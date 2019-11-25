/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import connectionjdbc.user.UserService;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;


@WebFilter (urlPatterns = {"/Filter.jsp"} )
public class SignUpFilter implements Filter {
    
    private static final boolean debug = true;
    private UserService userService;

    private FilterConfig filterConfig = null;
    
    public SignUpFilter() {
    }    
    
    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        if (debug) {
            log("SignUpFilter:DoBeforeProcessing");
        }

       
    }    
    
    private void doAfterProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        if (debug) {
            log("SignUpFilter:DoAfterProcessing");
        }

        
    }

    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
        String name  = request.getParameter("name");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phone_number");
        String avatar = request.getParameter("avatar");
        String address = request.getParameter("address");
        //user.setBirthday(request.getParameter("birthday"));
        String day = request.getParameter("day");
        String month = request.getParameter("month");
        String year = request.getParameter("year");
        String birthday = year+"/"+month+"/"+day;
        String gender = request.getParameter("gender");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(name,email,phoneNumber,gender,address,birthday,avatar);
        req.setAttribute("newUser", user);
        req.setAttribute("username", username);
        req.setAttribute("password", password);
        if(userService.getUserByEmail(email) != null){
            res.sendRedirect("/SignUp.jsp?error=1");
        } else if(userService.getUserByPhonenNumber(phoneNumber) != null){
            res.sendRedirect("/SignUp.jsp?error=2");
        } else if(userService.checkUsername(username)){
            res.sendRedirect("/SignUp.jsp?error=3");
        }else{
            
        }
        chain.doFilter(request, response);
    }

 
    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }

 
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

   
    public void destroy() {        
    }


    public void init(FilterConfig filterConfig) {        
        userService = new UserService();
    }


    @Override
    public String toString() {
        if (filterConfig == null) {
            return ("SignUpFilter()");
        }
        StringBuffer sb = new StringBuffer("SignUpFilter(");
        sb.append(filterConfig);
        sb.append(")");
        return (sb.toString());
    }
    
    private void sendProcessingError(Throwable t, ServletResponse response) {
        String stackTrace = getStackTrace(t);        
        
        if (stackTrace != null && !stackTrace.equals("")) {
            try {
                response.setContentType("text/html");
                PrintStream ps = new PrintStream(response.getOutputStream());
                PrintWriter pw = new PrintWriter(ps);                
                pw.print("<html>\n<head>\n<title>Error</title>\n</head>\n<body>\n"); //NOI18N

                // PENDING! Localize this for next official release
                pw.print("<h1>The resource did not process correctly</h1>\n<pre>\n");                
                pw.print(stackTrace);                
                pw.print("</pre></body>\n</html>"); //NOI18N
                pw.close();
                ps.close();
                response.getOutputStream().close();
            } catch (Exception ex) {
            }
        } else {
            try {
                PrintStream ps = new PrintStream(response.getOutputStream());
                t.printStackTrace(ps);
                ps.close();
                response.getOutputStream().close();
            } catch (Exception ex) {
            }
        }
    }
    
    public static String getStackTrace(Throwable t) {
        String stackTrace = null;
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            t.printStackTrace(pw);
            pw.close();
            sw.close();
            stackTrace = sw.getBuffer().toString();
        } catch (Exception ex) {
        }
        return stackTrace;
    }
    
    public void log(String msg) {
        filterConfig.getServletContext().log(msg);        
    }
    
}
