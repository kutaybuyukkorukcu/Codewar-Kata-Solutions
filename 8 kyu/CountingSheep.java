public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int count = 0;
        for (Boolean element: arrayOfSheeps) {
            if (element != null && element) {
                count++;
            }
        }
        return count;
  }}
