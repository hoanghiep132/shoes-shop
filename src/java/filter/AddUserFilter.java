/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import connectionjdbc.user.UserService;
import java.io.IOException;
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

/**
 *
 * @author hiepnguyen
 */

@WebFilter (urlPatterns = {"/Filter.jsp"} )
public class AddUserFilter implements Filter{

    private UserService userService;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        userService = new UserService();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
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
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}