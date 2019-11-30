

<%@page import="connectionjdbc.user.UserService"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    
    <body>
        <% 
            //User user = (User) session.getAttribute("currentUser");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            User user = new UserService().getAccount(username, password);
            session.setAttribute("currentUser", user);
            if(user.getRole().equals("admin")){
                response.sendRedirect("employee/ListEmployee.jsp");
            }else if(user.getRole().equals("employee")){
                response.sendRedirect("employee/ListCus.jsp");
            }else{
                response.sendRedirect("home.jsp");
            }
        %>
    </body>
</html>
