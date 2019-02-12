public class Kata {
  public static int[] digitize(long n) {
    String numDizi = String.valueOf(n);
    String[] strDizi = numDizi.split("");
    int[] dizi = new int[numDizi.length()];
    for(int i = 0; i < strDizi.length;i++){
      dizi[i] = Integer.parseInt(strDizi[i]);
    }
    int temp = 0;
    for(int i = 0; i < dizi.length / 2; i++){
      temp = dizi[i];
      dizi[i] = dizi[dizi.length - i - 1];
      dizi[dizi.length - i - 1] = temp;
      }
    return dizi;
  }
}
