import java.util.*;

public class Factor {
  
  public static void Iterative(int x){
    for(int i = 1;i<=x;i++){
      if(x%i == 0){
        System.out.print(i+" ");
      }
    }
  }

  public static void Recursive(int x,int i){
    if(i > x){
      return ;
    }
    if( x % i == 0){
      System.out.print(i+" ");
    }
    Recursive(x, i+1);
  }
  
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);

    int x = sc.nextInt();

    System.out.print("Iterative Factors : ");
    Iterative(x);
    
    System.out.println();

    System.out.print("Recursive Factors : ");
    Recursive(x,1);
  }
}
