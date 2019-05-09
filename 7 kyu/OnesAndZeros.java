import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
            int number = 0;
        for (int bit : binary)
            number = number << 1 | bit;
        return number;
    }
}
