<%-- 
    Document   : ProReport
    Created on : 19 May, 2023, 2:53:04 AM
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
      <th scope="col">Project Name</th>
      <th scope="col">Report</th>
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
            String sql="select * from prorep_tbl";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
            
      
      
      
      %>
    <tr>
  <form action="ProRepo" method="post">
      <th scope="row"><%=counter++%></th>
  <input type="hidden" name="prorepid" value="<%=rs.getString("prorepid")%>">
      <td><input type="text" name="txt_proname" class="form-control" value="<%=rs.getString("proname")%>"></td>
       <td><input type="text" name="txt_preport" class="form-control" value="<%=rs.getString("prorepo")%>"></td>
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