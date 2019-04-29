import java.util.*;

public class JadenCase {
	public String toJadenCase(String phrase) {
  if(phrase == null || phrase.equals("")) return null;
    String[] arr = phrase.split(" ");
    StringBuffer sb = new StringBuffer();
    for(int i = 0;i<arr.length;i++){
      //output.append(Character.toUpperCase(list[i].charAt(0))).append(list[i].substring(1)).append(" ");
      sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
    }
    return sb.toString().trim();
  }
}
