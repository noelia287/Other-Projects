let valor = document.getElementById("valor");
let tipus = document.getElementById("tipus");
let resultat = document.getElementById("resultat");

document.getElementById("convertir").addEventListener("click", function() {
    if (tipus.value == "c") {
        resultat.textContent = "Resultat: " + (Number(valor.value) * 9/5 + 32) + " °F";
    } else {
        resultat.textContent = "Resultat: " + ((Number(valor.value) - 32) * 5/9) + " °C";
    }
});
