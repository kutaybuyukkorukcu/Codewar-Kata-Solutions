// https://www.codewars.com/kata/52ea928a1ef5cfec800003ee

const ipToInt32 = (ip) => {
  let binary32 = '';
  ip.split('.').map( (value) => {
    binary32 += ((+value).toString(2)).padStart(8,'0');
  });
  return parseInt(binary32,2);
}

// 🧙‍♂️👍
