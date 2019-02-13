public class Kata {

  public int min(int[] list) {
    int min = list[0];
    for(int item : list){
      if(min > item)
        min = item;
    }
    return min;
  }
  
  public int max(int[] list) {
     int max = list[0];
    for(int item : list){
      if(item > max)
        max = item;
    }
    return max;
  }
}
