import java.util.*;

public class palindromeString {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String x = sc.next();

    String y = x;
    for(int i = x.length()-1;i>=0;i--){
      y += x.charAt(i);
    }

    if(x == y){
      System.out.print("Given string is palindrome");
    }
    else{
      System.out.print("Given string is not palindrome");
    }
  }
}
