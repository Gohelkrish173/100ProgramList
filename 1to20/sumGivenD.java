import java.util.*;

public class sumGivenD {
  
  public static int Iterative(int x){
    int ans = 0;
    while (x != 0) {
      ans = ans + (x%10);
      x = x/10;
    }
    return ans;
  }

  public static int Recursive(int x){
    if(x == 0){
      return 0;
    }
    return (x%10) + Recursive(x/10);
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();

    System.out.println("Iterative Ans : " + Iterative(x));
    System.out.print("Recursive Ans : " + Recursive(x));
  }
}