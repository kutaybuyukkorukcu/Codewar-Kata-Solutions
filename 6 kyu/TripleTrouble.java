// https://www.codewars.com/kata/55d5434f269c0c3f1b000058

public class Kata{
  public static int TripleDouble(long num1, long num2) {
		String string1 = String.valueOf(num1);
		String string2 = String.valueOf(num2);

		for(int i = 0; i < string1.length(); i++){
			char ch = string1.charAt(i);
			if(string1.contains(new String(new char[]{ch, ch, ch})) &&
					string2.contains(new String(new char[]{ch, ch}))){
				return 1;
			}
		}
		return 0;
  }
}

// 🧙‍♂️👍
