import java.util.Scanner;

public class P9_Recursive_Fibonacci {
  
  public static int recursive_Fibonacci(int n){
    if(n<=1){
      return n;
    }
    return recursive_Fibonacci(n-1) + recursive_Fibonacci(n-2);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("n = ");
    int n = sc.nextInt();

    for(int i = 0;i<n;i++){
      System.err.print(recursive_Fibonacci(i)+" ");
    }
  }
}
