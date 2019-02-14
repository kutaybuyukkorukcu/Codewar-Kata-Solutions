public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    int temp = salary;
    if(bonus)
      temp = salary * 10;
    return "\u00A3" + String.valueOf(temp);
  }
  
}
