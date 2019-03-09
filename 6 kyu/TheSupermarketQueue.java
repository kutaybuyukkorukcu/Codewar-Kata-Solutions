import java.util.*;
public class Solution {
    public static int solveSuperMarketQueue(int[] customers, int n) {
      ArrayList<Integer> done = new ArrayList<Integer>();
      for(int i = 0;i<n;i++)
        done.add(0);
      for(int i = 0;i<customers.length;i++)
        done.set(done.indexOf(Collections.min(done)),Collections.min(done) + customers[i]);
        return Collections.max(done);
    }
}
