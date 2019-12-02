<%-- 
    Document   : LogOut
    Created on : Sep 6, 2019, 4:05:13 PM
    Author     : NHH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.removeAttribute("currentUser");
            response.sendRedirect("/ShoeShop/SignIn.jsp");
        %>
    </body>
</html>
