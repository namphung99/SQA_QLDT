<%-- 
    Document   : Home
    Created on : Mar 14, 2021, 10:06:33 PM
    Author     : DELL
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entities.Subject"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="entities.BangDiem"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="assets/css/bootsrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="assets/css/main.css"/>
        <title>QLDT PTIT</title>
        <style>
            .error {border: 1px red solid;}
        </style>
    </head>
    <body>
        <div class="header mar-30">
            <div class="menu" href="/">
                <img src="assets/image/Logo_PTIT.jpg" alt="" class="navbar-logo">
                <a href="/" class="menu-item">Thông Tin Lớp Giảng Dạy</a>
            </div>
            <div class="user-info">
                <span class="user-name">
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="background-color: rgb(29, 191, 175);border: none;">
                            ${sessionScope.nameUser}
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="#">Thông tin tài khoản</a>
                            <a class="dropdown-item" href="DangXuat">Đăng xuất</a>
                        </div>
                    </div>
                </span>
            </div>
        </div>

        <div class="app">
            <div class="mar-30">
                <h2 class="title">Bảng Điểm Sinh Viên</h2>
                <div class="control">
                    <form action="listClassic" method="POST" class = "form-subject" onsubmit="return checkSubjectSelected()">
                        <div class="control-title">Chọn môn học</div>
                        <div class="form-group">
                            <label style="display:none;">${sessionScope.idUser}</label>
                            <label style = "display:none;">${sessionScope.idSubject}</label>
                            <select name ="nameSub" class="form-control" id="subject-selected" onchange="checkSubjectSelected()">
                                <option>Chọn môn học</option>
                                <c:forEach items="${listSubject}" var="a" >
                                    <option>${a.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <button class="btn button-color select-subject-btn" type="submit">Chọn</button>
                    </form>

                    <form action="listBangDiem" method="POST" class = "form-class" onsubmit="return checkShiftSelected()">
                        <div class="control-title">Chọn nhóm môn học</div>
                        <div class="form-group">
                            <select name ="timeClass" class="form-control" id = "shift-selected" onchange="checkShiftSelected()">
                                <option>Chọn nhóm môn học</option>
                                <c:forEach items="${listClassics}" var="a" >
                                    <option>${a.time}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <button class="btn button-color select-shift-btn" type="submit">Chọn</button>
                    </form>
                    <span class="error-message-selected"></span>
                </div>

                <div class="info-class">
                    <h5>Thông tin môn học:</h5>
                    <div class="class-name">
                        <span style = "margin-right: 4px;">Tên môn học: </span>
                        <span class = "name-subject">${sessionScope.nameSubject}</span>
                    </div>
                    <div class="school shift">
                        <span  style = "margin-right: 4px;" >Kíp học: </span>
                        <span>${sessionScope.timeCla} </span>
                    </div>
                </div>

                <div class="row">
                    <table class="table mt-4">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">STT</th>
                                <th scope="col">Họ tên</th>
                                <th scope="col">MSV</th>
                                <th scope="col">Điểm CC</th>
                                <th scope="col">Điểm TP1</th>
                                <th scope="col">Điểm TP2</th>
                                <th scope="col">ĐIểm thi</th>
                                <th scope="col">Điểm TB</th>
                                <th>ĐKDT</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>

                            <%
                                String se = (String) session.getAttribute("emty");
                                if (se == "false") { %>

                                    <tr>
                                        <td colspan = 9 style="text-align:center"></td>
                                    </tr>
                                    <tr>
                                        <td colspan = 9 style="text-align:center; color:red;"><span>Dữ liệu trống, vui lòng chọn môn học và nhóm môn học để xem điểm sinh viên!</span></td>
                                    </tr>

                            <% } else { %>
                            <c:forEach items="${listBangDiems}" var="bd" varStatus="loop">
                                <tr>
                                    <td style="display:none;">${bd.id}</td>
                                    <td>${loop.index+1}</td>
         
                                    <td>${bd.student.getMaSV()}</td>
                                    <td>${bd.student.getName()}</td>
                                    <td>${bd.point.getCC()}</td>
                                    <td>${bd.point.getTP1()}</td>
                                    <td>${bd.point.getTP2()}</td>
                                    <td>${bd.point.getDT()}</td>
                                    <td>${bd.point.getDiemTB()}</td>
                                    <td>${bd.point.getDKDT()}</td>
                                    <td>
                                        <a href="EditPoint?studentId=${bd.id}">Sửa điểm</a>
                                    </td>
                                </tr>
                            </c:forEach>
                            <% }%>


                        </tbody>
                    </table>
                </div>

                <div class="row mt-5 other-form">
                    <div class="col-lg-4">
                        <h5>Phần trăm điểm thành phần:</h5>
                        <div class="list-percent-point">
                            <input type="text" name="id" value = "${phanTramDiem.id}" readonly="true" style="display:none;">
                            <div class="percent-point">
                                <span class="title-percent">% Điểm CC:</span>
                                <span class="num-percent">${phanTramDiem.phantramCC}%</span>
                            </div>
                            <div class="percent-point">
                                <span class="title-percent">% Điểm TP1:</span>
                                <span class="num-percent">${phanTramDiem.phantramTP1}%</span>
                            </div>
                            <div class="percent-point">
                                <span class="title-percent">% Điểm TP2:</span>
                                <span class="num-percent">${phanTramDiem.phantramTP2}%</span>
                            </div>
                            <div class="percent-point">
                                <span class="title-percent">% Điểm thi:</span>
                                <span class="num-percent">${phanTramDiem.phantramDT}%</span>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4"></div>
                    <div class="col-lg-4">

                        <div class="d-flex">
                            <p>Số SV đủ điều kiện dự thi: </p> &nbsp; <p>${sessionScope.kduDK}</p>
                        </div>
                        <div class="d-flex">
                            <p>Số SV không đủ điều kiện dự thi: </p> &nbsp; <p>${sessionScope.duDK}</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="assets/JS/validate_select.js"></script>
    </body>
</html>