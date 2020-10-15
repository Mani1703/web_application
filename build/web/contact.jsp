<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<%@ page  import="java.util.*" %>
    <% 
    String name=request.getParameter("name");
    String email=request.getParameter("email");
    String message=request.getParameter("message");
    
    
    try 
    {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fashionarea","root","root");
Statement st=conn.createStatement();
st.executeUpdate("insert into feedback(name,email,message) values('"+name+"','"+email+"','"+message+"')");
out.println("Thanking you");

}
    
catch(Exception e){
out.println(e);
}
   
%>