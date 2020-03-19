var arvo = 4;

function pow(n) {
    if (n == 1) {
        console.log(n) // Prints 1
        return 1;
    } else {
        console.log(n) // Prints all other numbers
        return n * pow(n - 1);
    }
}
console.log(pow(arvo));