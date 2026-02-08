function mostrarSeccio(id) {
    let seccions = ["sobre", "projectes", "contacte"];
    for (let i = 0; i < seccions.length; i++) {
        document.getElementById(seccions[i]).style.display = "none";
    }
    document.getElementById(id).style.display = "block";
}
