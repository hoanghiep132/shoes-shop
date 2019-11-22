<%-- 
    Document   : addUserPost
    Created on : Sep 5, 2019, 3:25:15 PM
    Author     : NHH
--%>

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
            UserService userService = new UserService();
            User user = new User();
            
            user.setName(request.getParameter("name"));
            user.setEmail(request.getParameter("email"));
            user.setPhoneNumber(request.getParameter("phone"));
            user.setRole(request.getParameter("role"));
            user.setAvatar(request.getParameter("avatar"));
            user.setAddress(request.getParameter("address"));
            user.setBirthday(request.getParameter("birthday"));
            user.setGender(request.getParameter("gender"));
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            userService.addUser(user,username,password);
            response.sendRedirect("/SignIn.jsp");
          
        %>
    </body>
</html>
