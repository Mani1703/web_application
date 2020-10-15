package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;
import java.sql.DriverManager.*;

public final class orderconf_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".right {\ttext-align: right;\r\n");
      out.write("}\r\n");
      out.write(".img {\r\n");
      out.write("    border-radius:100px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("    <body bgcolor=\"papayawhip\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("         \r\n");
      out.write("<table width=\"993\" height=\"102\" border=\"0\">\r\n");
      out.write(" \r\n");
      out.write("    <td width=\"251\" height=\"96\"><img src=\"logo.png\" width=\"251\" height=\"88\" alt=\"Logo\" ></td>\r\n");
      out.write("    <td width=\"726\" class=\"right\">24X7 Customer Support - <a href=\"contact.html\">Contact us</a> | <a href=\"home_1.html\">Home</a> |\r\n");
      out.write("      ");
 if(session.getAttribute("username")==null) {
			
      out.write("\r\n");
      out.write("      <a href=\"login.jsp\">Login</a>\r\n");
      out.write("      ");
} else {
				
      out.write("\r\n");
      out.write("      <a href=\"logout.jsp\">Logout</a>\r\n");
      out.write("      ");
}
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<hr />\r\n");
 
       PreparedStatement ps;
        Connection conn;
        ResultSet rs= null;
       Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fashionarea","root","root");
      
         Statement st=conn.createStatement();
		 String sql = "SELECT * from product where item_id=?"; 
		 ps = conn.prepareStatement (sql);
		 ps.setString(1,(String)session.getAttribute("product_name"));
	 rs = ps.executeQuery (); 
	 while(rs.next())
	 {

      out.write("\r\n");
      out.write("<p> Order Confirmed:</p>\r\n");
      out.write("<table width=\"992\" border=\"1\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"66\" align=\"center\"><strong>Item ID</strong></td>\r\n");
      out.write("    <td width=\"354\" align=\"center\"><strong>Product Name &amp; Model</strong></td>\r\n");
      out.write("    <td width=\"153\" align=\"center\"><strong>Price</strong></td>\r\n");
      out.write("    <td width=\"148\" align=\"center\"><strong>Shipping Charges</strong></td>\r\n");
      out.write("  \r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"75\" align=\"center\">");
      out.print(rs.getString("item_id"));
      out.write("</td>\r\n");
      out.write("    <td align=\"center\">");
      out.print(rs.getString("product_name"));
      out.write("</td>\r\n");
      out.write("    <td align=\"center\">Rs. ");
      out.print(rs.getString("price"));
      out.write("</td>\r\n");
      out.write("    <td align=\"center\">Rs. ");
      out.print(rs.getString("shipping_charges"));
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
}
      out.write("\r\n");
      out.write("<p> Thanks for shopping with us. Your item will be delivered within 2-3 days.</p>\r\n");
      out.write("<p><strong> Happy Shopping! </strong></p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
