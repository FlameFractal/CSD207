package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Exercise43_005f15_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      chapter43.AdditionTutor additionTutor = null;
      synchronized (session) {
        additionTutor = (chapter43.AdditionTutor) _jspx_page_context.getAttribute("additionTutor", PageContext.SESSION_SCOPE);
        if (additionTutor == null){
          additionTutor = new chapter43.AdditionTutor();
          _jspx_page_context.setAttribute("additionTutor", additionTutor, PageContext.SESSION_SCOPE);
          out.write('\n');
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>\n");
      out.write("      Subtraction Quiz\n");
      out.write("    </title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <form method = \"post\" action = \"Exercise43_15DisplayResult.jsp\">\n");
      out.write("      ");
 additionTutor.refresh(); 
      out.write("\n");
      out.write("      <table>\n");
      out.write("        ");
 for (int i = 0; i < 10; i++) { 
      out.write("\n");
      out.write("        <tr>\n");
      out.write("          <td>\n");
      out.write("            ");
      out.print( Math.max(additionTutor.number1[i], additionTutor.number2[i]) );
      out.write(" \n");
      out.write("          </td>\n");
      out.write("          <td>\n");
      out.write("            - \n");
      out.write("          </td>\n");
      out.write("          <td>");
      out.print( Math.min(additionTutor.number1[i], additionTutor.number2[i]) );
      out.write(" \n");
      out.write("          </td>\n");
      out.write("          <td>\n");
      out.write("            = \n");
      out.write("          </td>\n");
      out.write("          <td>\n");
      out.write("            <input name = \"");
      out.print( "result" + i);
      out.write("\" size = 2/>\n");
      out.write("          </td>\n");
      out.write("        </tr>  \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("      </table> \n");
      out.write("            <br />\n");
      out.write("      <input type = \"submit\" name = \"Submit\" \n");
      out.write("      value = \"Submit\" /> Click the browser's Refresh button to get a new quiz\n");
      out.write("    </form>\n");
      out.write("  </body>\n");
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
