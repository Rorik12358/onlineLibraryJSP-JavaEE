package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contant_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>main</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/styleForMain.css\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Lora:700' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    ");
 request.setCharacterEncoding("UTF-8");
    Object searchOption;
    if(request.getParameter("search_option")!=null){
        searchOption = request.getParameter("search_option");
    }else{
        searchOption=session.getAttribute("search_option");
    }
    String selected1 = "";
    String selected2 = "";
    if(searchOption!=null && searchOption.equals("Название")){
        selected1 = "selected";
    }
    if(searchOption!=null && searchOption.equals("Автор")){
        selected2 = "selected";
    }
    String searchString = "";
    if(request.getParameter("search_string")!=null){
        searchString = request.getParameter("search_string");
        session.setAttribute("search_string", searchString);
    } else if (session.getAttribute("search_string")!=null){
        searchString = (String)session.getAttribute("search_string");
    } else {
        session.setAttribute("search_string", searchString);
    }
    if (request.getParameter("user_name")!=null){
        session.setAttribute("user_name", request.getParameter("user_name"));
    }
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <img src=\"../images/Library-Logo.png\" alt=\"Library Logo\">\n");
      out.write("            <a id=\"exit\" href=\"#\">Выйти</a>\n");
      out.write("            <h1>Онлайн библиотека\"JavaLib\"</h1>\n");
      out.write("            <p>Добро пожаловать ");
      out.print(session.getAttribute("user_name"));
      out.write("!</p>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"serch\">\n");
      out.write("                <form class=\"serchForm\" name=\"serchForm\" method=\"GET\" action=\"books.jsp\">\n");
      out.write("                    <img src=\"../images/Zoom_SH.png\" alt=\"serch image\">\n");
      out.write("                    <input type=\"text\" name=\"search_string\" value=\"");
      out.print(searchString);
      out.write("\" id=\"textArea\">\n");
      out.write("                    <input type=\"submit\" value=\"Search\" id=\"btn\">\n");
      out.write("                    <select name=\"search_option\">\n");
      out.write("                        <option ");
      out.print(selected1);
      out.write(">Название</option>\n");
      out.write("                        <option ");
      out.print(selected2);
      out.write(">Автор</option>\n");
      out.write("                    </select>\n");
      out.write("                </form> <!-- close serchForm-->\n");
      out.write("            </div> <!-- close search-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("        <div class=\"pdf_viewer\">\n");
      out.write("            ");
System.out.println("aplet "+request.getContextPath());
      out.write("\n");
      out.write("            <applet CODE=\"EmbedPDF.class\" archive=\"");
      out.print(getServletContext().getContextPath());
      out.write("/jars/EmbedPDF.jar\" WIDTH=\"900\" HEIGHT=\"900\">\n");
      out.write("                <!-- The URL of the PDF document that we want to show: -->\n");
      out.write("\n");
      out.write("                <param name=\"pdf\" value=\"");
      out.print( request.getContextPath());
      out.write("/PdfContent?index=");
      out.print(request.getParameter("index"));
      out.write("&session_id=");
      out.print(request.getSession().getId());
      out.write("\"/> \n");
      out.write("\n");
      out.write("                <!-- Whether users may open the PDF document in a new window: -->\n");
      out.write("                <param name=\"enableOpenWindow\" value=\"true\"/>\n");
      out.write("\n");
      out.write("                <!-- Whether the PDF is rendered with subpixel-antialiasing (may be slow and needs more memory) -->\n");
      out.write("                <param name=\"enableSubpixAA\" value=\"true\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- The following parameters are recommended to improve usability and\n");
      out.write("                     performance of the applet when run with Sun's Java Plugin: -->\n");
      out.write("\n");
      out.write("                <!-- whether language-specific texts shall be looked up on the server. -->\n");
      out.write("                <param name=\"codebase_lookup\" value=\"false\"/>\n");
      out.write("\n");
      out.write("                <!-- whether the code of the applet shall be shared with other applets. -->\n");
      out.write("                <param name=\"classloader_cache\" value=\"false\"/>\n");
      out.write("\n");
      out.write("                <!-- Whether the server provides a highly compressed .pack.gz-version of the applet.\n");
      out.write("                     The amount of memory that the applet may use (128m is 128 mega bytes).\n");
      out.write("                -->\n");
      out.write("                <param name=\"java_arguments\" value=\"-Djnlp.packEnabled=true -Xmx128m\"/>\n");
      out.write("\n");
      out.write("                <!-- the splash screen to show, while the applet loads. -->\n");
      out.write("                <param name=\"image\" value=\"");
      out.print(getServletContext().getContextPath());
      out.write("/images/splash.gif\"/>\n");
      out.write("\n");
      out.write("                <!-- the border of the splash screen. -->\n");
      out.write("                <param name=\"boxborder\" value=\"false\"/>\n");
      out.write("\n");
      out.write("                <!-- whether the splash screen shall be centered. -->\n");
      out.write("                <param name=\"centerimage\" value=\"true\"/>\n");
      out.write("\n");
      out.write("            </applet>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div><!-- close row-->\n");
      out.write("        </div> <!-- close content-->\n");
      out.write("        <footer></footer>\n");
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
