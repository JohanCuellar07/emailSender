function enviarChangedPasswordMail() {
    var email = document.getElementById("email").value;
    if (!email) {
        alert("Please enter a valid email");
        return
    }
    var url = "http://127.0.0.1:8080/changedPasswordEmail/" + email;
    fetch(url, {
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    })
    alert("Email sent successfully");
}