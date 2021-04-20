
// Đối tượng 'Validator'

function Validator(options) {

    var selectorRules = {};


    // Hàm thực hiện validate
    function validate(inputElement,rule) {
        // console.log(options.errorSelector)
        var errorElement = inputElement.parentElement.querySelector(options.errorSelector);
        // var errorMessage =rule.test(inputElement.value);
        var errorMessage;

        // lay ra cac rule cua selector
        var rules = selectorRules[rule.selector];

        // lap qua tung rules va kiem tra
        // neu co loi thi dung kiem tra
        for (let i = 0; i < rules.length; i++) {
            errorMessage = rules[i](inputElement.value);
            if(errorMessage) break;
        }

        if(errorMessage){
             errorElement.innerHTML = errorMessage;
             inputElement.parentElement.classList.add('invalid');
        }
        else{
             errorElement.innerHTML = '';
             inputElement.parentElement.classList.remove('invalid');
    
        }
    
        return !errorMessage; // có lỗi return false
    }

    // lấy element form validate
    var formElement = document.querySelector(options.form);
    if(formElement){
        // lặp qua các rules
        options.rules.forEach(rule => {

            // luu lai rule cho moi input
            
            if (Array.isArray(selectorRules[rule.selector])) {
                selectorRules[rule.selector].push(rule.test);
            } else {
                selectorRules[rule.selector] = [rule.test];
            }

            var inputElement = formElement.querySelector(rule.selector);
            if(inputElement){

                // on blur
                inputElement.onblur = () => {
                   validate(inputElement,rule)
                }

                // nhập input
                inputElement.oninput = () => {
                    var errorElement = inputElement.parentElement.querySelector(options.errorSelector);
                    errorElement.innerHTML = '';
                    inputElement.parentElement.classList.remove('invalid'); 
                }
            }
        });
        // console.log(selectorRules)

        //submit
        formElement.onsubmit = (e) =>{
            e.preventDefault();

            var isFormValid = true;
            options.rules.forEach(rule => {
                var inputElement = formElement.querySelector(rule.selector);
                var isValid = validate(inputElement,rule);
                if(!isValid){
                    isFormValid = false;
                }
            })
            // submit js
            if(isFormValid){
                if(typeof options.onSubmit === 'function') {

                    var Inputs = formElement.querySelectorAll('[name]');
                    var formValues = Array.from(Inputs).reduce((values,input) =>{
                        return (values[input.name] = input.value) && values
                    },{});
                    options.onSubmit(formValues);
                }
                else{
                    formElement.submit();
                }
            }
        }
    }
}




// Định nghĩa các rules
// Nguyên tắc chung
// 1. khi có lỗi => trả ra message lôĩ
// 2. khi không có lỗi trả về undefined


// validate Login

Validator.isRequiredLogin = function (selector,message) {
    return {
        selector: selector,
        test: function (value) {
            return value.trim() ? undefined : message || 'Vui lòng nhập trường này!!!';
        }
    }
}

Validator.isUser = (selector) =>{
    return {
        selector: selector,
        test: function (value) {
            // var regex = /^[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]*$/;
            var regex = /^[a-zA-Z0-9]+$/;
            return regex.test(value) ? undefined : 'MGV không bao gồm các ký tự đặc biệt!' ;
        }
    }
}

Validator.minLength = (selector, min) =>{
    return {
        selector: selector,
        test: function (value) {
            
            return value.length >= min ? undefined : `Mật khẩu phải lớn hơn ${min} ký tự`;
        }
    }
}


// validate nhap phan tram diem

Validator.isRequiredPoint = function (selector,message) {
    return {
        selector: selector,
        test: function (value) {
            return value.trim() ? undefined : message;
        }
    }
}

Validator.checkSpecialCharacters = (selector) =>{
    return {
        selector: selector,
        test: function (value) {
            var res = undefined;
            var isNum = false;
            if(value.includes('-')){
                isNum = true;
                var arr = value.split("");
                if(arr[0] == '-'){
                    arr.splice(0,1);
                    arr = arr.join("");
                    let re = /^[.0-9]+$/;
                    let isSpecialChar = arr.match(re) ? false : true;
                    if(isSpecialChar == true){
                        isNum = false;
                    }else{
                        isNum = true;
                    }
                }
                else{
                    isNum = false;;
                }
            }
            if(isNum === false){
                var regex = /^[.0-9]+$/;
                res = regex.test(value) ? undefined : 'Điểm không bao gồm chuỗi và các ký tự đặc biệt' ;
            }
            // var regex = /^[.0-9]+$/;
            return res ;
        }
    }
}

Validator.checkNum = (selector) =>{
    return {
        selector: selector,
        test: function (value) {
           let num = parseFloat(value);
            let isOK = false;
            if(num >=0 && num <=10){
                
                isOK = true;
            }
            return isOK ? undefined : 'Giá trị điểm cho phép từ 0 - 10' ;
        }
    }
}

Validator.checkDecimal = (selector) => {
    return {
        selector: selector,
        test: function (value) {
           let isDecimal
           let num = parseFloat(value);
           num = num - Math.floor(num);
           
            
        }
    }
}
