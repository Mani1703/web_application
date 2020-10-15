<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<style type="text/css">
.right {	text-align: right;
}
.img {
    border-radius:100px;
}
</style>
</head>

    <body bgcolor="papayawhip">
<%@ page language="java" %>
    <%@ page import="java.sql.*" %>
         <%@ page import="java.sql.DriverManager.*" %>
<table width="993" height="102" border="0">
 
    <td width="251" height="96"><img src="logo.png" width="251" height="88" alt="Logo" ></td>
    <td width="726" class="right">24X7 Customer Support - <a href="contact.html">Contact us</a> | <a href="home_1.html">Home</a> |
      <% if(session.getAttribute("username")==null) {
			%>
      <a href="login.jsp">Login</a>
      <%} else {
				%>
      <a href="logout.jsp">Logout</a>
      <%}%></td>
  </tr>
</table>
<hr />
<% 
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
%>
<p> Order Confirmed:</p>
<table width="992" border="1" cellspacing="0">
  <tr>
    <td width="66" align="center"><strong>Item ID</strong></td>
    <td width="354" align="center"><strong>Product Name &amp; Model</strong></td>
    <td width="153" align="center"><strong>Price</strong></td>
    <td width="148" align="center"><strong>Shipping Charges</strong></td>
  
  </tr>
  <tr>
    <td height="75" align="center"><%=rs.getString("item_id")%></td>
    <td align="center"><%=rs.getString("product_name")%></td>
    <td align="center">Rs. <%=rs.getString("price")%></td>
    <td align="center">Rs. <%=rs.getString("shipping_charges")%></td>
  </tr>
</table>
<%}%>
<p> Thanks for shopping with us. Your item will be delivered within 2-3 days.</p>
<p><strong> Happy Shopping! </strong></p>
</body>
</html>