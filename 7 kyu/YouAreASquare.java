public class Square {    
    public static boolean isSquare(int n) {        
        int x = (int) Math.sqrt(n);
        if (x * x == n)
          return true; 
        else
          return false;
  }
}
