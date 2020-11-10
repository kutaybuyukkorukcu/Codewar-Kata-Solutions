// https://www.codewars.com/kata/5839edaa6754d6fec10000a2

import java.util.Arrays;
import java.lang.Character;

public class Kata{
  public static char findMissingLetter(char[] array){
    for (int j = 0; j < array.length; j++){
      if (Character.getNumericValue(array[j+1]) - Character.getNumericValue(array[j]) != 1) return (char) (array[j] + 1);
    }
	return 1;
  }  
}

// 🧙‍♂️👍
