// https://www.codewars.com/kata/557e8a141ca1f4caa70000a6

public class TriangleNumbers {
	public static Boolean isTriangleNumber(long number) {
    int i = 1;
    while(true){
      number -= i;
      if(number == 0) return true;
      else if(number < 0) return false;
      i++;
    }
  }
}

// 🧙‍♂️👍