// https://www.codewars.com/kata/52de553ebb55d1fca3000371

const findMissing = (seq) => {  
  const n = (seq[seq.length - 1] - seq[0])/seq.length;
  
  for(var i = 0; i < seq.length - 1; i++)
    if(seq[i+1] - seq[i] !== n) 
      return seq[i] + n;
}

// 🧙‍♂️👍