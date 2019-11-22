<%-- 
    Document   : DetailProduct
    Created on : Nov 16, 2019, 3:25:52 PM
    Author     : hiepnguyen
--%>

<%@page import="java.util.List"%>
<%@page import="model.DetailProduct"%>
<%@page import="connectionjdbc.product.ProductService"%>
<%@page import="connectionjdbc.user.UserService"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="vi">
    <head>
        <title>MiaShoes</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.1/css/all.css" integrity="sha384-O8whS3fhG2OnA5Kas0Y9l3cfpmYjapjI0E4theH4iuMD+pLhbf6JI0jIMfYcK3yZ" crossorigin="anonymous">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="detail.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <%
            int id = 60;
            ProductService service = new ProductService();
            Product product = service.getDescriptionProduct(id);
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
                            <i class="fa fa-user-plus" aria-hidden="true"> Đăng Ký</i>
                            <br>
                            <i class="fa fa-sign-out" aria-hidden="true"> Đăng Nhập</i>
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

        <div class="menu">
            <div class="package">
                <ul class="menu-ngang">
                    <li id="menu1">
                        <a href="" class="item1">NIKE</a>
                        <ul id="menu11">
                            <li><a href="http://" id="item2">Air Force 1</a></li>
                            <li><a href="http://" id="item2">Air Jordan1</a></li>
                            <li><a href="http://" id="item2">Air Max 1</a></li>
                            <li><a href="http://" id="item2">Air Max 197</a></li>
                            <li><a href="http://" id="item2">Air Max 270</a></li>
                            <li><a href="http://" id="item2">Air Max 97</a></li>
                            <li><a href="http://" id="item2">Presto</a></li>
                        </ul>
                    </li>
                    <li id="menu1">
                        <a href="" class="item1">ADIDAS</a>
                        <ul id=menu11>
                            <li><a href="http://" id="item2">Stan Smith</a></li>
                            <li><a href="http://" id="item2">SuperStar</a></li>
                            <li><a href="http://" id="item2">Derup Runner</a></li>
                            <li><a href="http://" id="item2">Tubular Doom</a></li>
                            <li><a href="http://" id="item2">Falcom</a></li>
                            <li><a href="http://" id="item2">Pod</a></li>
                            <li><a href="http://" id="item2">Young1</a></li>
                        </ul>
                    </li>
                    <li id="menu1">
                        <a href="" class="item1">LUXURY</a>
                        <ul id=menu11 style="height: 100px;">
                            <li><a href="http://" id="item2">Balenciaga</a></li>
                            <li><a href="http://" id="item2">Gucci</a></li>
                            <li><a href="http://" id="item2">MC Queen</a></li>
                        </ul>
                    </li>
                    <li id="menu1">
                        <a href="" class="item1">VANS</a>
                        <ul id=menu11 style="height: 150px;">
                            <li><a href="http://" id="item2">Style 36</a></li>
                            <li><a href="http://" id="item2">Slip on</a></li>
                            <li><a href="http://" id="item2">Old Skool</a></li>
                            <li><a href="http://" id="item2">Era 95</a></li>
                            <li><a href="http://" id="item2">Sk8</a></li>
                        </ul>
                    </li>
                    <li id="menu1">
                        <a href="" class="item1">CONVERS</a>
                        <ul id=menu11 style="height: 80px;">
                            <li><a href="http://" id="item2">1970s</a></li>
                            <li><a href="http://" id="item2">Chuck 70s x CDG</a></li>
                        </ul>
                    </li>
                    <li id="menu1">
                        <a href="" class="item1">FILA</a>
                        <ul id=menu11 style="height: 80px;">
                            <li><a href="http://" id="item2">Fila ray</a></li>
                            <li><a href="http://" id="item2">Fila Disruptor II</a></li>
                        </ul>
                    </li>
                    <li id="menu1">
                        <a href="" class="item1">THE10</a>
                    </li>
                    <li id="menu1">
                        <a href="" class="item1">FASHION</a>
                        <ul id=menu11 style="height: 120px;">
                            <li><a href="http://" id="item2">Áo Phông</a></li>
                            <li><a href="http://" id="item2">Áo Sơ Mi</a></li>
                            <li><a href="http://" id="item2">Quần Jeans</a></li>
                            <li><a href="http://" id="item2">Quần Âu</a></li>
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

        <c:choose>
            <c:when test="${product} eq null">
                <h2>Sản phẩm hiện tại không có! Xin khách hàng vui lòng quay lại sau!</h2>
            </c:when>
            <c:otherwise>
                        <div class="col-xs-3  col-md-4 col-sm-2">
            <div class="top-cart-contain f-right">
                <div class="mini-cart text-xs-center pull-right">
                    <div class="heading-cart">
                        <a href="/cart" class="cart-label header-icon">
                            <i class="fa fa-shopping-cart"></i>
                            <div class="cart-info hidden-sm hidden-xs">
                                <label style=" line-height: 1; ">Giỏ hàng</label>
                                (<span class="cartCount count_item_pr" id="cart-total">0</span>) Sản phẩm
                            </div>
                        </a>
                    </div>	
                    <div class="top-cart-content hidden-md hidden-sm hidden-xs">					
                        <ul id="cart-sidebar" class="mini-products-list count_li">
                            <li class="list-item">
                                <ul></ul>
                            </li>
                            <li class="action">
                                <ul>
                                    <li class="li-fix-1">
                                        <div class="top-subtotal">
                                            Tổng tiền thanh toán: 
                                            <span class="price"></span>
                                        </div>
                                    </li>
                                    <li class="li-fix-2" style="">
                                        <div class="actions">
                                            <a href="/cart" class="btn btn-primary">
                                                <span>Giỏ hàng</span>
                                            </a>
                                            <a href="/checkout" class="btn btn-checkout btn-gray">
                                                <span>Thanh toán</span>
                                            </a>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>		

            </div>

            <div class="top-cart-contain f-right hidden-sm hidden-xs">
                <div class="pull-right dropdown-toggle account">
                    <a href="/account" class="header-icon" style="font-size: 14px;"><i class="fa fa-user"></i> Tài khoản</a>
                    <ul class="dropdown-content dr-left" style="width: 200px;line-height: 26px;">

                        <li><a href="/account"><i class="fa fa-user"></i> nguyen hiep</a></li>

                        <li><a href="/account/logout"><i class="fa  fa-sign-out"></i> Đăng xuất</a></li>


                    </ul>
                </div>

            </div>
        </div>


        <div class="col-xs-12">
            <nav>
                <ul id="nav-mobile" class="nav hidden-md hidden-lg">

                    <li class="nav-item ">
                        <a href="/nike" class="nav-link">NIKE <i class="fa faa fa-angle-right"></i></a>

                        <ul class="dropdown-menu">

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/air-force-1">Air Force 1</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/air-jordan-1">Air Jordan 1</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/air-gordan-1-x-ow">Air Jordan 1 X OW</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/air-max-1">Air Max 1</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/air-max-197">Air Max 197</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/air-max-270">Air Max 270</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/air-max-97">Air Max 97</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/cortez-classic">Cortez Classic</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/presto">Presto</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/m2k-tekno">M2K Tekno</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/air-max-98">Air Max 98</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/blazer-mid-x-off-white">Blazer Mid x Off White</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/epic-react-flyknit">Epic React Flyknit</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/zoom-pegasus-turbo">Zoom Pegasus Turbo</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/vapormax">VAPORMAX</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/air-max-90">AIR MAX 90</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/air-max-720">Air Max 720</a>
                            </li>

                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/joyride-run-flyknit-blue">Joyride Run Flyknit Blue</a>
                            </li>

                        </ul>

                    </li>

                    <li class="nav-item ">
                        <a href="/adidas" class="nav-link">Adidas <i class="fa faa fa-angle-right"></i></a>

                        <ul class="dropdown-menu">
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/stan-smith">Stan Smith</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/superstar">SuperStar</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/derup-runner">Derup runner</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/tubular-doom">Tubular Doom</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/pod">Pod</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/prophere">Prophere</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/yung-1">Yung 1</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/4d">4D</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/eqt">EQT</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/yeezy">Yeezy</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/human-race">Human Race</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/falcom">Falcom</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/alphabounce">Alphabounce</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/ultra-boost">Ultra Boost</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/xplr">XPLR</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/nmd-r1">NMD R1</a>
                            </li>
                        </ul>

                    </li>


                    <li class="nav-item ">
                        <a href="/luxury" class="nav-link">LUXURY <i class="fa faa fa-angle-right"></i></a>
                        <ul class="dropdown-menu">
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/balenciaga">Balenciaga</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/gucci">Gucci</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/mc-queen">MC Queen</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/mlb">MLB</a>
                            </li>
                        </ul>
                    </li>
                    <li class="nav-item ">
                        <a href="/vans" class="nav-link">VANS <i class="fa faa fa-angle-right"></i></a>
                        <ul class="dropdown-menu">
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/style-36">Style 36</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/slip-on">Slip on</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/old-skool">Old skool</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/era-95">Era 95</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/sk8">Sk8</a>
                            </li>
                        </ul>
                    </li>

                    <li class="nav-item ">
                        <a href="/converse" class="nav-link">CONVERSE <i class="fa faa fa-angle-right"></i></a>
                        <ul class="dropdown-menu">
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/1970s">1970s</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/chuck-70s-x-cdg">Chuck 70s x CDG</a>
                            </li>
                        </ul>
                    </li>

                    <li class="nav-item ">
                        <a href="/fila" class="nav-link">FILA <i class="fa faa fa-angle-right"></i></a>
                        <ul class="dropdown-menu">
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/fila-ray">Fila ray</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/fila-disruptor-ii">Fila Disruptor II</a>
                            </li>
                        </ul>
                    </li>
                    <li class="nav-item ">
                        <a href="/the-10" class="nav-link">THE 10 <i class="fa faa fa-angle-right"></i></a>
                        <ul class="dropdown-menu">
                        </ul>
                    </li>
                    
                    <li class="nav-item ">
                        <a href="/fashion" class="nav-link">FASHION <i class="fa faa fa-angle-right"></i></a>
                        <ul class="dropdown-menu">
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/ao-phong">Áo Phông</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/ao-so-mi">Áo Sơ Mi</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/quan-jeans">Quần Jeans</a>
                            </li>
                            <li class="nav-item-lv2">
                                <a class="nav-link" href="/quan-au">Quần Âu</a>
                            </li>
                        </ul>
                    </li>

                    <li class="nav-item "><a class="nav-link" href="/san-pham-khuyen-mai">SALES</a></li>		

                    <li class="nav-item ">
                        <a href="/phu-kien" class="nav-link">Phụ Kiện <i class="fa faa fa-angle-right"></i></a>
                        <ul class="dropdown-menu">
                        </ul>
                    </li>

                    <li class="nav-item "><a class="nav-link" href="/lien-he">Nhận Thông Báo SALE</a></li>		
                </ul>
            </nav>
        </div>
        <div class="hidden-sm hidden-xs static">

    <nav>
        <div class="container">
            <ul id="nav" class="nav hidden-xs hidden-sm">
                <li class="nav-item ">
                    <a href="/nike" class="nav-link">NIKE <i class="fa fa-angle-down" data-toggle="dropdown"></i></a>
                    <ul class="dropdown-menu">
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/air-force-1">Air Force 1</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/air-jordan-1">Air Jordan 1</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/air-gordan-1-x-ow">Air Jordan 1 X OW</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/air-max-1">Air Max 1</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/air-max-197">Air Max 197</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/air-max-270">Air Max 270</a>
                        </li>

                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/air-max-97">Air Max 97</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/cortez-classic">Cortez Classic</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/presto">Presto</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/m2k-tekno">M2K Tekno</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/air-max-98">Air Max 98</a>
                        </li>

                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/blazer-mid-x-off-white">Blazer Mid x Off White</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/epic-react-flyknit">Epic React Flyknit</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/zoom-pegasus-turbo">Zoom Pegasus Turbo</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/vapormax">VAPORMAX</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/air-max-90">AIR MAX 90</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/air-max-720">Air Max 720</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/joyride-run-flyknit-blue">Joyride Run Flyknit Blue</a>
                        </li>
                    </ul>

                </li>
                <li class="nav-item ">
                    <a href="/adidas" class="nav-link">Adidas <i class="fa fa-angle-down" data-toggle="dropdown"></i></a>
                    <ul class="dropdown-menu">
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/stan-smith">Stan Smith</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/superstar">SuperStar</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/derup-runner">Derup runner</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/tubular-doom">Tubular Doom</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/pod">Pod</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/prophere">Prophere</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/yung-1">Yung 1</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/4d">4D</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/eqt">EQT</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/yeezy">Yeezy</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/human-race">Human Race</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/falcom">Falcom</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/alphabounce">Alphabounce</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/ultra-boost">Ultra Boost</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/xplr">XPLR</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/nmd-r1">NMD R1</a>
                        </li>
                    </ul>
                </li>

                <li class="nav-item ">
                    <a href="/luxury" class="nav-link">LUXURY <i class="fa fa-angle-down" data-toggle="dropdown"></i></a>
                    <ul class="dropdown-menu">
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/balenciaga">Balenciaga</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/gucci">Gucci</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/mc-queen">MC Queen</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/mlb">MLB</a>
                        </li>
                    </ul>
                </li>

                <li class="nav-item ">
                    <a href="/vans" class="nav-link">VANS <i class="fa fa-angle-down" data-toggle="dropdown"></i></a>
                    <ul class="dropdown-menu">
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/style-36">Style 36</a>
                        </li>

                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/slip-on">Slip on</a>
                        </li>

                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/old-skool">Old skool</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/era-95">Era 95</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/sk8">Sk8</a>
                        </li>
                    </ul>
                </li>

                <li class="nav-item ">
                    <a href="/converse" class="nav-link">CONVERSE <i class="fa fa-angle-down" data-toggle="dropdown"></i></a>
                    <ul class="dropdown-menu">
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/1970s">1970s</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/chuck-70s-x-cdg">Chuck 70s x CDG</a>
                        </li>
                    </ul>
                </li>

                <li class="nav-item ">
                    <a href="/fila" class="nav-link">FILA <i class="fa fa-angle-down" data-toggle="dropdown"></i></a>
                    <ul class="dropdown-menu">
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/fila-ray">Fila ray</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/fila-disruptor-ii">Fila Disruptor II</a>
                        </li>
                    </ul>
                </li>

                <li class="nav-item ">
                    <a href="/the-10" class="nav-link">THE 10 <i class="fa fa-angle-down" data-toggle="dropdown"></i></a>
                    <ul class="dropdown-menu">
                    </ul>
                </li>

                <li class="nav-item ">
                    <a href="/fashion" class="nav-link">FASHION <i class="fa fa-angle-down" data-toggle="dropdown"></i></a>
                    <ul class="dropdown-menu">
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/ao-phong">Áo Phông</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/ao-so-mi">Áo Sơ Mi</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/quan-jeans">Quần Jeans</a>
                        </li>
                        <li class="nav-item-lv2">
                            <a class="nav-link" href="/quan-au">Quần Âu</a>
                        </li>
                    </ul>

                </li>

                <li class="nav-item "><a class="nav-link" href="/san-pham-khuyen-mai">SALES</a></li>

                <li class="nav-item ">
                    <a href="/phu-kien" class="nav-link">Phụ Kiện <i class="fa fa-angle-down" data-toggle="dropdown"></i></a>
                    <ul class="dropdown-menu">
                    </ul>
                </li>
                <li class="nav-item "><a class="nav-link" href="/lien-he">Nhận Thông Báo SALE</a></li>
            </ul>
        </div>
    </nav>
