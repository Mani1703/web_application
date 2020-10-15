<%@page import="java.sql.*" %>
<%
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
%>
<html>
    <head>
        <title>Add to cart</title>
        <link rel="stylesheet" type="text/css" href="cart.css">
    </head>
    <body>

        <div class="header">
            <img src="images.png" alt="adminlogo" class="adminlogo">
        </div>


        <div class="data">

            <br>    
            <h2 align="center">
                <font size="10"><strong>
                    YOUR SHOPPING !!
                </strong>
                </font>
            </h2>
            <table align="center" cellpadding="10" cellspacing="5" border="1">
                <tr>

                </tr>
                <tr bgcolor="grey">
                    <td><b>Item_id</b></td>
                    <td><b>Product_name</b></td>
                    <td><b>Quantity</b></td>
                    <td><b>Address</b></td>
                    <td><b>Shipping_Charges</b></td>
                    <td><b>Price</b></td>
                    <td><b>Total price</b></td>
                    
                </tr>
                <%
                    try {
                        connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
                        statement = connection.createStatement();
                        String sql = "SELECT orders.item_id, product.product_name,product.price,orders.address,orders.quantity,product.shipping_charges,product.price+product.shipping_charges as total_price FROM orders INNER JOIN product ON orders.item_id=product.item_id;";

                        resultSet = statement.executeQuery(sql);
                        while (resultSet.next()) {
                            out.println();
                %>
                <tr bgcolor="#DEB887">

                    <td><%=resultSet.getString("item_id")%></td>
                    <td><%=resultSet.getString("product_name")%></td>
                    <td><%=resultSet.getString("quantity")%></td>
                    <td><%=resultSet.getString("address")%></td>
                    <td><%=resultSet.getString("shipping_charges")%></td>
                    <td><%=resultSet.getString("price")%></td>
                    <td><%=resultSet.getString("total_price")%></td>
                    
                 
                </tr>
                

          
                    
                

                <%
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %>
            </table>

            <br>
            

        </div>
   

    </body>
</html>