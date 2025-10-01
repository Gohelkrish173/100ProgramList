import java.util.Scanner;

public class ArmstrongNumber{
  
  public static void findArmstrong(long x){
    String y = "" + x;
    int digitCount = y.length();
    long temp = x;
    double sum = 0;

    for(int i=0;i<digitCount;i++){
      sum = sum + Math.pow(temp%10, digitCount);
      temp = temp/10;
    }

    if(sum == x) System.out.println("Given Number is Amstrong Number");
    else System.out.println("Given Number is Not Amstrong Number");
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter A Number : ");
    long x = sc.nextLong();

    findArmstrong(x);
  }
}