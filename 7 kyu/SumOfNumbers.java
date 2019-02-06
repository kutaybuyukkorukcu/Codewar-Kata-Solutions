  public class Sum{
      public int GetSum(int a, int b){
        int max, min, sum = 0;
        if(a > b){
          max = a;
          min = b;
        }else{
          max = b;
          min = a;
        }  
        for (;min <= max;min++)
          sum += min;
      return sum;
     }
  }
