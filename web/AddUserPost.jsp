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
            String codeConfirm = (String) session.getAttribute("confirmCode");
            System.out.println("Add User Post : " + codeConfirm);
            if(code.equals(codeConfirm)){
                User user = (User) session.getAttribute("newUser");

                String username = (String) session.getAttribute("username");
                String password = (String) session.getAttribute("password");
                new UserService().addUser(user,username,password);
                response.sendRedirect("/ShoeShop/SignIn.jsp");
            }else{
                response.sendRedirect("/ShoeShop/Confirm.jsp?err=1");
            }
          
        %>
    </body>
</html>
