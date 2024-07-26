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
public class AddMan extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String manid=req.getParameter("manid");
        String mname=req.getParameter("txt_name");
        String phone=req.getParameter("txt_phone");
        String memail=req.getParameter("txt_email");
        String madd=req.getParameter("txt_add");
        String dob=req.getParameter("txt_dob");
        String pass=req.getParameter("txt_pass");
        String gender=req.getParameter("txt_gender");
        String mimg=req.getParameter("m_image");
        
        String event=req.getParameter("btn");
        
        out.println(manid);
        out.println(mname);
        out.println(phone);
        out.println(memail);
        out.println(madd);
        out.println(dob);
        out.println(pass);
        out.println(gender);
        out.println(mimg);
        out.println(event);
        
        Database db=new Database();
        String result=db.connectdb();
        out.println(result);
        
        if(event.equals("SUBMIT"))
       { 
           
           String insert = db.Query("insert into addman_tbl(mname,phone,memail,madd,dob,pass,gender,mimg)values('"+mname+"','"+phone+"','"+memail+"','"+madd+"','"+dob+"','"+pass+"','"+gender+"','"+mimg+"')", "Record Inserted");
           out.println(insert);
           resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Inserted');");
            out.println("location='Addpro.jsp';");
            out.println("</script>");
       }
        if(event.equals("Delete"))
       {
       String delete=db.Query("delete from addman_tbl where manid='"+manid+"'", "Record Deleted");
       out.println(delete);
       }
        
        if(event.equals("Update"))
       {
           
           String update=db.Query("update addman_tbl set mname='"+mname+"',phone='"+phone+"',memail='"+memail+"',madd='"+madd+"',dob='"+dob+"',pass='"+pass+"',gender='"+gender+"',mimg='"+mimg+"' where manid='"+manid+"'", "Record Updated");
           out.println(update);
       
       }
    }
}