</div>                
            </c:otherwise>
        </c:choose>





</header>


<section class="bread-crumb">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">

                <ul class="breadcrumb" itemscope itemtype="http://data-vocabulary.org/Breadcrumb">	

                    <li class="home">
                        <a itemprop="url" itemprop="url" href="/" ><span itemprop="title"><i class="fa fa-home"></i> Trang chủ</span></a>						
                        <span><i class="fa fa-angle-right"></i></span>
                    </li>


                    <li>
                        <a itemprop="url" href="/mlb"><span itemprop="title">MLB</span></a>						
                        <span><i class="fa fa-angle-right"></i></span>
                    </li>

                    <li><strong><span itemprop="title">MLB NY Cream</span></strong><li>

                </ul>
            </div>
        </div>
    </div>
</section>



<section class="product" itemscope itemtype="http://schema.org/Product">	
    <meta itemprop="url" content="//tushoes.vn/mlb-cream">
    <meta itemprop="image" content="//bizweb.dktcdn.net/thumb/grande/100/336/177/products/dscf4559.jpg?v=1573540616160">
    <div class="container">
        <div class="row">
            <div class="col-xs-12 details-product">
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-7 relative">
                        <div class="large-image">

                            <a href="//bizweb.dktcdn.net/thumb/1024x1024/100/336/177/products/dscf4559.jpg?v=1573540616160" data-rel="prettyPhoto[product-gallery]">
                                <img id="zoom_01" src="${product.getImg1}" alt="MLB NY Cream">
                            </a>							
                            <div class="hidden">

                                <div class="item">
                                    <a href="//bizweb.dktcdn.net/100/336/177/products/dscf4559.jpg?v=1573540616160" data-image="//bizweb.dktcdn.net/100/336/177/products/dscf4559.jpg?v=1573540616160" data-zoom-image="//bizweb.dktcdn.net/100/336/177/products/dscf4559.jpg?v=1573540616160" data-rel="prettyPhoto[product-gallery]">										
                                    </a>
                                </div>	

                                <div class="item">
                                    <a href="//bizweb.dktcdn.net/100/336/177/products/dscf4560.jpg?v=1573540617447" data-image="//bizweb.dktcdn.net/100/336/177/products/dscf4560.jpg?v=1573540617447" data-zoom-image="//bizweb.dktcdn.net/100/336/177/products/dscf4560.jpg?v=1573540617447" data-rel="prettyPhoto[product-gallery]">										
                                    </a>
                                </div>	

                                <div class="item">
                                    <a href="//bizweb.dktcdn.net/100/336/177/products/dscf4561.jpg?v=1573540618487" data-image="//bizweb.dktcdn.net/100/336/177/products/dscf4561.jpg?v=1573540618487" data-zoom-image="//bizweb.dktcdn.net/100/336/177/products/dscf4561.jpg?v=1573540618487" data-rel="prettyPhoto[product-gallery]">										
                                    </a>
                                </div>	

                                <div class="item">
                                    <a href="//bizweb.dktcdn.net/100/336/177/products/dscf4562.jpg?v=1573540619567" data-image="//bizweb.dktcdn.net/100/336/177/products/dscf4562.jpg?v=1573540619567" data-zoom-image="//bizweb.dktcdn.net/100/336/177/products/dscf4562.jpg?v=1573540619567" data-rel="prettyPhoto[product-gallery]">										
                                    </a>
                                </div>	

                                <div class="item">
                                    <a href="//bizweb.dktcdn.net/100/336/177/products/dscf4565.jpg?v=1573540620470" data-image="//bizweb.dktcdn.net/100/336/177/products/dscf4565.jpg?v=1573540620470" data-zoom-image="//bizweb.dktcdn.net/100/336/177/products/dscf4565.jpg?v=1573540620470" data-rel="prettyPhoto[product-gallery]">										
                                    </a>
                                </div>	

                            </div>
                        </div>

                        <div id="gallery_01" class="owl-carousel owl-theme thumbnail-product" data-md-items="3" data-sm-items="3" data-xs-items="3" data-smxs-items="3" data-margin="20">


                            <div class="item">
                                <a href="javascript:void(0);" data-image="//bizweb.dktcdn.net/100/336/177/products/dscf4559.jpg?v=1573540616160" data-zoom-image="//bizweb.dktcdn.net/thumb/1024x1024/100/336/177/products/dscf4559.jpg?v=1573540616160">
                                    <img  src="//bizweb.dktcdn.net/thumb/medium/100/336/177/products/dscf4559.jpg?v=1573540616160" alt="MLB NY Cream">
                                </a>
                            </div>

                            <div class="item">
                                <a href="javascript:void(0);" data-image="//bizweb.dktcdn.net/100/336/177/products/dscf4560.jpg?v=1573540617447" data-zoom-image="//bizweb.dktcdn.net/thumb/1024x1024/100/336/177/products/dscf4560.jpg?v=1573540617447">
                                    <img  src="//bizweb.dktcdn.net/thumb/medium/100/336/177/products/dscf4560.jpg?v=1573540617447" alt="MLB NY Cream">
                                </a>
                            </div>

                            <div class="item">
                                <a href="javascript:void(0);" data-image="//bizweb.dktcdn.net/100/336/177/products/dscf4561.jpg?v=1573540618487" data-zoom-image="//bizweb.dktcdn.net/thumb/1024x1024/100/336/177/products/dscf4561.jpg?v=1573540618487">
                                    <img  src="//bizweb.dktcdn.net/thumb/medium/100/336/177/products/dscf4561.jpg?v=1573540618487" alt="MLB NY Cream">
                                </a>
                            </div>

                            <div class="item">
                                <a href="javascript:void(0);" data-image="//bizweb.dktcdn.net/100/336/177/products/dscf4562.jpg?v=1573540619567" data-zoom-image="//bizweb.dktcdn.net/thumb/1024x1024/100/336/177/products/dscf4562.jpg?v=1573540619567">
                                    <img  src="//bizweb.dktcdn.net/thumb/medium/100/336/177/products/dscf4562.jpg?v=1573540619567" alt="MLB NY Cream">
                                </a>
                            </div>

                            <div class="item">
                                <a href="javascript:void(0);" data-image="//bizweb.dktcdn.net/100/336/177/products/dscf4565.jpg?v=1573540620470" data-zoom-image="//bizweb.dktcdn.net/thumb/1024x1024/100/336/177/products/dscf4565.jpg?v=1573540620470">
                                    <img  src="//bizweb.dktcdn.net/thumb/medium/100/336/177/products/dscf4565.jpg?v=1573540620470" alt="MLB NY Cream">
                                </a>
                            </div>

                        </div>

                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-5 details-pro">
                        <h1 class="title-head" itemprop="name">${product.getName}</h1>

                        <div class="price-box detail-header-info">

                            <span class="special-price"><span class="price product-price"></span> </span> <!-- Giá Khuyến mại -->
                            <span class="old-price"><del class="price product-price-old" ></del> </span> <!-- Giá gốc -->

                        </div>

                        <div class="product_description margin-bottom-20">
                            <div class="rte description rte-summary">

                                <p>- Chất lượng Rep 1:1 [ Bao check ]<br />
                                    - Vận chuyển toàn quốc&nbsp;[ Kiểm Tra Hàng Trước Khi Thanh Toán ]&nbsp;<br />
                                    - 100% Ảnh chụp trực tiếp tại Tu Shoes&nbsp;<br />
                                    - Bảo Hành Trọn Đời Sản Phẩm&nbsp;<br />
                                    - Đổi Trả 7 Ngày Không Kể Lí Do&nbsp;<br />
                                    - Liên Hệ : 0967.585.135</p>

                            </div>
                        </div>

                        <div class="form-product">
                            <form enctype="multipart/form-data" id="add-to-cart-form" action="/cart/add" method="post" class="form-inline">

                                <div class="box-variant clearfix 1azs">

                                    <div class=" swatch-nomal  swatch clearfix" data-option-index="0">
                                        <div class="header">Kích thước:</div>

                                        <div data-value="36" data-var="28823554" class="swatch-element  nomals 36 available">


                                            <input class="swatch-hai" id="swatch-0-36" type="radio" name="option-0" data-value="36" value="36" checked  />

                                            <label for="swatch-0-36">
                                                36
                                            </label>

                                        </div>

                                        <div data-value="37" data-var="28823555" class="swatch-element  nomals 37 available">


                                            <input class="swatch-hai" id="swatch-0-37" type="radio" name="option-0" data-value="37" value="37"  />

                                            <label for="swatch-0-37">
                                                37
                                            </label>

                                        </div>

                                        <div data-value="38" data-var="28823556" class="swatch-element  nomals 38 available">


                                            <input class="swatch-hai" id="swatch-0-38" type="radio" name="option-0" data-value="38" value="38"  />

                                            <label for="swatch-0-38">
                                                38
                                            </label>

                                        </div>

                                        <div data-value="39" data-var="28823557" class="swatch-element  nomals 39 available">


                                            <input class="swatch-hai" id="swatch-0-39" type="radio" name="option-0" data-value="39" value="39"  />

                                            <label for="swatch-0-39">
                                                39
                                            </label>

                                        </div>

                                        <div data-value="40" data-var="28823558" class="swatch-element  nomals 40 available">


                                            <input class="swatch-hai" id="swatch-0-40" type="radio" name="option-0" data-value="40" value="40"  />

                                            <label for="swatch-0-40">
                                                40
                                            </label>

                                        </div>

                                        <div data-value="41" data-var="28823559" class="swatch-element  nomals 41 available">


                                            <input class="swatch-hai" id="swatch-0-41" type="radio" name="option-0" data-value="41" value="41"  />

                                            <label for="swatch-0-41">
                                                41
                                            </label>

                                        </div>

                                        <div data-value="42" data-var="28823560" class="swatch-element  nomals 42 available">


                                            <input class="swatch-hai" id="swatch-0-42" type="radio" name="option-0" data-value="42" value="42"  />

                                            <label for="swatch-0-42">
                                                42
                                            </label>

                                        </div>

                                        <div data-value="43" data-var="28823561" class="swatch-element  nomals 43 soldout">


                                            <input class="swatch-hai" id="swatch-0-43" type="radio" name="option-0" data-value="43" value="43"  />

                                            <label for="swatch-0-43">
                                                43
                                            </label>

                                        </div>

                                        <div data-value="44" data-var="28823562" class="swatch-element  nomals 44 available">


                                            <input class="swatch-hai" id="swatch-0-44" type="radio" name="option-0" data-value="44" value="44"  />

                                            <label for="swatch-0-44">
                                                44
                                            </label>

                                        </div>


                                    </div>

                                </div>

                                <div class="box-variant clearfix  hidden  ">



                                    <fieldset class="form-group">
                                        <select id="product-selectors" class="form-control form-control-lg" name="variantId" style="display:none">

                                            <option  selected="selected"  value="28823554">36 - 760.000₫</option>

                                            <option  value="28823555">37 - 760.000₫</option>

                                            <option  value="28823556">38 - 760.000₫</option>

                                            <option  value="28823557">39 - 760.000₫</option>

                                            <option  value="28823558">40 - 760.000₫</option>

                                            <option  value="28823559">41 - 760.000₫</option>

                                            <option  value="28823560">42 - 760.000₫</option>

                                            <option  value="28823561">43 - 760.000₫</option>

                                            <option  value="28823562">44 - 760.000₫</option>

                                        </select>										
                                    </fieldset>


                                </div>
                                <div class="form-groupx form-group form-detail-action ">
                                    <label>Số lượng: </label>
                                    <div class="custom custom-btn-number hidden">																			
                                        <span class="qtyminus" data-field="quantity"><i class="fa fa-caret-down"></i></span>
                                        <input type="number" class="input-text qty" data-field='quantity' title="Só lượng" value="1" maxlength="12" id="qty" name="quantity">									
                                        <span class="qtyplus" data-field="quantity"><i class="fa fa-caret-up"></i></span>										
                                    </div>

                                </div>		
                                <div class="form-groupx form-group form-detail-action ">


                                    <button type="submit" class="btn btn-lg btn-primary btn-cart btn-cart2 add_to_cart btn_buy add_to_cart" title="Cho vào giỏ hàng">
                                        <span>Thêm vào giỏ hàng</span>
                                    </button>
                                    <a class=" dat-hang btn-cart3" onclick="window.location.href = '/cart/28823554:1'">
                                        Mua ngay
                                    </a>


                                </div>			



                            </form>

                            <div class="tag-product margin-bottom-5">
                                <span class="inline">Tags: </span>


                                <a href="/collections/all/giay-mlb">Giày MLB</a>			



                                <a href="/collections/all/mlb">MLB</a>			



                                <a href="/collections/all/mlb-shoes">MLB shoes</a>			



                                <a href="/collections/all/rep11">Rep11</a>			



                                <a href="/collections/all/replica">Replica</a>			


                            </div>



                            <div class="social-sharing">								






                                <div class="social-media" data-permalink="https://tushoes.vn/mlb-cream">
                                    <span class="inline">Chia sẻ: </span>

                                    <a target="_blank" href="//www.facebook.com/sharer.php?u=https://tushoes.vn/mlb-cream" class="share-facebook" title="Chia sẻ lên Facebook">
                                        <i class="fa fa-facebook"></i>
                                    </a>



                                    <a target="_blank" href="//twitter.com/share?text=MLB NY Cream&amp;url=https://tushoes.vn/mlb-cream" class="share-twitter" title="Chia sẻ lên Twitter">
                                        <i class="fa fa-twitter"></i>
                                    </a>





                                    <a target="_blank" href="//pinterest.com/pin/create/button/?url=https://tushoes.vn/mlb-cream&amp;media=http://bizweb.dktcdn.net/thumb/1024x1024/100/336/177/products/dscf4559.jpg?v=1573540616160&amp;description=MLB NY Cream" class="share-pinterest" title="Chia sẻ lên pinterest">
                                        <i class="fa fa-pinterest"></i>
                                    </a>







                                    <a target="_blank" href="//plus.google.com/share?url=https://tushoes.vn/mlb-cream" class="share-google" title="+1">
                                        <i class="fa fa-google-plus"></i>
                                    </a>


                                </div>								
                            </div>

                        </div>

                    </div>
                </div>				
            </div>
            <div class="col-xs-12">
                <div class="row margin-top-75 xs-margin-top-15">


                </div>

            </div>

            <div class="col-xs-12">






                <div class="related-product margin-top-10">
                    <div class="heading a-center">
                        <h2 class="title-head"><a href="/mlb">Sản phẩm cùng loại</a></h2>
                    </div>
                    <div class="products  owl-carousel owl-theme products-view-grid" data-md-items="4" data-sm-items="3" data-xs-items="2" data-margin="30">

                        <div class="product-box">	
                            <div class="product-thumbnail">		

                                <div class="sale-flash">- 
                                    20% 
                                </div>

                                <a class="find-out" href="/mlb-ny-cream-black" title="MLB NY Cream Black">
                                    <picture class="dp-flex">

                                        <img class="img-responsive" src="//bizweb.dktcdn.net/100/336/177/products/dscf4554.jpg?v=1573540568000" alt="MLB NY Cream Black"/>


                                    </picture>
                                </a>
                                <a class="find-in" href="/mlb-ny-cream-black" title="MLB NY Cream Black">
                                    <picture class="dp-flex">





                                        <img class="img-responsive 1" src="//bizweb.dktcdn.net/100/336/177/products/dscf4555.jpg?v=1573540569000"  alt="mlb-ny-cream-black"/>



                                    </picture>
                                </a>
                                <div class="product-action clearfix">
                                    <div class="fix_bg" onclick="window.location.href = '/mlb-ny-cream-black'"></div>
                                    <form action="/cart/add" method="post" class="variants form-nut-grid" data-id="product-actions-16254044" enctype="multipart/form-data">

                                        <div>



                                        </div>
                                    </form>
                                </div>
                            </div>

                            <div class="product-info a-center">

                                <h3 class="product-name"><a href="/mlb-ny-cream-black" title="MLB NY Cream Black">MLB NY Cream Black</a></h3>





                                <div class="price-box clearfix">			
                                    <div class="special-price">
                                        <span class="price product-price">760.000₫</span>
                                    </div>

                                    <div class="old-price">															 
                                        <span class="price product-price-old">
                                            950.000₫			
                                        </span>
                                    </div>

                                </div>		


                            </div>
                            <div class="hidden">
                                <form action="/cart/add" method="post" class="variants a-center form-nut-grid" data-id="product-actions-16254044" enctype="multipart/form-data">
                                    <div>				
                                        <div class="action-item">

                                            <input class="hidden" type="hidden" name="variantId" value="28823552" />
                                            <button class="btn btn-white btn-cart btn  left-to"   title="Chọn sản phẩm"  type="button" onclick="window.location.href = '/mlb-ny-cream-black'" >
                                                <i class="icon_plus"></i> Tùy chọn
                                            </button>

                                        </div>

                                    </div>
                                </form>
                            </div>

                        </div>



                        <div class="product-box">	
                            <div class="product-thumbnail">		

                                <div class="sale-flash">- 
                                    20% 
                                </div>

                                <a class="find-out" href="/mlb-ny-black" title="MLB NY Black">
                                    <picture class="dp-flex">

                                        <img class="img-responsive" src="//bizweb.dktcdn.net/100/336/177/products/dscf4585.jpg?v=1573540651000" alt="MLB NY Black"/>


                                    </picture>
                                </a>
                                <a class="find-in" href="/mlb-ny-black" title="MLB NY Black">
                                    <picture class="dp-flex">





                                        <img class="img-responsive 1" src="//bizweb.dktcdn.net/100/336/177/products/dscf4586.jpg?v=1573540652000"  alt="mlb-ny-black"/>



                                    </picture>
                                </a>
                                <div class="product-action clearfix">
                                    <div class="fix_bg" onclick="window.location.href = '/mlb-ny-black'"></div>
                                    <form action="/cart/add" method="post" class="variants form-nut-grid" data-id="product-actions-16253994" enctype="multipart/form-data">

                                        <div>



                                        </div>
                                    </form>
                                </div>
                            </div>

                            <div class="product-info a-center">

                                <h3 class="product-name"><a href="/mlb-ny-black" title="MLB NY Black">MLB NY Black</a></h3>





                                <div class="price-box clearfix">			
                                    <div class="special-price">
                                        <span class="price product-price">760.000₫</span>
                                    </div>

                                    <div class="old-price">															 
                                        <span class="price product-price-old">
                                            950.000₫			
                                        </span>
                                    </div>

                                </div>		


                            </div>
                            <div class="hidden">
                                <form action="/cart/add" method="post" class="variants a-center form-nut-grid" data-id="product-actions-16253994" enctype="multipart/form-data">
                                    <div>				
                                        <div class="action-item">

                                            <input class="hidden" type="hidden" name="variantId" value="28823563" />
                                            <button class="btn btn-white btn-cart btn  left-to"   title="Chọn sản phẩm"  type="button" onclick="window.location.href = '/mlb-ny-black'" >
                                                <i class="icon_plus"></i> Tùy chọn
                                            </button>

                                        </div>

                                    </div>
                                </form>
                            </div>

                        </div>



                        <div class="product-box">	
                            <div class="product-thumbnail">		

                                <div class="sale-flash">- 
                                    20% 
                                </div>

                                <a class="find-out" href="/mlb-la" title="MLB LA">
                                    <picture class="dp-flex">

                                        <img class="img-responsive" src="//bizweb.dktcdn.net/100/336/177/products/dscf4574.jpg?v=1573540720000" alt="MLB LA"/>


                                    </picture>
                                </a>
                                <a class="find-in" href="/mlb-la" title="MLB LA">
                                    <picture class="dp-flex">





                                        <img class="img-responsive 1" src="//bizweb.dktcdn.net/100/336/177/products/dscf4575.jpg?v=1573540721000"  alt="mlb-la"/>



                                    </picture>
                                </a>
                                <div class="product-action clearfix">
                                    <div class="fix_bg" onclick="window.location.href = '/mlb-la'"></div>
                                    <form action="/cart/add" method="post" class="variants form-nut-grid" data-id="product-actions-16253993" enctype="multipart/form-data">

                                        <div>



                                        </div>
                                    </form>
                                </div>
                            </div>

                            <div class="product-info a-center">

                                <h3 class="product-name"><a href="/mlb-la" title="MLB LA">MLB LA</a></h3>





                                <div class="price-box clearfix">			
                                    <div class="special-price">
                                        <span class="price product-price">760.000₫</span>
                                    </div>

                                    <div class="old-price">															 
                                        <span class="price product-price-old">
                                            950.000₫			
                                        </span>
                                    </div>

                                </div>		


                            </div>
                            <div class="hidden">
                                <form action="/cart/add" method="post" class="variants a-center form-nut-grid" data-id="product-actions-16253993" enctype="multipart/form-data">
                                    <div>				
                                        <div class="action-item">

                                            <input class="hidden" type="hidden" name="variantId" value="28823572" />
                                            <button class="btn btn-white btn-cart btn  left-to"   title="Chọn sản phẩm"  type="button" onclick="window.location.href = '/mlb-la'" >
                                                <i class="icon_plus"></i> Tùy chọn
                                            </button>

                                        </div>

                                    </div>
                                </form>
                            </div>

                        </div>



                        <div class="product-box">	
                            <div class="product-thumbnail">		

                                <div class="sale-flash">- 
                                    20% 
                                </div>

                                <a class="find-out" href="/mlb-boston" title="MLB Boston">
                                    <picture class="dp-flex">

                                        <img class="img-responsive" src="//bizweb.dktcdn.net/100/336/177/products/dscf4569.jpg?v=1573540759000" alt="MLB Boston"/>


                                    </picture>
                                </a>
                                <a class="find-in" href="/mlb-boston" title="MLB Boston">
                                    <picture class="dp-flex">





                                        <img class="img-responsive 1" src="//bizweb.dktcdn.net/100/336/177/products/dscf4570.jpg?v=1573540760000"  alt="mlb-boston"/>



                                    </picture>
                                </a>
                                <div class="product-action clearfix">
                                    <div class="fix_bg" onclick="window.location.href = '/mlb-boston'"></div>
                                    <form action="/cart/add" method="post" class="variants form-nut-grid" data-id="product-actions-16253984" enctype="multipart/form-data">

                                        <div>



                                        </div>
                                    </form>
                                </div>
                            </div>

                            <div class="product-info a-center">

                                <h3 class="product-name"><a href="/mlb-boston" title="MLB Boston">MLB Boston</a></h3>





                                <div class="price-box clearfix">			
                                    <div class="special-price">
                                        <span class="price product-price">760.000₫</span>
                                    </div>

                                    <div class="old-price">															 
                                        <span class="price product-price-old">
                                            950.000₫			
                                        </span>
                                    </div>

                                </div>		


                            </div>
                            <div class="hidden">
                                <form action="/cart/add" method="post" class="variants a-center form-nut-grid" data-id="product-actions-16253984" enctype="multipart/form-data">
                                    <div>				
                                        <div class="action-item">

                                            <input class="hidden" type="hidden" name="variantId" value="28823582" />
                                            <button class="btn btn-white btn-cart btn  left-to"   title="Chọn sản phẩm"  type="button" onclick="window.location.href = '/mlb-boston'" >
                                                <i class="icon_plus"></i> Tùy chọn
                                            </button>

                                        </div>

                                    </div>
                                </form>
                            </div>

                        </div>

                        <div class="product-box">	
                            <div class="product-thumbnail">		

                                <div class="sale-flash">- 
                                    20% 
                                </div>

                                <a class="find-out" href="/mlb-new-york" title="MLB New York">
                                    <picture class="dp-flex">

                                        <img class="img-responsive" src="//bizweb.dktcdn.net/100/336/177/products/dscf4590.jpg?v=1573540797000" alt="MLB New York"/>


                                    </picture>
                                </a>
                                <a class="find-in" href="/mlb-new-york" title="MLB New York">
                                    <picture class="dp-flex">





                                        <img class="img-responsive 1" src="//bizweb.dktcdn.net/100/336/177/products/dscf4591.jpg?v=1573540798000"  alt="mlb-new-york"/>



                                    </picture>
                                </a>
                                <div class="product-action clearfix">
                                    <div class="fix_bg" onclick="window.location.href = '/mlb-new-york'"></div>
                                    <form action="/cart/add" method="post" class="variants form-nut-grid" data-id="product-actions-16253973" enctype="multipart/form-data">

                                        <div>



                                        </div>
                                    </form>
                                </div>
                            </div>

                            <div class="product-info a-center">

                                <h3 class="product-name"><a href="/mlb-new-york" title="MLB New York">MLB New York</a></h3>





                                <div class="price-box clearfix">			
                                    <div class="special-price">
                                        <span class="price product-price">760.000₫</span>
                                    </div>

                                    <div class="old-price">															 
                                        <span class="price product-price-old">
                                            950.000₫			
                                        </span>
                                    </div>

                                </div>		


                            </div>
                            <div class="hidden">
                                <form action="/cart/add" method="post" class="variants a-center form-nut-grid" data-id="product-actions-16253973" enctype="multipart/form-data">
                                    <div>				
                                        <div class="action-item">

                                            <input class="hidden" type="hidden" name="variantId" value="28823591" />
                                            <button class="btn btn-white btn-cart btn  left-to"   title="Chọn sản phẩm"  type="button" onclick="window.location.href = '/mlb-new-york'" >
                                                <i class="icon_plus"></i> Tùy chọn
                                            </button>

                                        </div>

                                    </div>
                                </form>
                            </div>

                        </div>

                        <div class="product-box">	
                            <div class="product-thumbnail">		

                                <div class="sale-flash">- 
                                    20% 
                                </div>

                                <a class="find-out" href="/mlb-dodgers" title="MLB Dodgers">
                                    <picture class="dp-flex">

                                        <img class="img-responsive" src="//bizweb.dktcdn.net/100/336/177/products/dscf4579.jpg?v=1573540829000" alt="MLB Dodgers"/>


                                    </picture>
                                </a>
                                <a class="find-in" href="/mlb-dodgers" title="MLB Dodgers">
                                    <picture class="dp-flex">





                                        <img class="img-responsive 1" src="//bizweb.dktcdn.net/100/336/177/products/dscf4580.jpg?v=1573540830000"  alt="mlb-dodgers"/>



                                    </picture>
                                </a>
                                <div class="product-action clearfix">
                                    <div class="fix_bg" onclick="window.location.href = '/mlb-dodgers'"></div>
                                    <form action="/cart/add" method="post" class="variants form-nut-grid" data-id="product-actions-16253959" enctype="multipart/form-data">

                                        <div>



                                        </div>
                                    </form>
                                </div>
                            </div>

                            <div class="product-info a-center">

                                <h3 class="product-name"><a href="/mlb-dodgers" title="MLB Dodgers">MLB Dodgers</a></h3>





                                <div class="price-box clearfix">			
                                    <div class="special-price">
                                        <span class="price product-price">760.000₫</span>
                                    </div>

                                    <div class="old-price">															 
                                        <span class="price product-price-old">
                                            950.000₫			
                                        </span>
                                    </div>

                                </div>		


                            </div>
                            <div class="hidden">
                                <form action="/cart/add" method="post" class="variants a-center form-nut-grid" data-id="product-actions-16253959" enctype="multipart/form-data">
                                    <div>				
                                        <div class="action-item">

                                            <input class="hidden" type="hidden" name="variantId" value="28823601" />
                                            <button class="btn btn-white btn-cart btn  left-to"   title="Chọn sản phẩm"  type="button" onclick="window.location.href = '/mlb-dodgers'" >
                                                <i class="icon_plus"></i> Tùy chọn
                                            </button>

                                        </div>

                                    </div>
                                </form>
                            </div>

                        </div>


                    </div>
                </div>

            </div>

        </div>	
    </div>
