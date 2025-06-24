
public class P1{
  
  public static int maxStudent(String[][] x){

    int count = 0;

    for(int i = 0;i<x.length;i++){
      for(int j = 0;j<x[0].length;j++){
        if(x[i][j] == "."){
          if(
            checkStudent(x,i, j-1,0) &&
            checkStudent(x,i, j+1,0) &&
            checkStudent(x,i-1, j,1)
            // checkStudent(x, i, j+1, 1)
            // checkStudent(x, i-1, j-1) ||
            // checkStudent(x, i+1, j-1)
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

    return count;
  }

  public static boolean checkStudent(String[][] x,int i,int j,int side){

    if((i>=x.length || j>=x[0].length) || ( i < 0 || j < 0)){
      return true;
    }

    if(x[i][j] == "S"){
      return false;
    }

    boolean y = false;

    if(side == 1){
      y = checkStudent(x, i, j-1, 0) && checkStudent(x, i, j+1, 0);
    }

    else{
      if((x[i][j] == "#" || x[i][j] == ".")){
        y = true;
      }
    }

    return y;
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

    System.out.println(maxStudent(x));
    System.out.println(maxStudent(x1));
    System.out.println(maxStudent(x2));
    
  }

}