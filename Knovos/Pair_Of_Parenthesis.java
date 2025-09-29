public class Pair_Of_Parenthesis {
  public static void main(String[] args) {
    String A = "(()";

    System.out.println("Count of Possible Pair Parenthesis : "+possible_Parenthesis(A));
  } 

  public static int possible_Parenthesis(String a){
    
    int c = 0;

    for(int i =0 ;i< a.length();i++){
      if(a.charAt(i) == '('){
        c++;
      }
    }

    return c;
  }
}