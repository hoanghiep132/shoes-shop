package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <title>MiaShoes</title>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.1/css/all.css\" \n");
      out.write("          integrity=\"sha384-O8whS3fhG2OnA5Kas0Y9l3cfpmYjapjI0E4theH4iuMD+pLhbf6JI0jIMfYcK3yZ\" crossorigin=\"anonymous\">\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"home.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" \n");
      out.write("          integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
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
      out.write("              ");

                  User user = (User) session.getAttribute("currentUser");
                  request.setAttribute("u", user);
              
      out.write("\n");
      out.write("              ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
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
      out.write("      <div id=\"slide\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("          <li data-target=\"#slide\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("          <li data-target=\"#slide\" data-slide-to=\"1\"></li>\n");
      out.write("          <li data-target=\"#slide\" data-slide-to=\"2\"></li>\n");
      out.write("        </ol>\n");
      out.write("        <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("          <div class=\"carousel-item active\">\n");
      out.write("            <a href=\"home.jsp\"><img src=\"css/slider_1.jpg\" alt=\"\"></a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <a href=\"home.jsp\"><img src=\"css/slider_2.jpg\" alt=\"\"></a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <a href=\"home.jsp\"><img src=\"css/slider_1.jpg\" alt=\"\"></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"carousel-control-prev\" href=\"#slide\" role=\"button\" data-slide=\"prev\">\n");
      out.write("          <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("          <span class=\"sr-only\">previous</span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"carousel-control-next\" href=\"#slide\" role=\"button\" data-slide=\"next\">\n");
      out.write("          <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("          <span class=\"sr-only\">Next</span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <!-- end-slide -->\n");
      out.write("      <div class=\"title\">\n");
      out.write("        <span>SẢN PHẨM NỔI BẬT</span>\n");
      out.write("        <br>\n");
      out.write("        <div></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"shoes\">\n");
      out.write("        <div class=\"package\">\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=50\" id=\"find-out\"><img src=\"css/shoe1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=50\" id=\"find-in\"><img src=\"css/shoe2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"MLB NY Cream\">MLB NY Cream</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">760.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">950.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=51\" id=\"find-out\"><img src=\"css/a1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=51\" id=\"find-in\"><img src=\"css/a2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"MLB Boston\">MLB Boston</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">760.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">950.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=52\" id=\"find-out\"><img src=\"css/b1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=52\" id=\"find-in\"><img src=\"css/b2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"MLB LA\">MLB LA</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">760.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">950.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=20\" id=\"find-out\"><img src=\"https://res.cloudinary.com/hoangghiepp1302/image/upload/v1568878446/shoes%20shop/airmax_yellow_1_xzgshr_gpmuey.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=20\" id=\"find-in\"><img src=\"https://res.cloudinary.com/hoangghiepp1302/image/upload/v1568878437/shoes%20shop/airmax_yellow_2_uhjbde_loxbya.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"THE 10: NIKE AIR MAX 90 \"OFF WHITE\" YELLOW\">THE 10: NIKE AIR MAX 90 \"OFF WHITE\" YELLOW</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">1.890.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">2.100.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=19\" id=\"find-out\"><img src=\"css/d1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=19\" id=\"find-in\"><img src=\"css/d2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"M2K Tekno White Black\">M2K Tekno White Black</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">1.440.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">1.600.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=6\" id=\"find-out\"><img src=\"https://res.cloudinary.com/hoangghiepp1302/image/upload/v1568878577/shoes%20shop/yeezy350_black_1_rwkbh6_w4xzvp.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=6\" id=\"find-in\"><img src=\"https://res.cloudinary.com/hoangghiepp1302/image/upload/v1568878568/shoes%20shop/yeezy350_black_2_treh0p_o3oj98.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"YEEZY BOOST 350 V2 3M black\">YEEZY BOOST 350 V2 3M black</a>\n");
      out.write("              <ul style=\"margin-top:-4px;\">\n");
      out.write("                <li style=\"color: red; margin-left:20px\">1.030.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">1.150.000</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=6\" id=\"find-out\"><img src=\"css/f1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=6\" id=\"find-in\"><img src=\"css/f2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"Zoom Pegasus 36 Black\">Zoom Pegasus 36 Black</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">1.200.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">1.500.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=9\" id=\"find-out\"><img src=\"https://res.cloudinary.com/hoangghiepp1302/image/upload/v1568878533/shoes%20shop/stan_smith_black_1_faqt7d_myeqjk.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=9\" id=\"find-in\"><img src=\"https://res.cloudinary.com/hoangghiepp1302/image/upload/v1568878529/shoes%20shop/stan_smith_black_2_mfgoty_powpxi.jpgv\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"Stan Smith Black\">Stan Smith Black</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">9.500.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">760.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=34\" id=\"find-out\"><img src=\"css/h1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=34\" id=\"find-in\"><img src=\"css/h2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"Vans Vault Style 36 Black\">Vans Vault Style 36 Black</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">712.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\"> 890.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=37\" id=\"find-out\"><img src=\"css/i1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=37\" id=\"find-in\"><img src=\"css/i2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"Prophere Grey One - Rep\">Prophere Grey One - Rep</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">599.000₫ </li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">1.000.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=17\" id=\"find-out\"><img src=\"css/k1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=17\" id=\"find-in\"><img src=\"css/k2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"Air Max 1 Parra\">Air Max 1 Parra</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">1.260.000₫ </li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">2.100.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=23\" id=\"find-out\"><img src=\"css/l1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=23\" id=\"find-in\"><img src=\"css/l2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"NMD R1 BLACK GOLD\">NMD R1 BLACK GOLD</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">1.080.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\"> 1.800.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=29\" id=\"find-out\"><img src=\"css/m1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=29\" id=\"find-in\"><img src=\"css/m2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"YEEZY BOOST 350 V2 3M REFLECTIVE - 1:1 Boost Nén\">YEEZY BOOST 350 V2 3M REFLECTIVE - 1:1 Boost Nén</a>\n");
      out.write("              <ul style=\"margin-top:-4px;\">\n");
      out.write("                <li style=\"color: red; margin-left:20px\">1.050.000₫ </li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">2.100.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=29\" id=\"find-out\"><img src=\"css/n1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=29\" id=\"find-in\"><img src=\"css/n2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"YEEZY BOOST 350 V2 Static - 1:1\">YEEZY BOOST 350 V2 Static - 1:1</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">900.000₫ </li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">1.800.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=27\" id=\"find-out\"><img src=\"css/p1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=27\" id=\"find-in\"><img src=\"css/p2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"Yeezy 700 Static - 1:1\">Yeezy 700 Static - 1:1</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">699.000₫ </li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">1.400.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"product1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-20%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=5\" id=\"find-out\"><img src=\"css/q1.jpg\" alt=\"\"style=\" width: 280px;\n");
      out.write("                height: 200px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=5\" id=\"find-in\"><img src=\"css/q2.jpg\" alt=\"\" style=\" width: 280px;height: 200px;\"></a>\n");
      out.write("              <a href=\"\" class=\"name\" title=\"YEEZY 350 V2 FROZEN YELLOW - 1:1\">YEEZY 350 V2 \"FROZEN YELLOW - 1:1</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">950.000₫ </li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">1.900.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- end-shoes -->\n");
      out.write("      <div class=\"title\">\n");
      out.write("        <span>FASHION</span>\n");
      out.write("        <br>\n");
      out.write("        <div style=\"width:85px;\"></div>\n");
      out.write("      </div>\n");
      out.write("      <!-- end -->\n");
      out.write("      <div class=\"fashion\">\n");
      out.write("        <div class=\"package\">\n");
      out.write("          <div class=\"fashion1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-55%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=53\" id=\"clother-out\" ><img src=\"css/fs1.jpg\" alt=\"\" style=\"width:280px; height:400px;\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=53\" id=\"clother-in\"><img src=\"css/fs11.jpg\" alt=\"\" style=\"width:280px; height:400px\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=53\" class=\"name\" title=\"Jean rách ống bó - Blue White\">Jean rách ống bó - Blue White</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">580.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">1.299.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"fashion1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-55%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=53\" id=\"clother-out\" ><img src=\"css/fs2.jpg\" alt=\"\" style=\"width:280px; height:400px\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=53\" id=\"clother-in\"><img src=\"css/fs22.jpg\" alt=\"\" style=\"width:280px; height:400px\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=53\" class=\"name\" title=\"Jean rách ống bó - Black\">Jean rách ống bó - Black</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">580.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">1.299.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"fashion1\">\n");
      out.write("            <div class=\"thumbai\">\n");
      out.write("              <span class=\"icon-sale\" style=\"padding-top:10px;padding-right:8px; font-weight:bold;\">-55%</span>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=53\" id=\"clother-out\" ><img src=\"css/fs3.jpg\" alt=\"\" style=\"width:280px; height:400px\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=53\" id=\"clother-in\"><img src=\"css/fs33.jpg\" alt=\"\" style=\"width:280px; height:400px\"></a>\n");
      out.write("              <a href=\"DetailProduct.jsp?id=53\" class=\"name\" title=\"Jean rách ống bó - Blue\" >Jean rách ống bó - Blue</a>\n");
      out.write("              <ul>\n");
      out.write("                <li style=\"color: red; margin-left:20px\">580.000₫</li>\n");
      out.write("                <li style=\"color: #a6a6a6;text-decoration: line-through;\">1.299.000₫</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"contact\">\n");
      out.write("        <a href=\"tel:0966027102\" title=\"tel:0966027102\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i></a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"contact1\">\n");
      out.write("        <a href=\"https://www.facebook.com/Hung.2mono\"><i class=\"fab fa-facebook-messenger\"></i></a>\n");
      out.write("      </div>\n");
      out.write("              <div class=\"information\">\n");
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
      out.write("      <!-- end-html -->\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
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
        out.write("                  ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                  ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              ");
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                      <div class=\"infor\">\n");
        out.write("                <a href=\"SignIn.jsp\" class=\"account\">\n");
        out.write("                    <i class=\"fa fa-user\" aria-hidden=\"true\" id=\"show\"> Tài Khoản</i>\n");
        out.write("\n");
        out.write("                </a>\n");
        out.write("              </div>\n");
        out.write("                  ");
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
        out.write("                      <div class=\"infor\">\n");
        out.write("                        <a href=\"MyAccount.jsp.\" class=\"account\">\n");
        out.write("                        <i class=\"fa fa-user\" aria-hidden=\"true\" id=\"show\"> Tài Khoản</i>\n");
        out.write("                        </a>\n");
        out.write("                    <div class=\"product\">\n");
        out.write("                      <a href=\"\" class=\"cart\">\n");
        out.write("                        <i class=\"fa fa-shopping-cart\" aria-hidden=\"true\" id=\"cart\"></i>\n");
        out.write("                        <ul>\n");
        out.write("                          <li>Giỏ hàng</li>\n");
        out.write("                          <li>(0) Sản phẩm</li>\n");
        out.write("                        </ul>\n");
        out.write("                      </a>\n");
        out.write("                  <span>Không có sản phẩm nào trong giỏ hàng</span>\n");
        out.write("                </div>\n");
        out.write("              </div>\n");
        out.write("                  ");
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
