public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        for (int i = 2; ; i++) {
            int root = (int) Math.round(Math.pow(n, 1.0 / i));
            if (root < 2) {
              return null;
            }
            if (Math.pow(root, i) == n) {
              return new int[]{root, i};
            }
        }
    }
}// I couldn't solve the kata better than this. Not my sol.
public class SumSquaredDivisors {
  public static String listSquared(long m, long n) {
        String[] tempResult = LongStream
                .rangeClosed(m, n)
                .boxed()
                .map(l -> new long[] {l, sumSquaredDivisors(l)})
                .filter(ls -> isSquared(ls[1]))
                .map(Arrays::toString)
                .toArray(String[]::new);
        return Arrays.toString(tempResult);
    }

    private static boolean isSquared(long n) {
        long sqrtN = (long) Math.sqrt(n);
        return sqrtN * sqrtN == n;
    }

    private static long sumSquaredDivisors(long n) {
        return LongStream
                .rangeClosed(1, (long) Math.sqrt(n))
                .filter(l -> n % l == 0)
                .map(l -> (l * l) + ((n / l) == l ? 0 : (n / l) * (n / l)))
                .sum();
    }
}
