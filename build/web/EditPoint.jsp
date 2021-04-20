<%-- 
    Document   : EditPoint
    Created on : Mar 23, 2021, 8:25:10 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="assets/css/bootsrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="assets/css/main.css"/>
        <title>Sửa và nhập điểm sinh viên</title>
    </head>
    <body>
        <div class="header mar-30">
            <div class="menu" href="/">
                <img src="assets/image/Logo_PTIT.jpg" alt="" class="navbar-logo">
                <a href="Home.html" class="menu-item">Thông Tin Lớp Giảng Dạy</a>
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
                <h2 class="title">Sửa điểm sinh viên</h2>
                <div class="student-info">
                    <h5>Thông tin sinh viên:</h5>
                    <div class="d-flex">
                        <span class="sv-name"> Họ tên SV: </span> &nbsp; <span name ="name">${student.name}</span>
                    </div>
                    <div class="d-flex">
                        <span class="sv-code"> Mã SV: </span> &nbsp; <span>${student.maSV}</span>
                    </div>
                    <p id="id-sv"style="display:none;">id</p>
                </div>
                <div class="row mt-4">

                    <div class="upadte">
                        <form class="add-form" id = "form-2" method="POST" action="EditPointStudent">
                            <label name="id" style="display:none;"> ${sessionScope.nameUser}</label>
                            <div class="add-form__sub">
                                <input type="text" class="form-control" value = "${pointUpdate.id}" name ="id" style="display:none;" >
                                <span>Điểm CC</span>
                                <div class="form-group">
                                    <input type="text" class="form-control" value = "${pointUpdate.CC}" name ="cc" id = "diem-cc" autofocus>
                                    <span class="form-message"></span>
                                </div>
                            </div>
                            <div class="add-form__sub">
                                <span>Điểm TP1</span>
                                <div class="form-group">
                                    <input type="text" class="form-control" value = "${pointUpdate.TP1}" name ="tp1" id = "diem-tp1">
                                    <span class="form-message"></span>
                                </div>
                            </div>
                            <div class="add-form__sub">
                                <span>Điểm TP2</span>
                                <div class="form-group">
                                    <input type="text" class="form-control" value = "${pointUpdate.TP2}" name ="tp2" id = "diem-tp2">
                                    <span class="form-message"></span>
                                </div>
                            </div>
                            <div class="add-form__sub">
                                <span>Điểm Thi</span>
                                <div class="form-group">
                                    <input type="text" class="form-control" value = "${pointUpdate.DT}" name ="thi" id = "diem-thi">
                                    <span class="form-message"></span>
                                </div>
                            </div>

                            <button type="submit" class="btn button-color">Lưu Lại</button>
                        </form>
                    </div>

                </div>
            </div>
            <script src="assets/JS/Validate_input.js"></script>

            <script>

                // Mong muốn nhận được
                Validator({
                    form: '#form-2',
                    errorSelector: '.form-message',
                    rules: [
                        Validator.isRequiredPoint('#diem-cc', "Vui lòng nhập điểm chuyên cần"),
                        Validator.checkSpecialCharacters('#diem-cc'),
                        Validator.checkNum('#diem-cc'),
                        Validator.checkDecimal('#diem-cc'),

                        Validator.isRequiredPoint('#diem-tp1', "Vui lòng nhập điểm thành phần"),
                        Validator.checkSpecialCharacters('#diem-tp1'),
                        Validator.checkNum('#diem-tp1'),
                        Validator.checkDecimal('#diem-tp1'),

                        Validator.isRequiredPoint('#diem-tp2', "Vui lòng nhập điểm thành phần"),
                        Validator.checkSpecialCharacters('#diem-tp2'),
                        Validator.checkNum('#diem-tp2'),
                        Validator.checkDecimal('#diem-tp2'),

                        Validator.isRequiredPoint('#diem-thi', "Vui lòng nhập điểm thi"),
                        Validator.checkSpecialCharacters('#diem-thi'),
                        Validator.checkNum('#diem-thi'),
                        Validator.checkDecimal('#diem-thi'),
                    ],
    //                onSubmit: function(data){
    //
    //                  // console.log(data);
    //                  // nếu submit với JS thì ông lấy data ở đây
    //
    //                  // Nếu submit = form như bình thường thì cmt hàm này
    //                }
                });

            </script>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>