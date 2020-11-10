// https://www.codewars.com/kata/5552101f47fc5178b1000050

import java.util.*;

public class DigPow {
	
	public static long digPow(int n, int p) {
	  ArrayList<Integer> list = new ArrayList<Integer>();
    int m = n;
    while (m > 0){
      list.add(m % 10);
      m = m / 10;
    }
    int toplam = 0,temp = 0;
    for (Integer item : list){
      temp = p + list.size() - 1;
      toplam = toplam + (int) Math.pow(item,temp);
      --p;
    }
    if (toplam % n == 0)
      return (toplam / n);
    else
      return -1;
  }
	
}

// 🧙‍♂️👍