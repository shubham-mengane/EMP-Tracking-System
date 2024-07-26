<%-- 
    Document   : showman.jsp
    Created on : 21 May, 2023, 5:25:37 PM
    Author     : Shubham
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Manager</title>
        <link rel="stylesheet" href="css/bootstrap.css">
    </head>
    <body>
        <div class="container">
            <br>
            <h2>Show Manager</h2>
            <br>
            <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Phone Number</th>
      <th scope="col">Email</th>
      <th scope="col">Address</th>
      <th scope="col">Date Of Birth</th>
      <th scope="col">Gender</th>
      <th scope="col">Password</th>
      <th scope="col">Image</th>
      <th scope="col">Update</th>
      <th scope="col">Delete</th>
    </tr>
  </thead>
  <tbody>
      <%
          
          Connection cn=null;
    Statement st=null;
    
    int counter=1;
          
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_tracking","root","root");
            st=cn.createStatement();
            String sql="select * from addman_tbl";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
            
      
      
      
      %>
    <tr>
  <form action="AddMan" method="post">
      <th scope="row"><%=counter++%></th>
  <input type="hidden" name="manid" value="<%=rs.getString("manid")%>">
      <td><input type="text" name="txt_name" class="form-control" value="<%=rs.getString("mname")%>"></td>
       <td><input type="text" name="txt_phone" class="form-control" value="<%=rs.getString("phone")%>"></td>
      <td><input type="text" name="txt_email" class="form-control" value="<%=rs.getString("memail")%>"></td>
       <td><input type="text" name="txt_add" class="form-control" value="<%=rs.getString("madd")%>"></td>
       <td><input type="text" name="txt_dob" class="form-control" value="<%=rs.getString("dob")%>"></td>
       <td><input type="text" name="txt_pass" class="form-control" value="<%=rs.getString("pass")%>"></td>
         <td><input type="text" name="txt_gender" class="form-control" value="<%=rs.getString("gender")%>"></td>
         <td><input type="text" name="m_image" class="form-control" value="<%=rs.getString("mimg")%>"></td>
       <td><input type="submit" name="btn" value="Update" class="btn btn-success"></td>
       <td><input type="submit" name="btn" value="Delete" class="btn btn-danger"></td>
  </form>
    </tr>
    <% 
        }
    
    }catch(Exception ex)
{

out.println(ex.toString());
}
    
    
    %>
    
  </tbody>
</table>
        </div>
    </body>
</html>