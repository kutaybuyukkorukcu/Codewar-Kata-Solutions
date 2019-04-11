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
//chkd
