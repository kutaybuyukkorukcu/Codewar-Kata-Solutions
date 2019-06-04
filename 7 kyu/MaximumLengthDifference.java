class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
       if(a1.length == 0 || a2.length == 0) return -1;
    int maxLength = 0;
    for(String a1String: a1) {
      for(String a2String: a2) {
        int difference = Math.abs(a1String.length() - a2String.length());
        if(difference > maxLength) maxLength = difference;
      }
    }
    return maxLength;
    }
}
