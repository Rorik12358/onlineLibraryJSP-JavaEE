package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.BookList;
import java.util.List;
import beans.Book;
import beans.SearchType;
import beans.GenreList;
import beans.Genre;

public final class books_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/pages/../WEB-INF/jspf/left_menu.jspf");
    _jspx_dependants.add("/pages/../WEB-INF/jspf/letters.jspf");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
request.setCharacterEncoding("UTF-8");
    long genreId = 0;

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
long selectedGenreId = 0;
if(request.getParameter("genre_id")!=null){
    selectedGenreId = Long.parseLong(request.getParameter("genre_id"));
}
      out.write("\n");
      out.write("<div class=\"genres\">\n");
      out.write("    <h4>Жанры</h4>\n");
      out.write("    <ul>\n");
      out.write("        <li ><a href=\"books.jsp?genre_id=0&name=Все книги>\">Все книги</a></li>\n");
      out.write("        ");
      beans.GenreList genreList = null;
      synchronized (application) {
        genreList = (beans.GenreList) _jspx_page_context.getAttribute("genreList", PageContext.APPLICATION_SCOPE);
        if (genreList == null){
          genreList = new beans.GenreList();
          _jspx_page_context.setAttribute("genreList", genreList, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
 for (Genre genre : genreList.getGenreList()) {
        if(genre.getId()==selectedGenreId){
      out.write("\n");
      out.write("        <li><a style=\"color:red\" href=\"books.jsp?genre_id=");
      out.print(genre.getId());
      out.write("&name=");
      out.print(genre.getName());
      out.write('"');
      out.write('>');
      out.print(genre.getName());
      out.write("</a></li>\n");
      out.write("            ");
} else{
      out.write("\n");
      out.write("        <li ><a href=\"books.jsp?genre_id=");
      out.print(genre.getId());
      out.write("&name=");
      out.print(genre.getName());
      out.write('"');
      out.write('>');
      out.print(genre.getName());
      out.write("</a></li>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </ul>\n");
      out.write("</div> <!-- close genres-->\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"letters\">\n");
      out.write("    ");
      beans.LetterList letterList = null;
      synchronized (application) {
        letterList = (beans.LetterList) _jspx_page_context.getAttribute("letterList", PageContext.APPLICATION_SCOPE);
        if (letterList == null){
          letterList = new beans.LetterList();
          _jspx_page_context.setAttribute("letterList", letterList, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
String searchLetter = null;
    if(request.getParameter("letter")!=null){
        searchLetter = request.getParameter("letter");
        session.setAttribute("letter", searchLetter);
} else if(session.getAttribute("letter")!=null){
    searchLetter = session.getAttribute("letter").toString();
}
    char[] russianLetters = letterList.getRussianLetters();
    for (int i = 0; i < russianLetters.length; i++){
        if(searchLetter!=null && searchLetter.toUpperCase().charAt(0)==russianLetters[i]){
      out.write("\n");
      out.write("        <a href=\"books.jsp?letter=");
      out.print(russianLetters[i]);
      out.write("\" style=\"color: red\">");
      out.print(russianLetters[i]);
      out.write("</a>\n");
      out.write("        ");
}else{
      out.write("\n");
      out.write("        <a href=\"books.jsp?letter=");
      out.print(russianLetters[i]);
      out.write('"');
      out.write('>');
      out.print(russianLetters[i]);
      out.write("</a>\n");
      out.write("    ");
}
    }
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"books\">\n");
      out.write("    <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("    ");
List<Book> books = null;
    BookList bookList = new BookList();
    if(request.getParameter("genre_id")!=null){
        books = bookList.getBooksByGenre(Long.parseLong(request.getParameter("genre_id")));
    } else if(request.getParameter("letter")!=null){
        String letter = request.getParameter("letter");
        books = bookList.getBooksByLetter(letter);
//        session.setAttribute("letter", letter);
    } else if(request.getParameter("search_string")!=null){
        String searchStr = request.getParameter("search_string");
        SearchType searchType;
        if (request.getParameter("search_option").equals("Название")){
            searchType = SearchType.TITLE;
        } else {
            searchType = SearchType.AUTHOR;
        }
        session.setAttribute("search_option", request.getParameter("search_option"));
        books = bookList.getBooksBySearch(searchStr, searchType);
    }
    session.setAttribute("curentBooks", books);
        for (Book book : books) {
      out.write("\n");
      out.write("        <div class=\"book\">\n");
      out.write("            <div class=\"title\">\n");
      out.write("                <p>");
      out.print( book.getName());
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cover_image\">\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath());
      out.write("/ShowImage?index=");
      out.print(books.indexOf(book));
      out.write("\" alt=\"");
      out.print(request.getContextPath());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"book_details\">\n");
      out.write("                <br><strong>ISBN:</strong> ");
      out.print(book.getIsbn());
      out.write("\n");
      out.write("                <br><strong>Год издания:</strong> ");
      out.print(book.getGenre());
      out.write("\n");
      out.write("                <br><strong>Издательство:</strong> ");
      out.print(book.getPublisher() );
      out.write("\n");
      out.write("                <br><strong>Количество страниц:</strong> ");
      out.print(book.getPages());
      out.write("\n");
      out.write("                <br><strong>Год издания:</strong> ");
      out.print(book.getPublishDateFormat() );
      out.write("\n");
      out.write("                <br><strong>Автор:</strong> ");
      out.print(book.getAuthor() );
      out.write("\n");
      out.write("                <p style=\"margin:10px;\"> <a href=\"contant.jsp?index=");
      out.print(books.indexOf(book));
      out.write("\">Читать</a></p>\n");
      out.write("         </div>  \n");
      out.write("        </div>  \n");
      out.write("        ");
}
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
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
