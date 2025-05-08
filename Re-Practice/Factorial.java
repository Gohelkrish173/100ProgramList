import java.util.Scanner;

public class Factorial {
  
  public static long Factorial_Itterative(int n){
    long out = 1;
    while(n > 0){
      out = out * n;
      n--;
    }
    
    return out;
  }

  public static long Factorial_Recursive(int n){
    if(n == 1 || n == 0){
      return 1;
    }
    return n * Factorial_Recursive(n-1);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Gives Number For Find Factorial : ");
    int x = sc.nextInt();

    System.out.println("Factorial Itterative : ");
    System.out.println(Factorial_Itterative(x));

    System.out.println("---------------------------------------");

    System.out.println("Factorial Recursive : ");
    System.out.println(Factorial_Recursive(x));
  }  
}
