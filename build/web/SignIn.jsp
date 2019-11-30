<%-- 
    Document   : SignIn
    Created on : Nov 18, 2019, 8:25:49 PM
    Author     : hiepnguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <title>account</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.1/css/all.css" integrity="sha384-O8whS3fhG2OnA5Kas0Y9l3cfpmYjapjI0E4theH4iuMD+pLhbf6JI0jIMfYcK3yZ" crossorigin="anonymous">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="signUp.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
      <div class="header">
          <div class="package">
              <div class="shop_name">
                  <a href="home.jsp"><h1>MiaShoes</h1></a>
              </div>
              <div class="box_search">
                  <span>Tìm Kiếm Sản Phẩm</span>
                  <div class="search">
                      <form action="Search.jsp?type=1" method="post">
                            <input type="search" name="str" placeholder="Search">
                            <input type="submit" value="Tìm kiếm" >
                        </form>
                  </div>
              </div>
              <!-- end-search -->
              <div class="infor">
                <a href="SignIn.jsp" class="account">
                    <i class="fa fa-user" aria-hidden="true" id="show"> Tài Khoản</i>
                    <div id="hide">
                        <a href="SignUp.jsp">
                            <i class="fa fa-user-plus" aria-hidden="true"> Đăng Ký</i>
                        </a>
                      <br>
                      <a href="SignIn.jsp">
                          <i class="fa fa-sign-out" aria-hidden="true"> Đăng Nhập</i>
                      </a>
                    </div>
                </a>
