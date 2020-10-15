package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
 
    String id=request.getParameter("userId");
    String driverName="com.mysql.jdbc.Driver";
    String connectionUrl="jdbc:mysql://localhost:3306/";
    String dbName="fashionarea";
    String userId="root";
    String password="root";
    try
    {
        Class.forName(driverName);
        }
        catch(ClassNotFoundException e)
        {e.printStackTrace();
    }
    Connection connection=null;
    Statement statement=null;
    ResultSet resultSet=null;
    
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Admin Panel</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"adstyle.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <img src=\"images.png\" alt=\"adminlogo\" class=\"adminlogo\">\n");
      out.write("        </div><br><pre>Welcome to Admin Panel .Please proceed with caution!</pre>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <h2>Dashboard</h2>\n");
      out.write("        <ul>\n");
      out.write("            <a href=\"#\" title=\"add new products\"><li>Add Data    </li></a>\n");
      out.write("            <a href=\"#\" title=\"delete products\"> <li>Delete Data   </li></a>\n");
      out.write("            <a href=\"#\" title=\"update products\"><li>Update Data   </li></a>\n");
      out.write("            <a href=\"#\" title=\"search data\"> <li> search        </li></a>\n");
      out.write("            <a href=\"#\" title=\"delivered products\"><li>product delivered</li></a>\n");
      out.write("            <a href=\"home.html\" title=\"log out admin panel\"><li>log off</li></a>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            </div></div>\n");
      out.write("        <div class=\"data\">\n");
      out.write("        <center><h2>DATA AVAILABLE!</h2></center>\n");
      out.write("           \n");
      out.write("    <h2 align=\"center\">\n");
      out.write("        <font<strong>\n");
      out.write("            Retrieve data from database in jsp\n");
      out.write("        </strong>\n");
      out.write("            </font>\n");
      out.write("    </h2>\n");
      out.write("    <table align=\"center\" cellpadding=\"10\" cellspacing=\"5\" border=\"1\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"#A52A2A\">\n");
      out.write("<td><b>first_name</b></td>\n");
      out.write("<td><b>last_name</b></td>\n");
      out.write("<td><b>Email</b></td>\n");
      out.write("<td><b>address</b></td>\n");
      out.write("<td><b>username</b></td>\n");
      out.write("<td><b>password</b></td>\n");
      out.write("</tr>\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM users";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){out.println();

      out.write("\n");
      out.write("<tr bgcolor=\"#DEB887\">\n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString("first_name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("last_name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("email") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("address") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("username") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("password") );
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("      \n");
      out.write(" </div>\n");
      out.write("    \n");
      out.write("            \n");
      out.write("    </body>\n");
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
