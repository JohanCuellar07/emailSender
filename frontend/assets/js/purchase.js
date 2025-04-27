function enviarPurchaseMail() {
    var email = document.getElementById("email").value;
    if (!email) {
        alert("Por favor, ingrese un correo electrónico válido");
        return
    }
    var url = "http://127.0.0.1:8080/purchaseEmail/" + email;
    fetch(url, {
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    })
    alert("Se ha enviado un correo con la información de la compra");
}