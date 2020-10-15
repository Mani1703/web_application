<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<%@ page  import="java.util.*" %>
    <% 
    String item_id=request.getParameter("item_id");
    String name=request.getParameter("username");
    String address=request.getParameter("address");
     
    String quantity=request.getParameter("quantity");
    String product_name=request.getParameter("product_name");
    
    try 
    {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fashionarea","root","root");
Statement st=conn.createStatement();
st.executeUpdate("insert into mtable(item_id,username,address,quantity,product_name) values('"+item_id+"','"+name+"','"+address+"','"+quantity+"','"+product_name+"')");
out.println("item is added in your cart");

    }
                 
   
         
  
       
   
    
catch(Exception e){
out.println(e);
}
              
%>
