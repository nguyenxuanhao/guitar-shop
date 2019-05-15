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