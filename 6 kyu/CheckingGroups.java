import java.util.*;
public class Groups{
  public static boolean groupCheck(String s){
    HashMap<Character, Integer> m = new HashMap<Character, Integer>();
    m.put('(', 1);
    m.put('{', 2);
    m.put('[', 3);
    m.put(')', -1);
    m.put('}', -2);
    m.put(']', -3);
    Stack<Integer> resultStack = new Stack<Integer>();
    int temp = 0;
    for (int i = 0; i < s.length(); ++i) {
      temp = m.get(s.charAt(i));
      if (temp > 0) resultStack.push(temp);
      else if (temp < 0)
        if (resultStack.empty() || 0 != resultStack.pop() + temp) return false;
    }
    return resultStack.empty();
  }
}
