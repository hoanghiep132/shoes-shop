<%-- 
    Document   : MyAccount
    Created on : Nov 16, 2019, 10:04:58 AM
    Author     : hiepnguyen
--%>

<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@page import="model.Bill"%>
<%@page import="connectionjdbc.bill.BillTransaction"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">				
        <title>
            Trang khách hàng			
        </title>

        <meta name="keywords" content="Trang khách hàng, Shop Tú Shoes, tushoes.vn"/>		
        <link rel="canonical" href="https://tushoes.vn/account"/>
        <meta name='revisit-after' content='1 days' />


        <link rel="icon" href="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/favicon.png?1573498022604" type="image/x-icon" />




        <link href="//fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet" type="text/css" />








        <link href="//fonts.googleapis.com/css?family=Roboto:400" rel="stylesheet" type="text/css" />

        <link href="https://fonts.googleapis.com/css?family=Roboto:400,400i&amp;subset=vietnamese" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=vietnamese" rel="stylesheet">

        <!-- Facebook Open Graph meta tags -->

        <meta property="og:type" content="website">
        <meta property="og:title" content="Trang kh&#225;ch h&#224;ng">
        <meta property="og:image" content="http://bizweb.dktcdn.net/100/336/177/themes/693093/assets/logo.png?1573498022604">
        <meta property="og:image:secure_url" content="https://bizweb.dktcdn.net/100/336/177/themes/693093/assets/logo.png?1573498022604">


        <meta property="og:url" content="https://tushoes.vn/account">
        <meta property="og:site_name" content="Shop Tú Shoes">		
        <!-- Plugin CSS -->			
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">

        <link href="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/owl.carousel.min.css?1573498022604" rel="stylesheet" type="text/css" />
        <!-- Build Main CSS -->								
        <link href="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/base.scss.css?1573498022604" rel="stylesheet" type="text/css" />		
        <link href="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/font.scss.css?1573498022604" rel="stylesheet" type="text/css" />		
        <link href="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/style.scss.css?1573498022604" rel="stylesheet" type="text/css" />		
        <link href="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/update.scss.css?1573498022604" rel="stylesheet" type="text/css" />		
        <link href="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/module.scss.css?1573498022604" rel="stylesheet" type="text/css" />
        <link href="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/responsive.scss.css?1573498022604" rel="stylesheet" type="text/css" />
        <link href="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/fix.scss.css?1573498022604" rel="stylesheet" type="text/css" />



        <script>
            var iwish_template = 'customers/account';
            var iwish_cid = parseInt('9844126', 10);
        </script>

        <%
            User user = new User();
            List<Bill> bills = new BillTransaction().getListBill(user.getId());

        %>
        <script src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/iwishheader.js?1573498022604" type="text/javascript"></script>

        <!-- Bizweb javascript customer -->

        <script src="//bizweb.dktcdn.net/assets/themes_support/bizweb-api.js?4" type="text/javascript"></script>
        <script src="//bizweb.dktcdn.net/assets/themes_support/common.js?4" type="text/javascript"></script>   
        <script src="//bizweb.dktcdn.net/assets/themes_support/customer.js?4" type="text/javascript"></script>




        <!-- Bizweb conter for header -->
        <script> var Bizweb = Bizweb || {}; Bizweb.store = 'tushoes.bizwebvietnam.net'; Bizweb.id = '336177'; Bizweb.theme = {"id": 693093, "role": "main", "name": "DQ Furniture"}; Bizweb.template = 'customers/account';</script>
        <script>
            (function () {
                function asyncLoad() {
                    var urls = ["//static.zotabox.com/a/9/a9f4e8d6f2a9686909739ed8b6c3d77f/widgets.js?store=tushoes.bizwebvietnam.net", "//static.zotabox.com/a/9/a9f4e8d6f2a9686909739ed8b6c3d77f/widgets.js?store=tushoes.bizwebvietnam.net", "//static.zotabox.com/a/9/a9f4e8d6f2a9686909739ed8b6c3d77f/widgets.js?store=tushoes.bizwebvietnam.net", "https://contactform.sapoapps.vn/ContactForm/ContactFormAsset/ContactFormScript?store=tushoes.bizwebvietnam.net"];
                    for (var i = 0; i < urls.length; i++) {
                        var s = document.createElement('script');
                        s.type = 'text/javascript';
                        s.async = true;
                        s.src = urls[i];
                        s.src = urls[i];
                        var x = document.getElementsByTagName('script')[0];
                        x.parentNode.insertBefore(s, x);
                    }
                }
                window.attachEvent ? window.attachEvent('onload', asyncLoad) : window.addEventListener('load', asyncLoad, false);
            })();
        </script>

        <script type='text/javascript'>
            (function () {
                var log = document.createElement('script');
                log.type = 'text/javascript';
                log.async = true;
                log.src = '//stats.bizweb.vn/delivery/336177.js?lang=vi';
                var s = document.getElementsByTagName('script')[0];
                s.parentNode.insertBefore(log, s);
            })();
        </script>


        <!-- Global site tag (gtag.js) - Google Analytics -->
        <script async src="https://www.googletagmanager.com/gtag/js?id=UA-130524433-1"></script>
        <script>
            window.dataLayer = window.dataLayer || [];
            function gtag() {
                dataLayer.push(arguments);
            }
            gtag('js', new Date());

            gtag('config', 'UA-130524433-1');
        </script>



        <link href="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/iwish.css?1573498022604" rel="stylesheet" type="text/css" />
        <script>var ProductReviewsAppUtil = ProductReviewsAppUtil || {};
            ProductReviewsAppUtil.customer = {id: '9844126', name: 'nguyen hiep', email: 'nguyenhoanghiep1302@gmail.com'};</script>
    </head>
    <body>		
        <!-- Main content -->

        <header class="header">	
            <div class="topbar hidden-lg hidden-md">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-6 col-sm-6 col-md-7 a-left">

                            <span class="header-contact-item"><i class="fa fa-phone-square"></i>
                                <a href="tel:0967585135">0967585135</a>
                            </span>
                            <span class="hidden-xs hidden-sm fix-iconline"> | </span>
                            <span class="header-contact-item hidden-sm  hidden-xs "><i class="fa fa-envelope"></i>
                                <a href="mailto:nguyenhoanghiep132@gmail.com">nguyenhoanghiep132@gmail.com</a>
                            </span>

                        </div>
                        <div class="col-xs-6 col-sm-6 col-md-5 col-xs-12">
                            <div class="top-cart-contain f-right">
                                <div class="pull-right dropdown-toggle account">
                                    <a href="/account" class="header-icon" style="font-size: 14px;"><i class="fa fa-user"></i> Tài khoản</a>
                                    <ul class="dropdown-content dr-left" style="width: 200px;line-height: 26px;">

                                        <li><a href="/account"><i class="fa fa-user"></i> nguyen hiep</a></li>

                                        <li><a href="/account/logout"><i class="fa  fa-sign-out"></i> Đăng xuất</a></li>


                                    </ul>
                                </div>
                                <div class="pull-right dropdown-toggle account hidden-xs fixcheckout">
                                    <a href="/checkout" class="header-icon" style="font-size: 14px;"><i class="fa fa-check-circle-o"></i> Thanh toán</a>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="container relative">
                <div class="menu-bar hidden-md hidden-lg">
                    <img src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/menu-bar.png?1573498022604" alt="menu bar" />
                </div>



                <div class="header-main">
                    <div class="row">

                        <div class="col-xs-6 col-md-2 col-sm-2 a-center">
                            <div class="logo">						

                                <a href="/" class="logo-wrapper ">					
                                    <img src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/logo.png?1573498022604" alt="logo ">					
                                </a>

                            </div>
                        </div>

                    </div>
                    <input style="padding-left: 102px;" type="search" name="query" value="" placeholder="Tìm kiếm... " class="input-group-field st-default-search-input search-text" autocomplete="off">
                    <span class="input-group-btn">
                        <button class="btn icon-fallback-text">
                            <i class="fa fa-search"></i>
                        </button>
                    </span>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-xs-3  col-md-4 col-sm-2">
            <div class="top-cart-contain f-right">
                <div class="mini-cart text-xs-center pull-right">
                    <div class="heading-cart">
                        <a href="/cart" class="cart-label header-icon">
                            <i class="fa fa-shopping-cart"></i>
                            <div class="cart-info hidden-sm hidden-xs">
                                <label style=" line-height: 1; ">Your Cart</label>
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
                                                <span>Your Cart</span>
                                            </a>
                                            <a href="/checkout" class="btn btn-checkout btn-gray">
                                                <span>Payment</span>
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

                        <li><a href="/account"><i class="fa fa-user"></i>${user.getName}</a></li>

                        <li><a href="/account/logout"><i class="fa  fa-sign-out"></i>Log Out</a></li>


                    </ul>
                </div>

            </div>
        </div>
    </div>
