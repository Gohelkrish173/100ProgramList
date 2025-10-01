import java.util.Scanner;

public class N_Number_Pyramid {
 
  public static void n_Number_Pyramid(int n){
    for(int i = 0;i<n;i++){
      for(int j = n-i-1;j>=0;j--){
        System.out.print(" ");
      }
      for(int j = 0;j<=i;j++){
        System.out.print((i+1) + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter N : ");
    int n = sc.nextInt();

    n_Number_Pyramid(n);
  }
  
}