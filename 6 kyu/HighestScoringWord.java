public class Kata {
  public static String high(String s) {
    String[] arr = s.split(" ");
    int mx= 0;
    String result = "";
    for(int i =0;i<arr.length;i++){
      String item = arr[i];
      int temp = 0;
      for(int j = 0;j<item.length();j++){
        temp = temp + (int) (item.charAt(j) - 96);
      }
      if(temp > mx){
        mx = temp;
        result = item;
      }
    }
    return result;
  }
}

//chkd
