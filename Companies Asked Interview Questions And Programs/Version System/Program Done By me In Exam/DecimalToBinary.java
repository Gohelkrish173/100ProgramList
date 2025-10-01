public class DecimalToBinary{

 public static void main(String[] args){
 	int x = 122; // it's binary is 1111010
	
	binary(x); 

 }

 public static void binary(int x){
 	int[] y = new int[32];
	int index = 0;

	while(x != 0){
		y[index++] = x%2;
		x = x/2;
	}

	for(int i = index-1;i>=0;i--){
		System.out.print(y[i]);
	}
 }

}