package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.1/css/all.css\" integrity=\"sha384-O8whS3fhG2OnA5Kas0Y9l3cfpmYjapjI0E4theH4iuMD+pLhbf6JI0jIMfYcK3yZ\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"signUp.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"header\">\n");
      out.write("          <div class=\"package\">\n");
      out.write("              <div class=\"shop_name\">\n");
      out.write("                  <a href=\"home.jsp\"><h1>MiaShoes</h1></a>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"box_search\">\n");
      out.write("                  <span>Tìm Kiếm Sản Phẩm</span>\n");
      out.write("                  <div class=\"search\">\n");
      out.write("                      <form action=\"Search.jsp?type=1\" method=\"post\">\n");
      out.write("                            <input type=\"search\" name=\"str\" placeholder=\"Search\">\n");
      out.write("                            <input type=\"submit\" value=\"Tìm kiếm\" >\n");
      out.write("                        </form>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("              <!-- end-search -->\n");
      out.write("              <div class=\"infor\">\n");
      out.write("                <a href=\"\" class=\"account\">\n");
      out.write("                    <i class=\"fa fa-user\" aria-hidden=\"true\" id=\"show\"> Tài Khoản</i>\n");
      out.write("                    <div id=\"hide\">\n");
      out.write("                        <a href=\"SignUp.jsp\">\n");
      out.write("                            <i class=\"fa fa-user-plus\" aria-hidden=\"true\"> Đăng Ký</i>\n");
      out.write("                        </a>\n");
      out.write("                      <br>\n");
      out.write("                      <a href=\"SignIn.jsp\">\n");
      out.write("                          <i class=\"fa fa-sign-out\" aria-hidden=\"true\"> Đăng Nhập</i>\n");
      out.write("                      </a>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("<!--                <div class=\"product\">\n");
      out.write("                  <a href=\"\" class=\"cart\">\n");
      out.write("                    <i class=\"fa fa-shopping-cart\" aria-hidden=\"true\" id=\"cart\"></i>\n");
      out.write("                    <ul>\n");
      out.write("                      <li>Giỏ hàng</li>\n");
      out.write("                      <li>(0) Sản phẩm</li>\n");
      out.write("                    </ul>\n");
      out.write("                  </a>\n");
      out.write("                  <span>Không có sản phẩm nào trong giỏ hàng</span>\n");
      out.write("                </div>-->\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("          <!-- end-header -->\n");
      out.write("      <div class=\"menu\">\n");
      out.write("            <div class=\"package\">\n");
      out.write("                <ul class=\"menu-ngang\">\n");
      out.write("                  <li id=\"menu1\">\n");
      out.write("                      <a href=\"Search.jsp?str=nike&type=2\" class=\"item1\">NIKE</a>\n");
      out.write("                      <ul id=\"menu11\">\n");
      out.write("                        <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Air Force 1</a></li>\n");
      out.write("                        <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Air Jordan1</a></li>\n");
      out.write("                        <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Air Max 1</a></li>\n");
      out.write("                        <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Air Max 197</a></li>\n");
      out.write("                        <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Air Max 270</a></li>\n");
      out.write("                        <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Air Max 97</a></li>\n");
      out.write("                        <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Presto</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li id=\"menu1\">\n");
      out.write("                      <a href=\"Search.jsp?str=adidas&type=2\" class=\"item1\">ADIDAS</a>\n");
      out.write("                      <ul id=menu11>\n");
      out.write("                        <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">Stan Smith</a></li>\n");
      out.write("                        <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">SuperStar</a></li>\n");
      out.write("                        <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">Derup Runner</a></li>\n");
      out.write("                        <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">Tubular Doom</a></li>\n");
      out.write("                        <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">Falcom</a></li>\n");
      out.write("                        <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">Pod</a></li>\n");
      out.write("                        <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">Young1</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                      <li id=\"menu1\">\n");
      out.write("                         <a href=\"Search.jsp?str=luxury&type=2\" class=\"item1\">LUXURY</a>\n");
      out.write("                         <ul id=menu11 style=\"height: 100px;\">\n");
      out.write("                            <li><a href=\"Search.jsp?str=luxury&type=2\" id=\"item2\">Balenciaga</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=luxury&type=2\" id=\"item2\">Gucci</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=luxury&type=2\" id=\"item2\">MC Queen</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                      </li>\n");
      out.write("                      <li id=\"menu1\">\n");
      out.write("                         <a href=\"Search.jsp?str=vans&type=2\" class=\"item1\">VANS</a>\n");
      out.write("                         <ul id=menu11 style=\"height: 150px;\">\n");
      out.write("                            <li><a href=\"Search.jsp?str=vans&type=2\" id=\"item2\">Style 36</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=vans&type=2\" id=\"item2\">Slip on</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=vans&type=2\" id=\"item2\">Old Skool</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=vans&type=2\" id=\"item2\">Era 95</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=vans&type=2\" id=\"item2\">Sk8</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                      </li>\n");
      out.write("                      <li id=\"menu1\">\n");
      out.write("                         <a href=\"Search.jsp?str=convers&type=2\" class=\"item1\">CONVERS</a>\n");
      out.write("                         <ul id=menu11 style=\"height: 80px;\">\n");
      out.write("                            <li><a href=\"Search.jsp?str=convers&type=2\" id=\"item2\">1970s</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=convers&type=2\" id=\"item2\">Chuck 70s x CDG</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                      </li>\n");
      out.write("                      <li id=\"menu1\">\n");
      out.write("                         <a href=\"Search.jsp?str=fila&type=2\" class=\"item1\">FILA</a>\n");
      out.write("                         <ul id=menu11 style=\"height: 80px;\">\n");
      out.write("                            <li><a href=\"Search.jsp?str=fila&type=2\" id=\"item2\">Fila ray</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=fila&type=2\" id=\"item2\">Fila Disruptor II</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                      </li>\n");
      out.write("                      <li id=\"menu1\">\n");
      out.write("                         <a href=\"Search.jsp?str=the10&type=2\" class=\"item1\">THE10</a>\n");
      out.write("                      </li>\n");
      out.write("                      <li id=\"menu1\">\n");
      out.write("                         <a href=\"Search.jsp?str=fashion&type=2\" class=\"item1\">FASHION</a>\n");
      out.write("                         <ul id=menu11 style=\"height: 120px;\">\n");
      out.write("                            <li><a href=\"Search.jsp?str=fashion&type=2\" id=\"item2\">Áo Phông</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=fashion&type=2\" id=\"item2\">Áo Sơ Mi</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=fashion&type=2\" id=\"item2\">Quần Jeans</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=fashion&type=2\" id=\"item2\">Quần Âu</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                      </li>\n");
      out.write("                      <li id=\"menu1\">\n");
      out.write("                         <a href=\"\" class=\"item1\">SALES</a>\n");
      out.write("                      </li>\n");
      out.write("                      <li id=\"menu1\">\n");
      out.write("                         <a href=\"\" class=\"item1\">PHỤ KIỆN</a>\n");
      out.write("                      </li>\n");
      out.write("                      <li id=\"menu1\">\n");
      out.write("                         <a href=\"\" class=\"item1\">NHẬN THÔNG BÁO SALES</a>\n");
      out.write("                      </li>\n");
      out.write("                    </ul>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("          \n");
      out.write("      <!-- end-menu -->\n");
      out.write("        <div class=\"linked\">\n");
      out.write("            <div class=\"package\">\n");
      out.write("                <a href=\"\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i>Trang chủ</a>\n");
      out.write("                <span><i class=\"fa fa-chevron-right\" aria-hidden=\"true\"></i>Đăng ký tài khoản</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end-linked -->\n");
      out.write("        ");

            String error = request.getParameter("error");
            String username = "";
            String password = "";
            User user = null;
            if (!"".equals(error)) {
                username = request.getParameter("username");
                password = request.getParameter("password");
                user = (User) request.getAttribute("user");
                request.setAttribute("err", error);
            }
        
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form name=\"register\" action=\"SendMail.jsp\" method=\"post\" >\n");
      out.write("            <label for=\"lab\">Tài khoản </label> <input name=\"username\" type=\"text\" placeholder=\"example\"> <br> <br>\n");
      out.write("            <label for=\"lab\">Mật khẩu</label> <input name=\"password\" type=\"password\" placeholder=\"********\"> <br> <br>\n");
      out.write("            <label for=\"lab\">Họ và tên </label><input name=\"name\" type=\"text\" placeholder=\"Nguyễn Văn A\"> <br> <br>\n");
      out.write("            <label for=\"lab\">Email </label> <input name=\"email\" type=\"text\" placeholder=\"nguyenvana@gmal.com\"> <br> <br>\n");
      out.write("            <label for=\"lab\">Số điện thoại</label><input name=\"phone_number\" type=\"number\" placeholder=\"0123456789\"> <br> <br>\n");
      out.write("            <label for=\"lab\">Địa chỉ </label><input name=\"address\" type=\"text\" placeholder=\"Hà Nội\"> <br> <br>\n");
      out.write("            <div class=\"_58mq _5dbb\" id=\"birthday_wrapper\"><span class=\"mtm mbs _2_68 _7-1r\"><label>Ngày sinh</label></span>\n");
      out.write("            <div class=\"_5k_5\"><span class=\"_5k_4\" data-type=\"selectors\" data-name=\"birthday_wrapper\" id=\"u_0_x\"><span class=\"date\">                                                        \n");
      out.write("                        <select aria-label=\"Ngày\" name=\"day\" id=\"day\" title=\"Ngày\" class=\"_5dba _8esg\"><option value=\"0\">\n");
      out.write("                        Ngày</option><option value=\"1\">1</option><option value=\"2\">2</option><option value=\"3\">3</option><option value=\"4\">4</option><option value=\"5\">5</option><option value=\"6\">\n");
      out.write("                        6</option><option value=\"7\">7</option><option value=\"8\">8</option><option value=\"9\">9</option><option value=\"10\">10</option><option value=\"11\">11</option><option value=\"12\">\n");
      out.write("                        12</option><option value=\"13\">13</option><option value=\"14\">14</option><option value=\"15\">15</option><option value=\"16\">16</option><option value=\"17\">17</option><option value=\"18\">\n");
      out.write("                        18</option><option value=\"19\">19</option><option value=\"20\">20</option><option value=\"21\">21</option><option value=\"22\">22</option><option value=\"23\">23</option><option value=\"24\" selected=\"1\">24</option><option value=\"25\">25</option><option value=\"26\">26</option><option value=\"27\">\n");
      out.write("                        27</option><option value=\"28\">28</option><option value=\"29\">29</option><option value=\"30\">30</option><option value=\"31\">31</option></select><select aria-label=\"Tháng\" name=\"month\" id=\"month\" title=\"Tháng\" class=\"_5dba _8esg\"><option value=\"0\">\n");
      out.write("                        Tháng</option><option value=\"1\">Tháng 1</option><option value=\"2\">Tháng 2</option><option value=\"3\">Tháng 3</option><option value=\"4\">Tháng 4</option><option value=\"5\">Tháng 5</option><option value=\"6\">Tháng 6</option><option value=\"7\">\n");
      out.write("                        Tháng 7</option><option value=\"8\">Tháng 8</option><option value=\"9\">Tháng 9</option><option value=\"10\">Tháng 10</option><option value=\"11\" selected=\"1\">tháng 11</option><option value=\"12\">Tháng 12</option></select><select aria-label=\"Năm\" name=\"year\" id=\"year\" title=\"Năm\" class=\"_5dba _8esg\"><option value=\"0\">\n");
      out.write("                        Năm</option><option value=\"2019\">2019</option><option value=\"2018\">2018</option><option value=\"2017\">2017</option><option value=\"2016\">2016</option><option value=\"2015\">2015</option><option value=\"2014\">2014</option><option value=\"2013\">2013</option><option value=\"2012\">2012</option><option value=\"2011\">2011</option><option value=\"2010\">\n");
      out.write("                        2010</option><option value=\"2009\">2009</option><option value=\"2008\">2008</option><option value=\"2007\">2007</option><option value=\"2006\">2006</option><option value=\"2005\">2005</option><option value=\"2004\">2004</option><option value=\"2003\">2003</option><option value=\"2002\">2002</option><option value=\"2001\">2001</option><option value=\"2000\">\n");
      out.write("                        2000</option><option value=\"1999\">1999</option><option value=\"1998\">1998</option><option value=\"1997\">1997</option><option value=\"1996\">1996</option><option value=\"1995\">1995</option><option value=\"1994\" selected=\"1\">1994</option><option value=\"1993\">1993</option><option value=\"1992\">1992</option><option value=\"1991\">1991</option><option value=\"1990\">\n");
      out.write("                        1990</option><option value=\"1989\">1989</option><option value=\"1988\">1988</option><option value=\"1987\">1987</option><option value=\"1986\">1986</option><option value=\"1985\">1985</option><option value=\"1984\">1984</option><option value=\"1983\">1983</option><option value=\"1982\">1982</option><option value=\"1981\">1981</option><option value=\"1980\">\n");
      out.write("                        1980</option><option value=\"1979\">1979</option><option value=\"1978\">1978</option><option value=\"1977\">1977</option><option value=\"1976\">1976</option><option value=\"1975\">1975</option><option value=\"1974\">1974</option><option value=\"1973\">1973</option><option value=\"1972\">1972</option><option value=\"1971\">1971</option><option value=\"1970\">\n");
      out.write("                        1970</option><option value=\"1969\">1969</option><option value=\"1968\">1968</option><option value=\"1967\">1967</option><option value=\"1966\">1966</option><option value=\"1965\">1965</option><option value=\"1964\">1964</option><option value=\"1963\">1963</option><option value=\"1962\">1962</option><option value=\"1961\">1961</option><option value=\"1960\">\n");
      out.write("                        1960</option><option value=\"1959\">1959</option><option value=\"1958\">1958</option><option value=\"1957\">1957</option><option value=\"1956\">1956</option><option value=\"1955\">1955</option><option value=\"1954\">1954</option><option value=\"1953\">1953</option><option value=\"1952\">1952</option><option value=\"1951\">1951</option><option value=\"1950\">\n");
      out.write("                        1950</option><option value=\"1949\">1949</option><option value=\"1948\">1948</option><option value=\"1947\">1947</option><option value=\"1946\">1946</option><option value=\"1945\">1945</option><option value=\"1944\">1944</option><option value=\"1943\">1943</option><option value=\"1942\">1942</option><option value=\"1941\">1941</option><option value=\"1940\">\n");
      out.write("                        1940</option><option value=\"1939\">1939</option><option value=\"1938\">1938</option><option value=\"1937\">1937</option><option value=\"1936\">1936</option><option value=\"1935\">1935</option><option value=\"1934\">1934</option><option value=\"1933\">1933</option><option value=\"1932\">1932</option><option value=\"1931\">1931</option><option value=\"1930\">\n");
      out.write("                        1930</option><option value=\"1929\">1929</option><option value=\"1928\">1928</option><option value=\"1927\">1927</option><option value=\"1926\">1926</option><option value=\"1925\">1925</option><option value=\"1924\">1924</option><option value=\"1923\">1923</option><option value=\"1922\">1922</option><option value=\"1921\">1921</option><option value=\"1920\">\n");
      out.write("                        1920</option><option value=\"1919\">1919</option><option value=\"1918\">1918</option><option value=\"1917\">1917</option><option value=\"1916\">1916</option><option value=\"1915\">1915</option><option value=\"1914\">1914</option><option value=\"1913\">1913</option><option value=\"1912\">1912</option><option value=\"1911\">1911</option><option value=\"1910\">\n");
      out.write("                        1910</option><option value=\"1909\">1909</option><option value=\"1908\">1908</option><option value=\"1907\">1907</option><option value=\"1906\">1906</option><option value=\"1905\">1905</option></select></span></span><a class=\"_58ms mlm\" id=\"birthday-help\" href=\"#\" title=\"Nhấp chuột để biết thêm thông tin\" role=\"button\" aria-describedby=\"u_0_5\" tabindex=\"0\">\n");
      out.write("                        <i class=\"img sp_DsFT2tc46le_1_5x sx_74ad6c\"></i></a><i class=\"_5dbc _5k_6 img sp_DsFT2tc46le_1_5x sx_692903\"></i><i class=\"_5dbd _5k_7 img sp_DsFT2tc46le_1_5x sx_ba75b4\"></i><div class=\"_1pc_\"></div></div>           \n");
      out.write("            </div>\n");
      out.write("            <br><br>\n");
      out.write("            <label for=\"lab\">Giới tính </label> <input name=\"gender\" type=\"radio\" value=\"male\"> Nam \n");
      out.write("            <input name=\"gender\" type=\"radio\" value=\"female\"> Nữ \n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"submit\" value=\"Đăng ký\">\n");
      out.write("        </form>\n");
      out.write("        <!-- end register-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"information\">\n");
      out.write("            <div class=\"package\">\n");
      out.write("                <div class=\"information1\">\n");
      out.write("                    <h1>VỀ CỬA HÀNG</h1>\n");
      out.write("                    <span>MiaShoes chuyên Rep 1:1 cao cấp nhất thị trường.</span>\n");
      out.write("                    <div style=\"width:100%; height: 0.1em;background:rgb(181, 178, 178); margin-top:10px;margin-bottom: 10px;\"></div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Địa chỉ: Số 2 Trần Đại Nghĩa, Hà Nội, Việt Nam</li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"mailto:ngonam21021999@gmail.com\">Email:ngonam21021999@gmail.com</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"tel:123456789\">Điện thoại:123456789</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"\">Website:miashoes.vn</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"information2\">\n");
      out.write("                    <h1>THÔNG TIN</h1>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><i class=\"fa fa-chevron-right\" aria-hidden=\"true\"></i><a href=\"\">Trang chủ</a></li>\n");
      out.write("                        <li><i class=\"fa fa-chevron-right\" aria-hidden=\"true\"></i><a href=\"\">Giới thiệu</a></li>\n");
      out.write("                        <li><i class=\"fa fa-chevron-right\" aria-hidden=\"true\"></i><a href=\"\">Sản phẩm</a></li>\n");
      out.write("                        <li><i class=\"fa fa-chevron-right\" aria-hidden=\"true\"></i><a href=\"\">Khuyến mại</a></li>\n");
      out.write("                        <li><i class=\"fa fa-chevron-right\" aria-hidden=\"true\"></i><a href=\"\">Tin tức</a></li>\n");
      out.write("                        <li><i class=\"fa fa-chevron-right\" aria-hidden=\"true\"></i><a href=\"\">Liên hệ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"information2\" style=\"\">\n");
      out.write("                    <h1>HƯỚNG DẪN & CHÍNH SÁCH</h1>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><i class=\"fa fa-chevron-right\" aria-hidden=\"true\"></i><a href=\"\">Hướng dẫn mua hàng</a></li>\n");
      out.write("                        <li><i class=\"fa fa-chevron-right\" aria-hidden=\"true\"></i><a href=\"\">Thẻ Thành Viên</a></li>\n");
      out.write("                        <li><i class=\"fa fa-chevron-right\" aria-hidden=\"true\"></i><a href=\"\">Ship COD</a></li>\n");
      out.write("                        <li><i class=\"fa fa-chevron-right\" aria-hidden=\"true\"></i><a href=\"\">Chính sách bảo hành</a></li>\n");
      out.write("                        <li><i class=\"fa fa-chevron-right\" aria-hidden=\"true\"></i><a href=\"\">Chính sách đổi trả & hoàn tiền</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"payment\">\n");
      out.write("                    <h1>PHƯƠNG THỨC THANH TOÁN</h1>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><img src=\"css/pay1.png\" alt=\"\"></li>\n");
      out.write("                        <li><img src=\"css/pay2.png\" alt=\"\"></li>\n");
      out.write("                        <li><img src=\"css/pay3.png\" alt=\"\"></li>\n");
      out.write("                        <li><img src=\"css/pay4.png\" alt=\"\"></li>\n");
      out.write("                        <li><img src=\"css/pay5.png\" alt=\"\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <span><img src=\"css/cn.png\" alt=\"\" style=\"width:150px;\"></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end-information -->\n");
      out.write("        <div class=\"banner-end\">\n");
      out.write("            <div class=\"package\">\n");
      out.write("                <div class=\"banner-left\" style=\"color: black;\">© Bản quyền thuộc về <span style=\"color: white;\">MiaShoe</span></div>\n");
      out.write("                <div class=\"banner-right\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-facebook\" aria-hidden=\"true\" title=\"facebook\"></i></a></li>\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-instagram\" aria-hidden=\"true\" title=\"instagram\"></i></a></li>\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\" title=\"google\"></i></a></li>\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-twitter\" aria-hidden=\"true\" title=\"twitter\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end-banner -->\n");
      out.write("        <div class=\"contact\">\n");
      out.write("            <a href=\"tel:1234567\" title=\"tel:12345678\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"contact1\">\n");
      out.write("            <a href=\"http://www.facebook.com\"><i class=\"fab fa-facebook-messenger\"></i></a>\n");
      out.write("        </div>\n");
      out.write("        <!-- end-page -->\n");
      out.write("        <!-- javascript -->\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function checkName(){\n");
      out.write("                var name = document.getElementsByName(\"name\").value;\n");
      out.write("                if(name === ''){\n");
      out.write("                    alert('Họ và tên không hợp lệ')\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function checkPassword(){\n");
      out.write("                var password = document.getElementsByName(\"password\").value;\n");
      out.write("                if(password.length < 8){\n");
      out.write("                    alert('Mật khẩu không hợp lệ')\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function checkEmail() {\n");
      out.write("                var email = document.getElementById('email');\n");
      out.write("                var filter = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\n");
      out.write("                if (!filter.test(email.value)) {\n");
      out.write("                    alert('Hay nhap dia chi email hop le.\\nExample: ngvanA@gmail.com');\n");
      out.write("                    email.focus;\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function checkPhoneNumber() {\n");
      out.write("                var phoneNumber = document.getElementById('phone_number').value;\n");
      out.write("                var phoneRGEX = /(09|01[2|6|8|9])+([0-9]{8})\\b/g;\n");
      out.write("                var phoneResult = phoneRGEX.test(phoneNumber);\n");
      out.write("                if(!phoneRGEX.test(phoneNumber)){\n");
      out.write("                    alert(\"Số điện thoại không hợp lệ.\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${err eq '10'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
