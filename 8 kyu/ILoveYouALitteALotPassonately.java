public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
     String[] array = {"not at all", "I love you", "a little", "a lot", "passionately", "madly"};
     return array[nb_petals % 6];
    }
}
