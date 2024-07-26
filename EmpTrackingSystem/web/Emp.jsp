<%-- 
    Document   : Emp.jsp
    Created on : 15 May, 2023, 4:22:43 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <style>
            #navbar {
    height: 60px;
    width: 100%;
    background:green;
    position: absolute;
    top: 15px;
}

#navbar ul {
    list-style: none;
    display: flex;
    flex-direction: row;
}

#navbar ul li {
    height: 60px;
    width: 18px;
    font-size: 10px;
    margin: 0px 57px;
    display: flex;
}

#navbar ul li:first-child {
    margin-left: 100px;
}

#navbar ul li a {
    text-decoration: none;
    color: white;
    font-size: 15px;
}

#navbar ul li a:hover {
    color: black;
    padding: 10px 0;
    border-bottom: 2px solid #ff7720;
}

#navbar ul .active a {
    color: #ff7720;
    padding: 10px 0;
    border-bottom: 2px solid #ff7720;
}

#navbar ul:hover .active a {
    padding: none;
    border: none;
    color: #8c8c8c;
}

#navbar ul .active a:hover {
    color: #ff7720;
    padding: 10px 0;
    border-bottom: 2px solid #ff7720;
}
        </style>
    </head>
    <body>
        <div id="container">
        <div id="background"></div>
        <div id="navbar">
            <ul>
                <li><a href="http://localhost:8080//EmpTrackingSystem/Emp.jsp">Home</a></li>
                <li><a href="http://localhost:8080/EmpTrackingSystem/Attend.jsp">Attendance</a></li>
                <li><a href="http://localhost:8080//EmpTrackingSystem/Prorep.jsp">Project Report</a></li>
                <li><a href="http://localhost:8080//EmpTrackingSystem/Leave.jsp">Leave Report</a></li>
                <li><a href="http://localhost:8080//EmpTrackingSystem/">Logout</a></li>
            </ul>
        </div>
         </div>
        
         <div id="img">
            <img src="IMG/tracking-employee-computer-activity-1600.jpg" width="100%" height="100%">
        </div>
        
        
        
        
        
        
          <!-- Site footer -->
    <footer class="site-footer">
      <div class="container">
        <div class="row">
          <div class="col-sm-12 col-md-6">
            <h6>About</h6>
            <p class="text-justify">Employee Tracking System<i>Employee Tracking System is open to admins, Managers, and regular 
employees.</i>Among all users, only the admins have all privileges to access all 
the information of Employee Tracking System. So the admins will insert, 
update, remove the employees, departments, generate reports and whereas 
other users will have limited roles. Once the user’s login they can perform few 
tasks specific to their role.
Such as Managers can update a project report and give rating to 
employee working on that project. 
Employee can also update there work done on the project and they can 
also apply for leave.</p>
          </div>


          <div class="col-xs-6 col-md-3">
            <h6>Quick Links</h6>
            <ul class="footer-links">
              <li><a href="http://localhost:8080//EmpTrackingSystem/Aboutus.jsp">About Us</a></li>
              <li><a href="http://localhost:8080//EmpTrackingSystem/Contactus.jsp">Contact Us</a></li>
            </ul>
          </div>
        </div>
        <hr>
      </div>
</footer>
    </body>
</html>
