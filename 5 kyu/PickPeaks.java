import java.util.*;

public class PickPeaks {
    
    
    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        Map map = new HashMap<String, List<Integer>>();
        List<Integer> post = new ArrayList<Integer>();
        List<Integer> peaks = new ArrayList<Integer>(); 
        int prev = 0, curr = 0;
        for(int next = 1; next < arr.length; next++){
          if (arr[next] > arr[curr]) {
            prev = curr;
            curr = next;
          } else {
              if (arr[next] < arr[curr]) {
                if (arr[prev] < arr[curr]) {
                  post.add(curr);
                  peaks.add(arr[curr]);
                }
              prev = curr;
              curr = next;
              }
            }
        }
        map.put("pos", post);
        map.put("peaks", peaks);
  
        return map;
    }
}

//Could've put lists inside the map at first 
