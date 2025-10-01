import java.util.*;

public class digitToBCD {
  public static void BCD(int x){
    Stack<Integer> s = new Stack<Integer>();
    while (x != 0) {
      s.push(x%2);
      x = x/2;
    }

    while (!s.isEmpty()) {
      System.out.print(s.pop());
    }
  };

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a Number : ");
    int x = sc.nextInt();

    System.out.print("BCD of "+x+" : ");
    BCD(x);
  }
}
