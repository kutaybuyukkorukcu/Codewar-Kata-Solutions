import java.util.ArrayList;

class Metro {
  public static int countPassengers(ArrayList<int[]> stops) {
    int binen, inen, sum = 0;
    for (int[] item : stops){
      binen = item[0];
      inen = item[1];
      sum += (binen - inen);
    }
    return sum;
  }
}
