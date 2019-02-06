public class Accumul {
    
    public static String accum(String s) {
        char[] dizi = s.toLowerCase().toCharArray();
        String[] fdizi = new String[dizi.length];
        String temp = "";
        int j = 1;
        for(int i = 0;i<dizi.length;i++){
          for(int k = dizi.length - j;k<dizi.length;k++) 
        	  temp += dizi[i];
          temp = Character.toUpperCase(temp.charAt(0)) + temp.substring(1);
          fdizi[i] = temp;
          temp = "";
          j++;
        }
        for(int i = 0;i<dizi.length;i++) {
        	temp = temp + "-" + fdizi[i];
        }
        temp = temp.substring(1);
        return temp;
    }
}
