// https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec

class Persist {
	public static int persistence(long n) {
	  int num = 0, digit = 1;
    while(String.valueOf(n).length() > 1) {
      while(n>0) {
        digit *= n % 10;
        n /= 10;
      }
      num++;
      n = digit;
      digit = 1;
    }
    return num;
  }
}

// 🧙‍♂️👍