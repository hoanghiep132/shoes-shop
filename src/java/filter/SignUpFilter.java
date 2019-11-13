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


@WebFilter (urlPatterns = {"/AddUserPost.jsp"})
public class SignUpFilter implements Filter{

    private UserService userService;
    private User user;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        userService = new UserService();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String username = req.getParameter("username");


        //filter

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        
    }
    
    
    
}
