import java.util.*;

public class Josephus {
  public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
      List<T> result = new ArrayList<T>();
      int index = 0;
      
      while(items.size() > 0){
          index = (index + k - 1) % items.size();
          result.add(items.remove((int) position));
      }

      return result;
  }
}
