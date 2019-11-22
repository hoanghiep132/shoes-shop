<%-- 
    Document   : upLoadFile
    Created on : Aug 30, 2019, 11:42:20 PM
    Author     : NHH
--%>

<%@page import="connectionjdbc.user.UserService"%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Image</title>
    </head>
    <body>
        <%
            int id = Integer.valueOf(request.getParameter("id"));
            String url = "";
            DiskFileItemFactory diskFileItemFactory =new DiskFileItemFactory();
            diskFileItemFactory.setRepository(new File("/home/hiepnguyen/NetBeansProjects/ShoeShop/web/"));
            
            ServletFileUpload fileUpload = new ServletFileUpload(diskFileItemFactory);
            List<FileItem> fileItems = fileUpload.parseRequest(request);
            
            for(FileItem fileItem : fileItems){
                if(!fileItem.isFormField()){
                    if(fileItem.getFieldName().equals("file")){
                        File file = new File("/home/hiepnguyen/NetBeansProjects/ShoeShop/web/" + fileItem.getName());
                        fileItem.write(file);
                        url = fileItem.getName();
                    }
                }
            }
            User user = new User();
            user.setId(id);
            user.setAvatar(url);
            UserService userService = new UserService();
            userService.updateAvatarUserById(user);
            
            response.sendRedirect("/viewUser.jsp?id="+id);
        %>
        
        <img src="<%=url%>">
    </body>
</html>
