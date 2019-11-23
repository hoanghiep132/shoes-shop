<%-- 
    Document   : SendMail
    Created on : Nov 23, 2019, 4:08:34 PM
    Author     : hiepnguyen
--%>

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

            // Recipient's email ID needs to be mentioned.
            String to = request.getParameter("email");

            // Sender's email ID needs to be mentioned
            String from = "nguyenhoanghiep@gmail.com";

            // Assuming you are sending email from localhost
            String host = "localhost";

            // Get system properties object
            Properties properties = System.getProperties();

            // Setup mail server
            properties.setProperty("mail.smtp.host", host);

            // Get the default Session object.
            Session mailSession = Session.getDefaultInstance(properties);

            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(mailSession);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            // Set Subject: header field
            message.setSubject("Confirm Email");

            // Now set the actual message
            message.setText(security.getConfirmCode());

            // Send message
            try {
                Transport.send(message);
                response.sendRedirect("Confirm.jsp");
            } catch (javax.mail.MessagingException ex) {
                response.sendRedirect("SignUp.jsp?error=10&username="+username+"&password="+password);
            }
        %>
    </body>
</html>
