<%-- 
    Document   : Attend.jsp
    Created on : 16 Jun, 2023, 8:44:14 AM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attendance</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <style>
            body{
                background: linear-gradient(to left, #cc33ff 16%, #ccccff 54%);
                height: 500px;
            }
            .container
            {
                background-color: white;
                margin-top: 50px;
                padding: 30px;
            }
            input[type=submit]
            {
                 background: linear-gradient(to left, #cc33ff 16%, #ccccff 54%);
                 color: white;
            }
        </style>
    </head>
    <body>
        <form method="post" action="Addatend">
        <div class="row">
            <div class="col-sm-3">    
            </div>
            
            <div class="col-sm-6">
                <div class="container">                    
                    <br>
                    <div class="row">
                        <div class="col-sm-6">
                            <label>Employee Name</label>
                            <input type="text" name="txt_emaname" class="form-control" id="floatingInput" required>
                        </div>
                        <div class="col-sm-6">
                             <label>Date</label>
                            <input type="date" name="txt_adate" class="form-control" id="floatingInput" required>
                        </div>
                        <br>
                        <div class="col-sm-6">
                            <label>First Half</label>
                            <select  class="form-control" name="txt_fhalf" id="floatingInput" required>
                                <option>Present</option>
                                <option>Absent</option>
                            </select>
                        </div>
                        <div class="col-sm-6">
                            <label>Second Half</label>
                            <select  class="form-control" name="txt_shalf" id="floatingInput" required>
                                <option>Present</option>
                                <option>Absent</option>
                            </select>
                        </div>
                        <br>

                    </div>
                    <br>
                     <div class="row">
                         <div class="col-sm-6">
                         </div>
                        <div class="col-sm-6">

                            <input type="submit" name="btn" class="form-control" value="SUBMIT">
                        </div>

                    </div>


                </div>
            </div>
            <div class="col-sm-3"></div>
            
        </div>
        </form>
    </body>
</html>
