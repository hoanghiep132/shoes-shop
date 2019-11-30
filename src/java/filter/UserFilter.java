/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

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
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author hiepnguyen
 */
@WebFilter(urlPatterns = { "/user/*"})
public class UserFilter implements Filter {
    

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        String url = req.getRequestURI();
        if(url.startsWith("/ShoeShop/user/")){
            Object object = session.getAttribute("currentUser");
            if(object != null){
                if(url.startsWith("/ShoeShop/user/employee/")){
                    User user = (User) object;
                    if("employee".equals(user.getRole()) || "admin".equals(user.getRole())){
                        chain.doFilter(request, response);
                    }else{
                        res.sendRedirect("/ShoeShop/user/MyAccount.jsp");
                    }
                }
                chain.doFilter(request, response);
            }else{
                res.sendRedirect("/ShoeShop/SignIn.jsp");
            }
        }if(url.startsWith("/ShoeShop/user/ShoeShop/")){
            int index = 0;
            for(int i = url.length() - 1; ;i-- ){
                if(url.charAt(i) == '/'){
                    index = i;
                    break;
                }
            }
            String sub = "/ShoeShop/" + url.substring(index, url.length());
            res.sendRedirect(sub);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


}
