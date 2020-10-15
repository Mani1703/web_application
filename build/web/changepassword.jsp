<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%
String currentpassword=request.getParameter("current");
String Newpass=request.getParameter("new");
String conpass=request.getParameter("confirm");
String connurl = "jdbc:mysql://localhost:3306/fashionarea";
Connection con=null;
String pass="";
String id="";
try{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection(connurl, "root", "root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from users where password='"+currentpassword+"'");
while(rs.next()){
id=rs.getString(1);
pass=rs.getString(3);
} System.out.println(id+ " "+pass);
if(pass.equals(currentpassword)){
Statement st1=con.createStatement();
int i=st1.executeUpdate("update users set password='"+Newpass+"' where username='"+id+"'");
out.println("Password changed successfully");
st1.close();
con.close();
}
else{
out.println("Invalid Current Password");
}
}
catch(Exception e){
out.println(e);
}
%>

