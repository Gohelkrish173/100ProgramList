import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Fibonaci {
  
  public static void Fibo_Itterative(int x){
    int x1 = 0;
    int x2 = 1;
    int temp = 0;

    System.out.print(x1 + " ");
    System.out.print(x2 + " ");

    for(int i = 2;i<x;i++){
      temp = x1 + x2;
      System.out.print(temp + " ");
      x1 = x2;
      x2 = temp;
    }
  }

  public static int Fibo_Recursive(int x){
    if(x<=1){
      return x;
    }
    return Fibo_Recursive(x-1)+Fibo_Recursive(x-2);
  }

  public static void Fibo_Recursive_Print(int i,int x){
    if(i>=x){
      return ;
    }
    System.out.print(" "+Fibo_Recursive(i));
    Fibo_Recursive_Print(i+1, x);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Length Of Fibonaci Number : ");
    int x = sc.nextInt();

    System.out.println("Fibonaci Series Itterative : ");
    Fibo_Itterative(x);
    
    System.out.println("\n--------------------------------");

    System.out.println("Fibonaci Series Recursive : ");
    Fibo_Recursive_Print(0,x);
  }  
}
