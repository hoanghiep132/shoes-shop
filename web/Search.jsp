&type=2<%-- 
    Document   : Search
    Created on : Nov 18, 2019, 9:02:09 PM
    Author     : hiepnguyen
--%>

<%@page import="connectionjdbc.product.ProductService"%>
<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
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
    <link rel="stylesheet" href="search.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        
        <%
            List<Product> list;
            String type = request.getParameter("type");
            String str = request.getParameter("str");
            if("1".equals(type)){
                list = new ProductService().searchProductForName(str);
            }else{
                list = new ProductService().getAllProductForBrand(str);
            }
            request.setAttribute("list",list);
            int amount = list.size();
            request.setAttribute("a", amount);
            
        %>
        <div class="header">
          <div class="package">
              <div class="shop_name">
                  <a href=""><h1>MiaShoes</h1></a>
              </div>
              <div class="box_search">
                  <span>Tìm Kiếm Sản Phẩm</span>
                  <div class="search">
                        <form>
                            <input type="search" placeholder="Search">
                            <input type="submit" name="" id="">
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
                <div class="product">
                  <a href="" class="cart">
                    <i class="fa fa-shopping-cart" aria-hidden="true" id="cart"></i>
                    <ul>
                      <li>Giỏ hàng</li>
                      <li>(0) Sản phẩm</li>
                    </ul>
                  </a>
                  <span>Không có sản phẩm nào trong giỏ hàng</span>
                </div>
              </div>
          </div>
      </div>
          <!-- end-header -->
      <div class="menu">
            <div class="package">
                <ul class="menu-ngang">
                  <li id="menu1">
                      <a href="" class="item1">NIKE</a>
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
                      <a href="" class="item1">ADIDAS</a>
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
                         <a href="" class="item1">LUXURY</a>
                         <ul id=menu11 style="height: 100px;">
                            <li><a href="Search.jsp?str=luxury&type=2" id="item2">Balenciaga</a></li>
                            <li><a href="Search.jsp?str=luxury&type=2" id="item2">Gucci</a></li>
                            <li><a href="Search.jsp?str=luxury&type=2" id="item2">MC Queen</a></li>
                          </ul>
                      </li>
                      <li id="menu1">
                         <a href="" class="item1">VANS</a>
                         <ul id=menu11 style="height: 150px;">
                            <li><a href="Search.jsp?str=vans&type=2" id="item2">Style 36</a></li>
                            <li><a href="Search.jsp?str=vans&type=2" id="item2">Slip on</a></li>
                            <li><a href="Search.jsp?str=vans&type=2" id="item2">Old Skool</a></li>
                            <li><a href="Search.jsp?str=vans&type=2" id="item2">Era 95</a></li>
                            <li><a href="Search.jsp?str=vans&type=2" id="item2">Sk8</a></li>
                          </ul>
                      </li>
                      <li id="menu1">
                         <a href="" class="item1">CONVERS</a>
                         <ul id=menu11 style="height: 80px;">
                            <li><a href="Search.jsp?str=converse&type=2" id="item2">1970s</a></li>
                            <li><a href="Search.jsp?str=converse&type=2" id="item2">Chuck 70s x CDG</a></li>
                          </ul>
                      </li>
                      <li id="menu1">
                         <a href="" class="item1">FILA</a>
                         <ul id=menu11 style="height: 80px;">
                            <li><a href="Search.jsp?str=fila&type=2" id="item2">Fila ray</a></li>
                            <li><a href="Search.jsp?str=fila&type=2" id="item2">Fila Disruptor II</a></li>
                          </ul>
                      </li>
                      <li id="menu1">
                         <a href="Search.jsp?str=the10&type=2" class="item1">THE10</a>
                      </li>
                      <li id="menu1">
                         <a href="" class="item1">FASHION</a>
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
          
          <h3>Có ${a} sản phẩm</h3>
         <div class="shoes">
            <div class="package">
                <c:forEach items="${list}" var = "product">
                    <div class="product1">
                        <div class="thumbai">
                            <span class="icon-sale" style="padding-top:10px;padding-right:8px; font-weight:bold;">-20%</span>
                            <a href="DetailProduct.jsp?id=51" id="find-out"><img src="${product.img1}" alt=""style=" width: 280px;
                              height: 200px;"></a>
                            <a href="DetailProduct.jsp?id=51" id="find-in"><img src="${product.img2}" alt="" style=" width: 280px;height: 200px;"></a>
                            <a href="" class="name" title="${product.name}">${product.name}</a>
                            <ul>
                                <c:choose>
                                    <c:when test = "${product.discount} == 0">
                                        <li style="color: red; margin-left:20px">${product.price}</li>
                                    </c:when>
                                    <c:otherwise>
                                        <%
                                            double salePrice = 0 ;
                                        %>
                                        <li style="color: red; margin-left:20px"><c:out value="${product.price} * (100-${product.discount})" /></li>
                                        <li style="color: #a6a6a6;text-decoration: line-through;">${product.price}</li>
                                    </c:otherwise>
                                </c:choose>
                            </ul>
                        </div>
                    </div>
                </c:forEach>
            </div>
         </div>
      <!-- end-menu -->
    </body>
</html>
