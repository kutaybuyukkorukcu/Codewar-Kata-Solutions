import static java.util.Arrays.stream;
public class Codewars {
  public static String oddOrEven (int[] array) {
  return stream(array).sum() % 2 == 0 ? "even" : "odd";
  }
}
