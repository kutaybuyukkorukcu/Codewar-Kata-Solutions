public class Kata {

  public static String solution(String str) {
    String[] rstr = str.split("");
    StringBuilder bldr = new StringBuilder();
    for(String item : rstr)
      bldr.append(item);
    bldr = bldr.reverse();  
    return bldr.toString();
  }

}
