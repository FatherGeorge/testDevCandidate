function sendAjax() {

}

function displayParts(sortField) {

    $.ajax({
        url: "home.htm",
        type: 'POST',
        dataType: 'json',
        data: JSON.stringify(sortField),
        contentType: 'application/json',
        mimeType: 'application/json',

        success: function (data) {

            $('#partsList tbody').remove();

            $.each(data, function (index, part) {
                $("#partsList").append($('<tr/>')
                    .append($('<td/>')).html(part.partNumber)
                );


            });
        },

        error: function (data, status, er) {
            alert("error: " + data + " status: " + status + " er:" + er);
        }
    })
}


