// https://www.codewars.com/kata/525dfedb5b62f6954d000006

const scoreThrows = (radiuses) => {
  let n = radiuses.length;
  if(!n) 
    return 0;

  let bonus = (radiuses.filter(a => a < 5).length === n) ? 100 : 0
  return radiuses.map(a => (a > 10) ?
             0 : (a >= 5 && a <= 10) ? 5 : 10).reduce((b,c) => b + c) + bonus;
}

// 🧙‍♂️👍