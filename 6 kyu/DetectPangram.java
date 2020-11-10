// https://www.codewars.com/kata/545cedaa9943f7fe7b000048

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class PangramChecker {
  public boolean check(String sentence){
    String newS = sentence.replaceAll("[^A-Za-z]", "");
    Set<String> letters = new HashSet<>(Arrays.asList(newS.split("")));
    return letters.size() >= 26;
  }
}

// 🧙‍♂️👍