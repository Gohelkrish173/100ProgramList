import java.util.*;

public class palindromeNumber {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int temp = x;

    int y = 0;
    while (x != 0) {
      y = (y*10) + (x%10);
      x = x/10;
      System.out.println(y);
    }

    if(y == temp){
      System.out.print("Given number is palindrome number");
    }
    else{
      System.out.print("Given number is not palindrome number" );
    }
  }
}
