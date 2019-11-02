function firstNonRepeatingLetter(s) {

  const reducer = (accur, current) => {
    let i = current.toLowerCase();
    console.log(i + "!");
    accur[i] ? accur[i][1] += 1 : accur[i] = [current, 1];
    return accur;
  }
  
  const obj = s
    .split("")
    .reduce(reducer, {});
  
  const result = Object.values(obj).find(el => el[1] === 1);
    
  return result ? result[0] : '';
}

//:vault-boy-thumps-up:
