// https://www.codewars.com/kata/5274e122fc75c0943d000148

groupByCommas = (n) => {
  let m = n.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
  return m;
}

// 🧙‍♂️👍