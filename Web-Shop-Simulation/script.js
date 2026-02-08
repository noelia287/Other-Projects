let total = 0;

function afegirCarret(preu) {
    total += preu;
    document.getElementById("total").textContent = total;
}
