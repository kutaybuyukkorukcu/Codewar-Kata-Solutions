import java.util.*;

public class Kata{
  public static int sum(int[] numbers){
  if (numbers == null)
    return 0;
  Arrays.sort(numbers);
  int sum = 0;
  for(int i = 1;i < numbers.length - 1;i++){
    sum += numbers[i];
  }
  return sum;
  }
}
