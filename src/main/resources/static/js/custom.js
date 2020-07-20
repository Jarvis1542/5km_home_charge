// 메인 index 슬라이드 시간 설정
$('.carousel').carousel({
    interval: 4000,
    pause: false // 활성화시 슬라이드에 마우스가 있더라도 슬라이드쇼 허용
});

// Raido 버튼 값에 따라 내용 표시(memberEdit)
function memType() {
    var check_Box = document.getElementsByName("memberType"); //체크박스 name
    var disign = document.getElementById([j+1]); // 보여질내용

    if(check_Box[j].checked == true ){
        disign.style.display = "block";
    }else{
        check_Box[j].checked = false;
        disign.style.display = "none";
    }
}
