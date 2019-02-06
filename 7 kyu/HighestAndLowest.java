public class Kata {
	public static String HighAndLow(String numbers) {
	  int temp = 0,max = 0,min = 0;
	  String[] numString = numbers.split(" ");
	  int[] dizi = new int[numString.length];
	  for(int i = 0;i<numString.length;i++)
	   dizi[i] = Integer.parseInt(numString[i]);
		max = dizi[0];
		min = dizi[dizi.length-1];
		for(int i = 0;i<dizi.length;i++){
			if(max < dizi[i]){ // max 
			  temp = dizi[i];
				dizi[i] = max;
				max = temp;  
			}
			if(dizi[i] < min){ // min
				temp = min;
				min = dizi[i];
			  dizi[i] = temp;
			}
		}
		return max + " " + min;
	}
}
