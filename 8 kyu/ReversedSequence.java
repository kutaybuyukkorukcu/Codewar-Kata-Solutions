public class Sequence{
  public static int[] reverse(int n){
    int[] dizi = new int[n];
    for (int i=0; i<n; i++) 
      dizi[i]=n-i;
    return dizi;
  }
}