</section>

<%
    }
%>

<style>
    .suntory-alo-phone {
        background-color: transparent;
        cursor: pointer;
        height: 120px;
        position: fixed;
        transition: visibility 0.5s ease 0s;
        width: 120px;
        z-index: 200000 !important;
        top: initial !important;
    }
    .suntory-alo-ph-circle {
        animation: 1.2s ease-in-out 0s normal none infinite running suntory-alo-circle-anim;
        background-color: transparent;
        border: 2px solid rgba(30, 30, 30, 0.4);
        border-radius: 100%;
        height: 100px;
        left: 0px;
        opacity: 0.1;
        position: absolute;
        top: 0px;
        transform-origin: 50% 50% 0;
        transition: all 0.5s ease 0s;
        width: 100px;
    }
    .suntory-alo-ph-circle-fill {
        animation: 2.3s ease-in-out 0s normal none infinite running suntory-alo-circle-fill-anim;
        border: 2px solid transparent;
        border-radius: 100%;
        height: 70px;
        left: 15px;
        position: absolute;
        top: 15px;
        transform-origin: 50% 50% 0;
        transition: all 0.5s ease 0s;
        width: 70px;
    }
    .suntory-alo-ph-img-circle {
        border: 2px solid transparent;
        border-radius: 100%;
        height: 50px;
        left: 25px;
        opacity: 0.7;
        position: absolute;
        top: 25px;
        transform-origin: 50% 50% 0;
        width: 50px;
    }
    .suntory-alo-phone.suntory-alo-hover, .suntory-alo-phone:hover {
        opacity: 1;
    }
    .suntory-alo-phone.suntory-alo-active .suntory-alo-ph-circle {
        animation: 1.1s ease-in-out 0s normal none infinite running suntory-alo-circle-anim !important;
    }
    .suntory-alo-phone.suntory-alo-static .suntory-alo-ph-circle {
        animation: 2.2s ease-in-out 0s normal none infinite running suntory-alo-circle-anim !important;
    }
    .suntory-alo-phone.suntory-alo-hover .suntory-alo-ph-circle, .suntory-alo-phone:hover .suntory-alo-ph-circle {
        border-color: #00aff2;
        opacity: 0.5;
    }
    .suntory-alo-phone.suntory-alo-green.suntory-alo-hover .suntory-alo-ph-circle, .suntory-alo-phone.suntory-alo-green:hover .suntory-alo-ph-circle {
        border-color: #EB278D;
        opacity: 1;
    }
    .suntory-alo-phone.suntory-alo-green .suntory-alo-ph-circle {
        border-color: #bfebfc;
        opacity: 1;
    }
    .suntory-alo-phone.suntory-alo-hover .suntory-alo-ph-circle-fill, .suntory-alo-phone:hover .suntory-alo-ph-circle-fill {
        background-color: rgba(0, 175, 242, 0.9);
    }
    .suntory-alo-phone.suntory-alo-green.suntory-alo-hover .suntory-alo-ph-circle-fill, .suntory-alo-phone.suntory-alo-green:hover .suntory-alo-ph-circle-fill {
        background-color: #EB278D;
    }
    .suntory-alo-phone.suntory-alo-green .suntory-alo-ph-circle-fill {
        background-color: rgba(0, 175, 242, 0.9);
    }

    .suntory-alo-phone.suntory-alo-hover .suntory-alo-ph-img-circle, .suntory-alo-phone:hover .suntory-alo-ph-img-circle {
        background-color: #00aff2;
    }
    .suntory-alo-phone.suntory-alo-green.suntory-alo-hover .suntory-alo-ph-img-circle, .suntory-alo-phone.suntory-alo-green:hover .suntory-alo-ph-img-circle {
        background-color: #EB278D;
    }
    .suntory-alo-phone.suntory-alo-green .suntory-alo-ph-img-circle {
        background-color: #00aff2;
    }
    @keyframes suntory-alo-circle-anim {
        0% {
            opacity: 0.1;
            transform: rotate(0deg) scale(0.5) skew(1deg);
        }
        30% {
            opacity: 0.5;
            transform: rotate(0deg) scale(0.7) skew(1deg);
        }
        100% {
            opacity: 0.6;
            transform: rotate(0deg) scale(1) skew(1deg);
        }
    }

    @keyframes suntory-alo-circle-img-anim {
        0% {
            transform: rotate(0deg) scale(1) skew(1deg);
        }
        10% {
            transform: rotate(-25deg) scale(1) skew(1deg);
        }
        20% {
            transform: rotate(25deg) scale(1) skew(1deg);
        }
        30% {
            transform: rotate(-25deg) scale(1) skew(1deg);
        }
        40% {
            transform: rotate(25deg) scale(1) skew(1deg);
        }
        50% {
            transform: rotate(0deg) scale(1) skew(1deg);
        }
        100% {
            transform: rotate(0deg) scale(1) skew(1deg);
        }
    }
    @keyframes suntory-alo-circle-fill-anim {
        0% {
            opacity: 0.2;
            transform: rotate(0deg) scale(0.7) skew(1deg);
        }
        50% {
            opacity: 0.2;
            transform: rotate(0deg) scale(1) skew(1deg);
        }
        100% {
            opacity: 0.2;
            transform: rotate(0deg) scale(0.7) skew(1deg);
        }
    }
    .suntory-alo-ph-img-circle i {
        animation: 1s ease-in-out 0s normal none infinite running suntory-alo-circle-img-anim;
        font-size: 30px;
        line-height: 50px;
        padding-left: 13px;
        color: #fff;
    }

    /*=================== End phone ring ===============*/
    @keyframes suntory-alo-ring-ring {
        0% {
            transform: rotate(0deg) scale(1) skew(1deg);
        }
        10% {
            transform: rotate(-25deg) scale(1) skew(1deg);
        }
        20% {
            transform: rotate(25deg) scale(1) skew(1deg);
        }
        30% {
            transform: rotate(-25deg) scale(1) skew(1deg);
        }
        40% {
            transform: rotate(25deg) scale(1) skew(1deg);
        }
        50% {
            transform: rotate(0deg) scale(1) skew(1deg);
        }
        100% {
            transform: rotate(0deg) scale(1) skew(1deg);
        }
    }
