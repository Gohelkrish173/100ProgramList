import java.util.Scanner;

public class ButterFly {
  
  public static void ButterFly(int n){
    
    for(int i = 0;i<n;i++){
      for(int j = 0;j<=i;j++){
        System.out.print("* ");
      }
      for(int j = 0;j<(2*(n-i))-2;j++){
        System.out.print("  ");
      }
      for(int j = 0;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }

    for(int i = n-1;i>=0;i--){
      for(int j = i;j>=0;j--){
        System.out.print("* ");
      }
      for(int j = (2*(n-i-1));j>0;j--){
        System.out.print("  ");
      }
      for(int j = i;j>=0;j--){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter N : ");
    int N = sc.nextInt();

    ButterFly(N);

  }
}