function incrementString(input) {
  if(isNaN(parseInt(input[input.length - 1]))) {
    return input + "1";
  }
  
  return input.replace(/(0*)([0-9]+$)/, function(match, p1, p2) {
    const num = parseInt(p2) + 1;
    return num.toString().length > p2.length ? p1.slice(0, -1) + num : p1 + num;
  });
}

//:vault-boy-thumps-up:
