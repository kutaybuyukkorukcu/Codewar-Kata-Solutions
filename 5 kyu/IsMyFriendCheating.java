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
