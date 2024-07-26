package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Singuppage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Sing Up Page</title>\n");
      out.write("        <style>\n");
      out.write("                @import url('https://fonts.googleapis.com/css2?family=Quicksand:wght@300;500&display=swap');\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-family: 'Quicksand', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("html,\n");
      out.write("body {\n");
      out.write("  background-image: url('IMG/download.jpg');\n");
      out.write("   background-repeat: no-repeat;\n");
      out.write("   background-size: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".full-screen-container {\n");
      out.write("  height: 100vh;\n");
      out.write("  width: 100vw;\n");
      out.write("  background-size: cover;\n");
      out.write("  background-position: center;\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-container {\n");
      out.write("  background-color: hsla(201, 100%, 6%, 0.6);\n");
      out.write("  padding: 50px 30px;\n");
      out.write("  min-width: 400px;\n");
      out.write("  width: 50%;\n");
      out.write("  max-width: 600px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-title {\n");
      out.write("  color: #fff;\n");
      out.write("  text-align: center;\n");
      out.write("  margin: 0;\n");
      out.write("  margin-bottom: 40px;\n");
      out.write("  font-size: 2.5em;\n");
      out.write("  font-weight: normal;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group {\n");
      out.write("  display: flex;\n");
      out.write("  flex-direction: column;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group label {\n");
      out.write("  color: #fff;\n");
      out.write("  font-weight: lighter;\n");
      out.write("  font-size: 1.5em;\n");
      out.write("  margin-bottom: 7px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group input {\n");
      out.write("  font-size: 1.5em;\n");
      out.write("  padding: 0.1em 0.25em;\n");
      out.write("  background-color: hsla(201, 100%, 91%, 0.3);\n");
      out.write("  border: 1px solid hsl(201, 100%, 6%);\n");
      out.write("  outline: none;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  color: #fff;\n");
      out.write("  font-weight: lighter;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group input:focus {\n");
      out.write("  border: 1px solid hsl(201, 100%, 50%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-button {\n");
      out.write("  padding: 10px 30px;\n");
      out.write("  width: 100%;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background: hsla(201, 100%, 50%, 0.1);\n");
      out.write("  border: 1px solid hsl(201, 100%, 50%);\n");
      out.write("  outline: none;\n");
      out.write("  font-size: 1.5em;\n");
      out.write("  color: #fff;\n");
      out.write("  font-weight: lighter;\n");
      out.write("  margin-top: 20px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-button:hover {\n");
      out.write("  background-color: hsla(201, 100%, 50%, 0.3);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-button:focus {\n");
      out.write("  background-color: hsla(201, 100%, 50%, 0.5);\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"AdminLog\">\n");
      out.write("            <div class=\"full-screen-container\">\n");
      out.write("      <div class=\"login-container\">\n");
      out.write("          <a  style=\"float: right; color: black\" href=\"http://localhost:8080//EmpTrackingSystem/\">X</a>\n");
      out.write("        <h3 class=\"login-title\">Admin Login</h3>\n");
      out.write("        <form>\n");
      out.write("          <div class=\"input-group\">\n");
      out.write("            <label>Email</label>\n");
      out.write("            <input type=\"email\" class=\"form-control\" name=\"txt_email\" id=\"floatingInput\" required />\n");
      out.write("          </div>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <label>Contact NUmber</label>\n");
      out.write("                <input type=\"Number\" class=\"form-control\" name=\"txt_num\" id=\"floatingInput\" required/>\n");
      out.write("            </div>\n");
      out.write("          <div class=\"input-group\">\n");
      out.write("            <label>Password</label>\n");
      out.write("            <input type=\"password\" class=\"form-control\" name=\"txt_pass\" id=\"floatingInput\" required />\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("          <div class=\"input-group\">\n");
      out.write("            <label>Re-Write Password</label>\n");
      out.write("            <input type=\"password\" class=\"form-control\" name=\"txt_pass\" id=\"floatingInput\" required />\n");
      out.write("          </div>\n");
      out.write("            <button type=\"submit\" class=\"login-button\" name=\"btn\" value=\"Login\">Sign Up</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
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
