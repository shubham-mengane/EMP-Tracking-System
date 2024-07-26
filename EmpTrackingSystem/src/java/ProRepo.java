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
public class ProRepo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String prorepid=req.getParameter("prorepid");
        String proname=req.getParameter("txt_proname");
        String proreport=req.getParameter("txt_preport");
        
        String event=req.getParameter("btn");
        
        out.println(prorepid);
        out.println(proname);
        out.println(proreport);
        out.println(event);
        
        Database db=new Database();
        String result=db.connectdb();
        out.println(result);
        
        if(event.equals("SUBMIT"))
       { 
           String insert = db.Query("insert into prorep_tbl(proname,prorepo)values('"+proname+"','"+proreport+"')", "Record Inserted");
           out.println(insert);
           resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('report Added');");
            out.println("location='Prorep.jsp';");
            out.println("</script>");
       }
        if(event.equals("Delete"))
       {
       String delete=db.Query("delete from prorep_tbl where prorepid='"+prorepid+"'", "Record Deleted");
       out.println(delete);
       resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('report Deleted');");
            out.println("location='ProReport.jsp';");
            out.println("</script>");
       }
        
        if(event.equals("Update"))
       {
           
           String update=db.Query("update prorep_tbl set proname='"+proname+"',prorepo='"+proreport+"' where prorepid='"+prorepid+"'", "Record Updated");
           out.println(update);
           resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('report Updated');");
            out.println("location='ProReport.jsp';");
            out.println("</script>");
       
       }
    }
}









