import java.util.Scanner;

public class P7_Reverse_Fibonacci {

  public static int[] Fibonacci(int n){
    int[] ans = new int[n];
    int a = 0;
    int b = 1;

    ans[0] = 0;
    ans[1] = 1;

    for(int i = 2;i<n;i++){
      ans[i] = a + b;
      a = b;
      b = ans[i];
    }

    return ans;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("n : ");
    int n = sc.nextInt();

    int[] ans = Fibonacci(n);

    System.out.println("Reverse Fibonacci : ");
    for(int i = n-1;i>=0;i--){
      System.out.print(ans[i] + " ");
    }
  }  
}
