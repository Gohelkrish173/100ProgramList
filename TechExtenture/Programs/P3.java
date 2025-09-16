import java.util.*;

// Balance Parenthesis

public class P3 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.print("Input String : ");
      String x = sc.nextLine();

      boolean valid = checkParenthesis(x);
      if(valid) System.out.println("Valid.");
      else System.out.println("Invalid.");

    }

    public static boolean checkParenthesis(String x) {

      Stack<Character> S = new Stack<Character>();

      try{
        for(char a : x.toCharArray()){
          if(a == '{' || a == '(' || a == '['){
            S.push(a);
          }
          else if(a == '}' || a == ')' || a == ']'){
            if(a == '}' && S.peek() == '{'){
              S.pop();
            }
            else if(a == ')' && S.peek() == ')'){
              S.pop();
            }
            else if(a == ']' && S.peek() == '['){
              S.pop();
            }
          }
        }
      }
      catch(EmptyStackException e){
        return false;
      }

      if(S.isEmpty()) return true;
      else return false;

    }

}