</style>
<a href="tel:0967585135" class="suntory-alo-phone suntory-alo-green" id="suntory-alo-phoneIcon" style="left: 0px; bottom: 0px;">
    <div class="suntory-alo-ph-circle"></div>
    <div class="suntory-alo-ph-circle-fill"></div>
    <div class="suntory-alo-ph-img-circle"><i class="fa fa-phone"></i></div>
</a>


<!-- Add to cart -->	
<div class="ajax-load"> 
    <span class="loading-icon">
        <svg version="1.1"  xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
             width="24px" height="30px" viewBox="0 0 24 30" style="enable-background:new 0 0 50 50;" xml:space="preserve">
        <rect x="0" y="10" width="4" height="10" fill="#333" opacity="0.2">
        <animate attributeName="opacity" attributeType="XML" values="0.2; 1; .2" begin="0s" dur="0.6s" repeatCount="indefinite" />
        <animate attributeName="height" attributeType="XML" values="10; 20; 10" begin="0s" dur="0.6s" repeatCount="indefinite" />
        <animate attributeName="y" attributeType="XML" values="10; 5; 10" begin="0s" dur="0.6s" repeatCount="indefinite" />
        </rect>
        <rect x="8" y="10" width="4" height="10" fill="#333"  opacity="0.2">
        <animate attributeName="opacity" attributeType="XML" values="0.2; 1; .2" begin="0.15s" dur="0.6s" repeatCount="indefinite" />
        <animate attributeName="height" attributeType="XML" values="10; 20; 10" begin="0.15s" dur="0.6s" repeatCount="indefinite" />
        <animate attributeName="y" attributeType="XML" values="10; 5; 10" begin="0.15s" dur="0.6s" repeatCount="indefinite" />
        </rect>
        <rect x="16" y="10" width="4" height="10" fill="#333"  opacity="0.2">
        <animate attributeName="opacity" attributeType="XML" values="0.2; 1; .2" begin="0.3s" dur="0.6s" repeatCount="indefinite" />
        <animate attributeName="height" attributeType="XML" values="10; 20; 10" begin="0.3s" dur="0.6s" repeatCount="indefinite" />
        <animate attributeName="y" attributeType="XML" values="10; 5; 10" begin="0.3s" dur="0.6s" repeatCount="indefinite" />
        </rect>
        </svg>
    </span>
