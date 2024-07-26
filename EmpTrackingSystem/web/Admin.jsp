<%-- 
    Document   : Admin.jsp
    Created on : 10 May, 2023, 12:58:27 AM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
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


.site-footer
{
  background-color:#26272b;
  padding:45px 0 20px;
  font-size:15px;
  line-height:24px;
  color:#737373;
}
.site-footer hr
{
  border-top-color:#bbb;
  opacity:0.5
}
.site-footer hr.small
{
  margin:20px 0
}
.site-footer h6
{
  color:#fff;
  font-size:16px;
  text-transform:uppercase;
  margin-top:5px;
  letter-spacing:2px
}
.site-footer a
{
  color:#737373;
}
.site-footer a:hover
{
  color:#3366cc;
  text-decoration:none;
}
.footer-links
{
  padding-left:0;
  list-style:none
}
.footer-links li
{
  display:block
}
.footer-links a
{
  color:#737373
}
.footer-links a:active,.footer-links a:focus,.footer-links a:hover
{
  color:#3366cc;
  text-decoration:none;
}
.footer-links.inline li
{
  display:inline-block
}
.site-footer .social-icons
{
  text-align:right
}
.site-footer .social-icons a
{
  width:40px;
  height:40px;
  line-height:40px;
  margin-left:6px;
  margin-right:0;
  border-radius:100%;
  background-color:#33353d
}
.copyright-text
{
  margin:0
}
@media (max-width:991px)
{
  .site-footer [class^=col-]
  {
    margin-bottom:30px
  }
}
@media (max-width:767px)
{
  .site-footer
  {
    padding-bottom:0
  }
  .site-footer .copyright-text,.site-footer .social-icons
  {
    text-align:center
  }
}
.social-icons
{
  padding-left:0;
  margin-bottom:0;
  list-style:none
}
.social-icons li
{
  display:inline-block;
  margin-bottom:4px
}
.social-icons li.title
{
  margin-right:15px;
  text-transform:uppercase;
  color:#96a2b2;
  font-weight:700;
  font-size:13px
}
.social-icons a{
  background-color:#eceeef;
  color:#818a91;
  font-size:16px;
  display:inline-block;
  line-height:44px;
  width:44px;
  height:44px;
  text-align:center;
  margin-right:8px;
  border-radius:100%;
  -webkit-transition:all .2s linear;
  -o-transition:all .2s linear;
  transition:all .2s linear
}
.social-icons a:active,.social-icons a:focus,.social-icons a:hover
{
  color:#fff;
  background-color:#29aafe
}
.social-icons.size-sm a
{
  line-height:34px;
  height:34px;
  width:34px;
  font-size:14px
}
.social-icons a.facebook:hover
{
  background-color:#3b5998
}
.social-icons a.twitter:hover
{
  background-color:#00aced
}
.social-icons a.linkedin:hover
{
  background-color:#007bb6
}
.social-icons a.dribbble:hover
{
  background-color:#ea4c89
}
@media (max-width:767px)
{
  .social-icons li.title
  {
    display:block;
    margin-right:0;
    font-weight:600
  }
}

#img{
    padding-top: 70px;
}

        </style>
    </head>
    <body>
        <div id="container">
        <div id="background"></div>
        <div id="navbar">
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="http://localhost:8080//EmpTrackingSystem/Addemp.jsp">Add Employee</a></li>
                <li><a href="http://localhost:8080//EmpTrackingSystem/Addman.jsp">Add Manager</a></li>
                <li><a href="http://localhost:8080//EmpTrackingSystem/Addpro.jsp">Add Project</a></li>
                <li><a href="http://localhost:8080//EmpTrackingSystem/showemp.jsp">View Employee</a></li>
                <li><a href="http://localhost:8080//EmpTrackingSystem/showman.jsp">View Manager</a></li>
                <li><a href="http://localhost:8080//EmpTrackingSystem/showpro.jsp">View Project</a></li>
                <li><a href="http://localhost:8080//EmpTrackingSystem/ProReport.jsp">Project Report</a></li>
                <li><a href="http://localhost:8080//EmpTrackingSystem/LeaveReport.jsp">Leave Report</a></li>
                <li><a href="http://localhost:8080/EmpTrackingSystem/ShowAttend.jsp">View Attendance</a></li>
                <li><a href="http://localhost:8080//EmpTrackingSystem/">Logout</a></li>
            </ul>
        </div>
         </div>
        
        <div id="img">
            <img src="IMG/istockphoto-1192884194-170667a.jpg" width="100%" height="800">
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
