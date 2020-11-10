// https://www.codewars.com/kata/52f78966747862fc9a0009ae

import java.util.*;

public class Calc {
  public double evaluate(String expr) {
        if (expr.isEmpty()) return 0;
        Stack<Double> stack = new Stack<>();
        for (String item : expr.split(" ")) {
            if (item.matches("[\\+\\-\\*/]")) {
                Double B = stack.pop();
                Double A = stack.pop();
                switch (item) {
                    case "+":
                        stack.push(A + B);
                        break;
                    case "-":
                        stack.push(A - B);
                        break;
                    case "*":
                        stack.push(A * B);
                        break;
                    case "/":
                        stack.push(A / B);
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            } else stack.push(Double.parseDouble(item));
        }
        return stack.pop();
  }
}

// 🧙‍♂️👍