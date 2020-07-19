// 메인 index 슬라이드 시간 설정
$('.carousel').carousel({
    interval: 4000,
    pause: false // 활성화시 슬라이드에 마우스가 있더라도 슬라이드쇼 허용
});

// CheckBox 버튼을 하나만 선택하게 만들기(memberEdit)
$(document).ready(function() {
    //radio버튼처럼 checkbox name값 설정
    $('input[type="checkbox"][name="memberType"]').click(function(){
        //click 이벤트가 발생했는지 체크
        if ($(this).prop('checked')) {
            //checkbox 전체를 checked 해제후 click한 요소만 true지정
            $('input[type="checkbox"][name="check"]').prop('checked', false);
            $(this).prop('checked', true);
        }
    });
});