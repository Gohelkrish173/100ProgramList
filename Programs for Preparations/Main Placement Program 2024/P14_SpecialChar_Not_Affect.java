import java.util.Scanner;

public class P14_SpecialChar_Not_Affect {

  public static void Reverse_Without_Effect_SpecialChar(String X){
    char[] c = new char[X.length()];
    int index = 0;
    String Y = "";

    for(int i = 0;i<X.length();i++){
      if(((int)X.charAt(i) >= 65 && (int)X.charAt(i) <=90) || ((int)X.charAt(i) >= 97 && (int)X.charAt(i) <=122) ){
        c[index] = X.charAt(i);
        index++;
      }
    }

    index = index - 1;
    for(int i = 0;i<X.length();i++){
      if((int)X.charAt(i) < 65 || ((int)X.charAt(i) > 90 && (int)X.charAt(i) <97) || (int)X.charAt(i) >122){
        System.out.print(X.charAt(i));
      }
      else{
        System.out.print(c[index]);
        index = index - 1;
      }
    }
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter A String : ");
    String X = sc.nextLine();
    
    System.out.print("Reverse String Without Effect SpecialChar : ");
    Reverse_Without_Effect_SpecialChar(X);
  }
}