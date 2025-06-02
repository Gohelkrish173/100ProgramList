import java.util.*;

public class Telephone_P2 {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Note :- \nHere Not Enter A Digit Of 0 and 1 .");

    System.out.println("Enter Size Of Array : ");
    int n = sc.nextInt();

    int[] a = new int[n];

    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
   
    printString(a);
    
  }

  public static void printString(int[] x){
    int[] n = new int[10];

    n[0] = 0;
    n[1] = 0;
    n[2] = 3; n[3] = 3; n[4] = 3; n[5] = 3; n[6] = 3; n[7] = 4; n[8] = 3; n[9] = 4;

    String[][] S = new String[10][4];
    S[2][0] = "a"; S[2][1] = "b"; S[2][2] = "c";
    S[3][0] = "d"; S[3][1] = "e"; S[3][2] = "f";
    S[4][0] = "g"; S[4][1] = "h"; S[4][2] = "i";
    S[5][0] = "j"; S[5][1] = "k"; S[5][2] = "l";
    S[6][0] = "m"; S[6][1] = "n"; S[6][2] = "o";
    S[7][0] = "p"; S[7][1] = "q"; S[7][2] = "r"; S[7][3] = "s";
    S[8][0] = "t"; S[8][1] = "u"; S[8][2] = "v";
    S[9][0] = "w"; S[9][1] = "x"; S[9][2] = "y"; S[9][3] = "z";

    for(int i = 0;i<x.length-1;i++){
      if(x.length == 1){
        for(int j = 0;j<n[x[i]];j++){
          System.out.print(S[x[i]][j] + " ");
        }
      }
      else{
        for(int l = i+1;l<x.length;l++){
          for(int j=0;j<n[x[i]];j++){
            for(int k=0;k<n[x[l]];k++){
              System.out.print(S[x[i]][j]+S[x[l]][k]+" ");
            }
          }
        }
      }
    }

  }
}
