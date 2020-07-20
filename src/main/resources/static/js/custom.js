// 메인 index 슬라이드 시간 설정
$('.carousel').carousel({
    interval: 4000,
    pause: false // 활성화시 슬라이드에 마우스가 있더라도 슬라이드쇼 허용
});

// Raido 버튼 값에 따라 내용 표시(memberEdit)
$('input[type=radio][name=memberType]').on('click', function() {
    var chkValue = $('input[type=radio][name=memberType]:checked').val();

    if (chkValue == 'typeNormal') {
        $('#securityForm').css('display', 'none');
        $('#adminForm').css('display', 'none');
        // return false;
    } else if (chkValue == 'typeSecurity') {
        $('#securityForm').css('display', 'block');
        $('#adminForm').css('display', 'none');
        // return false;
    } else if (chkValue == 'typeAdmin') {
        $('#securityForm').css('display', 'none');
        $('#adminForm').css('display', 'block');
        // return false;
    }
});