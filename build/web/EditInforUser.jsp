<%-- 
    Document   : EditInforUser
    Created on : Nov 22, 2019, 9:56:52 PM
    Author     : hiepnguyen
--%>

<%@page import="model.User"%>
<%@page import="connectionjdbc.user.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>MiaShoes</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.1/css/all.css" 
          integrity="sha384-O8whS3fhG2OnA5Kas0Y9l3cfpmYjapjI0E4theH4iuMD+pLhbf6JI0jIMfYcK3yZ" crossorigin="anonymous">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="edit.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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
                <a href="" class="account">
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
                         <a href="" class="item1">SALES</a>
                      </li>
                      <li id="menu1">
                         <a href="" class="item1">PHỤ KIỆN</a>
                      </li>
                      <li id="menu1">
                         <a href="" class="item1">NHẬN THÔNG BÁO SALES</a>
                      </li>
                    </ul>
            </div>
      </div>     
      <!-- end-menu -->
      
        <%
            //int id = Integer.parseInt(request.getParameter("id"));
            int id = 5;
            User user = new UserService().getUserById(id);
            request.setAttribute("u", user);
//            String birth = user.getBirthday();
//            String year = birth.substring(0, 3);
//            String month = birth.substring(5,6);
//            String date = birth.substring(8,9);
//            request.setAttribute(date, "d");
//            request.setAttribute(month, "m");
//            request.setAttribute(year, "y");
        %>
        
        <form action="EditUserPost.jsp?id=${u.id}" method="post" enctype="multipart/form-data" class="edit">
            <c:choose>
                <c:when test="${u.avatar eq null}">
                    <br> <input type ="file" name="file" accept="image/*" > <br><br>
                </c:when>
                <c:otherwise>
                    <br> <img src="${u.avatar}" width="100px" class="ava"> <br><br>
                    <input type ="file" name="file" accept="image/*"> <br><br>
                </c:otherwise>
            </c:choose>
            Name <input name = "name" type="text" value="${u.name}"> <br><br>
            Email<input name = "email" type="text" value="${u.email}"> <br><br>
            Phone Number<input name ="phone_number" type="text" value="${u.phoneNumber}" > <br><br>
            Address<input name ="address" type="text" value="${u.address}" > <br><br>
            Gender 
            <c:if test="${u.gender eq 'male'}">
                <input name="gender" type="radio" checked="true">Male
                <input name="gender" type="radio" checked="false">Female
            </c:if>
            
            <c:if  test="${u.gender eq 'female'}">
                <input name="gender" type="radio" checked="false">Male
                <input name="gender" type="radio" checked="true">Female
            </c:if>
            <br><br>
            Birthday
            <input name="date" type="date" value="${d}-${m}-${y}"> 
            <br><br>
            <input type="submit" value="Edit">
        </form> 
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
          </div>name
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
      <!-- end-page -->
    </body>
</html>
