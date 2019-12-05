<%-- 
    Document   : SendMail3
    Created on : Dec 4, 2019, 8:45:54 AM
    Author     : hiepnguyen
--%>

<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@page import="model.TempProduct"%>
<%@page import="javax.mail.PasswordAuthentication"%>
<%@page import="model.MyGmail"%>
<%@page import="java.util.Properties"%>
<%@page import="javax.mail.Session"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.Transport"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            User user = (User) session.getAttribute("currentUser");
            String msg = user.sendEmail();
            //Get properties object    
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            //get Session   
            Session ses = Session.getInstance(props, 
                    new javax.mail.Authenticator(){
                        protected PasswordAuthentication getPasswordAuthentication(){
                            return new javax.mail.PasswordAuthentication(MyGmail.username, MyGmail.password);
                        }
                    });
            //compose message    
            try {
                MimeMessage message = new MimeMessage(ses);
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(user.getEmail()));
                message.setSubject("Thông báo đặt hàng");
                message.setText(msg);
                //send message  
                Transport.send(message);
                System.out.println("message sent successfully");
                response.sendRedirect("/ShoeShop/user/Thanks.jsp");
                
            } catch (javax.mail.MessagingException ex) {
                System.err.println("Failed");
                response.sendRedirect("/ShoeShop/BuyNow.jsp?error=1");
            }
        %>
    </body>
</html>
