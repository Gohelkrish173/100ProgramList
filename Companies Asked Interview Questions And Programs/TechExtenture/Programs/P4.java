import java.util.*;

// given A N*M Matrix Rotate Matrix into 90 Degree

public class P4 {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter N : ");
    int N = sc.nextInt();

    System.out.print("Enter M : ");
    int M = sc.nextInt();

    int[][] x = new int[N][M];

    for(int i = 0;i<N;i++){
      for(int j = 0;j<M;j++){
        System.out.print("x["+i+"]["+j+"] = ");
        x[i][j] = sc.nextInt();
      }
    }

    System.out.println("Before 90 Degree Convertion.");

    for(int i = 0;i<N;i++){
      for(int j = 0;j<M;j++){
        System.out.print(x[i][j] + " ");
      }
      System.out.println("");
    }

    int[][] ans = convert90(N,M,x);

    System.out.println("After 90 Degree Convertion.");

    for(int i = 0;i<M;i++){
      for(int j = 0;j<N;j++){
        System.out.print(ans[i][j] + " ");
      }
      System.out.println("");
    }

  }

  public static int[][] convert90(int N,int M,int[][] x){

    int[][] y = new int[M][N];
    int xi = 0;
    int yi = 0;

    for(int i = 0;i<M;i++){
      for(int j = N-1;j>=0;j--){
        y[xi][yi++] = x[j][i];
      }
      xi++;
      yi=0;
    }

    return y;
  }

}