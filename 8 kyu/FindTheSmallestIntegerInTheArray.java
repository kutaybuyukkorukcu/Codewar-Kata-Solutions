public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
      int min = args[0];
      for(int i = 1; i < args.length; i++){
      if(min > args[i]) 
        min = args[i];
      }
      return min;
    }
}
