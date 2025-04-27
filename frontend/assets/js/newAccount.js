function enviarNewAccountMail() {
    var email = document.getElementById("email").value;
    var activationCode = document.getElementById("activationCode").value;
    if (!email || !activationCode) {
        alert("Por favor, ingrese un correo electrónico y un código de activación válidos");
        return;
    }
    if (activationCode !== "6789") {
        alert("El código de activación no es correcto");
        return;
    }
    var url = "http://127.0.0.1:8080/newAccountEmail/" + email;
    fetch(url, {
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    })
    alert("Correo enviado con éxito");
}