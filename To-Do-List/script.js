let boto = document.getElementById("afegir");
let input = document.getElementById("tasca");
let llista = document.getElementById("llista");

boto.addEventListener("click", function () {

    if (input.value == "") {
        alert("Escriu una tasca primer!");
    } 
    else {
        let novaTasca = document.createElement("li");
        novaTasca.textContent = input.value;

        novaTasca.addEventListener("click", function () {
            novaTasca.remove();
        });

        llista.appendChild(novaTasca);
        input.value = "";
    }
});
