import java.util.Scanner;

public class P4_PascalTriangel {

  public static int factorial(int n){
    if(n == 0 || n == 1){
      return 1;
    }
    return n * factorial(n-1);
  }
  public static void main(String[] args){
    Scanner sc = new  Scanner(System.in);
  
    System.out.print("Enter Size : ");
    int n = sc.nextInt();
    int e = 0;

    for(int i = 0;i<n;i++){
      for(int j = (n-i-1);j>=0;j--){
        System.out.print(" ");
      }

      for(int j = 0;j<=i;j++){
        e = factorial(i) / (factorial(j)*factorial(i-j));
        System.out.print(e+" ");
      }
      System.out.println();
    }
  }
}
