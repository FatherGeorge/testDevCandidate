function sendAjax(){

}

function displayParts(){
    $.ajax({
        url: "home.htm",
        type: 'POST',
        dataType: 'json',
        contentType: 'application/json',
        mimeType: 'application/json',

        success: function (data) {

        }
    })
}