</div>
</div>

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

                    <li><strong itemprop="title">Trang khách hàng</strong></li>

                </ul>
            </div>
        </div>
    </div>
</section> 
<section class="signup page_customer_account">
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-12 col-main-acount">
                <div id="parent" class="row">
                    <div id="a" class="col-xs-12 col-sm-12 col-lg-9 col-left-account xs-margin-top-20">
                        <div class="page-title m992">
                            <h1 class="title-head margin-top-0"><a href="#">Thông tin tài khoản</a></h1>
                        </div>
                        <div class="form-signup name-account m992"> 
                            <p><strong>Xin chào, <a href="/account/addresses" style="color:#201e1d;">nguyen hiep</a>&nbsp;!</strong></p>
                        </div>
                        <div class="col-xs-12 col-sm-12 col-lg-12 no-padding">
                            <div class="my-account">
                                <div class="dashboard">

                                    <div class="recent-orders">
                                        <div class="table-responsive tab-all"style="overflow-x:auto;">
                                            <table class="table table-cart" id="my-orders-table">
                                                <tr>
                                                    <th>Đơn hàng</th>
                                                    <th>Ngày</th>
                                                    <th>Địa chỉ</th>
                                                    <th>Giá trị đơn hàng</th>
                                                    <th>Tình trạng thanh toán</th>													
                                                    <th>Trạng thái</th>
                                                </tr>
                                                <c:forEach items = "${bills}" var= "bills">
                                                    <tr>
                                                        <td>${user.id}</td>
                                                        <td>${user.name}</td>
                                                        <td>${user.email}</td>
                                                        <th> <a href="EditUser.jsp?id=${user.id}"> Edit</a> 
                                                            | <a href="viewUser.jsp?id=${user.id}"> Information</a> 
                                                            | <a href="DeleteUser.jsp?id=${user.id}">Delete</a>
                                                        </th>
                                                    </tr>
                                                </c:forEach>
                                                <tbody>

                                                    <tr>
                                                        <td colspan="6"><p>Không có đơn hàng nào.</p></td></tr>

                                                </tbody>


                                            </table>

                                        </div>

                                        <div class="text-xs-right">

                                        </div>
                                    </div>
                                    <div class="paginate-pages pull-right page-account">

                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                    <div id="b" class="col-xs-12 col-sm-12 col-lg-3 col-right-account margin-top-20 xs-margin-top-0">
                        <div class="page-title mx991">
                            <h1 class="title-head"><a href="#">Thông tin tài khoản</a></h1>
                        </div>
                        <div class="form-signup body_right mx991"> 
                            <p><strong>Xin chào, <a href="/account/addresses" style="color:#201e1d;">nguyen hiep</a>&nbsp;!</strong></p>
                        </div>
                        <div class="block-account">
                            <div class="block-title-account"><h5>Tài khoản của tôi</h5></div>
                            <div class="block-content form-signup">
                                <p>Tên tài khoản: <strong style="line-height: 20px;"> nguyen hiep!</strong></p>
                                <p><i class="fa fa-home font-some" aria-hidden="true"></i>  <span>Địa chỉ: </span></p>
                                <p><i class="fa fa-mobile font-some" aria-hidden="true"></i> <span>Điện thoại: </span> </p>
                                <p><i class="fa fa-map-marker font-some" aria-hidden="true"></i> <span> Địa chỉ 1: </span></p>
                                <p><i class="fa fa-yelp font-some" aria-hidden="true"></i> <span> Công ty: </span></p>
                                <p><i class="fa fa-plane font-some" aria-hidden="true"></i> <span> Quốc gia :</span></p> 
                                <p><i class="fa fa-code font-some" aria-hidden="true"></i> <span> Zip code: </span></p>
                                <p style="margin-top:20px;"><a href="/account/addresses" class="btn btn-full btn-primary">Sổ địa chỉ (0)</a></p>

                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</section>














