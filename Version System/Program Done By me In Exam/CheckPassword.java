public class CheckPassword{

 public static void main(String[] args){
 	String x1 = "krish173";
	String x2 = "Krish@173";
	String x3 = "KRISH173";
	String x4 = "Kri";

	System.out.println(x1 + " is " + checkPass(x1));
	System.out.println(x2 + " is " + checkPass(x2));
	System.out.println(x3 + " is " + checkPass(x3));
	System.out.println(x4 + " is " + checkPass(x4));
 }

 public static boolean checkPass(String x){
 	if(x.length() < 8){
		return false;
	}

	boolean upper = false;
	boolean lower = false;
	boolean digit = false;
	boolean special = false;

	for(int i = 0;i<x.length();i++){
		if(Character.isUpperCase(x.charAt(i))){
			upper = true;
		}

		if(Character.isLowerCase(x.charAt(i))){
			lower = true;
		}

		if(Character.isDigit(x.charAt(i))){
			digit = true;
		}

		if(!Character.isLetterOrDigit(x.charAt(i))){
			special = true;
		}
	}

	return upper && lower && digit && special ? true : false;
 }

}