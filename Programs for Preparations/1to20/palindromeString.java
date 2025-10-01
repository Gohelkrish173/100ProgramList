import java.util.*;

public class palindromeString {

  public static String palindrome(String x){
    Stack<Character> s = new Stack<Character>();
    String y = "";

    for(int i=0;i<x.length();i++){
      s.push(x.charAt(i));
      System.out.println(s);
    }

    while (!s.isEmpty()) {
      y = y + s.pop(); 
      System.out.println(y);     
    }

    return y;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String x = sc.next();
    
    String z = palindrome(x);
    System.out.println(x.compareTo(z) == 0 ? z+"Given string is palindrome string"+x:z+"Given string is not palindrome string"+x);

    String y = x;
    for(int i = x.length()-1;i>=0;i--){
      y += x.charAt(i);
    }

    if(x.compareTo(y) == 0){
      System.out.print("Given string is palindrome");
    }
    else{
      System.out.print("Given string is not palindrome");
    }
  }
}
