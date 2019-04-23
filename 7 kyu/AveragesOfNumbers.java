public class Kata{
  public static double[] averages(int[] numbers){
         final double res[] = new double[(numbers == null || numbers.length == 0) ? 0 : numbers.length - 1];
    for (int i = 0; i < res.length; i++) res[i] = (numbers[i]+numbers[i+1]) / 2.0;
    return res;
  }
}
