import java.util.Scanner;

public class Zigzag {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter A String : ");
    String S = sc.nextLine();
    System.out.print("Enter a Number Of Rows : ");
    int N = sc.nextInt();

    System.out.println("With String : "+convert_Without_StringBuilder(S, N));
    System.out.println("With StringBuilder : "+convert_With_StringBuilder(S, N));

  }

  // in Java, String is immutable, which means every time you modify or append a String, a new object is created in memory. So yes, when    you write: main = main + S[j]; It does not append to the existing main String in-place. Instead, Java:

  //1. Creates a new String that is the result of main + S[j].
  //2. Reassigns that new String to the main reference.
  //3. Discards the old main String object (if no other references exist).

  //✅ Does it work?
  // Yes, your code works correctly. But from a performance point of view, this is inefficient, especially when dealing with long strings or many concatenations.

  public static String convert_Without_StringBuilder(String s,int numRows){
    String main = "";

    String[] S = new String[numRows];
    boolean b = false;
    int index = 0;

    for(int i = 0;i<numRows;i++){
      S[i] = "";
    }

    for(char c : s.toCharArray()){
      if(b == false){
        S[index] = S[index] + c;
        if(index == (numRows - 1)){
          b = true;
          index--;
        }
        else{
          index++;
        }
      }
      else{
        S[index] = S[index] + c;
        if(index == 0){
          b = false;
          index++;
        }
        else{
          index--;
        }
      }
    }

    for(int i = 0;i<numRows;i++){
      main += S[i];
    }

    return main;
  }

  // Better Way :-
  // Use StringBuilder, which is mutable and designed for efficient string manipulation

  public static String convert_With_StringBuilder(String s,int numRows){
    boolean b = false;
    int index = 0;
    
    StringBuilder[] S = new StringBuilder[numRows];
    
    for(int i = 0;i<numRows;i++){
      S[i] = new StringBuilder();
    }

    for(char c : s.toCharArray()){
      if(b == false){
        S[index].append(c);
        if(index == (numRows - 1)){
          b = true;
          index--;
        }
        else{
          index++;
        }
      }
      else{
        S[index].append(c);
        if(index == 0){
          b = false;
          index++;
        }
        else{
          index--;
        }
      }
    }

    StringBuilder main = new StringBuilder();

    for(int i = 0;i<numRows;i++){
      main.append(S[i]);
    }

    return main.toString();
  }
}
