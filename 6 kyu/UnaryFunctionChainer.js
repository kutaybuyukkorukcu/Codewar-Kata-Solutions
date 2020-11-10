// https://www.codewars.com/kata/54ca3e777120b56cb6000710

const chained = (functions) => {
    return (input) => {
        for (let i = 0; i < functions.length; i++) {
          input = functions[i](input);
        }
        return input;
  }
}

// 🧙‍♂️👍
