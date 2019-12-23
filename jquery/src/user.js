var user = user || {};

user.drawTable = function () {

    $.ajax({
        url: 'http://randomuser.me/api',
        method: 'GET',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {
            var response = data.results;
            $.each(response, function (index, value) {
                var name = value.name;
                var location = value.location;
                $('#tbUser').append(
                    "<tr>" +
                    "<td>" + name.title + name.first + name.last + "</td>" +
                    "<td>" + value.gender + "</td>" +
                    "<td>" + value.dob.date + "</td>" +
                    "<td>" + location.street.number + "." + location.street.name + "</td>" +
                    "<td>" +"<a href='javascript:;'<i</td>" +
                "</tr>"
            );
            });
        }
    });
};

user.init = function () {
    user.drawTable();
};

$(document).ready(function () {
    user.init();
});