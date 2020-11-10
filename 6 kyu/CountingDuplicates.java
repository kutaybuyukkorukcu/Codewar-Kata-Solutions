// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

import java.util.*;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    int answer = 0;
    text = text.toLowerCase();

    Set<String> duplicateCountList = new HashSet<>();
    
    for (String chr : text.split("")) {
      if (text.indexOf(chr) != text.lastIndexOf(chr)) duplicateCountList.add(chr);
    }

    return duplicateCountList.size();
  }
}

// 🧙‍♂️👍
