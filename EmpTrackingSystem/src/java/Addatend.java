/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Shubham
 */
@WebServlet(urlPatterns = {"/Addatend"})
public class Addatend extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Addatend</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Addatend at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
         PrintWriter out=resp.getWriter();
        
        String attendid=req.getParameter("attendid");
        String eaname=req.getParameter("txt_emaname");
        String atdate=req.getParameter("txt_adate");
        String fihalf=req.getParameter("txt_fhalf");
        String sehalf=req.getParameter("txt_shalf");
        
        String event=req.getParameter("btn");
        
        out.println(attendid);
        out.println(eaname);
        out.println(atdate);
        out.println(fihalf);
        out.println(sehalf);
        out.println(event);
        
        Database db=new Database();
        String result=db.connectdb();
        out.println(result);
        
        if(event.equals("SUBMIT"))
       { 
           String insert = db.Query("insert into attendance_tbl(eatname,attdate,atfhalf,atshalf)values('"+eaname+"','"+atdate+"','"+fihalf+"','"+sehalf+"')", "Record Inserted");
           out.println(insert);
           resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Attendance Uploaded');");
            out.println("location='Attend.jsp';");
            out.println("</script>");
       }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
