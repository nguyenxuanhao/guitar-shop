<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html class="no-js">

<head>
    <!-- Mobile Specific Meta -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Favicon-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/img/fav.png">
    <!-- Author Meta -->
    <meta name="author" content="CodePixar">
    <!-- Meta Description -->
    <meta name="description" content="">
    <!-- Meta Keyword -->
    <meta name="keywords" content="">
    <!-- meta character set -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Site Title -->
    <title>Guitar Shop</title>

    <!-- CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/linearicons.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/themify-icons.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/owl.carousel.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/nouislider.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ion.rangeSlider.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ion.rangeSlider.skinFlat.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/magnific-popup.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" type="text/css">
</head>

<body>
<!-- Start Header Area -->
<header class="header_area sticky-header">
    <div class="main_menu">
        <nav class="navbar navbar-expand-lg navbar-light main_box">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->

                <a class="navbar-brand logo_h" href="/"><img src="${pageContext.request.contextPath}/resources/img/logo.png" alt=""></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                    <ul class="nav navbar-nav menu_nav ml-auto">
                        <li class="nav-item"><a class="nav-link" href="#">Trang chủ</a></li>
                        <li class="nav-item submenu dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">Sản phẩm &nbsp;<i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li class="nav-item"><a class="nav-link" href="#">Acoustic Guitars</a></li>
                                <li class="nav-item"><a class="nav-link" href="#">Classic Guitars</a></li>
                                <li class="nav-item"><a class="nav-link" href="#">Guitars có EQ</a></li>
                            </ul>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="#">Liên hệ</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Giới thiệu</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="nav-item" title="Tìm kiếm">
                            <button class="search nav-link"><span class="fa fa-search" id="search"></span></button>
                        </li>
                        <li class="nav-item" title="Xem giỏ hàng">
                            <a href="#" class="cart nav-link">
                                <span class="fa fa-shopping-cart"></span>
                                <div class="cart_item_count">0</div>
                            </a>
                        </li>
                        <li class="nav-item submenu dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false"><span class="fa fa-user"></span></a>
                            <ul class="dropdown-menu">
                                <li class="nav-item user_name"><a class="nav-link" href="#">Đăng nhập</a></li>
                                <li class="nav-item"><a class="nav-link" href="#">Đăng kí</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
    <div class="search_input" id="search_input_box">
        <div class="container">
            <form class="d-flex justify-content-between">
                <input type="text" class="form-control" id="search_input" placeholder="Nhập từ khoá tìm kiếm">
                <button type="submit" class="btn"></button>
                <span class="lnr lnr-cross" id="close_search" title="Đóng"></span>
            </form>
        </div>
    </div>

</header>
<!-- End Header Area -->

<!-- Start banner Area -->
<section class="banner-area home_banner">
    <div class="home_banner_wrapper">
        <div class="banner_shop_name">
            <h3>GuitarShop</h3>
        </div>
        <div class="banner_title">
            <h1>Sự lựa chọn của đam mê</h1>
        </div>
        <div class="banner_explore_button">
            <a href="#most_discount_products" class="explore_btn">Khám phá</a>
            <a href=# class="contact_btn">Liên hệ</a>
        </div>
    </div>
</section>
<!-- End banner Area -->

<!-- Start features Area -->
<section class="features-area section_gap">
    <div class="container">
        <div class="row features-inner">
            <!-- single features -->
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="single-features">
                    <div class="f-icon">
                        <img src="${pageContext.request.contextPath}/resources/img/features/f-icon1.png" alt="">
                    </div>
                    <h6>Miễn phí vận chuyển</h6>
                    <p>Cho tất cả đơn hàng tại Guitar Shop</p>
                </div>
            </div>
            <!-- single features -->
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="single-features">
                    <div class="f-icon">
                        <img src="${pageContext.request.contextPath}/resources/img/features/f-icon2.png" alt="">
                    </div>
                    <h6>1 đổi 1 trong vòng 1 tháng</h6>
                    <p>Đối với sản phẩm lỗi kỹ thuật.</p>
                </div>
            </div>
            <!-- single features -->
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="single-features">
                    <div class="f-icon">
                        <img src="${pageContext.request.contextPath}/resources/img/features/f-icon3.png" alt="">
                    </div>
                    <h6>Hỗ trợ 24/7</h6>
                    <p>Thông qua nhiều kênh mạng xã hội.</p>
                </div>
            </div>
            <!-- single features -->
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="single-features">
                    <div class="f-icon">
                        <img src="${pageContext.request.contextPath}/resources/img/features/f-icon4.png" alt="">
                    </div>
                    <h6>Thanh toán tiện lợi</h6>
                    <p>Nhanh chóng và an toàn.</p>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End features Area -->