</div>

<div class="loading awe-popup">
    <div class="overlay"></div>
    <div class="loader" title="2">
        <svg version="1.1"  xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
             width="24px" height="30px" viewBox="0 0 24 30" style="enable-background:new 0 0 50 50;" xml:space="preserve">
        <rect x="0" y="10" width="4" height="10" fill="#333" opacity="0.2">
        <animate attributeName="opacity" attributeType="XML" values="0.2; 1; .2" begin="0s" dur="0.6s" repeatCount="indefinite" />
        <animate attributeName="height" attributeType="XML" values="10; 20; 10" begin="0s" dur="0.6s" repeatCount="indefinite" />
        <animate attributeName="y" attributeType="XML" values="10; 5; 10" begin="0s" dur="0.6s" repeatCount="indefinite" />
        </rect>
        <rect x="8" y="10" width="4" height="10" fill="#333"  opacity="0.2">
        <animate attributeName="opacity" attributeType="XML" values="0.2; 1; .2" begin="0.15s" dur="0.6s" repeatCount="indefinite" />
        <animate attributeName="height" attributeType="XML" values="10; 20; 10" begin="0.15s" dur="0.6s" repeatCount="indefinite" />
        <animate attributeName="y" attributeType="XML" values="10; 5; 10" begin="0.15s" dur="0.6s" repeatCount="indefinite" />
        </rect>
        <rect x="16" y="10" width="4" height="10" fill="#333"  opacity="0.2">
        <animate attributeName="opacity" attributeType="XML" values="0.2; 1; .2" begin="0.3s" dur="0.6s" repeatCount="indefinite" />
        <animate attributeName="height" attributeType="XML" values="10; 20; 10" begin="0.3s" dur="0.6s" repeatCount="indefinite" />
        <animate attributeName="y" attributeType="XML" values="10; 5; 10" begin="0.3s" dur="0.6s" repeatCount="indefinite" />
        </rect>
        </svg>
    </div>

