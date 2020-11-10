// https://www.codewars.com/kata/5266876b8f4bf2da9b000362

class Solution {
  public static String whoLikesIt(String... names) {
	  int count = names.length;
	  String r = "";	
	  if(count>=4){
		  r = names[0] + ", " + names[1] + " and " + (count - 2) + " others like this"; 
    }else if(count == 1){
		  r = names[0] + " likes this";
    }else if(count == 2){
      r = names[0] + " and " + names[1] + " like this";
    }else if(count == 3){
      r = names[0] + ", " + names[1] + " and " + names[2] + " like this";
    }else if(count == 0){
      r = "no one likes this";
    }
	return r;
  }
}

// 🧙‍♂️👍
