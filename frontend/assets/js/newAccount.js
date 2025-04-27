function enviarNewAccountMail() {
    var email = document.getElementById("email").value;
    var activationCode = document.getElementById("activationCode").value;
    if (!email || !activationCode) {
        alert("Please enter a valid email and activation code");
        return;
    }
    if (activationCode !== "6789") {
        alert("Activation code is incorrect");
        return;
    }
    var url = "http://127.0.0.1:8080/newAccountEmail/" + email;
    fetch(url, {
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    })
    alert("Email sent successfully");
}