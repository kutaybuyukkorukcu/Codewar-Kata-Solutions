// https://www.codewars.com/kata/5432fd1c913a65b28f000342

const multiplicationTable = (row,col) => {
  let multiArray = [];
  for (let i = 1; i < row+1; i++) {
    multiArray.push([]);
    for (let j = 1; j < col+1; j++) {
      multiArray[i-1].push((i) * (j));
    }
  }
  return multiArray;
}

// 🧙‍♂️👍 