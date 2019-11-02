var sum_pairs = function(ints, s) {
    let arr = [], result = [];
    
    ints.forEach(n => {
      // !result.length sayesinde en kisa resultu bulabiliyoruz
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

// function sum_pairs(ints, s) {
//   let seen = new Set();
//   for (let i of ints) {
//     if (seen.has(s - i)) return [s - i, i];
//     seen.add(i);
//   }
// }

//:vault-boy-thumbs-up:
