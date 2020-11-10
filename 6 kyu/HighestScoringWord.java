// https://www.codewars.com/kata/57eb8fcdf670e99d9b000272

public class Kata {
  public static String high(String s) {
    String[] arr = s.split(" ");
    int mx= 0;
    String result = "";
    for(int i =0;i<arr.length;i++){
      String item = arr[i];
      int temp = 0;
      for (int j = 0;j<item.length();j++){
        temp += (int) (item.charAt(j) - 96);
      }
      if (temp > mx) {
        mx = temp;
        result = item;
      }
    }
    return result;
  }
}

// 🧙‍♂️👍
