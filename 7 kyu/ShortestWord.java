import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        String[] dizi = s.split(" ");
        int index = dizi[0].length();
        for(int i = 1;i < dizi.length;i++){
          if(dizi[i].length() < index){
            index= dizi[i].length();
          }
        }
        return index;
    }
}
