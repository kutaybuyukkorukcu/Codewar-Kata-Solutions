// https://www.codewars.com/kata/554ca54ffa7d91b236000023

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer,Integer> itemNumberOccurence = new HashMap();
        List<Integer> result = new ArrayList();

        for(int item : elements) {
            if(itemNumberOccurence.containsKey(item)) 
                itemNumberOccurence.put(item, itemNumberOccurence.get(item) + 1);
            else 
                itemNumberOccurence.put(item, 1);
            

            if(itemNumberOccurence.get(item).intValue() <= maxOccurrences)
                result.add(item);
        }

        int[] arr = new int[result.size()];
        arr = result.toArray(arr);
        return arr;
	}
}

// 🧙‍♂️👍