// https://www.codewars.com/kata/54da539698b8a2ad76000228

import java.util.HashMap;

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    HashMap<Character,Integer> pair = new HashMap<>();
    pair.put('n',1);
    pair.put('e',1);
    pair.put('s',-1);
    pair.put('w',-1);
    int sum = 0;
    for(int i  = 0;i<walk.length;i++){
      char c = walk[i];
      sum += pair.get(c);
    }
    if(sum == 0 && walk.length == 10){
      return true;
    }
    return false;
  }
}

// 🧙‍♂️👍