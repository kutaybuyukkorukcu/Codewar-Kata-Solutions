public class GiftSorter{
  public String sortGiftCode(String code){
        char[] chars = code.toCharArray();
    java.util.Arrays.sort(chars);
    return new String(chars);
  }
}
