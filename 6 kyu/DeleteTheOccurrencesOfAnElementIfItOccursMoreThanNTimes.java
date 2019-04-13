import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer,Integer> itemNumberOccurence = new HashMap();
        List<Integer> result = new ArrayList();

        for(int item : elements)
        {
            if(itemNumberOccurence.containsKey(item))
            {
                itemNumberOccurence.put(item, itemNumberOccurence.get(item) + 1);
            }
            else
            {
                itemNumberOccurence.put(item, 1);
            }

            if(itemNumberOccurence.get(item).intValue() <= maxOccurrences)
            {
                result.add(item);
            }
        }
        int[] arr = new int[result.size()];
        Object[] obj = new Object[result.size()];
        obj = result.toArray();
        for(int l = 0;l<arr.length;l++){
          arr[l] = (int)obj[l];
        }
        return arr;
	}
}

//chkd
