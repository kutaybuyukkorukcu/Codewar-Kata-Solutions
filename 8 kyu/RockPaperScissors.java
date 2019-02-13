public class Kata {
  public static String rps(String p1, String p2) {
  String temp = "";
    if(p1.equals(p2)) 
      temp = "Draw!";
    else if (p1.equals("rock") && p2.equals("scissors"))
      temp = "Player 1 won!";
    else if (p1.equals("paper") && p2.equals("rock"))
      temp = "Player 1 won!";
    else if (p1.equals("scissors") && p2.equals("paper"))
      temp = "Player 1 won!";
    else if (p1.equals("scissors") && p2.equals("rock"))
      temp = "Player 2 won!";
    else if (p1.equals("rock") && p2.equals("paper"))
      temp = "Player 2 won!";
    else if (p1.equals("paper") && p2.equals("scissors"))
      temp = "Player 2 won!";
    else
      temp = "Player 2 won!";
    return temp;
  }
}
