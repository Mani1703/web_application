package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class mycart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".right {\ttext-align: right;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<link href=\"talic.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src=\"cart.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body bgcolor=\"papayawhip\">\n");
      out.write("\n");
      out.write("<table width=\"993\" height=\"102\" border=\"0\">\n");
      out.write("    <tr> \n");
      out.write("    <td width=\"251\" height=\"96\"><img src=\"logo.png\" width=\"251\" height=\"88\" alt=\"Logo\" /></td>\n");
      out.write("    <td width=\"726\" class=\"right\">24X7 Customer Support - <a href=\"contact.jsp\">Contact us</a> | <a href=\"main.jsp\">Home</a> |\n");
      out.write("     \n");
      out.write("    ");
 if(session.getAttribute("username")==null) {
			
      out.write("\n");
      out.write("      <a href=\"login.jsp\">Login</a>\n");
      out.write("      ");
} else {
				
      out.write("\n");
      out.write("      <a href=\"logout.jsp\">Logout</a>\n");
      out.write("      ");
}
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write(" \n");
      out.write("<p>\n");
      out.write("<form method=\"post\" action=\"addorder.jsp\">\n");
      out.write("    <table width=\"450\" height=\"142\" border=\"0\">\n");
      out.write("    <td width=\"92\" height=\"33\" align=\"right\">Item_id</td>\n");
      out.write("    <td width=\"342\"><input type=\"text\" name=\"item_id\" size=\"30\" value=\"f2\" required/></td>\n");
      out.write("  \n");
      out.write("    <tr>\n");
      out.write("    <td height=\"32\" align=\"right\">Product Name</td>\n");
      out.write("    <td><input type=\"text\" name=\"product_name\" size=\"20\" value=\"Women Bellies\" required/></td>\n");
      out.write("    </tr>\n");
      out.write("  \n");
      out.write("    <td height=\"32\" align=\"right\">Phone No.</td>\n");
      out.write("    <td><input type=\"text\" name=\"phone_no\" size=\"20\" required/></td>r>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"60\" align=\"right\">Address:</td>\n");
      out.write("    <td><input type=\"text\" name=\"address\" size=\"120\" required/></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"60\" align=\"right\">quantity</td>\n");
      out.write("    <td><input type=\"number\" name=\"quantity\" size=\"120\" required/></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"60\" align=\"right\">Username</td>\n");
      out.write("    <td><input type=\"text\" name=\"username\" size=\"120\" required/></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<input type=\"submit\" name=\"submit\" value=\"add to cart\" />\n");
      out.write("</form>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
