public class Solution {
  private static int P = 5;
  
  public static int zeros(int n) {
    int zeros = 0;
    for (int i = 1, k = k(n), p = P; i <= k; i++, p *= P) {
      zeros += n / p;
    }
    return zeros;
  }
  
  private static int k(final int n) {
    return (int) Math.log(n) / Math.log(P);
  }
}

// amazin
public class Solution {
  public static int zeros(int n) {
    int res = 0;
    for (int i = 5; i <= n; i *= 5) {
      res += n / i;
    }
    return res;
  }
}

// amazin also

public class Solution {
  public static int zeros(int n) {
      if(n/5 == 0)
        return 0;
      return n/5 + zeros(n/5);
  }
}

//:vault-boy-thumps-up:
