public class DnaStrand {
  public static String makeComplement(String dna) {
    StringBuilder str = new StringBuilder();
    for(int i = 0; i < dna.length(); i++){
      if(dna.charAt(i) == 'A')
        str.append("T");
      else if(dna.charAt(i) == 'T')
        str.append("A");
      else if(dna.charAt(i) == 'G')
        str.append("C");
      else
        str.append("G");
    }  
    return str.toString(); 
  }
}
