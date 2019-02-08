public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String temp = "";
        for(int i = 0;i<repeat;i++)
          temp += string;
        return temp;
    }
}
