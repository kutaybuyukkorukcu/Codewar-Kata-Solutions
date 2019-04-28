public class Kata {
  public static String[] capMe(String[] strings) {
       for (int i = 0; i < strings.length; i++) {
            if (strings.length > 0) {
                strings[i] = Character.toUpperCase(strings[i].charAt(0)) +
                        strings[i].substring(1, strings[i].length()).toLowerCase();}
        }
        return strings;   
  }
}
