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
public class AddPro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String proid=req.getParameter("proid");
        String proname=req.getParameter("txt_pname");
        String proemp=req.getParameter("txt_pemp");
        String cliname=req.getParameter("txt_cname");
        String devplat=req.getParameter("txt_dplat");
        String protype=req.getParameter("txt_ptype");
        String technotype=req.getParameter("txt_dbtechno");
        String proman=req.getParameter("txt_pman");
        String prodescip=req.getParameter("txt_pdescrip");
        
        String event=req.getParameter("btn");
        
        out.println(proid);
        out.println(proname);
        out.println(proemp);
        out.println(cliname);
        out.println(devplat);
        out.println(protype);
        out.println(technotype);
        out.println(proman);
        out.println(prodescip);
        out.println(event);
        
        Database db=new Database();
        String result=db.connectdb();
        out.println(result);
        
        if(event.equals("SUBMIT"))
       { 
           String insert = db.Query("insert into addpro_tbl(proname,proemp,cliname,devplat,protype,prodbtech,proman,prodescrib)values('"+proname+"','"+proemp+"','"+cliname+"','"+devplat+"','"+protype+"','"+technotype+"','"+proman+"','"+prodescip+"')", "Record Inserted");
           out.println(insert);
           resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Inserted');");
            out.println("location='Addpro.jsp';");
            out.println("</script>");
       }
        if(event.equals("Delete"))
       {
       String delete=db.Query("delete from addpro_tbl where proid='"+proid+"'", "Record Deleted");
       out.println(delete);
       resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Deleted');");
            out.println("location='showpro.jsp';");
            out.println("</script>");
       }
        
        if(event.equals("Update"))
       {
           
           String update=db.Query("update addpro_tbl set proname='"+proname+"',proemp='"+proemp+"',cliname='"+cliname+"',devplat='"+devplat+"',protype='"+protype+"',prodbtech='"+technotype+"',proman='"+proman+"',prodescrib='"+prodescip+"' where proid='"+proid+"'", "Record Updated");
           out.println(update);
           resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Updated');");
            out.println("location='showpro.jsp';");
            out.println("</script>");
       
       }

        
    }
}









