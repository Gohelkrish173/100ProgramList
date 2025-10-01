import java.util.*;

public class Armstrong {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = n;
    int count = 0;
    int temp1 = 0;

    while (n != 0) {
      int temp = n%10;
      count += 1;
      n = n/10;
    }

    double ans = 0;
    n = x; 
    while(x != 0){
      temp1 = x%10;
      ans = ans +  Math.pow(temp1, count);
      x = x/10;
    }

    if(ans == n){
      System.out.print("Given Number is Armstrong Number.");
    }
    else{
      System.out.print("Given Number is not Armstrong Number.");
    }
  }
}
