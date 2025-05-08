import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseWord {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x = "";

    String S = sc.nextLine();
    S = S.trim();
    System.out.println("S with trim " + S);

    ArrayList A = new ArrayList();

    Stack St = new Stack();

    for(int i=0;i<S.length();i++){
      if(S.charAt(i) != ' '){
        x = x + S.charAt(i);
      }
      else{
        A.add(x);
        St.push(x);
        x = "";
        if(S.charAt(i + 1) == ' '){
          i = i+1;
        }
      }

      if(i+1 == S.length()){
        A.add(x);
        St.push(x);
        x = "";
      }

    }

    int n = A.size();

    System.out.print("Using ArrayList : ");

    for(int i = n-1;i>=0;i--){
      if(i == 0){
        System.out.println(A.get(i));
      }
      else{
        System.out.print(A.get(i) + " ");
      }
    }

    String ans = "";
    while (!St.empty()) {
      ans = ans + St.pop() + " ";
      if(St.empty()){
        ans = ans.trim();
      }
    }

    System.out.println("Reverse Using Stack : " + ans);

  }  
}
