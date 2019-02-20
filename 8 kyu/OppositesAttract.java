public class OppositesAttract {
  public static boolean isLove(final int flower1, final int flower2) {
    return isEven(flower1) ? isOdd(flower2) : isEven(flower2);
  }
    private static boolean isEven(int num) {
    return (num & 1) == 0;
  }
  
  private static boolean isOdd(int num) {
    return !isEven(num);
  }
}
