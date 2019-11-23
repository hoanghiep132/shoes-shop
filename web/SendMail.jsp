<%-- 
    Document   : SendMail
    Created on : Nov 23, 2019, 4:08:34 PM
    Author     : hiepnguyen
--%>


<%@page import="model.MyGmail"%>
<%@page import="model.User"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="connectionjdbc.user.Security"%>
<%@page import="com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException"%>
<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.Session"%>
<%@page import="java.util.Properties"%>
<%@page import="javax.mail.PasswordAuthentication"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            User user = new User();
            user.setName(request.getParameter("name"));
            user.setEmail(request.getParameter("email"));
            user.setPhoneNumber(request.getParameter("phone_number"));
            user.setAvatar(request.getParameter("avatar"));
            user.setAddress(request.getParameter("address"));
            user.setBirthday(request.getParameter("birthday"));
            user.setGender(request.getParameter("gender"));
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            request.setAttribute("user", user);
            Security security = new Security();

            //Get properties object    
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            //get Session   
            Session ses = Session.getDefaultInstance(props, 
                    new javax.mail.Authenticator(){
                        protected PasswordAuthentication getPasswordAuthentication(){
                            return new javax.mail.PasswordAuthentication(MyGmail.username, MyGmail.password);
                        }
                    });
            
            //compose message    
            try {
                MimeMessage message = new MimeMessage(ses);
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(request.getParameter("name")));
                message.setSubject("Confirm Email");
                message.setText(security.getConfirmCode());
                //send message  
                Transport.send(message);
                System.out.println("message sent successfully");
                response.sendRedirect("Confirm.jsp");
            } catch (javax.mail.MessagingException ex) {
                response.sendRedirect("SignUp.jsp?error=10&username=" + username + "&password=" + password);
            }
        %>
    </body>
</html>
