function productFib(prod){
  var n = 0;
  var n1 = 1;  
  while(n * n1 < prod) {
    n1 = n + n1;
    n = n1 - n;
  }
  return [n, n1, n * n1 === prod];
}
