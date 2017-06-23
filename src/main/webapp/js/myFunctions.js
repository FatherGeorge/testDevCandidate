function displayParts(filtered, sorted, sortField) {

    var dto = new Object();
    dto.pn = $('#pn').val();
    dto.partName = $('#partName').val();
    dto.vendor = $('#vendor').val();
    dto.qty = $('#qty').val();
    dto.shippedAfter = $('#shippedAfter').val();
    dto.shippedBefore = $('#shippedBefore').val();
    dto.receivedAfter = $('#receivedAfter').val();
    dto.receivedBefore = $('#receivedBefore').val();
    dto.sorted = sorted;
    dto.sortField = sortField;
    dto.filtered = filtered;

    $.ajax({
        url: "home.htm",
        type: 'POST',
        dataType: 'json',
        data: JSON.stringify(dto),
        contentType: 'application/json',
        mimeType: 'application/json',

        success: function (data) {

            $('#partsList tbody').remove();

            $.each(data, function (index, part) {
                $("#partsList").append($('<tr/>')
                    .append($('<td/>').html(part.partNumber))
                    .append($('<td/>').html(part.partName))
                );
            });
        },

        error: function (data, status, er) {
            alert("error: " + data + " status: " + status + " er:" + er);
        }
    })
}


