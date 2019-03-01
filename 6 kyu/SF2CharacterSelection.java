import java.util.*;
import java.util.Arrays;
public class Solution{
  public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
  ArrayList<String> arr = new ArrayList<>();
  int verticalPos = position[0];
  int horizontalPos = position[1];

  for(String mov : moves){
    switch(mov) {
      case "up":
        verticalPos--;
        if (verticalPos < 0) verticalPos = 0;
        break;
      case "down":
        verticalPos++;
        if (verticalPos > fighters.length - 1) verticalPos = fighters.length - 1;
        break;
      case "left":
        horizontalPos--;
        if (horizontalPos < 0) horizontalPos = fighters[verticalPos].length - 1;
        break;
      case "right":
        horizontalPos++;
        if (horizontalPos > fighters[verticalPos].length - 1) horizontalPos = 0;
        break;
    }
    arr.add(fighters[verticalPos][horizontalPos]);
  }
  String[] result = new String[arr.size()];
  return arr.toArray(result);
  }
}
