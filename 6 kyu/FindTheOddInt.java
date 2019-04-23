public class FindOdd {
  public static int findIt(int[] A) {
    int odd=0;
    for (int item: A)
      {
        odd = odd ^ item;// XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
      }
    return odd;
  }
}

//chkd
