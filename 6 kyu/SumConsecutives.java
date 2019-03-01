import java.util.*;

public class Consecutives {
    
	public static List<Integer> sumConsecutives(List<Integer> s) {
		List<Integer> sumList =  new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < s.size(); i ++) {
			if (i < s.size() - 1 && s.get(i) == s.get(i + 1))
				if (sum == 0) sum = s.get(i) + s.get(i + 1);
				else sum = sum + s.get(i + 1);
			else
				if (sum == 0) sumList.add(s.get(i));
				else{
					sumList.add(sum);
					sum = 0;
			  }
		}
		return sumList;
	}
}
