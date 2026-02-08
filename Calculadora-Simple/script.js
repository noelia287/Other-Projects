let num1 = document.getElementById("num1");
let num2 = document.getElementById("num2");
let resultat = document.getElementById("resultat");

document.getElementById("suma").addEventListener("click", function () {
    resultat.textContent = "Resultat: " + (Number(num1.value) + Number(num2.value));
});

document.getElementById("resta").addEventListener("click", function () {
    resultat.textContent = "Resultat: " + (Number(num1.value) - Number(num2.value));
});

document.getElementById("multi").addEventListener("click", function () {
    resultat.textContent = "Resultat: " + (Number(num1.value) * Number(num2.value));
});

document.getElementById("div").addEventListener("click", function () {
    resultat.textContent = "Resultat: " + (Number(num1.value) / Number(num2.value));
});
