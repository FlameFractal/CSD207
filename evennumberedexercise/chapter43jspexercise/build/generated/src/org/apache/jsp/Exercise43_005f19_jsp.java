package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Exercise43_005f19_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String message = "";
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html;charset=windows-1252");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      chapter43.Exercise43_19 backend = null;
      synchronized (session) {
        backend = (chapter43.Exercise43_19) _jspx_page_context.getAttribute("backend", PageContext.SESSION_SCOPE);
        if (backend == null){
          backend = new chapter43.Exercise43_19();
          _jspx_page_context.setAttribute("backend", backend, PageContext.SESSION_SCOPE);
          out.write('\n');
        }
      }
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("backend"), request);
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

            if (request.getParameter("submit") != null) {
                if (request.getParameter("submit").toString().equalsIgnoreCase("view")) {
                    backend.view(request);
                } else if (request.getParameter("submit").toString().equalsIgnoreCase("insert")) {
                    message = backend.insert(request) + " rows affected.";
                } else if (request.getParameter("submit").toString().equalsIgnoreCase("update")) {
                    message = backend.update(request) + " rows affected.";
                } else if (request.getParameter("submit").toString().equalsIgnoreCase("reset")) {
                    backend.reset();
                }
            }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Exercise43_19</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>Staff Information</legend>\n");
      out.write("                        <form action='Exercise43_19.jsp' method='post'>\n");
      out.write("                            <p>\n");
      out.write("                                <label >ID: </label><input name=\"id\" value = ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((chapter43.Exercise43_19)_jspx_page_context.findAttribute("backend")).getId())));
      out.write(" ><br /><br />\n");
      out.write("                                <label >First Name: </label><input name=\"firstname\" value = ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((chapter43.Exercise43_19)_jspx_page_context.findAttribute("backend")).getFirstname())));
      out.write(" >\n");
      out.write("                                <label for='mi'>Middle Initial: </label><input type='text' size = \"1\" name='mi' value = ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((chapter43.Exercise43_19)_jspx_page_context.findAttribute("backend")).getMi())));
      out.write(" >\n");
      out.write("                                <label for='lastname'>Last Name: </label><input type='text' name='lastname' value = ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((chapter43.Exercise43_19)_jspx_page_context.findAttribute("backend")).getLastname())));
      out.write(" ><br /><br />\n");
      out.write("                                <label for='address'>Address: </label><input type='text' name='address' value = ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((chapter43.Exercise43_19)_jspx_page_context.findAttribute("backend")).getAddress())));
      out.write(" ><br /><br />\n");
      out.write("                                <label for='city'>City: </label><input type='text' name='city' value = ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((chapter43.Exercise43_19)_jspx_page_context.findAttribute("backend")).getCity())));
      out.write(" >\n");
      out.write("                                <label for='state'>State: </label><input type='text' name='state' value = ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((chapter43.Exercise43_19)_jspx_page_context.findAttribute("backend")).getState())));
      out.write(" ><br /><br />\n");
      out.write("                                <label for='telephone'>Telephone: </label><input type='text' name='telephone' value = ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((chapter43.Exercise43_19)_jspx_page_context.findAttribute("backend")).getTelephone())));
      out.write(" >\n");
      out.write("                                <label for='email'>Email: </label><input type='text' name='email' value = ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((chapter43.Exercise43_19)_jspx_page_context.findAttribute("backend")).getEmail())));
      out.write(" ><br />\n");
      out.write("\n");
      out.write("                            </fieldset>\n");
      out.write("                            </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr align=\"center\">\n");
      out.write("                                <td>\n");
      out.write("                                    <button name='submit' value='view' type='submit'>View</button>\n");
      out.write("                                    <button name='submit' value='insert' type='submit'>Insert</button>\n");
      out.write("                                    <button name='submit' value='update' type='submit'>Update</button>\n");
      out.write("                                    <button name='submit' value='reset' type='submit'>Reset</button>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr align=\"center\">\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      out.print( message);
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </form>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