<footer class="footer">		
    <div class="site-footer">		
        <div class="container">			
            <div class="footer-inner padding-top-40">
                <div class="row">
                    <div class="col-xs-12 col-sm-6 col-lg-4">
                        <div class="footer-widget">
                            <h3><span>Về cửa hàng</span></h3>
                            <ul class="list-menu list-showroom">								
                                <li class="about-content">
                                    <p style="padding-left: 0;">
                                        Running Shoes
                                    </p>
                                </li>
                                <li class="clearfix">Địa chỉ: Số 1D Ngõ 24 Đặng Tiến Đông, Hà Nội, Việt Nam</li>
                                <li class="clearfix">Email: <a href="mailto:hosytuxn18@gmail.com">hosytuxn18@gmail.com</a></li>
                                <li class="clearfix">Điện thoại: <a href="tel:0967585135">0967585135</a></li>
                                <li class="clearfix">Website: <a href="https://tushoes.vn">tushoes.vn</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-lg-2">
                        <div class="footer-widget">
                            <h3><span>Thông tin</span></h3>
                            <ul class="list-menu list-right">

                                <li><a href="/">Trang chủ</a></li>

                                <li><a href="/gioi-thieu">Giới thiệu</a></li>

                                <li><a href="/collections/all">Sản phẩm</a></li>

                                <li><a href="/san-pham-khuyen-mai">Khuyến mãi</a></li>

                                <li><a href="/tin-tuc">Tin tức</a></li>

                                <li><a href="/lien-he">Liên hệ</a></li>

                            </ul>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-lg-3">
                        <div class="footer-widget">
                            <h3><span>Hướng dẫn & Chính sách </span></h3>
                            <ul class="list-menu list-right">

                                <li><a href="/huong-dan">Hướng dẫn mua hàng</a></li>

                                <li><a href="/chinh-sach">Thẻ Thành Viên</a></li>

                                <li><a href="/chinh-sach">Ship COD</a></li>

                                <li><a href="/chinh-sach">Chính sách bảo hành</a></li>

                                <li><a href="/chinh-sach">Chính sách đổi trả & hoàn tiền</a></li>

                            </ul>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-lg-3">
                        <div class="footer-widget">
                            <h3><span>Phương thức thanh toán</span></h3>           
                            <ul class="list-right payment">




                                <li>
                                    <img class="img-responsive" src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/img_payment_1.png?1573498022604" alt="Shop Tú Shoes">
                                </li>





                                <li>
                                    <img class="img-responsive" src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/img_payment_2.png?1573498022604" alt="Shop Tú Shoes">
                                </li>





                                <li>
                                    <img class="img-responsive" src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/img_payment_3.png?1573498022604" alt="Shop Tú Shoes">
                                </li>





                                <li>
                                    <img class="img-responsive" src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/img_payment_4.png?1573498022604" alt="Shop Tú Shoes">
                                </li>





                                <li>
                                    <img class="img-responsive" src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/img_payment_5.png?1573498022604" alt="Shop Tú Shoes">
                                </li>


                            </ul>

                            <ul class="list-menu list-right bct">
                                <img src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/icon-bct.png?1573498022604" alt="Shop Tú Shoes"/>
                            </ul>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>	
    <div class="copyright clearfix">
        <div class="container">
            <div>
                <div class="inner clearfix">
                    <div class="row">
                        <div class="col-xs-12 col-md-6 a-left">
                            <span>© Bản quyền thuộc về <b>Tú Shoes</b> <span class="fot-line">|</span> Cung cấp bởi <a href="https://www.sapo.vn/?utm_campaign=cpn:site_khach_hang-plm:footer&utm_source=site_khach_hang&utm_medium=referral&utm_content=fm:text_link-km:-sz:&utm_term=&campaign=site_khach_hang" rel="nofollow" title="Sapo" target="_blank">Sapo</a></span>

                        </div>
                        <div class="col-xs-12 col-md-6 a-left">
                            <div class="footer-menu">
                                <ul class="inline-list social-icons">


                                    <li>
                                        <a class="icon-fallback-text" href="#">
                                            <span class="fa fa-facebook" aria-hidden="true"></span>
                                            <span class="fallback-text">Facebook</span>
                                        </a>
                                    </li>



                                    <li>
                                        <a class="icon-fallback-text" href="#">
                                            <span class="fa fa-pinterest" aria-hidden="true"></span>
                                            <span class="fallback-text">Pinterest</span>
                                        </a>
                                    </li>


                                    <li>
                                        <a class="icon-fallback-text" href="#" rel="publisher">
                                            <span class="fa fa-google-plus" aria-hidden="true"></span>
                                            <span class="fallback-text">Google</span>
                                        </a>
                                    </li>


                                    <li>
                                        <a class="icon-fallback-text" href="#">
                                            <span class="fa fa-instagram" aria-hidden="true"></span>
                                            <span class="fallback-text">Instagram</span>
                                        </a>
                                    </li>






                                </ul>
                            </div>
                        </div>
                    </div>

                    <div class="back-to-top"><i class="fa  fa-angle-up"></i></div>

                </div>
            </div>
        </div>
    </div>

</footer>

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

<!-- Bizweb javascript -->
<script src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/option-selectors.js?1573498022604" type="text/javascript"></script>
<script src="//bizweb.dktcdn.net/assets/themes_support/api.jquery.js?4" type="text/javascript"></script> 

<!-- Plugin JS -->
<script src="//bizweb.dktcdn.net/100/336/177/themes/693093/assets/owl.carousel.min.js?1573498022604" type="text/javascript"></script>			
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

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







</body>
</html>