</div>

<div class="addcart-popup product-popup awe-popup">
    <div class="overlay no-background"></div>
    <div class="content">
        <div class="row row-noGutter">
            <div class="col-xl-6 col-xs-12">
                <div class="btn btn-full btn-primary a-left popup-title"><i class="fa fa-check"></i>Thêm vào giỏ hàng thành công
                </div>
                <a href="javascript:void(0)" class="close-window close-popup"><i class="fa fa-close"></i></a>
                <div class="info clearfix">
                    <div class="product-image margin-top-5">
                        <img alt="popup" src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/logo.png?1573498022604" style="max-width:150px; height:auto"/>
                    </div>
                    <div class="product-info">
                        <p class="product-name"></p>
                        <p class="quantity color-main"><span>Số lượng: </span></p>
                        <p class="total-money color-main"><span>Tổng tiền: </span></p>

                    </div>
                    <div class="actions">    
                        <button class="btn  btn-primary  margin-top-5 btn-continue">Tiếp tục mua hàng</button>        
                        <button class="btn btn-gray margin-top-5" onclick="window.location = '/cart'">Kiểm tra giỏ hàng</button>
                    </div> 
                </div>

            </div>			
        </div>

    </div>    
</div>
<div class="error-popup awe-popup">
    <div class="overlay no-background"></div>
    <div class="popup-inner content">
        <div class="error-message"></div>
    </div>
