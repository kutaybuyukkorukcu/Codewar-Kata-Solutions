public class Fracts {

  public static String convertFrac(long[][] lst) {
    if (lst.length == 0) {
      return "";
    }
    long l = lst[0][1];
    // Imp LinkedList result 
    for(int i = 0; i < lst.length; i++){
      l = lcm(l, lst[i][1]);
    }
    for(int i = 0; i <lst.length; i++){
      lst[i][0] = (l / lst[i][1]) * lst[i][0];
      lst[i][1] = l;
      // return actual [{,}]
    }
  return res;
}

  static long gcd(long a, long b) { 
      if (a == 0) 
          return b; 
            
      return gcd(b % a, a); 
  } 
    
  static long lcm(long a, long b) { 
      return (a * b) / gcd(a, b); 
  } 
}

//Need coverage
