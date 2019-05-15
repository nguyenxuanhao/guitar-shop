<!-- Start Banner Area -->
<section class="banner-area organic-breadcrumb">
    <div class="container">
        <div class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
            <div class="col-first">
                <h1>Chi tiết giỏ hàng</h1>
            </div>
        </div>
    </div>
</section>
<!-- End Banner Area -->
<!--================Cart Area =================-->
<section class="cart_area">
    <div class="container">
        <div class="cart_inner">
            <div class="table-responsive">
                <table class="table">
                    <thead>
                    <tr>
                        <th scope="col">Sản phẩm</th>
                        <th scope="col">Đơn giá</th>
                        <th scope="col">Số lượng</th>
                        <th scope="col">Thành tiền</th>
                    </tr>
                    </thead>
                    <tbody>
                    <%--Chi tiết sản phẩm--%>
                    <tr>
                        <td>
                            <div class="media">
                                <img class="img-fluid" src="../../resources/img/fav.png" alt="">

                                <div class="media-body">
                                    <a href="#">
                                        <h5>Guitar 123</h5>
                                    </a>
                                    <a class="delete_item" href="#" data-id="#">Xoá</a>
                                </div>
                            </div>
                        </td>
                        <td>
                            <h5>2.700.000đ</h5>

                            <span class="l-through">3.000.000đ</span>
                            <span> | -10%</span>

                        </td>
                        <td>
                            <div class="product_count">
                                <input type="text" name="qty" data-id="#" id="sst" maxlength="12" value="1"
                                       class="input-text quantity_text">
                                <button onclick="var result = document.getElementById('sst'); var sst = result.value; if( !isNaN( sst )) result.value++;return false;"
                                        class="increase items-count" type="button">
                                    <i class="lnr lnr-chevron-up"></i>
                                </button>
                                <button onclick="var result = document.getElementById('sst'); var sst = result.value; if( !isNaN( sst )&& sst > 1 ) result.value--;return false;"
                                        class="reduced items-count" type="button">
                                    <i class="lnr lnr-chevron-down"></i>
                                </button>
                            </div>
                        </td>
                        <td>
                            <div class="total">
                                <h5>2.700.000đ</h5>
                            </div>

                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <hr />

            <div class="bottom_button row justify-content-end">
                <h5>Tạm tính: 2.700.000đ</h5>
            </div>

            <div class="bottom_button row justify-content-end">
                <h5>Giảm giá: -300.000đ</h5>
            </div>


            <div class="bottom_button row justify-content-end">

                <div class="cupon_text d-flex align-items-center">
                    <input id = "discount_text" type = "text" placeholder = "Mã giảm giá">
                    <button type="submit" class="gray_btn" id="apply_code">Áp dụng</button>
                </div>
            </div>

            <div class="bottom_button row justify-content-end align-items-center">
                <div class="applied_code">
                    <span class="applied_code">QTTN19</span>
                    <a href="#" id="delete_discount_code" title="Xoá mã giảm giá"><i class="ti-close"></i></a>
                </div>
            </div>

            <div class="total_price row justify-content-end align-items-center">
                <h5>Tổng cộng: </h5>
                <h2 id="total_number">2.500.000đ</h2>
            </div>
            <div class="out_button_area row justify-content-end">
                <div class="checkout_btn_inner d-flex align-items-center">
                    <a class="gray_btn" href="#">Tiếp tục mua hàng</a>
                    <a class="primary-btn" href="#">Thanh toán</a>
                </div>
            </div>

            <div class="justify-content-center">
                <p>Không có sản phẩm nào trong giỏ hàng của bạn. </p>
                <a class="primary-btn" href="#">Về trang chủ</a>
            </div>



        </div>
    </div>
</section>
<!--================End Cart Area =================-->


