public class NumberFun {
  public static long findNextSquare(long sq) {
      long rt = (long) Math.sqrt(sq);
      return rt * rt == sq ? (rt + 1) * (rt + 1) : -1;
  }
}
