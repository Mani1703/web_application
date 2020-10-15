<%@page import="java.sql.*" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<style type="text/css">
.right {	text-align: right;
}
</style>
<link href="talic.css" rel="stylesheet" type="text/css" />
<script src="cart.js"></script>
</head>


<body bgcolor="papayawhip">

<table width="993" height="102" border="0">
    <tr> 
    <td width="251" height="96"><img src="logo.png" width="251" height="88" alt="Logo" /></td>
    <td width="726" class="right">24X7 Customer Support - <a href="contact.jsp">Contact us</a> | <a href="main.jsp">Home</a> |
     
    <% if(session.getAttribute("username")==null) {
			%>
      <a href="login.jsp">Login</a>
      <%} else {
				%>
      <a href="logout.jsp">Logout</a>
      <%}%></td>
    </tr>
</table>
 
<p>
<form method="post" action="order.jsp">
    <table width="450" height="142" border="0">
    <td width="92" height="33" align="right">Item_id</td>
    <td width="342"><input type="text" name="item_id" size="30" value="f2" required/></td>
  
    <tr>
    <td height="32" align="right">Product Name</td>
    <td><input type="text" name="product_name" size="20" value="Women Bellies" required/></td>
    </tr>
  
    <td height="32" align="right">Phone No.</td>
    <td><input type="text" name="phone_no" size="20" required/></td>r>
  <tr>
    <td height="60" align="right">Address:</td>
    <td><input type="text" name="address" size="120" required/></td>
  </tr>
  <tr>
    <td height="60" align="right">quantity</td>
    <td><input type="number" name="quantity" size="120" required/></td>
  </tr>
  <tr>
    <td height="60" align="right">Username</td>
    <td><input type="text" name="username" size="120" required/></td>
  </tr>
</table>
<input type="submit" name="submit" value="submit" />
</form>
</p>


</body>
</html>