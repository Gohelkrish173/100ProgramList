import java.util.Scanner;

public class P10_Count_Of_Given_Char {

  public static int Count_Char(String x,char c){
    int count_c = 0;

    for(int i = 0;i<x.length();i++){
      if(x.charAt(i) == c){
        count_c++;
      }
    }

    return count_c;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("String S = ");
    String S = sc.nextLine();
    System.out.print("String C = ");
    char C = sc.next().charAt(0);
  
    System.out.println("Frequency of Given Char in String : "+(Count_Char(S, C)));
  }
}
