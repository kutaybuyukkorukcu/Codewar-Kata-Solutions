public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        for (String letter : str2.split("")) {
            if (str1.contains(letter)) {
                str1 = str1.replaceFirst(letter, "");
            } else return false;
        }
        return true;
    }
}
