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
public class Leave extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String ename=req.getParameter("txt_ename");
        String edeg=req.getParameter("txt_edeg");
        String fdate=req.getParameter("txt_from");
        String tdate=req.getParameter("txt_to");
        String reason=req.getParameter("txt_res");
        
        String event=req.getParameter("btn");
        
        out.println(ename);
        out.println(edeg);
        out.println(fdate);
        out.println(tdate);
        out.println(reason);
        out.println(event);
        
        Database db=new Database();
        String result=db.connectdb();
        out.println(result);
        
        if(event.equals("SUBMIT"))
       { 
           String insert = db.Query("insert into leave_tbl(empna,edeg,fdate,tdate,reason)values('"+ename+"','"+edeg+"','"+fdate+"','"+tdate+"','"+reason+"')", "Record Inserted");
           out.println(insert);
           resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Leave applied');");
            out.println("location='Emp.jsp';");
            out.println("</script>");
       }
    }
}









