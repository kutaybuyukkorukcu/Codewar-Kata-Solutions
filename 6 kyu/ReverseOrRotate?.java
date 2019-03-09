import java.util.*;
public class RevRot {
    public static String revRot(String str, int sz) {
    	if (sz <= 0 || str == null || str.equals("") || str.length() < sz) return "";    	
    	ArrayList<String> chunks = new ArrayList<String>();
    	int begin = 0;
    	int end = sz;
    	while (begin < str.length() && end <= str.length()) {
    		chunks.add(str.substring(begin, end));
    		begin += sz;
    		end += sz;
    	}
    	StringBuilder strMod = new StringBuilder();
    	for (String chunk : chunks) {
    		int sum = 0;
        	for (int i = 0; i < chunk.length(); i++) {
        		sum += Character.getNumericValue(chunk.charAt(i)) * Character.getNumericValue(chunk.charAt(i)) * Character.getNumericValue(chunk.charAt(i));
        	}
        	if (sum % 2 == 0) {
        		strMod.append(reverse(chunk));
        	}
        	else {
        		strMod.append(rotate(chunk));
        	}
    	}
    	
    	return strMod.toString();
    }
    
    private static String reverse(String str) {
    	StringBuilder reversedStr = new StringBuilder();
		  for (int i = str.length() - 1; i >= 0; i--) {
			  reversedStr.append(str.charAt(i));
		  }
    	return reversedStr.toString();
    }
    
    private static String rotate(String str) {
    	StringBuilder rotatedStr = new StringBuilder();
    	rotatedStr.append(str.substring(1) + str.substring(0, 1));
    	return rotatedStr.toString();
    }
}
