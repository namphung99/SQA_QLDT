function start(){
    disableShift();
}
start();

function disableShift(){
    document.getElementById("shift-selected").disabled = true;
    document.querySelector(".select-shift-btn").disabled = true;
    
    document.querySelector(".filter-all").disabled = true;
    document.querySelector(".filter-pass").disabled = true;
    document.querySelector(".filter-fail").disabled = true;
    let nameShiftSelect = document.querySelector(".name-shift");
    console.log(nameShiftSelect.textContent)

    if(nameShiftSelect.textContent.trim() !== ""){
//        alert("hellol")
        document.querySelector(".filter-all").disabled = false;
        document.querySelector(".filter-pass").disabled = false;
        document.querySelector(".filter-fail").disabled = false;
    }

    let nameSubject = document.querySelector(".name-subject");
    if(nameSubject.textContent.trim() !== ""){
        document.getElementById("shift-selected").disabled = false;
        document.querySelector(".select-shift-btn").disabled = false;
    }
}

var errorMessage = document.querySelector(".error-message-selected");
var message = "";

function checkSubjectSelected() {
    let subject = document.getElementById('subject-selected');
    let invalid = subject.value == "Chọn môn học";
    
    if (invalid) {
        subject.classList.add("error");
        message = "*Vui lòng chọn môn học học trước!";
        errorMessage.innerHTML = message;
    }
    else {
        subject.classList.remove("error");
        errorMessage.innerHTML = "";
    }
    
    return !invalid;
}

function checkShiftSelected(){
    let subject = document.getElementById('shift-selected');
    let invalid = subject.value == "Chọn nhóm môn học";
 
    if (invalid) {
        message = "*Vui lòng chọn nhóm môn học học trước!";
        errorMessage.innerHTML = message;
        subject.classList.add("error");
    }
    else {
        subject.classList.remove("error");
        errorMessage.innerHTML = "";
    }
    
    return !invalid;
}
