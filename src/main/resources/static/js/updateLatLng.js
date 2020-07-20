$(document).ready(function () {
    $('#sendLatLng').on('click', function () {
        alert("click");
        var data = {
            lat : $('#lat').val(),
            lng : $('#lng').val(),
            parkingName : $('#parkingName').val()
        };


        $.ajax({
            type : 'POST',
            url : '/admin/rest/happyParkingRequest',
            data : data
        }).done(function () {
            var message = "저장 완료되었습니다.";
            var resultDiv = document.getElementById("complete");
            resultDiv.innerHTML = message;
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    });
});
