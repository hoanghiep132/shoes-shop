package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import other.Other;
import connectionjdbc.product.ProductService;
import model.Product;
import java.util.List;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>MiaShoes</title>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.1/css/all.css\" \n");
      out.write("              integrity=\"sha384-O8whS3fhG2OnA5Kas0Y9l3cfpmYjapjI0E4theH4iuMD+pLhbf6JI0jIMfYcK3yZ\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"search.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            List<Product> list = null;
            String type = "2";
            String str = "adidas";
            if ("1".equals(type)) {
                list = new ProductService().searchProductForName(str);
            } else {
                String option = request.getParameter("option");
                list = new ProductService().getAllProductForBrand(str);
                if("1".equals(option)){
                  list = new ProductService().orderProductAscendingByName(list);
                }else if("2".equals(option)){
                    list = new ProductService().orderProductDescendingByName(list);    
                }else if("3".equals(option)){
                   list = new ProductService().orderProductAscendingByPrice(list); 
                }else{
                    list = new ProductService().orderProductDescendingByPrice(list);
                }
            }
            request.setAttribute("list", list);
            int amount = list.size();
            request.setAttribute("a", amount);

        
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"package\">\n");
      out.write("                <div class=\"shop_name\">\n");
      out.write("                    <a href=\"home.jsp\"><h1>MiaShoes</h1></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box_search\">\n");
      out.write("                    <span>Tìm Kiếm Sản Phẩm</span>\n");
      out.write("                    <div class=\"search\">\n");
      out.write("                        <form action=\"Search.jsp?type=1\" method=\"post\">\n");
      out.write("                            <input type=\"search\" name=\"str\" placeholder=\"Search\">\n");
      out.write("                            <input type=\"submit\" value=\"Tìm kiếm\" >\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end-search -->\n");
      out.write("                <div class=\"infor\">\n");
      out.write("                    <a href=\"\" class=\"account\">\n");
      out.write("                        <i class=\"fa fa-user\" aria-hidden=\"true\" id=\"show\"> Tài Khoản</i>\n");
      out.write("                        <div id=\"hide\">\n");
      out.write("                            <a href=\"SignUp.jsp\">\n");
      out.write("                                <i class=\"fa fa-user-plus\" aria-hidden=\"true\"> Đăng Ký</i>\n");
      out.write("                            </a>\n");
      out.write("                            <br>\n");
      out.write("                            <a href=\"SignIn.jsp\">\n");
      out.write("                                <i class=\"fa fa-sign-out\" aria-hidden=\"true\"> Đăng Nhập</i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <!--                <div class=\"product\">\n");
      out.write("                                      <a href=\"\" class=\"cart\">\n");
      out.write("                                        <i class=\"fa fa-shopping-cart\" aria-hidden=\"true\" id=\"cart\"></i>\n");
      out.write("                                        <ul>\n");
      out.write("                                          <li>Giỏ hàng</li>\n");
      out.write("                                          <li>(0) Sản phẩm</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                      </a>\n");
      out.write("                                      <span>Không có sản phẩm nào trong giỏ hàng</span>\n");
      out.write("                                    </div>-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end-header -->\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <div class=\"package\">\n");
      out.write("                <ul class=\"menu-ngang\">\n");
      out.write("                    <li id=\"menu1\">\n");
      out.write("                        <a href=\"Search.jsp?str=nike&type=2\" class=\"item1\">NIKE</a>\n");
      out.write("                        <ul id=\"menu11\">\n");
      out.write("                            <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Air Force 1</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Air Jordan1</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Air Max 1</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Air Max 197</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Air Max 270</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Air Max 97</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=nike&type=2\" id=\"item2\">Presto</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"menu1\">\n");
      out.write("                        <a href=\"Search.jsp?str=adidas&type=2\" class=\"item1\">ADIDAS</a>\n");
      out.write("                        <ul id=menu11>\n");
      out.write("                            <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">Stan Smith</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">SuperStar</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">Derup Runner</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">Tubular Doom</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">Falcom</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">Pod</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=adidas&type=2\" id=\"item2\">Young1</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"menu1\">\n");
      out.write("                        <a href=\"Search.jsp?str=luxury&type=2\" class=\"item1\">LUXURY</a>\n");
      out.write("                        <ul id=menu11 style=\"height: 100px;\">\n");
      out.write("                            <li><a href=\"Search.jsp?str=luxury&type=2\" id=\"item2\">Balenciaga</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=luxury&type=2\" id=\"item2\">Gucci</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=luxury&type=2\" id=\"item2\">MC Queen</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"menu1\">\n");
      out.write("                        <a href=\"Search.jsp?str=vans&type=2\" class=\"item1\">VANS</a>\n");
      out.write("                        <ul id=menu11 style=\"height: 150px;\">\n");
      out.write("                            <li><a href=\"Search.jsp?str=vans&type=2\" id=\"item2\">Style 36</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=vans&type=2\" id=\"item2\">Slip on</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=vans&type=2\" id=\"item2\">Old Skool</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=vans&type=2\" id=\"item2\">Era 95</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=vans&type=2\" id=\"item2\">Sk8</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"menu1\">\n");
      out.write("                        <a href=\"Search.jsp?str=convers&type=2\" class=\"item1\">CONVERS</a>\n");
      out.write("                        <ul id=menu11 style=\"height: 80px;\">\n");
      out.write("                            <li><a href=\"Search.jsp?str=convers&type=2\" id=\"item2\">1970s</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=convers&type=2\" id=\"item2\">Chuck 70s x CDG</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"menu1\">\n");
      out.write("                        <a href=\"Search.jsp?str=fila&type=2\" class=\"item1\">FILA</a>\n");
      out.write("                        <ul id=menu11 style=\"height: 80px;\">\n");
      out.write("                            <li><a href=\"Search.jsp?str=fila&type=2\" id=\"item2\">Fila ray</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=fila&type=2\" id=\"item2\">Fila Disruptor II</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"menu1\">\n");
      out.write("                        <a href=\"Search.jsp?str=the10&type=2\" class=\"item1\">THE10</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"menu1\">\n");
      out.write("                        <a href=\"Search.jsp?str=fashion&type=2\" class=\"item1\">FASHION</a>\n");
      out.write("                        <ul id=menu11 style=\"height: 120px;\">\n");
      out.write("                            <li><a href=\"Search.jsp?str=fashion&type=2\" id=\"item2\">Áo Phông</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=fashion&type=2\" id=\"item2\">Áo Sơ Mi</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=fashion&type=2\" id=\"item2\">Quần Jeans</a></li>\n");
      out.write("                            <li><a href=\"Search.jsp?str=fashion&type=2\" id=\"item2\">Quần Âu</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"menu1\">\n");
      out.write("                        <a href=\"\" class=\"item1\">SALES</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"menu1\">\n");
      out.write("                        <a href=\"\" class=\"item1\">PHỤ KIỆN</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"menu1\">\n");
      out.write("                        <a href=\"\" class=\"item1\">NHẬN THÔNG BÁO SALES</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- end-menu -->\n");
      out.write("        <br><br><br>\n");
      out.write("        <div class=\"func\">\n");
      out.write("            \n");
      out.write("            <a href=\"Search.jsp?option=1\" ><button class=\"button1\">Tên tăng dần</button></a>\n");
      out.write("\n");
      out.write("            <a href=\"Search.jsp?option=2\" ><button class=\"button1\">Tên giảm dần</button></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <a href=\"Search.jsp?option=3\" ><button class=\"button1\">Giá tăng dần</button></a>\n");
      out.write("            \n");
      out.write("            <a href=\"Search.jsp?option=4\" ><button class=\"button1\">Giá giảm dần</button></a>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("        <br>        \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <h2 align=\"center\">Có ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" sản phẩm được tìm thấy</h2>\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"shoes\">\n");
      out.write("            <div class=\"package\">\n");
      out.write("            ");
   
                for (Product p : list) {
                    int pri = (int)p.getPrice()/100 * (100 - p.getDiscount());
                    String sale = Other.displayMoney(pri);
                    String price = Other.displayMoney((int)p.getPrice());
                    request.setAttribute("id", p.getId());
                    request.setAttribute("name", p.getName());
                    request.setAttribute("discount", p.getDiscount());
                    request.setAttribute("img1", p.getImg1());
                    request.setAttribute("img2", p.getImg2());
                    request.setAttribute("sale", sale);
                    request.setAttribute("price", price);
            
      out.write("\n");
      out.write("            \n");
      out.write("                <div class=\"product1\">\n");
      out.write("                    <div class=\"thumbai\">\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("                    \n");
      out.write("                    <a href=\"DetailProduct.jsp?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"find-out\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${img1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" class=\"anh1\" style=\" width: 280px; height: 200px;\"></a>\n");
      out.write("                    <a href=\"DetailProduct.jsp?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"find-in\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${img2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" class=\"anh2\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("                    <a href=\"DetailProduct.jsp?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"name\" title=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                    ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"contact\">\n");
      out.write("            <a href=\"tel:0966027102\" title=\"tel:0966027102\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"contact1\">\n");
      out.write("            <a href=\"https://www.facebook.com/Hung.2mono\"><i class=\"fab fa-facebook-messenger\"></i></a>\n");
      out.write("        </div>\n");
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
      out.write("        <!-- end-html -->\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${discount != '0'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                     <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${discount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("%</span>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
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
        out.write("                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${discount != '0'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <ul>\n");
        out.write("                            <li style=\"color: red; margin-left:20px;font-size: 17px;\">");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("</li>\n");
        out.write("                            <li style=\"color: #a6a6a6;text-decoration: line-through;font-size: 17px;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</li>\n");
        out.write("                        </ul>\n");
        out.write("                    ");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sale}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
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
        out.write("                        <ul>\n");
        out.write("                            <li style=\"color: black; margin-left: 40px; font-size: 17px;\">");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("</li>\n");
        out.write("                        </ul>\n");
        out.write("                    ");
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

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sale}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}