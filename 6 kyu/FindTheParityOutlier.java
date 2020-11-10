// https://www.codewars.com/kata/5526fc09a1bbd946250002dc

public class FindOutlier{
  static int find(int[] integers) {
        int even = 0;
        int odd = 0;
        int cycle = 0;

        for(Integer value : integers) {
            if(value % 2 == 0) {
                cycle++;
                even = value;
            }else {
                odd = value;
            }
        }
        return (cycle > 1) ? odd : even;
    }
}

// 🧙‍♂️👍