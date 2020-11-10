// https://www.codewars.com/kata/5421c6a2dda52688f6000af8

const compose = (f,g) => {
  return (i) => {
    if (arguments.length > 1) {
      return f.call(null, g.apply(null, arguments));
    } else {
      return f(g(i));
    }
  }
}

// 🧙‍♂️👍