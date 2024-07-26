<%-- 
    Document   : showpro.jsp
    Created on : 21 May, 2023, 5:26:07 PM
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
        <title>Show Employee</title>
        <link rel="stylesheet" href="css/bootstrap.css">
    </head>
    <body>
        <div class="container">
            <br>
            <h2>Show Projects</h2>
            <br>
            <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Project Name</th>
      <th scope="col">project Employee </th>
      <th scope="col">Clint Name</th>
      <th scope="col">Development Platform</th>
      <th scope="col">Project Type</th>
      <th scope="col">Database Technology</th>
      <th scope="col">Project Manager</th>
      <th scope="col">Project Description</th>
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
            String sql="select * from addpro_tbl";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
            
      
      
      
      %>
    <tr>
  <form action="AddPro" method="post">
      <th scope="row"><%=counter++%></th>
  <input type="hidden" name="proid" value="<%=rs.getString("proid")%>">
      <td><input type="text" name="txt_pname" class="form-control" value="<%=rs.getString("proname")%>"></td>
       <td><input type="text" name="txt_pemp" class="form-control" value="<%=rs.getString("proemp")%>"></td>
      <td><input type="text" name="txt_cname" class="form-control" value="<%=rs.getString("cliname")%>"></td>
       <td><input type="text" name="txt_dplat" class="form-control" value="<%=rs.getString("devplat")%>"></td>
       <td><input type="text" name="txt_ptype" class="form-control" value="<%=rs.getString("protype")%>"></td>
        <td><input type="text" name="txt_dbtechno" class="form-control" value="<%=rs.getString("prodbtech")%>"></td>
        <td><input type="text" name="txt_pman" class="form-control" value="<%=rs.getString("proman")%>"></td>
          <td><input type="text" name="txt_pdescrip" class="form-control" value="<%=rs.getString("prodescrib")%>"></td>
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