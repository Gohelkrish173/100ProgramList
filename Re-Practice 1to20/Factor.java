import java.util.Scanner;

public class Factor{

  public static void Factor_Itterative(int n){
    
    for(int i=1;i<=n;i++){
      if(n%i == 0){
        System.out.print(i + " ");
      }
    }
  
  }

  public static void Factor_Recursive(int n,int i){
    if(i>n){
      return ;
    }
    if( n % i ==0){
      System.out.print(i+" ");
    }
    Factor_Recursive(n,i+1);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number For Factor");
    int n = sc.nextInt();

    System.out.println("Factors Itterative : ");
    Factor_Itterative(n);

    System.out.println("\n-------------------------");

    System.out.println("Factors Recursive : ");
    Factor_Recursive(n, 1);


  }
}