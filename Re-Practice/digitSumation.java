import java.util.Scanner;

public class digitSumation {
  
  public static int digitsum_Itterative(int n){
    int out = 0;
    while(n > 0){
      out = out + (n%10);
      n = n/10;
    }

    return out;
  }

  public static int digitsum_Recursive(int n){
    if(n == 0){
      return 0;
    }
    return (n%10) + digitsum_Recursive(n/10);
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Digit :");
    int x = sc.nextInt();

    System.out.println("Digit Sum Recursively : "+digitsum_Itterative(x));

    System.out.println("---------------------------------");

    System.out.println("Digit Sum Recursively : "+digitsum_Recursive(x));
  }
}
