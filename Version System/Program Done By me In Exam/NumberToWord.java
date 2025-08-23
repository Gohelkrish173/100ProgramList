public class NumberToWord{

public static void main(String[] args){
   String[] unit = {"","One","Two","Three","Four","Five","Six","Seven","Eight",
		   "Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen"
		   ,"Sixteen","Seventeen","Eigthteen","Nineteen"};

   String[] tens = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy",
		   "Eighty","Ninety"};

   int number = 512;
   int temp = number;
   String Ans = "";

   while(number != 0){
   	
	if(number >= 1000){
		Ans += unit[(int)(number / 1000)] + " Thousand ";
		number = number % 1000;
	}

	if(number >= 100){
		Ans += unit[(int)(number / 100)] + " Hundred ";
		number = number % 100;
	}

	if(number >= 0){
		if(number <20){
			Ans += unit[number];
			number = 0;	
		}
		else{
			Ans += tens[(int)(number / 10)];
			number = number % 10;
		}
	}
   }

   System.out.println(temp +" in word is "+Ans);
 }

}