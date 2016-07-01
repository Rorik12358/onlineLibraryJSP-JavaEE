<%-- 
    Document   : index
    Created on : 21.06.2016, 10:50:49
    Author     : R2-D2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>
        <header>
            <div class="logo"></div>
        </header>
        <div class="content">
            <p>Добро пожаловать в онлайн библеотеку, где Вы сможете найти любую книгу на ваш вкус. Доступны функции поиска, просмотра, сортировки и многие другие.</p>
            <p>Проект находится в разработке, поэтому дизайн и функционал будет постоянно дорабатываться.</p>
            <p>По всем вопросам обращайтесь по адресу <a href="mazurov.rn@gmail.com">mazurov.rn@gmail.com</a></p>
            <form name="username" action="pages/main.jsp" method="POST">
                <h2>Для входа в библеотеку пожалуйста введите логи и пароль</h1>
                <span>Имя </span><input type="text" name="user_name" size="30">
                <input type="submit" value="Submit" id="button">
            </form>
        </div>
        <footer>
            <h3>Разработал Ромчик 2016</h3>
        </footer>
    </body>
</html>
