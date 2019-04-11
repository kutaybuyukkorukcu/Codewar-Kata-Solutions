public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
      float answer = (float)g/(v2-v1);
      if(answer < 0) return null;
      int[] solution = new int[3];
      solution[0] = (int)answer;
      solution[1] = (int)((answer-solution[0])*60);
      solution[2] = (int)((answer-solution[0]-solution[1]/60.0)*3600.0);
      return solution;
    }
}
//chkd
