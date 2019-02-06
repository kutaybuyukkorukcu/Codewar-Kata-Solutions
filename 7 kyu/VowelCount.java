public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    char[] dizi = str.toCharArray();
    for(int i = 0;i<dizi.length;i++){
      if(dizi[i] == 'a' || dizi[i] == 'e' || dizi[i] == 'i' || dizi[i] == 'o' || dizi[i] == 'u')
        vowelsCount++;
    }
    return vowelsCount;
  }

}
