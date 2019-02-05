import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class SumDigPower {
      public static long sumNumber(long a){
        ArrayList<Long> list = new ArrayList<Long>();
        int m = (int) a;
        while (m>0){
          list.add((long) (m % 10));
          m = m / 10;
        }
        long sum = 0; 
        int boyut = list.size();
        int temp = 1;
        for (int i = boyut;i > 0;i--){
        		sum += Math.pow(list.get(i-1),temp);
        		temp++;
        	}
        return sum;
      }
      
      public static List<Long> sumDigPow(long a, long b) {
        ArrayList<Long> liste = new ArrayList<Long>();
        for(;a<=b;a++){
  		    if(a == sumNumber(a))
  		    	liste.add(a);
        } 
        return liste;
      }
}
