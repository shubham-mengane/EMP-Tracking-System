<%-- 
    Document   : LeaveReport.jsp
    Created on : 19 May, 2023, 2:54:07 AM
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
        <title>Leave Report</title>
        <link rel="stylesheet" href="css/bootstrap.css">
    </head>
    <body>
        <div class="container">
            <br>
            <h2>Show Leave Report</h2>
            <br>
            <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Employee Name</th>
      <th scope="col">Employee Designation</th>
      <th scope="col">From Date</th>
      <th scope="col">To Date</th>
      <th scope="col">Reason</th>
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
            String sql="select * from leave_tbl";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
            
      
      
      
      %>
    <tr>
  <form action="Leave" method="post">
      <th scope="row"><%=counter++%></th>
  <input type="hidden" name="leaveid" value="<%=rs.getString("leaveid")%>">
        <td><%=rs.getString("empna")%></td>
        <td><%=rs.getString("edeg")%></td>
      <td><%=rs.getString("fdate")%></td>
       <td><%=rs.getString("tdate")%></td>
      <td><%=rs.getString("reason")%></td>
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