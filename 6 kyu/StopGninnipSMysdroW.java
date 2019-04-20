import java.util.*;
public class SpinWords {
  public String spinWords(String sentence) {
    String[] seq = sentence.split(" ");
    String input = "";
    for(int i = 0; i < seq.length; i++){
      if(seq[i].length() > 4) {
        for(int k = seq[i].length() - 1; k >= 0; k--){
            input += seq[i].charAt(k);
        }
      seq[i] = input;
	input = "";
      }
    }
    input = "";
    for(int j = 0; j < seq.length; j++){
	input += seq[j] + " ";
    }
	return input.trim();
  }
}

//chkd
