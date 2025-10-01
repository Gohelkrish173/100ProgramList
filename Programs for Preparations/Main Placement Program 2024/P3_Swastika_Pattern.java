import java.util.Scanner;

public class P3_Swastika_Pattern {

  public static void Swastik(int n){
    for(int i = (2*n)-1;i>=0;i--){
      
      for(int j = (2*n-i);j<=n/2;j++){
        System.out.print("*");
      }
      for(int j = 0;j>=0;j--){
        System.out.print(" ");
      }
      for(int j = 0;j<n;j++){
        System.out.print("*");
      }

      System.out.println("");
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("N = ");
    int n = sc.nextInt();

    Swastik(n);
  }
}