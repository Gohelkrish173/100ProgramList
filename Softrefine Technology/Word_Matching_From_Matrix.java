import java.util.Scanner;

public class Word_Matching_From_Matrix {

  public static boolean word_Match_With_Matrix(char[][] x,String w){

    for(int i = 0;i<x.length;i++){
      for(int j = 0;j<x[i].length;j++){
        if(dfs(x,w,i,j,0)){
          return true;
        }
      }
    }

    return false;
  }

  public static boolean dfs(char[][] x,String w,int i,int j,int w_index){
    
    // If All Char Are Matched.
    if(w_index == w.length()){
      return true;
    }

    if(i < 0 || j<0 || i>=x.length || j>=x[0].length || x[i][j] != w.charAt(w_index)){
      return false;
    }

    char temp = x[i][j];
    x[i][j] = '#';

    boolean found = dfs(x, w, i+1, j, w_index + 1) ||
                    dfs(x, w, i-1, j, w_index + 1) ||
                    dfs(x, w, i, j+1, w_index + 1) ||
                    dfs(x, w, i, j-1, w_index + 1);

    x[i][j] = temp;

    return found;
  }

  public static void main(String[] args) {
    char[][] x = new char[3][4];

    x[0][0] = 'A';
    x[0][1] = 'B';
    x[0][2] = 'C';
    x[0][3] = 'E';

    x[1][0] = 'S';
    x[1][1] = 'F';
    x[1][2] = 'C';
    x[1][3] = 'S';

    x[2][0] = 'A';
    x[2][1] = 'D';
    x[2][2] = 'E';
    x[2][3] = 'F';

    String Word = "DE";

    System.out.println("Answer : "+word_Match_With_Matrix(x, Word));

  }
}