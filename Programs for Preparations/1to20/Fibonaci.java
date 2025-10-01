import java.text.NumberFormat.Style;
import java.util.Scanner;

public class Fibonaci {
  
  public static void Iterative(int x){
    int x1 = 0;
    int x2 = 1;
    int temp = 0;

    System.out.print(x1+" "+x2);
    temp = x1 + x2;
    for(int i = 2;i<x;i++){
      x1 = x2;
      x2 = temp;
      temp = x1 + x2;
      System.out.print(" "+x2);
    }
  };

  public static int Recursive(int x){
    if(x<=1){
      return x;
    }
    return Recursive(x-1) + Recursive(x-2);
  };

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A number : ");
    int n = sc.nextInt();

    System.out.print("Iterative Ans : ");
    Iterative(n);
    System.out.println("");
    System.out.print("Recursive Ans : ");
    for(int i = 0;i<n ;i++){
      System.out.print(Recursive(i) + " ");
    }
  }
}
