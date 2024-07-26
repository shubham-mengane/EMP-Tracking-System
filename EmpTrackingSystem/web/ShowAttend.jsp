<%-- 
    Document   : ShowAttend
    Created on : 16 Jun, 2023, 2:13:46 PM
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
        <title>Show Attendance</title>
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
      <th scope="col">Employee Name</th>
      <th scope="col">Date</th>
      <th scope="col">First Half</th>
      <th scope="col">Second Half</th>
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
            String sql="select * from attendance_tbl";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
            
      
      
      
      %>
    <tr>
  <form action="ProRepo" method="post">
      <th scope="row"><%=counter++%></th>
  <input type="hidden" name="attendid" value="<%=rs.getString("attendid")%>">
       <td><%=rs.getString("eatname")%></td>
       <td><%=rs.getString("attdate")%></td>
       <td><%=rs.getString("atfhalf")%></td>
       <td><%=rs.getString("atshalf")%></td>
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
