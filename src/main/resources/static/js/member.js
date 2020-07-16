// #아이디 중복 체크
$('#checkId').click(function () {
    var data = {
        id : $('#joinId').val()
    };

    $.ajax({
        type: 'post',
        url: '/rest/checkId',
        data: data
    }).done(function(){
        alert("아이디 중복 점검");
    }).fail(function (error) {
        alert(error);
    });
});

// #회원가입
$('#joinBtn').click(function () {
    var data = {
        id : $('#id').val(),
        password : $('#password').val(),
        name : $('#name').val(),
        phone : $('#phone').val(),
        email : $('#email').val()
    };

    $.ajax({
        type: 'post',
        url: '/rest/join',
        data: data
    }).done(function(){
        alert("회원가입 완료");
        window.location.href="/index/login";
    }).fail(function (error) {
        alert(error);
    });
});

// #로그인
$('#loginBtn').click(function () {
    var data = {
        id : $('#id').val(),
        password : $('#password').val()
    };

    $.ajax({
        type: 'post',
        url: '/rest/login',
        data: data
    }).done(function(){
        alert("로그인 완료");
        window.location.href="/";
    }).fail(function (error) {
        alert(error);
    });
});