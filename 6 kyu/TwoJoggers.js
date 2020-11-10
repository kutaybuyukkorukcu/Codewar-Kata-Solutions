// https://www.codewars.com/kata/5274d9d3ebc3030802000165

const nbrOfLaps = function (x, y) {
  let count = x
  while(count%y !== 0){
    count += x
  }
  return [count/x, count/y];
}

// 🧙‍♂️👍