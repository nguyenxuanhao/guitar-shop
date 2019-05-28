var dialog = document.querySelector('dialog');

$(document).ready(function () {
    $("#contactForm").submit(function (e) {
        e.preventDefault();
        ajaxPost();
    })

    function ajaxPost() {
        var fromData = {
            name: $("#name").val(),
            email: $("#email").val(),
            title: $("#title").val(),
            messageContent: $("#messageContent").val()
        }
        debugger
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/lien-he",
            data: JSON.stringify(fromData),
            success: function (res) {
                if(res) {
                    dialog.showModal();
                }
            },
            error: function (e) {
                alert("Gửi tin nhắn không thành công!")
            }
        })
    }

    $(".closeDialog").on("click", function () {
        dialog.close();
    })
});
