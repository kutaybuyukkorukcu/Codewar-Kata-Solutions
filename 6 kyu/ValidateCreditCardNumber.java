public class Validate{
  public static boolean validate(String n){
    int sum = 0,i = 0,x = 1;
    String[] arr = n.split("");
    if(arr.length % 2 == 0){ 
      while(i<arr.length){
        arr[i] = Integer.toString(Integer.valueOf(arr[i]) * 2);
        if(Integer.valueOf(arr[i])>9){
          arr[i] = Integer.toString(Integer.valueOf(arr[i]) - 9);
        }
        i += 2;
      }
      for(int j = 0;j<arr.length;j++){
        sum += Integer.valueOf(arr[j]);
      }
    }else{
      while(x<arr.length){
        arr[x] = Integer.toString(Integer.valueOf(arr[x]) * 2);
        if(Integer.valueOf(arr[x])>9){
          arr[x] = Integer.toString(Integer.valueOf(arr[x]) - 9);
        }
        x += 2;
      }
      for(int j = 0;j<arr.length;j++){
        sum += Integer.valueOf(arr[j]);
      }
    }
    return sum % 10 == 0;
  }
}
