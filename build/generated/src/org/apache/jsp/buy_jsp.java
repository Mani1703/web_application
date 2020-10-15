package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class buy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".right {\ttext-align: right;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"talic.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"cart.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"papayawhip\">\r\n");
      out.write("\r\n");
      out.write("<table width=\"993\" height=\"102\" border=\"0\">\r\n");
      out.write("    <tr> \r\n");
      out.write("    <td width=\"251\" height=\"96\"><img src=\"logo.png\" width=\"251\" height=\"88\" alt=\"Logo\" /></td>\r\n");
      out.write("    <td width=\"726\" class=\"right\">24X7 Customer Support - <a href=\"contact.jsp\">Contact us</a> | <a href=\"main.jsp\">Home</a> |\r\n");
      out.write("     \r\n");
      out.write("    ");
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
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write(" \r\n");
      out.write("<p>\r\n");
      out.write("<form method=\"post\" action=\"order.jsp\">\r\n");
      out.write("    <table width=\"450\" height=\"142\" border=\"0\">\r\n");
      out.write("    <td width=\"92\" height=\"33\" align=\"right\">Item_id</td>\r\n");
      out.write("    <td width=\"342\"><input type=\"text\" name=\"item_id\" size=\"30\" value=\"f2\" required/></td>\r\n");
      out.write("  \r\n");
      out.write("    <tr>\r\n");
      out.write("    <td height=\"32\" align=\"right\">Product Name</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"product_name\" size=\"20\" value=\"Women Bellies\" required/></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  \r\n");
      out.write("    <td height=\"32\" align=\"right\">Phone No.</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"phone_no\" size=\"20\" required/></td>r>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"60\" align=\"right\">Address:</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"address\" size=\"120\" required/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"60\" align=\"right\">quantity</td>\r\n");
      out.write("    <td><input type=\"number\" name=\"quantity\" size=\"120\" required/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"60\" align=\"right\">Username</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"username\" size=\"120\" required/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<input type=\"submit\" name=\"submit\" value=\"submit\" />\r\n");
      out.write("</form>\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
