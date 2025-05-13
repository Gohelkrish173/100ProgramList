import java.util.Scanner;

public class Multiplication_Matrix {
  
  public static int[][] multplication(int[][] M1,int[][] M2,int[] m1,int[] m2){
    int[][] Ans = new int[m1[0]][m2[1]];
    int sum = 0;

    for(int i = 0;i<m1[0];i++){
      for(int j = 0;j<m2[1];j++){
        for(int k = 0;k<m2[0];k++){
          Ans[i][j] += (M1[i][k] * M2[k][j]);
        }
      }
    }
  
    return Ans;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);       
  
    System.out.println("Matrix-1 Dimension : ");
    System.out.print("m1 = ");
    int m1 = sc.nextInt();
    System.out.print("n1 = ");
    int n1 = sc.nextInt();

    System.out.println("Matrix-2 Dimension : ");
    System.out.print("m2 = ");
    int m2 = sc.nextInt();
    System.out.print("n2 = ");
    int n2 = sc.nextInt();

    if(m2 == n1){
      int[][] M1 = new int[m1][n1];
      int[][] M2 = new int[m2][n2];
  
      System.out.println("Matrix-1 :- ");
      for(int i=0;i<m1;i++){
        for(int j = 0;j<n1;j++){
          System.out.print("M1["+i+"]"+"["+j+"] = ");
          M1[i][j] = sc.nextInt();
        }
      }
  
      System.out.println("Matrix-2 :- ");
      for(int i=0;i<m2;i++){
        for(int j = 0;j<n2;j++){
          System.out.print("M2["+i+"]"+"["+j+"] = ");
          M2[i][j] = sc.nextInt();
        }
      }

      int[] one = new int[2];
      one[0] = m1;
      one[1] = n1;

      int[] two = new int[2];
      two[0] = m1;
      two[1] = n2;

      int[][] Ans = multplication(M1,M2,one,two);

      System.out.println("Final Matrix : -");
      System.out.println("[");
      for(int i = 0;i<m1;i++){
        for(int j=0;j<n2;j++){
          System.out.print(Ans[i][j] + " ");
        }
        System.out.println();
      }
      System.out.println("]");

    }
    else{
      System.out.println("This Matrixs are Not Multiplicable.");
    }
  }
}