function gap(g, m, n) {
  for(let i = m; i<= n;i++){
    if(isPrime(i) && isPrime(i + g)){
      let arr = Array(g - 1).fill().map((item, index) => i + index + 1)
      if(arr.filter((item) => isPrime(item)).length > 0)
        continue;
      else return [i, i+g];
    }
  }
  return null;
}
