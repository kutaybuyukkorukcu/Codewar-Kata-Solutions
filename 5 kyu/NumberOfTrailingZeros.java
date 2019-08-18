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
