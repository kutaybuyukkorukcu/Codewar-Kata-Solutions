// https://www.codewars.com/kata/526571aae218b8ee490006f4

public class BitCounting {
	public static int countBits(int n){
	  char[] seq = Integer.toString(n,2).toCharArray();
    int count = 0;
    
    for(int i = 0;i<seq.length;i++)
      if(seq[i] == '1') count++;
    
      return count;
  }	
}

// 🧙‍♂️👍
