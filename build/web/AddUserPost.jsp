<%-- 
    Document   : addUserPost
    Created on : Sep 5, 2019, 3:25:15 PM
    Author     : NHH
--%>

<%@page import="connectionjdbc.user.Security"%>
<%@page import="model.User"%>
<%@page import="connectionjdbc.user.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <body>
        <%
            String code = request.getParameter("code");
            if(code == Security.confirmCode){
                User user = (User) request.getAttribute("newUser");

                String username = (String) request.getAttribute("username");
                String password = (String) request.getAttribute("password");
                new UserService().addUser(user,username,password);
                response.sendRedirect("/SignIn.jsp");
            }else{
                response.sendRedirect("/Confirm.jsp?err=1");
            }
          
        %>
    </body>
</html>
