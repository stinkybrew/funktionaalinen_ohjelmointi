var arvo = 4;

function recur(n) {
    if (n == 1) {
        console.log(n);
        return 1;
    } else {
        console.log(n);
        return n * recur(n - 1);
    }
}

console.log(recur(arvo));