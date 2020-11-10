// https://www.codewars.com/kata/583203e6eb35d7980400002a

import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

public class SmileFaces {
  public static int countSmileys(List<String> arr) {
      int count = 0;
      String pattern = "[:;][-~]?[)D]";
      Pattern p = Pattern.compile(pattern);
      for(String item : arr){
        Matcher m = p.matcher(item);
        if(m.matches()) count++;
      }
      return count;
  }
}

// 🧙‍♂️👍