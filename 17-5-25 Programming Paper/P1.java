import java.util.Scanner;

public class P1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter N = ");
    int n = sc.nextInt();

    System.out.println("Pascal Tringle Of "+n+"");
    for(int i = 0;i<n;i++){
      for(int j =(n-i-1);j>0;j--){
        System.out.print(" ");
      }

      int Number = 1;
      //this loop for print Number's of Pascal Triangle
      for(int j = 0;j<i+1;j++){
        System.out.print(Number + " ");
        Number = Number * (i - j)/(j+1);
      }
      
      System.out.println("");
    }
  }
}