public class Solution {
  public static int century(int number) {
    return (number % 100 == 0) ? (number = number / 100 ) : (number = (number / 100) + 1);
  }
}
