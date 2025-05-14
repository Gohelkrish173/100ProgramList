import java.util.Scanner;

public class DecimalToBCD{

  public static String singleDigitBinary(int n){
    if(n == 0){
      return "0000";
    }
    String singleBCD = "";

    for(int i=3;i>=0;i--){
      int bit = (n >> i) & 1;
      singleBCD += bit;
    }

    return singleBCD;
  }

  public static String dtObcd(int n){
    int x = n;
    int[] digit = new int[10];
    int count = 0;
    String Ans = "";

    while(x !=0){
      digit[count] = x%10;
      x= x/10;
      count++;
    }

    for(int i=count-1;i>=0;i--){
      Ans = Ans + singleDigitBinary(digit[i]) + " ";
    }

    return Ans;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number which you want to convert into bcd : ");
    int n = sc.nextInt();

    System.out.print("BCD : "+dtObcd(n));
  }
}