</div>		
<div id="popup-cart" class="modal fade" role="dialog">
    <div id="popup-cart-desktop" class="clearfix">
        <div class="content">
            <a href="javascript:void(0)" class="close-window">x</a>
            <div class="clearfix">
                <div class="product-image f-left padding-right-20">
                    <img alt="img" src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/logo.png?1573498022604" style="max-width:120px; height:auto">
                </div>
                <div class="f-left" style=" width: calc(100% - 130px); ">
                    <div class="product-info f-left">
                        <p class="product-name margin-bottom-10" style="font-weight: 700;">

                            <a href="#" title=""></a> 
                        </p>
                        <p class="success-message btn-cart">Sản phẩm đã thêm vào giỏ hàng !</p>


                    </div>
                    <div class="actions clearfix margin-top-10" style=" clear: left; ">
                        <button class="btn continue-shopping  btn-primary margin-right-10" onclick="$('#popup-cart').modal('hide');">Tiếp tục mua sắm</button>
                        <button class="btn btn-cart  btn-primary " onclick="window.location = '/cart'">Xem giỏ hàng</button>

                    </div>  
                </div>
            </div>

        </div>
        <a title="Close" class="quickview-close close-window" href="javascript:;" onclick="$('#popup-cart').modal('hide');"><i class="fa  fa-times-circle"></i></a>
    </div>

</div>




</body>
</html>
