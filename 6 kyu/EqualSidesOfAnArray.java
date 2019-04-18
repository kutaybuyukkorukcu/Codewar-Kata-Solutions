public class Kata {
  public static int findEvenIndex(int[] arr) {
    int r = 0;
    int n = 0;
    for(int i = 1;i<arr.length;i++){
      int left = 0, right = 0;
      for(int j = 0;j<i;j++){
        left += arr[j];
      }
      for(int k = arr.length - 1;k>i;k--){
        right += arr[k];  
      }
      if(left == right){
        r = i;
        n++;
        break;
      }
    }
    if (n != 1){
      r = -1;
    }
    return r;
  }
}

//chkd
