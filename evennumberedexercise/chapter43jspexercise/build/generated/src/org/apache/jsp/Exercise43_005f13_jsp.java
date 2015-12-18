package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import chapter43.Exercise43_13;

public final class Exercise43_005f13_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Exercise43_13</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      chapter43.Exercise43_13 poll = null;
      synchronized (application) {
        poll = (chapter43.Exercise43_13) _jspx_page_context.getAttribute("poll", PageContext.APPLICATION_SCOPE);
        if (poll == null){
          poll = new chapter43.Exercise43_13();
          _jspx_page_context.setAttribute("poll", poll, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("        <form method = \"post\" action = \"Exercise43_13b.jsp\">\n");
      out.write("            <table>\n");
      out.write("            ");
 for (int i = 0; i < poll.getQuestions().size(); i++) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                   <td>\n");
      out.write("                    <label>");
      out.print( poll.getQuestions().get(i) );
      out.write("</label>\n");
      out.write("                   </td>\n");
      out.write("                   <td>\n");
      out.write("                    <input type = \"radio\" name = ");
      out.print( "question" + i);
      out.write(" value = \"Yes\" /> Yes \n");
      out.write("                   </td>\n");
      out.write("                   <td>\n");
      out.write("                    <input type = \"radio\" name = ");
      out.print( "question" + i);
      out.write(" value = \"No\" /> No\n");
      out.write("                   </td>\n");
      out.write("                </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("                <p><input type = \"submit\" name = \"Submit\" value = \"Submit\">\n");
      out.write("                <input type = \"reset\" value = \"Reset\">\n");
      out.write("            </p>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
