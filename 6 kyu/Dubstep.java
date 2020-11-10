// https://www.codewars.com/kata/551dc350bf4e526099000ae5

import java.util.Arrays;

public class Dubstep {
  public static String SongDecoder (String song){
    return song.replaceAll("(WUB)+", " ").trim();
  }
}

// 🧙‍♂️👍