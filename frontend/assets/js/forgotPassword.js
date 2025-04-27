function enviarRecoverPasswordMail() {
    var email = document.getElementById("email").value;
    if (!email) {
        alert("Por favor, ingrese un correo electrónico válido");
        return
    }
    var url = "http://127.0.0.1:8080/RecoverPasswordEmail/" + email;
    fetch(url, {
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    })
    alert("Correo enviado con éxito");
}