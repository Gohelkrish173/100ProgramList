import java.util.Arrays;

public class P1{
  
  public static int maxStudent_Row_Wise(String[][] X){

    String[][] x = new String[X.length][X[0].length];
    for (int i = 0; i < X.length; i++) {
        x[i] = Arrays.copyOf(X[i], X[i].length);
    }

    int count = 0;

    for(int i = 0;i<x.length;i++){
      for(int j = 0;j<x[0].length;j++){
        if(x[i][j].equals(".")){
          if(
            checkStudent(x,i, j-1) &&
            checkStudent(x,i, j+1) &&
            checkStudent(x,i-1, j-1) &&
            checkStudent(x,i-1, j+1) &&
            checkStudent(x,i+1, j-1) &&
            checkStudent(x,i-1, j+1)
          ){
            count++;
            x[i][j] = "S";
          }
        }
      }
    }

    for (String[] strings : x) {
      for(String s : strings){
        System.out.print(s+" ");
      }
      System.out.println();
    }
    System.out.println("-----------------------------");

    return count;
  }

  public static int maxStudent_Column_Wise(String[][] X){

    String[][] x = new String[X.length][X[0].length];
    for (int i = 0; i < X.length; i++) {
        x[i] = Arrays.copyOf(X[i], X[i].length);
    }

    int count = 0;

    for(int i = 0;i<x[0].length;i++){
      for(int j = 0;j<x.length;j++){
        if(x[j][i].equals(".")){
          if(
            checkStudent(x,j, i-1) &&
            checkStudent(x,j, i+1) &&
            checkStudent(x,j-1, i-1) &&
            checkStudent(x,j-1, i+1) &&
            checkStudent(x,j+1, i-1) &&
            checkStudent(x,j+1, i+1)
          ){
            count++;
            x[j][i] = "S";
          }
        }
      }
    }

    for (String[] strings : x) {
      for(String s : strings){
        System.out.print(s+" ");
      }
      System.out.println();
    }
    System.out.println("-----------------------------");

    return count;
  }

  public static boolean checkStudent(String[][] x,int i,int j){

    if((i>=x.length || j>=x[0].length) || ( i < 0 || j < 0)){
      return true;
    }

    if(x[i][j] == "S"){
      return false;
    }
    else{
      return true;
    }
  }

  public static void main(String[] args) {
    String[][] x = {
      {".","#"},
      {"#","#"},
      {"#","."},
      {"#","#"},
      {".","#"}
    };

    String[][] x1 = {
      {"#",".","#","#",".","#"}, {".","#","#","#","#","."}, {"#",".","#","#",".","#"}
    };

    String[][] x2 = {
      {"#",".",".",".","#"},
      {".","#",".","#","."},
      {".",".","#",".","."},
      {".","#",".","#","."},
      {"#",".",".",".","#"}
    };

    // String[][] x3 ={
    //   {"#",".","."},
    //   {"#",".","."},
    //   {".","#","#"}
    // };

    int CXR = maxStudent_Row_Wise(x);
    int CXC = maxStudent_Column_Wise(x);

    int cx = CXR >= CXC ? CXR : CXC;


    // ---------------------------------------------

    int CX1R = maxStudent_Row_Wise(x1);
    int CX1C = maxStudent_Column_Wise(x1);

    int cx1 = CX1R >= CX1C ? CX1R : CX1C;

    // ----------------------------------------------

    int CX2R = maxStudent_Row_Wise(x2);
    int CX2C = maxStudent_Column_Wise(x2);

    int cx2 = CX2R >= CX2C ? CX2R : CX2C;

    // ----------------------------------------------

    // int CX3R = maxStudent_Row_Wise(x3);
    // int CX3C = maxStudent_Column_Wise(x3);

    // int cx3 = CX3R >= CX3C ? CX3R : CX3C;

    System.out.println(cx);
    System.out.println(cx1);
    System.out.println(cx2);
    // System.out.println(cx3);
    
  }

}