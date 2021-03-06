<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%--<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link rel="stylesheet" href="/static/admin/css/main.css">
</head>
<body>
    <div class="wrapper">
        <div class="container">
            <div class="dashboard">
                <div class="left">
                    <span class="left__icon">
                        <span></span>
                        <span></span>
                        <span></span>
                    </span>
                    <div class="left__content">
                        <div class="left__logo">LOGO</div>
                        <div class="left__profile">
                            <div class="left__image">
                                <%--<c:url value="/static/admin/assets/profile.jpg" var="bootstrap"></c:url>--%>
              					<img src="/static/admin/assets/profile.jpg" />
                                <!--<img src="assets/profile.jpg" alt="">-->
                            </div>
                            
                            
                            <p class="left__name">Hatsune Miku</p>
                        </div>
                        <ul class="left__menu">
                            <li class="left__menuItem">
                                <a href="index.html" class="left__title"><img src="/static/admin/assets/icon-dashboard.svg" alt="">Dashboard</a>
                            </li>
                            <li class="left__menuItem">
                                <div class="left__title"><img src="/static/admin/assets/icon-tag.svg" alt="">Sản Phẩm<img class="left__iconDown" src="/static/admin/assets/arrow-down.svg" alt=""></div>
                                <div class="left__text">
                                    <a class="left__link" href="insert_product.html">Chèn Sản Phẩm</a>
                                    <a class="left__link" href="view_product.html">Xem Sản Phẩm</a>
                                </div>
                            </li>
                            <li class="left__menuItem">
                                <div class="left__title"><img src="/static/admin/assets/icon-edit.svg" alt="">Danh Mục SP<img class="left__iconDown" src="/static/admin/assets/arrow-down.svg" alt=""></div>
                                <div class="left__text">
                                    <a class="left__link" href="insert_p_category.html">Chèn Danh Mục</a>
                                    <a class="left__link" href="view_p_category.html">Xem Danh Mục</a>
                                </div>
                            </li>
                            <li class="left__menuItem">
                                <div class="left__title"><img src="/static/admin/assets/icon-book.svg" alt="">Thể Loại<img class="left__iconDown" src="/static/admin/assets/arrow-down.svg" alt=""></div>
                                <div class="left__text">
                                    <a class="left__link" href="insert_category.html">Chèn Thể Loại</a>
                                    <a class="left__link" href="view_category.html">Xem Thể Loại</a>
                                </div>
                            </li>
                            <li class="left__menuItem">
                                <div class="left__title"><img src="/static/admin/assets/icon-settings.svg" alt="">Slide<img class="left__iconDown" src="/static/admin/assets/arrow-down.svg" alt=""></div>
                                <div class="left__text">
                                    <a class="left__link" href="insert_slide.html">Chèn Slide</a>
                                    <a class="left__link" href="view_slides.html">Xem Slide</a>
                                </div>
                            </li>
                            <li class="left__menuItem">
                                <div class="left__title"><img src="/static/admin/assets/icon-book.svg" alt="">Coupons<img class="left__iconDown" src="/static/admin/assets/arrow-down.svg" alt=""></div>
                                <div class="left__text">
                                    <a class="left__link" href="insert_coupon.html">Chèn Coupon</a>
                                    <a class="left__link" href="view_coupons.html">Xem Coupons</a>
                                </div>
                            </li>
                            <li class="left__menuItem">
                                <a href="view_customers.html" class="left__title"><img src="/static/admin/assets/icon-users.svg" alt="">Khách Hàng</a>
                            </li>
                            <li class="left__menuItem">
                                <a href="view_orders.html" class="left__title"><img src="/static/admin/assets/icon-book.svg" alt="">Đơn Đặt Hàng</a>
                            </li>
                            <li class="left__menuItem">
                                <a href="edit_css.html" class="left__title"><img src="/static/admin/assets/icon-pencil.svg" alt="">Chỉnh CSS</a>
                            </li>
                            <li class="left__menuItem">
                                <div class="left__title"><img src="/static/admin/assets/icon-user.svg" alt="">Admin<img class="left__iconDown" src="/static/admin/assets/arrow-down.svg" alt=""></div>
                                <div class="left__text">
                                    <a class="left__link" href="insert_admin.html">Chèn Admin</a>
                                    <a class="left__link" href="view_admins.html">Xem Admins</a>
                                </div>
                            </li>
                            <li class="left__menuItem">
                                <a href="" class="left__title"><img src="/static/admin/assets/icon-logout.svg" alt="">Đăng Xuất</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="right">
                    <div class="right__content">
                        <div class="right__title">Bảng điều khiển</div>
                        <p class="right__desc">Bảng điều khiển</p>
                        <div class="right__cards">
                            <a class="right__card" href="view_product.html">
                                <div class="right__cardTitle">Sản Phẩm</div>
                                <div class="right__cardNumber">72</div>
                                <div class="right__cardDesc">Xem Chi Tiết <img src="/static/admin/assets/arrow-right.svg" alt=""></div>
                            </a>
                            <a class="right__card" href="view_customers.html">
                                <div class="right__cardTitle">Khách Hàng</div>
                                <div class="right__cardNumber">12</div>
                                <div class="right__cardDesc">Xem Chi Tiết <img src="/static/admin/assets/arrow-right.svg" alt=""></div>
                            </a>
                            <a class="right__card" href="view_p_category.html">
                                <div class="right__cardTitle">Danh Mục</div>
                                <div class="right__cardNumber">4</div>
                                <div class="right__cardDesc">Xem Chi Tiết <img src="/static/admin/assets/arrow-right.svg" alt=""></div>
                            </a>
                            <a class="right__card" href="view_orders.html">
                                <div class="right__cardTitle">Đơn Hàng</div>
                                <div class="right__cardNumber">72</div>
                                <div class="right__cardDesc">Xem Chi Tiết <img src="/static/admin/assets/arrow-right.svg" alt=""></div>
                            </a>
                        </div>
                        <div class="right__table">
                            <p class="right__tableTitle">Đơn hàng mới</p>
                            <div class="right__tableWrapper">
                                <table>
                                    <thead>
                                        <tr>
                                            <th>STT</th>
                                            <th style="text-align: left;">Email</th>
                                            <th>Số Hoá Đơn</th>
                                            <th>ID Sản Phẩm</th>
                                            <th>Số Lượng</th>
                                            <th>Kích thước</th>
                                            <th>Trạng Thái</th>
                                        </tr>
                                    </thead>
                            
                                    <tbody>
                                        <tr>
                                            <td data-label="STT">1</td>
                                            <td data-label="Email" style="text-align: left;">chibaosinger@gmail.com</td>
                                            <td data-label="Số Hoá Đơn">6577544</td>
                                            <td data-label="ID Sản Phẩm">2</td>
                                            <td data-label="Số Lượng">1</td>
                                            <td data-label="Kích thước">Trung Bình</td>
                                            <td data-label="Trạng Thái"> 
                                                Đã Thanh Toán
                                            </td>
                                        </tr>
                                        <tr>
                                            <td data-label="STT">2</td>
                                            <td data-label="Email" style="text-align: left;">midu@gmail.com</td>
                                            <td data-label="Số Hoá Đơn">4578644</td>
                                            <td data-label="ID Sản Phẩm">4</td>
                                            <td data-label="Số Lượng">2</td>
                                            <td data-label="Kích thước">Nhỏ</td>
                                            <td data-label="Trạng Thái"> 
                                                Đang Xử Lý
                                            </td>
                                        </tr>
                                        <tr>
                                            <td data-label="STT">3</td>
                                            <td data-label="Email" style="text-align: left;">miku@gmail.com</td>
                                            <td data-label="Số Hoá Đơn">2657544</td>
                                            <td data-label="ID Sản Phẩm">3</td>
                                            <td data-label="Số Lượng">5</td>
                                            <td data-label="Kích thước">Lớn</td>
                                            <td data-label="Trạng Thái"> 
                                                Đang Xử Lý
                                            </td>
                                        </tr>
                                        <tr>
                                            <td data-label="STT">4</td>
                                            <td data-label="Email" style="text-align: left;">dangthimydung@gmail.com</td>
                                            <td data-label="Số Hoá Đơn">9659544</td>
                                            <td data-label="ID Sản Phẩm">8</td>
                                            <td data-label="Số Lượng">12</td>
                                            <td data-label="Kích thước">Trung Bình</td>
                                            <td data-label="Trạng Thái"> 
                                                Đang Xử Lý
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            <a href="" class="right__tableMore"><p>Xem tất cả các đơn đặt hàng</p> <img src="/static/admin/assets/arrow-right-black.svg" alt=""></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="/static/admin/js/main.js"></script>
</body>
</html>