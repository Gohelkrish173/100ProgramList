import java.util.Scanner;

public class P2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter N : ");
    int n = sc.nextInt();

    for(int i = 0;i<n;i++){
      for(int j = n-1-i;j>0;j--){
        System.out.print("  ");
      }
      for(int j = 0;j<n;j++){
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}