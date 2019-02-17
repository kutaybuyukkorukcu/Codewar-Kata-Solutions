import java.util.*;

public class ReverseWords{
 public static String reverseWords(String str){
     List Words = Arrays.asList(str.split(" "));
     Collections.reverse(Words);
     return String.join(" ", Words);
  }
}
