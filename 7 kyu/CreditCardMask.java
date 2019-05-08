public class Maskify {
    public static String maskify(String str) {
          char[] strChars = str.toCharArray();
    for( int i = 0; i < strChars.length - 4; i++ ) {
      strChars[i] = '#';
    }
    return new String(strChars);
    
    
    }
}
