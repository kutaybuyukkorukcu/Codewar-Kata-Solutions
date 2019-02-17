public class Kata {
  public static int rentalCarCost(int d) {
    int a = 40;
    if (d < 3)       
      return d * a;
    else if (d >= 7) 
      return d * a - 50;
    else            
      return d * a - 20;
  }
}