<!-- Start Categories Area -->
<section class="category_area">
    <div class="container">
        <div class="categories_home row">
            <div class="col-md-4 single_category">
                <a href="#">
                    <h3>Acoustic Guitars <i class="fa fa-angle-right"></i></h3>
                </a>
            </div>
            <div class="col-md-4 single_category">
                <a href="#">
                    <h3>Classic Guitars <i class="fa fa-angle-right"></i></h3>
                </a>
            </div>
            <div class="col-md-4 single_category">
                <a href="#">
                    <h3>Guitar có EQ <i class="fa fa-angle-right"></i></h3>
                </a>
            </div>
        </div>
    </div>
</section>

<!-- Start newest products Area -->
<section class="section_gap" id="most_discount_products">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-6 text-center">
                <div class="section-title">
                    <h1>Sản phẩm khuyến mãi hot nhất</h1>
                </div>
            </div>
        </div>
        <div class="row">
            <a href="#">
                <div class="col-lg-3 col-md-4 col-6">
                    <div class="single-product">
                        <img class="img-fluid" src="${pageContext.request.contextPath}/resources/img/fav.png" alt="">
                        <div class="product-details s_product_text">
                            <h6>Guitar ABC 123</h6>
                            <div class="price">
                                <h6>2.500.000đ</h6>
                                <h6 class="l-through">3.000.000đ</h6>
                            </div>
                            <div class="prd-bottom card_area">
                                <a class="primary-btn" href="#">Thêm vào giỏ</a>
                            </div>
                        </div>
                    </div>
                </div>
            </a>
            <a href="#">
                <div class="col-lg-3 col-md-4 col-6">
                    <div class="single-product">
                        <img class="img-fluid" src="${pageContext.request.contextPath}/resources/img/fav.png" alt="">
                        <div class="product-details s_product_text">
                            <h6>Guitar ABC 123</h6>
                            <div class="price">
                                <h6>2.500.000đ</h6>
                                <h6 class="l-through">3.000.000đ</h6>
                            </div>
                            <div class="prd-bottom card_area">
                                <a class="primary-btn" href="#">Thêm vào giỏ</a>
                            </div>
                        </div>
                    </div>
                </div>
            </a>
            <a href="#">
                <div class="col-lg-3 col-md-4 col-6">
                    <div class="single-product">
                        <img class="img-fluid" src="${pageContext.request.contextPath}/resources/img/fav.png" alt="">
                        <div class="product-details s_product_text">
                            <h6>Guitar ABC 123</h6>
                            <div class="price">
                                <h6>2.500.000đ</h6>
                                <h6 class="l-through">3.000.000đ</h6>
                            </div>
                            <div class="prd-bottom card_area">
                                <a class="primary-btn" href="#">Thêm vào giỏ</a>
                            </div>
                        </div>
                    </div>
                </div>
            </a>
            <a href="#">
                <div class="col-lg-3 col-md-4 col-6">
                    <div class="single-product">
                        <img class="img-fluid" src="${pageContext.request.contextPath}/resources/img/fav.png" alt="">
                        <div class="product-details s_product_text">
                            <h6>Guitar ABC 123</h6>
                            <div class="price">
                                <h6>2.500.000đ</h6>
                                <h6 class="l-through">3.000.000đ</h6>
                            </div>
                            <div class="prd-bottom card_area">
                                <a class="primary-btn" href="#">Thêm vào giỏ</a>
                            </div>
                        </div>
                    </div>
                </div>
            </a>
        </div>
    </div>
