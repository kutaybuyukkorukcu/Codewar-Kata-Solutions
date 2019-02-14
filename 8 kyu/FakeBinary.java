public class FakeBinary {
    public static String fakeBin(String numberString) {
        char c[] = numberString.toCharArray();
        for (int i = 0; i < c.length; i++)
          c[i] = c[i] < '5' ? '0' : '1';
        return new String(c);
    }
}
