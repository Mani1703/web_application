<%@page import="java.sql.*" %>
<% 
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
    %>
<html>
<head>
    <title>Admin Panel</title>
    <link rel="stylesheet" type="text/css" href="adstyle.css">
    </head>
    <body>
    
        <div class="header">
            <img src="images.png" alt="adminlogo" class="adminlogo">
        </div><br><pre>Welcome to Admin Panel .Please proceed with caution!</pre>
        <div class="wrapper">
            <div class="sidebar">
                <h2>Dashboard</h2>
        <ul>
            <a href="#" title="add new products"><li>Add Data    </li></a>
            <a href="#" title="delete products"> <li>Delete Data   </li></a>
            <a href="#" title="update products"><li>Update Data   </li></a>
            <a href="#" title="search data"> <li> search        </li></a>
            <a href="#" title="delivered products"><li>product delivered</li></a>
            <a href="home.html" title="log out admin panel"><li>log off</li></a>

            </ul>
            </div></div>
        <div class="data">
        <center><h2>DATA AVAILABLE!</h2></center>
           
    <h2 align="center">
        <font<strong>
            Retrieve data from database in jsp
        </strong>
            </font>
    </h2>
    <table align="center" cellpadding="10" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>first_name</b></td>
<td><b>last_name</b></td>
<td><b>Email</b></td>
<td><b>address</b></td>
<td><b>username</b></td>
<td><b>password</b></td>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM users";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){out.println();
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getString("first_name") %></td>
<td><%=resultSet.getString("last_name") %></td>
<td><%=resultSet.getString("email") %></td>
<td><%=resultSet.getString("address") %></td>
<td><%=resultSet.getString("username") %></td>
<td><%=resultSet.getString("password") %></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
      
 </div>
    
            
    </body>
</html>