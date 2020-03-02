
function pow(n) {
    if (n == 1) {
      return 1;
    } else {
      return n * pow(n - 1);
    }
}

console.log( pow(4) ); 