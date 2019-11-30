<%-- 
    Document   : UpLoadImgToCloud
    Created on : Nov 22, 2019, 9:45:09 PM
    Author     : hiepnguyen
--%>

<%@page import="model.User"%>
<%@page import="connectionjdbc.user.UserService"%>
<%@page import="upload.Upload"%>
<%@page import="com.cloudinary.utils.ObjectUtils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.cloudinary.Cloudinary"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int id = Integer.parseInt(request.getParameter("id"));
            String ava = "";
            String file = request.getParameter("file");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phoneNumber = request.getParameter("phone_number");
            String address = request.getParameter("address");
            String gender = request.getParameter("gender");
            if("".equals(file)){
                Upload upload = new Upload();
                ava = upload.uploadAvatarToCloud(file);
            }
            User user = new User();
            user.setId(id);
            user.setAvatar(ava);
            user.setName(name);
            user.setAddress(address);
            user.setEmail(email);
            user.setGender(gender);
            user.setPhoneNumber(phoneNumber);
            user.setBirthday("1999/01/01");
            new UserService().updateUser(user);
            response.sendRedirect("/EditInforUser.jsp?id="+id);
        %>
    </body>
</html>
