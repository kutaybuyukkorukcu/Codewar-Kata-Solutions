public class DRoot {
  public static int digital_root(int n) {
   int sum = n;
   do{
    char[] chr = String.valueOf(sum).toCharArray();
	  sum = 0;
    for(int i = 0;i<chr.length;i++)
      sum += Character.getNumericValue(chr[i]);
    }while(String.valueOf(sum).length() != 1);
    return sum;
  }
}

//chkd
