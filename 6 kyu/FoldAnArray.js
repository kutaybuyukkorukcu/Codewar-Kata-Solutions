// https://www.codewars.com/kata/57ea70aa5500adfe8a000110

const foldArray = (array, runs) => {
  array = array.slice();
  for(let i = 0; i < runs; i++)
    array.splice(Math.ceil(array.length/2)).reverse().map((a, b) => array[b] += a);
  return array;
}

// 🧙‍♂️👍 