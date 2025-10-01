import java.util.Scanner;
import java.util.Stack;

public class p12_Adjust_Parenthesis {
 
  public static boolean stack_Parenthesis(String x){

    Stack<Character> s = new Stack<Character>();
    
    for(int i = 0;i<x.length();i++){
      if(x.charAt(i) == '{' || x.charAt(i) == '[' || x.charAt(i) == '('){
        s.push(x.charAt(i));
      }
      else{
        if(x.charAt(i) == '}' && s.peek() == '{'){s.pop();}
        else if(x.charAt(i) == ']' && s.peek() == '['){s.pop();}
        else if(x.charAt(i) == ')' && s.peek() == '('){s.pop();}
        else{
          return false;
        }
      }
    }

    if(!s.empty()){
      return false;
    }

    return true;
  }

  public static boolean array_Perenthesis(String x){
    if(x.length() % 2 != 0){
      return false;
    }

    int n = x.length();

    for(int i = 0;i<n/2;i++){
      if(x.charAt(i) == '{' && x.charAt(n-i-1) == '}'){}
      else if(x.charAt(i) == '[' && x.charAt(n-i-1) == ']'){}
      else if(x.charAt(i) == '(' && x.charAt(n-i-1) == ')'){}
      else{
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter Perenthesis String : ");
    String p = sc.nextLine();

    System.out.println("Paranthesis is Adjust using Stack : "+stack_Parenthesis(p));
    System.out.print("Paranthesis is Adjust using Array : "+array_Perenthesis(p));
  }
}