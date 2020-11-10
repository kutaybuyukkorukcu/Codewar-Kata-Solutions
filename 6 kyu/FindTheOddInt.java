// https://www.codewars.com/kata/54da5a58ea159efa38000836

public class FindOdd {
  public static int findIt(int[] A) {
    int odd=0;
    for (int item: A)
      {
        // XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
        odd = odd ^ item;
      }
    return odd;
  }
}

// 🧙‍♂️👍
