package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class showemp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Show Employee</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br>\n");
      out.write("            <h2>Show Employee</h2>\n");
      out.write("            <br>\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">#</th>\n");
      out.write("      <th scope=\"col\">Name</th>\n");
      out.write("      <th scope=\"col\">Phone Number</th>\n");
      out.write("      <th scope=\"col\">Email</th>\n");
      out.write("      <th scope=\"col\">Address</th>\n");
      out.write("      <th scope=\"col\">Date Of Birth</th>\n");
      out.write("      <th scope=\"col\">Password</th>\n");
      out.write("      <th scope=\"col\">Gender</th>\n");
      out.write("      <th scope=\"col\">Designation</th>\n");
      out.write("      <th scope=\"col\">Update</th>\n");
      out.write("      <th scope=\"col\">Delete</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("      ");

          
          Connection cn=null;
    Statement st=null;
    
    int counter=1;
          
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_tracking","root","root");
            st=cn.createStatement();
            String sql="select * from addemp_tbl";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
            
      
      
      
      
      out.write("\n");
      out.write("    <tr>\n");
      out.write("  <form action=\"register\" method=\"post\">\n");
      out.write("      <th scope=\"row\">");
      out.print(counter++);
      out.write("</th>\n");
      out.write("  <input type=\"hidden\" name=\"empid\" value=\"");
      out.print(rs.getString("empid"));
      out.write("\">\n");
      out.write("      <td>");
      out.print(rs.getString("ename"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs.getString("phone"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs.getString("eadd"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs.getString("dob"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("pass"));
      out.write("</td>\n");
      out.write("         <td>");
      out.print(rs.getString("gender"));
      out.write("</td>\n");
      out.write("          <td>");
      out.print(rs.getString("design"));
      out.write("</td>\n");
      out.write("       <td><input type=\"submit\" name=\"btn\" value=\"Update\" class=\"btn btn-success\"></td>\n");
      out.write("       <td><input type=\"submit\" name=\"btn\" value=\"Delete\" class=\"btn btn-danger\"></td>\n");
      out.write("  </form>\n");
      out.write("    </tr>\n");
      out.write("    ");
 
        }
    
    }catch(Exception ex)
{

out.println(ex.toString());
}
    
    
    
      out.write("\n");
      out.write("    \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
