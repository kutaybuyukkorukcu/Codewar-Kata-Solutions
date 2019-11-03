function wrap(func) {
  const cache = {};
  
  return (n) => {
    if (!cache[n]) {
      cache[n] = func(n);
    }
    return cache[n];
  }
}

const fibonacci = wrap((n) => {
  if (n == 0 || n == 1) {
    return n;
  }
  return fibonacci(n-1) + fibonacci(n-2);
})

//:vault-boy-thumps-up:
