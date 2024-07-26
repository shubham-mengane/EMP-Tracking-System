package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Addpro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Project</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background: linear-gradient(to left, #cc33ff 16%, #ccccff 54%);\n");
      out.write("                height: 500px;\n");
      out.write("            }\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                background-color: white;\n");
      out.write("                margin-top: 50px;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            input[type=submit]\n");
      out.write("            {\n");
      out.write("                 background: linear-gradient(to left, #cc33ff 16%, #ccccff 54%);\n");
      out.write("                 color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"AddPro\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\">    \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a  style=\"float: right\" href=\"http://localhost:8080//EmpTrackingSystem/Admin.jsp\">X</a>\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <label>Project Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"txt_pname\" id=\"floatingInput\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <label>Project Employee</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"txt_pemp\" id=\"floatingInput\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <label>Client Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"txt_cname\" id=\"floatingInput\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <label>Development Platform</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"txt_dplat\" id=\"floatingInput\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <label>Project Type</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"txt_ptype\" id=\"floatingInput\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <label>DataBase Technology</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"txt_dbtechno\" id=\"floatingInput\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <br>\n");
      out.write("                     <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <label>Project Manager</label>\n");
      out.write("                            <select class=\"form-control\" name=\"txt_pman\" id=\"floatingInput\" required>\n");
      out.write("                                <option>Select</option>\n");
      out.write("                                <option>shubham</option>\n");
      out.write("                                <option>rakesh</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"col-sm-6\">\n");
      out.write("                            <label>Project Description</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"txt_pdescrip\" id=\"floatingInput\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                     <div class=\"row\">\n");
      out.write("                         <div class=\"col-sm-6\">\n");
      out.write("                         </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                            <input type=\"submit\" name=\"btn\" class=\"form-control\" value=\"SUBMIT\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        </form>\n");
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