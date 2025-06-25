public class Exam {
  public static int result(String[][] seat){
    int r = seat.length;
    int c = seat[0].length;
    int s=0;
    boolean[][] used=new boolean[r][c];
  
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){

        if(seat[i][j]=="."){

          if(j > 0 && used[i][j-1]) continue;
          if(j < c-1 && used[i][j+1]) continue;
          if(i >0){
            if(j>0 && used[i-1][j-1])continue;
            if(j<c-1 && used[i-1][j+1])continue;
          }
          used[i][j]=true;
          seat[i][j] = "S";
          s++;
        }
     
      }
    }
  
    for (String[] strings : seat) {
      for(String y : strings){
        System.out.print(y+" ");
      }
      System.out.println();
    }

    return s;
  }

  public static void main(String[] args){
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

    System.out.println("student is:"+result(x));
    System.out.println("student is:"+result(x1));
    System.out.println("student is:"+result(x2));


  }

  }