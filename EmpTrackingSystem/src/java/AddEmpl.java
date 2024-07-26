/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
public class AddEmpl extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String empid=req.getParameter("empid");
        String ename=req.getParameter("txt_name");
        String phone=req.getParameter("txt_phone");
        String email=req.getParameter("txt_email");
        String add=req.getParameter("txt_add");
        String dob=req.getParameter("txt_dob");
        String pass=req.getParameter("txt_pass");
        String gender=req.getParameter("txt_gender");
        String design=req.getParameter("txt_design");
        String img=req.getParameter("f_image");
        
        String event=req.getParameter("btn");
        
        out.println(empid);
        out.println(ename);
        out.println(phone);
        out.println(email);
        out.println(add);
        out.println(dob);
        out.println(pass);
        out.println(gender);
        out.println(design);
        out.println(img);
        out.println(event);
        
        Database db=new Database();
        String result=db.connectdb();
        out.println(result);
        
        if(event.equals("SUBMIT"))
       { 
           String insert = db.Query("insert into addemp_tbl(ename,phone,email,eadd,dob,pass,gender,design,img)values('"+ename+"','"+phone+"','"+email+"','"+add+"','"+dob+"','"+pass+"','"+gender+"','"+design+"','"+img+"')", "Record Inserted");
           out.println(insert);
           resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Inserted');");
            out.println("location='Addemp.jsp';");
            out.println("</script>");
       }
        if(event.equals("Delete"))
       {
       String delete=db.Query("delete from addemp_tbl where empid='"+empid+"'", "Record Deleted");
       out.println(delete);
       resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Deleted');");
            out.println("location='showemp.jsp';");
            out.println("</script>");
       }
        
        if(event.equals("Update"))
       {
           
           String update=db.Query("update addemp_tbl set ename='"+ename+"',phone='"+phone+"',email='"+email+"',add='"+add+"',dob='"+dob+"',pass='"+pass+"',gender='"+gender+"',design='"+design+"',img='"+img+"' where empid='"+empid+"'", "Record Updated");
           out.println(update);
           resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Updated');");
            out.println("location='showemp.jsp';");
            out.println("</script>");
       }
    }
}