</section>
<!-- End hot products Area -->


<!-- Start newest products Area -->
<section>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-6 text-center">
                <div class="section-title">
                    <h1>Sản phẩm mới nhất</h1>
                </div>
            </div>
        </div>
        <div class="row">
            <a href="#">
                <div class="col-lg-3 col-md-4 col-6">
                    <div class="single-product">
                        <img class="img-fluid" src="${pageContext.request.contextPath}/resources/img/fav.png" alt="">
                        <div class="product-details s_product_text">
                            <h6>Guitar ABC 123</h6>
                            <div class="price">
                                <h6>2.500.000đ</h6>
                                <h6 class="l-through">3.000.000đ</h6>
                            </div>
                            <div class="prd-bottom card_area">
                                <a class="primary-btn" href="#">Thêm vào giỏ</a>
                            </div>
                        </div>
                    </div>
                </div>
            </a>
            <a href="#">
                <div class="col-lg-3 col-md-4 col-6">
                    <div class="single-product">
                        <img class="img-fluid" src="${pageContext.request.contextPath}/resources/img/fav.png" alt="">
                        <div class="product-details s_product_text">
                            <h6>Guitar ABC 123</h6>
                            <div class="price">
                                <h6>2.500.000đ</h6>
                                <h6 class="l-through">3.000.000đ</h6>
                            </div>
                            <div class="prd-bottom card_area">
                                <a class="primary-btn" href="#">Thêm vào giỏ</a>
                            </div>
                        </div>
                    </div>
                </div>
            </a>
            <a href="#">
                <div class="col-lg-3 col-md-4 col-6">
                    <div class="single-product">
                        <img class="img-fluid" src="${pageContext.request.contextPath}/resources/img/fav.png" alt="">
                        <div class="product-details s_product_text">
                            <h6>Guitar ABC 123</h6>
                            <div class="price">
                                <h6>2.500.000đ</h6>
                                <h6 class="l-through">3.000.000đ</h6>
                            </div>
                            <div class="prd-bottom card_area">
                                <a class="primary-btn" href="#">Thêm vào giỏ</a>
                            </div>
                        </div>
                    </div>
                </div>
            </a>
            <a href="#">
                <div class="col-lg-3 col-md-4 col-6">
                    <div class="single-product">
                        <img class="img-fluid" src="${pageContext.request.contextPath}/resources/img/fav.png" alt="">
                        <div class="product-details s_product_text">
                            <h6>Guitar ABC 123</h6>
                            <div class="price">
                                <h6>2.500.000đ</h6>
                                <h6 class="l-through">3.000.000đ</h6>
                            </div>
                            <div class="prd-bottom card_area">
                                <a class="primary-btn" href="#">Thêm vào giỏ</a>
                            </div>
                        </div>
                    </div>
                </div>
            </a>
        </div>
    </div>
</section>
<!-- End newest products Area -->

<!-- Start footer Area -->
<footer class="footer-area section_gap">
    <div class="container">
        <hr />
        <div class="footer_wrap">
            <div class="row justify-content-center social_info">
                <a href="#"><i class="fa fa-facebook-f"></i></a>
                <a href="#"><i class="fa fa-twitter"></i></a>
                <a href="#"><i class="fa fa fa-tumblr"></i></a>
                <a href="#"><i class="fa fa-pinterest"></i></a>
            </div>
            <div class="copyright_info">
                    <span>
                        &copy; GuitarShop
                        <script>document.write(new Date().getFullYear());</script>. All rights reserved.
                        | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                    </span>
            </div>
        </div>
    </div>

</footer>
<!-- End footer Area -->

<!-- JavaScript -->

    <script src="${pageContext.request.contextPath}/resources/js/vendor/jquery-2.2.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/vendor/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.ajaxchimp.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.nice-select.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.sticky.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/nouislider.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.magnific-popup.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/owl.carousel.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/rater.js" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.unobtrusive-ajax.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/main.js"></script>

</body>
</html>