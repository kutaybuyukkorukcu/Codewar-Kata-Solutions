public class Line {
public static String Tickets(int[] peopleInLine) {
        int $25 = 0;
        int $50 = 0;
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) $25++;
            if (peopleInLine[i] == 50) {
                $25--;
                $50++;
            }
            if (peopleInLine[i] == 100) {
                if ($50 > 0) {
                    $50--;
                    $25--;
                } else 
                    $25 -= 3;
            }
            if ($25 < 0) return "NO";
        }
        return "YES";
    }
}

//chkd
