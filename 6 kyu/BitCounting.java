public class BitCounting {
	public static int countBits(int n){
	  char[] seq = Integer.toString(n,2).toCharArray();
    int count = 0;
    for(int i = 0;i<seq.length;i++)
      if(seq[i] == '1')
        count++;
    return count;
  }	
}

//chkd
