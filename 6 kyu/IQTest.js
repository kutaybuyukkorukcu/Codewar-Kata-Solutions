// https://www.codewars.com/kata/552c028c030765286c00007d

const iqTest = (numbers) => {
  let evenOdd = [[0, 0], [0, 0]];
  
  numbers.split(' ').some((num, i) => {
    let n = num % 2;
    evenOdd[n][0]++;
    evenOdd[n][1] = i;
    if (evenOdd[n][0] > 1 && evenOdd[+!n][0] == 1) {
      return true;
    }
  });
  return ++evenOdd[(evenOdd[0][0] == 1) ? 0 : 1][1];
}

// 🧙‍♂️👍 