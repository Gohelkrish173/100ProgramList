import java.util.Scanner;

public class Palindrome_Pyramid {
 
  public static void palindrome_pyramid(int n){
    for(int i = 0;i<n;i++){
      for(int j = n-i-1;j>0;j--){
        System.out.print("  ");
      }
      for(int j = i+1;j>0;j--){
        System.out.print(j + " ");
        if(j == 1){
          for(int k = j+1;k<=i+1;k++){
            System.out.print(k + " ");
          }
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter N : ");
    int n = sc.nextInt();

    palindrome_pyramid(n);
  }
}