// https://www.codewars.com/kata/5375f921003bf62192000746

import java.util.regex.*;

public class Abbreviator {
  public String abbreviate(String s) {
    Pattern p = Pattern.compile("[a-z]{4,}", Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(s);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
      String g = m.group();
      int len = g.length();
      m.appendReplacement(sb, g.substring(0, 1) + (len - 2) + g.substring(len - 1, len));
    }
    m.appendTail(sb);
    return sb.toString();
  }
}

// 🧙‍♂️👍
