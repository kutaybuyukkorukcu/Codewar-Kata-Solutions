var sum_pairs = function(ints, s) {
    let arr = [], result = [];
    
    ints.forEach(n => {
      if (arr.includes(s - n)  && !result.length) {
        result = [s-n, n];     
      }
      arr.push(n);
    });
    
    if (!result.length) {
      return undefined;
    }
    return result;
};

//:vault-boy-thumbs-up:
