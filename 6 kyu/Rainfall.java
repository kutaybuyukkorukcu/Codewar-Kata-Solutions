import java.util.*;

public class Rainfall {

    public static double mean(String town, String strng) {
        if (town == null || strng == null) {
            return 0d;
        }
        double[] townTemp = getTownTemp(town, strng);
        if (townTemp.length == 0) {
            return -1d;
        }
        return Arrays.stream(townTemp).average().getAsDouble();
    }

    public static double variance(String town, String strng) {
        if (town == null || strng == null) {
            return 0d;
        }
        double[] townTemp = getTownTemp(town, strng);
        if (townTemp.length == 0) {
            return -1d;
        }
        double average = Arrays.stream(townTemp).average().getAsDouble();
        double variance = Arrays.stream(townTemp)
                .map(p -> (p - average) * (p - average))
                .sum() / townTemp.length;
        return variance;
    }

    private static double[] getTownTemp(String town, String strng) {
        String[] lines = strng.split("\n");
        String resultLine = null;
        for (String line : lines) {
            if (line.startsWith(String.format("%s:", town))) {
                resultLine = line;
                break;
            }
        }

        List<Double> temps = new ArrayList<>();
        if (resultLine != null) {
            resultLine = resultLine.replace(',', ' ');
            Scanner scanner = new Scanner(resultLine);
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    temps.add(scanner.nextDouble());
                } else {
                    scanner.next();
                }
            }
        }
        double[] resultArray = temps.toArray(new double[temps.size()]);
        return resultArray;
    }
}

// el aticam ref.
