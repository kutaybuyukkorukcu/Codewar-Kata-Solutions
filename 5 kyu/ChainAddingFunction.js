function add(n){
  const fn = x => { return add(n + x); }
  
  fn.valueOf = () => { return n; }
  
  return fn;
}

//:vault-boy-thumps-boy:
