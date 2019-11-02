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
}

// With streams

public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        List<int[]> list = IntStream.range(2, (int) sqrt(n) + 1)
                                    .filter(i -> n % i == 0)
                                    .mapToObj(i -> new int[] {i, (int)(log(n) / log(i) + 0.00000001)})
                                    .filter(i -> pow(i[0], i[1]) == n)
                                    .limit(1)
                                    .collect(Collectors.toList());

        return list.size() == 0 ? null : list.get(0);
    }
}

//:vault-boy-thumps-up:
