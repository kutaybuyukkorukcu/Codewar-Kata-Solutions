class Kata {
  public static String getMiddle(String word) {
    String[] dizi = word.split("");
    StringBuilder str = new StringBuilder();
    int boyut = dizi.length;
    if(boyut % 2 == 0){
      str.append(dizi[(boyut / 2) - 1]);
      str.append(dizi[(boyut / 2)]);
    }else{
      str.append(dizi[boyut / 2]);
    }
    return str.toString();
  }
}
