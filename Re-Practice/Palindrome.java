import java.util.Scanner;
import java.util.Stack;

public class Palindrome{
  
  public static boolean Palindrome_For_Number(int n){
    String N = "" + n;
    int count = N.length();

    for(int i = 0;i<=count/2;i++){
      if(N.charAt(i) == N.charAt(count-1-i)){}
      else{
        return false;
      }
      if(i==count/2){
        return true;
      }
    }

    return false;
  }

  public static boolean Palindrome_For_Number_1(int n){
    int N = n;

    int y = 0;
    while (N != 0) {
      y = (y*10) + (N%10);
      N = N/10;
    }

    if(y == n){
      return true;
    }
    else{
      return false;
    }
  }

  public static boolean Palindrome_For_String(String S){
    int count = S.length();

    for(int i = 0;i<=count/2;i++){
      if(S.charAt(i) == S.charAt(count-1-i)){}
      else{
        return false;
      }
      if(i==count/2){
        return true;
      }
    }

    return false;
  }

  public static boolean Palindrome_For_String_1(String x){
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

    if(x.equals(y)){
      return true;
    }
    else{
      return false;
    }

  }

  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);

    System.out.println("which type of Palindrome you find : ");
    System.out.println("1.Number  2.String");
    int x = sc.nextInt();
    sc.nextLine();

    switch (x) {
      case 1 :  int n = sc.nextInt();
                if(Palindrome_For_Number(n) && Palindrome_For_Number_1(n)){
                  System.out.println("Number is Palindrome");
                }
                else{
                  System.out.println("Number is Not Palindrome");
                }
        break;
      case 2 : 
                String s = sc.nextLine();
                if(Palindrome_For_String(s) && Palindrome_For_String_1(s)){
                  System.out.println("String is Palindrome");
                }
                else{
                  System.out.println("String is Not Palindrome");
                }
        break;
    }
    
  }
}