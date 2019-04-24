class Solution {
  public static String isSortedAndHow(int[] array) {
            final boolean ascending = array[0] < array[1];

        for (int i = 2; i < array.length; i++) {
            if (ascending ? (array[i - 1] > array[i]) : (array[i - 1] < array[i])) {
                return "no";
            }
        }

        return String.format("yes, %s", ascending ? "ascending" : "descending");
  }
}
