<%-- 
    Document   : book
    Created on : 26.06.2016, 11:16:23
    Author     : R2-D2
--%>

<%@page import="beans.BookList"%>
<%@page import="java.util.List"%>
<%@page import="beans.Book"%>
<%@page import="beans.SearchType" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%request.setCharacterEncoding("UTF-8");
    long genreId = 0;
%>
<%@include file="../WEB-INF/jspf/left_menu.jspf" %>
<%@include file="../WEB-INF/jspf/letters.jspf" %>

<div class="books">
    <h3>${param.name}</h3>
    <%List<Book> books = null;
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
    } else if (request.getSession().getAttribute("curentBooks")!=null){
        books = (List)request.getSession().getAttribute("curentBooks");
    }
    session.setAttribute("curentBooks", books);
        for (Book book : books) {%>
        <div class="book">
            <div class="title">
                <p><%= book.getName()%></p>
            </div>
            <div class="cover_image">
                <img src="<%=request.getContextPath()%>/ShowImage?index=<%=books.indexOf(book)%>" alt="<%=request.getContextPath()%>">
            </div>
            <div class="book_details">
                <br><strong>ISBN:</strong> <%=book.getIsbn()%>
                <br><strong>Год издания:</strong> <%=book.getGenre()%>
                <br><strong>Издательство:</strong> <%=book.getPublisher() %>
                <br><strong>Количество страниц:</strong> <%=book.getPages()%>
                <br><strong>Год издания:</strong> <%=book.getPublishDateFormat() %>
                <br><strong>Автор:</strong> <%=book.getAuthor() %>
                <p style="margin:10px;"> <a href="contant.jsp?index=<%=books.indexOf(book)%>">Читать</a></p>
         </div>  
        </div>  
        <%}%>
</div>

