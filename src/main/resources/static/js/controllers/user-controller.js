var dialog = document.querySelector('dialog');

function fnRegisterSuccess(res) {
        dialog.showModal();
}
$("#registrationForm").submit(function(e) {

    e.preventDefault(); // avoid to execute the actual submit of the form.

    var form = $(this);

    $.ajax({
        type: "POST",
        url: "/dang-ky",
        data: form.serialize(), // serializes the form's elements.
        success: function(data)
        {
            alert(data); // show response from the php script.
        }
    });
});


function fnLoginSuccess(res) {
    if (res.result == true) {
        window.location.href = "/";
    }
    if (res.result == false) {
        window.location.href = "/thanh-toan";
    }
}

$(document).ready(function () {
    $(".closeDialog").on("click", function () {
        dialog.close();
    })
});
