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
import javax.servlet.http.HttpSession;
import model.User;



@WebFilter (urlPatterns = {"/filterJSP.jsp"} )
public class AccountFilter implements Filter{

    private UserService userService;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        userService = new UserService();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
 
        String username  = req.getParameter("username");
        String password  = req.getParameter("password");
        
        HttpSession session = req.getSession();

        if(!username.equals("") && !password.equals("")){
            User user = new UserService().getAccount(username, password);
            if(user != null){
                session.setAttribute("id_user", user.getId());
                chain.doFilter(request, response);
            }else{
                res.sendRedirect("/SignIn.jsp?error=1");
            }
        }else{
            res.sendRedirect("/SignIn.jsp?error=2");
        }
        
        
    }

    @Override
    public void destroy() {

    }


 

    
}