<!--                <div class="product">
                  <a href="" class="cart">
                    <i class="fa fa-shopping-cart" aria-hidden="true" id="cart"></i>
                    <ul>
                      <li>Giỏ hàng</li>
                      <li>(0) Sản phẩm</li>
                    </ul>
                  </a>
                  <span>Không có sản phẩm nào trong giỏ hàng</span>
                </div>-->
              </div>
          </div>
      </div>
          <!-- end-header -->
      <div class="menu">
            <div class="package">
                <ul class="menu-ngang">
                  <li id="menu1">
                      <a href="Search.jsp?str=nike&type=2" class="item1">NIKE</a>
                      <ul id="menu11">
                        <li><a href="Search.jsp?str=nike&type=2" id="item2">Air Force 1</a></li>
                        <li><a href="Search.jsp?str=nike&type=2" id="item2">Air Jordan1</a></li>
                        <li><a href="Search.jsp?str=nike&type=2" id="item2">Air Max 1</a></li>
                        <li><a href="Search.jsp?str=nike&type=2" id="item2">Air Max 197</a></li>
                        <li><a href="Search.jsp?str=nike&type=2" id="item2">Air Max 270</a></li>
                        <li><a href="Search.jsp?str=nike&type=2" id="item2">Air Max 97</a></li>
                        <li><a href="Search.jsp?str=nike&type=2" id="item2">Presto</a></li>
                      </ul>
                  </li>
                  <li id="menu1">
                      <a href="Search.jsp?str=adidas&type=2" class="item1">ADIDAS</a>
                      <ul id=menu11>
                        <li><a href="Search.jsp?str=adidas&type=2" id="item2">Stan Smith</a></li>
                        <li><a href="Search.jsp?str=adidas&type=2" id="item2">SuperStar</a></li>
                        <li><a href="Search.jsp?str=adidas&type=2" id="item2">Derup Runner</a></li>
                        <li><a href="Search.jsp?str=adidas&type=2" id="item2">Tubular Doom</a></li>
                        <li><a href="Search.jsp?str=adidas&type=2" id="item2">Falcom</a></li>
                        <li><a href="Search.jsp?str=adidas&type=2" id="item2">Pod</a></li>
                        <li><a href="Search.jsp?str=adidas&type=2" id="item2">Young1</a></li>
                      </ul>
                  </li>
                      <li id="menu1">
                         <a href="Search.jsp?str=luxury&type=2" class="item1">LUXURY</a>
                         <ul id=menu11 style="height: 100px;">
                            <li><a href="Search.jsp?str=luxury&type=2" id="item2">Balenciaga</a></li>
                            <li><a href="Search.jsp?str=luxury&type=2" id="item2">Gucci</a></li>
                            <li><a href="Search.jsp?str=luxury&type=2" id="item2">MC Queen</a></li>
                          </ul>
                      </li>
                      <li id="menu1">
                         <a href="Search.jsp?str=vans&type=2" class="item1">VANS</a>
                         <ul id=menu11 style="height: 150px;">
                            <li><a href="Search.jsp?str=vans&type=2" id="item2">Style 36</a></li>
                            <li><a href="Search.jsp?str=vans&type=2" id="item2">Slip on</a></li>
                            <li><a href="Search.jsp?str=vans&type=2" id="item2">Old Skool</a></li>
                            <li><a href="Search.jsp?str=vans&type=2" id="item2">Era 95</a></li>
                            <li><a href="Search.jsp?str=vans&type=2" id="item2">Sk8</a></li>
                          </ul>
                      </li>
                      <li id="menu1">
                         <a href="Search.jsp?str=convers&type=2" class="item1">CONVERS</a>
                         <ul id=menu11 style="height: 80px;">
                            <li><a href="Search.jsp?str=convers&type=2" id="item2">1970s</a></li>
                            <li><a href="Search.jsp?str=convers&type=2" id="item2">Chuck 70s x CDG</a></li>
                          </ul>
                      </li>
                      <li id="menu1">
                         <a href="Search.jsp?str=fila&type=2" class="item1">FILA</a>
                         <ul id=menu11 style="height: 80px;">
                            <li><a href="Search.jsp?str=fila&type=2" id="item2">Fila ray</a></li>
                            <li><a href="Search.jsp?str=fila&type=2" id="item2">Fila Disruptor II</a></li>
                          </ul>
                      </li>
                      <li id="menu1">
                         <a href="Search.jsp?str=the10&type=2" class="item1">THE10</a>
                      </li>
                      <li id="menu1">
                         <a href="Search.jsp?str=fashion&type=2" class="item1">FASHION</a>
                         <ul id=menu11 style="height: 120px;">
                            <li><a href="Search.jsp?str=fashion&type=2" id="item2">Áo Phông</a></li>
                            <li><a href="Search.jsp?str=fashion&type=2" id="item2">Áo Sơ Mi</a></li>
                            <li><a href="Search.jsp?str=fashion&type=2" id="item2">Quần Jeans</a></li>
                            <li><a href="Search.jsp?str=fashion&type=2" id="item2">Quần Âu</a></li>
                          </ul>
                      </li>
                      <li id="menu1">
                         <a href="Search.jsp?str=sales&type=4" class="item1">SALES</a>
                      </li>
                      <li id="menu1">
                         <a href="Search.jsp?str=shock&type=3" class="item1">PHỤ KIỆN</a>
                      </li>
                      <li id="menu1">
                         <a href="" class="item1">NHẬN THÔNG BÁO SALES</a>
                      </li>
                    </ul>
            </div>
      </div>
          
      <!-- end-menu -->
        <h1 class="title-head">
            <span>Đăng nhập tài khoản</span>
        </h1>
        <div class="row">
            <div class="col-lg-6">
                <div class="page-login margin-bottom-30">
                    <div id="login">
                        <span>
                            Nếu bạn đã có tài khoản, đăng nhập tại đây.
                        </span>
                        <form accept-charset="UTF-8" action="Filter.jsp" id="customer_login"  method="post">
                            <input name="FormType" type="hidden" value="customer_login">
                            <input name="utf8" type="hidden" value="true">
                            <div class="form-signup errors">

                            </div>
                            <div class="form-signup clearfix">
                                <fieldset class="form-group">
                                    <label>Tài khoản <span class="required">*</span></label>
                                    <input name ="username" type="text"  class="form-control form-control-lg" value="" name="username" id="customer_email" placeholder="username" required="">
                                </fieldset>
                                <fieldset class="form-group">
                                    <label>Mật khẩu <span class="required">*</span></label>
                                    <input name ="password" type="password" class="form-control form-control-lg" value="" name="password" id="customer_password" placeholder="Mật khẩu" required="">
                                </fieldset>



                                <div class="pull-xs-left" style="margin-top: 25px;">
                                    <input class="btn btn-style btn-primary rebtn" type="submit" value="Đăng nhập">
                                    <a href="SignUp.jsp" class="btn-link-style btn-register" style="margin-left: 20px;text-decoration: none; ">Đăng ký</a>
                                </div>
                            </div>
                        </form>
                    </div>


                </div>
            </div>
            <div class="col-lg-6">

                <div id="recover-password" class="form-signup">
                    <span>
                        Bạn quên mật khẩu? Nhập địa chỉ email để lấy lại mật khẩu qua email.
                    </span>					
                    <form accept-charset="UTF-8" action="SendMail2.jsp" id="recover_customer_password" onsubmit="return checkEmail()" method="post">
                        <input name="FormType" type="hidden" value="recover_customer_password">
                        <input name="utf8" type="hidden" value="true">
                        <div class="form-signup aaaaaaaa">

                        </div>
                        <div class="form-signup clearfix">
                            <fieldset class="form-group">
                                <label>Email <span class="required">*</span></label>
                                <input name="email" type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,63}$" class="form-control form-control-lg" value="" name="Email" id="recover-email" placeholder="Email" required="">
                            </fieldset>
                        </div>
                        <div class="action_bottom">
                            <input class="btn btn-style btn-dark rebtn" style="margin-top: 25px;" width="100px" type="submit" value="Lấy lại mật khẩu">

                        </div>
                    </form>
                </div>
            </div>
        </div>

        <div class="information">
            <div class="package">
                <div class="information1">
                    <h1>VỀ CỬA HÀNG</h1>
                    <span>MiaShoes chuyên Rep 1:1 cao cấp nhất thị trường.</span>
                    <div style="width:100%; height: 0.1em;background:rgb(181, 178, 178); margin-top:10px;margin-bottom: 10px;"></div>
                    <ul>
                        <li>Địa chỉ: Số 2 Trần Đại Nghĩa, Hà Nội, Việt Nam</li>
                        <li>
                            <a href="mailto:ngonam21021999@gmail.com">Email:ngonam21021999@gmail.com</a>
                        </li>
                        <li>
                            <a href="tel:123456789">Điện thoại:123456789</a>
                        </li>
                        <li><a href="">Website:miashoes.vn</a></li>
                    </ul>
                </div>
                <div class="information2">
                    <h1>THÔNG TIN</h1>
                    <ul>
                        <li><i class="fa fa-chevron-right" aria-hidden="true"></i><a href="">Trang chủ</a></li>
                        <li><i class="fa fa-chevron-right" aria-hidden="true"></i><a href="">Giới thiệu</a></li>
                        <li><i class="fa fa-chevron-right" aria-hidden="true"></i><a href="">Sản phẩm</a></li>
                        <li><i class="fa fa-chevron-right" aria-hidden="true"></i><a href="">Khuyến mại</a></li>
                        <li><i class="fa fa-chevron-right" aria-hidden="true"></i><a href="">Tin tức</a></li>
                        <li><i class="fa fa-chevron-right" aria-hidden="true"></i><a href="">Liên hệ</a></li>
                    </ul>
                </div>
                <div class="information2" style="">
                    <h1>HƯỚNG DẪN & CHÍNH SÁCH</h1>
                    <ul>
                        <li><i class="fa fa-chevron-right" aria-hidden="true"></i><a href="">Hướng dẫn mua hàng</a></li>
                        <li><i class="fa fa-chevron-right" aria-hidden="true"></i><a href="">Thẻ Thành Viên</a></li>
                        <li><i class="fa fa-chevron-right" aria-hidden="true"></i><a href="">Ship COD</a></li>
                        <li><i class="fa fa-chevron-right" aria-hidden="true"></i><a href="">Chính sách bảo hành</a></li>
                        <li><i class="fa fa-chevron-right" aria-hidden="true"></i><a href="">Chính sách đổi trả & hoàn tiền</a></li>
                    </ul>
                </div>
                <div class="payment">
                    <h1>PHƯƠNG THỨC THANH TOÁN</h1>
                    <ul>
                        <li><img src="css/pay1.png" alt=""></li>
                        <li><img src="css/pay2.png" alt=""></li>
                        <li><img src="css/pay3.png" alt=""></li>
                        <li><img src="css/pay4.png" alt=""></li>
                        <li><img src="css/pay5.png" alt=""></li>
                    </ul>
                    <span><img src="css/cn.png" alt="" style="width:150px;"></span>
                </div>
            </div>
        </div>
        <!-- end-information -->
        <div class="banner-end">
            <div class="package">
                <div class="banner-left" style="color: black;">© Bản quyền thuộc về <span style="color: white;">MiaShoe</span></div>
                <div class="banner-right">
                    <ul>
                        <li><a href=""><i class="fa fa-facebook" aria-hidden="true" title="facebook"></i></a></li>
                        <li><a href=""><i class="fa fa-instagram" aria-hidden="true" title="instagram"></i></a></li>
                        <li><a href=""><i class="fa fa-google-plus" aria-hidden="true" title="google"></i></a></li>
                        <li><a href=""><i class="fa fa-twitter" aria-hidden="true" title="twitter"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- end-banner -->
        <div class="contact">
            <a href="tel:1234567" title="tel:12345678"><i class="fa fa-phone" aria-hidden="true"></i></a>
        </div>
        <div class="contact1">
            <a href="http://www.facebook.com"><i class="fab fa-facebook-messenger"></i></a>
        </div>
        <script type="text/javascript"> 
        function checkEmail() { 
            var email = document.getElementById('email'); 
            var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/; 
            if (!filter.test(email.value)) { 
                     alert('Hay nhap dia chi email hop le.\nExample: ngvanA@gmail.com');
                     email.focus; 
                     return false; 
            }
            return true;
        } 
        </script>
    </body>
</html>
