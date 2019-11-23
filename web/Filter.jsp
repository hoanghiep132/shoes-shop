

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
            String name = request.getParameter("username");
            UserService  userService = new UserService();
            User user = userService.getUserByName(name);
            if(user.getRole().equals("admin")){
                session.setAttribute("currentUser", user);
                response.sendRedirect("/listEmployee.jsp");
            }else if(user.getRole().equals("employee")){
               session.setAttribute("currentUser", user);
            }else{
                session.setAttribute("currentUser", user);
                response.sendRedirect("/home.jsp");
            }
        %>
    </body>
</html>
