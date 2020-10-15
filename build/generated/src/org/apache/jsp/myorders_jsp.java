package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class myorders_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String id = request.getParameter("userId");
    String driverName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String dbName = "fashionarea";
    String userId = "root";
    String password = "root";
    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Add to cart</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cart.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <img src=\"images.png\" alt=\"adminlogo\" class=\"adminlogo\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"data\">\n");
      out.write("\n");
      out.write("            <br>    \n");
      out.write("            <h2 align=\"center\">\n");
      out.write("                <font size=\"10\"><strong>\n");
      out.write("                    YOUR SHOPPING !!\n");
      out.write("                </strong>\n");
      out.write("                </font>\n");
      out.write("            </h2>\n");
      out.write("            <table align=\"center\" cellpadding=\"10\" cellspacing=\"5\" border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr bgcolor=\"grey\">\n");
      out.write("                    <td><b>Item_id</b></td>\n");
      out.write("                    <td><b>Product_name</b></td>\n");
      out.write("                    <td><b>Quantity</b></td>\n");
      out.write("                    <td><b>Address</b></td>\n");
      out.write("                    <td><b>Shipping_Charges</b></td>\n");
      out.write("                    <td><b>Price</b></td>\n");
      out.write("                    <td><b>Total price</b></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                ");

                    try {
                        connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
                        statement = connection.createStatement();
                        String sql = "SELECT orders.item_id, product.product_name,product.price,orders.address,orders.quantity,product.shipping_charges,product.price+product.shipping_charges as total_price FROM orders INNER JOIN product ON orders.item_id=product.item_id;";

                        resultSet = statement.executeQuery(sql);
                        while (resultSet.next()) {
                            out.println();
                
      out.write("\n");
      out.write("                <tr bgcolor=\"#DEB887\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(resultSet.getString("item_id"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("product_name"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("quantity"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("address"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("shipping_charges"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("price"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("total_price"));
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("\n");
      out.write("          \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("\n");
      out.write("                ");

                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("\n");
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
