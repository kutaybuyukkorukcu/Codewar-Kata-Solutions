// https://www.codewars.com/kata/55c45be3b2079eccff00010f

public class Order {
    public static String order(String words) {
    if (words == "")
      return "";
    String[] sort = words.split(" ");
    String output = "";
    for (int i = 1; i < 10; i++)
      for (String o : sort)
        if (o.contains(Integer.toString(i)))
          output += o + " ";
    output = output.trim();
    return output;
  }
}

// 🧙‍♂️👍