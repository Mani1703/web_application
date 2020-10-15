<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<%@ page  import="java.util.*" %>
    <% 
    String first_name=request.getParameter("first_name");
    String last_name=request.getParameter("last_name");
    String email=request.getParameter("email");
    String address=request.getParameter("address");
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    
    try 
    {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fashionarea","root","root");
Statement st=conn.createStatement();
st.executeUpdate("insert into users(first_name,last_name,email,address,username,password) values('"+first_name+"','"+last_name+"','"+email+"','"+address+"','"+username+"','"+password+"')");
out.println("Data is successfully entered");
response.sendRedirect("login.jsp");
}
catch(Exception e){
out.println(e);
}
%>