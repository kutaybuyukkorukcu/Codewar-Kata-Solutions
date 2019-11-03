var lastDigit = function(str1, str2){
  let fNum = +str1.slice(-1);
  let sNum = +str2.slice(-2);
  
  return +str2 === 0 ? 1 : Math.pow(fNum, sNum % 4 + 4) % 10
}

//:vault-boy-thumps-up:
