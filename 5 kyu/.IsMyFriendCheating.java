import java.util.*;
public class RemovedNumbers {
	
	public static List<long[]> removNb(long n) {
    LinkedList<long[]> cift = new LinkedList<>();
		long sum = n * (n + 1) / 2;
    long b = 0;
    for(int i = 1; i < n + 1; i++){
      b = (sum - i) / (i + 1);
      
      if (b <= n) {
        cift.add(new long[] {i, (int) b});
      }
    }
    return cift;
	}
}

//Will check later on. not correct

public class RemovedNumbers {
	
public static List<long[]> removNb(long n) {
        LinkedList<long[]> pairs = new LinkedList<>();
        long sum = n * (n + 1) / 2;
        long lowerBound = ((n - 1) * n / 2) / (n + 1);
        long upperBound = (long) Math.sqrt(sum + 1) - 1;
        for (long a = upperBound; a >= lowerBound; a--) {
            long b = (sum - a)/(a + 1);
            if (a * b + a + b == sum) {
                pairs.addFirst(new long[]{a, b});
                pairs.addLast(new long[]{b, a});
            }
        }
        return pairs;
    }
}
