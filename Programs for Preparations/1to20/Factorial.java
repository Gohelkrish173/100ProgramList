import java.util.*;

public class Factorial {
  
  public static int Iterative(int x){
    int y = 1;
    for(int i = x;i>0;i--){
      y = y*i;
    }
    return y;
  }

  public static int Recursive(int x){
    if(x == 0 || x == 1){
      return x*1;
    }
    return x * Recursive(x-1);
  }
  
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);

    int x = sc.nextInt();

    System.out.print("Iterative Factorial : "+Iterative(x));
    
    System.out.println();

    System.out.print("Recursive Factorial : " + Recursive(x));
  }
}

