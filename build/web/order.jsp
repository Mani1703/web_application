<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<%@ page  import="java.util.*" %>
    <% 
    String item_id=request.getParameter("item_id");
    String name=request.getParameter("name");
    String address=request.getParameter("address");
    String phone_no=request.getParameter("phone_no");  
    String quantity=request.getParameter("quantity");
    String product_name=request.getParameter("product_name");
    
    try 
    {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fashionarea","root","root");
Statement st=conn.createStatement();
st.executeUpdate("insert into orders(item_id,name,address,phone_no,quantity,product_name) values('"+item_id+"','"+name+"','"+address+"','"+phone_no+"','"+quantity+"','"+product_name+"')");
out.println("Data is successfully entered");
 response.sendRedirect("orderconf.jsp");
    }
                 
   
         
  
       
   
    
catch(Exception e){
out.println(e);
}
              
%>
