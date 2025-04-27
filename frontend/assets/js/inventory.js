function deleteMovie(movieId) {
    // Buscamos el contenedor de la película por el atributo 'data-id'
    let movieCard = document.querySelector(`[data-id='${movieId}']`);
    
    // Si existe la película, la eliminamos
    if (movieCard) {
        movieCard.remove();
    }
    checkMovies();
}

function checkMovies() {
    let movieContainer = document.getElementById('listMovies');
    let peliculasRestantes = movieContainer.querySelectorAll('.movie-card').length;

    if (peliculasRestantes === 3) {
        enviarLowStockMail();
    }
}

function enviarLowStockMail() {
    var email = document.getElementById("email").value;
    if (!email) {
        alert("Please enter a valid email");
        return
    }
    var url = "http://127.0.0.1:8080/lowStockEmail/" + email;
    fetch(url, {
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    })
    alert("Low stock email sent");
}