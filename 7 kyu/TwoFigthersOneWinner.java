public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
          int moves1 = (int) Math.ceil( (double)fighter2.health / fighter1.damagePerAttack);
        int moves2 = (int) Math.ceil( (double)fighter1.health / fighter2.damagePerAttack);
        if (moves1 > moves2) {
            return fighter2.name;
        } else if (moves1 < moves2) {
            return fighter1.name;
        } else {
            return firstAttacker;
        }
  }
}
