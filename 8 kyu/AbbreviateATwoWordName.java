public class AbbreviateTwoWords {
 public static String abbrevName(String name) {
        String[] str = name.split(" ");
        return str[0].substring(0, 1).toUpperCase().concat("."+ str[1].substring(0, 1).toUpperCase());
    }
}
