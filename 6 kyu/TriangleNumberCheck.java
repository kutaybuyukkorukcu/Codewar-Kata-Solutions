public class TriangleNumbers {
	public static Boolean isTriangleNumber(long number) {
    int i = 1;
    while(true){
      number -= i;
      if(number == 0) return true;
      else if(number < 0) return false;
      i++;
    }
  }
}
