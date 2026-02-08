function filtrar(tipus) {
    let imatges = document.querySelectorAll(".galeria img");

    imatges.forEach(function(img) {
        if (tipus === "tot" || img.getAttribute("data-tipus") === tipus) {
            img.style.display = "block";
        } else {
            img.style.display = "none";
        }
    });
}
