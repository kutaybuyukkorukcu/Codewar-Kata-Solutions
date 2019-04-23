import java.util.Arrays;
public class Solution {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
          int[] ages = { age1, age2, age3, age4, age5, age6, age7, age8 };
    int sum = Arrays.stream(ages).map(age -> age * age).sum();
    double sqrt = Math.sqrt(sum);
    return (int) (sqrt / 2);
    }
}
