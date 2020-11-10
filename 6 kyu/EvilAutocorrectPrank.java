// https://www.codewars.com/kata/538ae2eb7a4ba8c99b000439

import java.util.regex.*;

public class Kata {
  public static String autocorrect(String input) {
    Pattern you = Pattern.compile("([yY][oO])([uU])+(\\W)*");
    Pattern u = Pattern.compile("\\s*[uU]\\s*");
    String[] words = input.split("\\s");
    for (int i = 0; i < words.length; i++) {
      Matcher mYou = you.matcher(words[i]);
      Matcher mU = u.matcher(words[i]);
      if (mYou.matches()) words[i] = mYou.replaceAll("your sister$3");
      else if (mU.matches()) words[i] = mU.replaceAll("your sister");
    }
    return String.join(" ", words);
  }
}

// 🧙‍♂️👍