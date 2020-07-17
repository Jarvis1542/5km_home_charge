// #아이디 중복 체크
$('#checkId').click(function () {
    var data = {
        id : $('#id').val()
    };
    $.ajax({
        type: 'post',
        url: '/rest/checkId',
        data: data
    }).done(function(data){
        if(data==0){
            alert("사용 가능한 아이디입니다.");
        }else {
            alert("아이디 중복입니다.")
        }
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
    }).done(function(msg){
        console.log(msg);
        if(msg == "로그인 성공") {
            alert("로그인 완료");
            window.location.href="/";
        } else {
            alert("아이디와 비밀번호를 확인해주세요");
            location.reload();
        }


    }).fail(function (error) {
        alert(error);
    });
});