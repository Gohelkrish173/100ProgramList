import java.util.*;

public class MultiplyMatrix {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("m1 : ");
    int m1 = sc.nextInt();
    System.out.print("n1 : ");
    int n1 = sc.nextInt();

    int[][] x1 = new int[m1][n1];

    System.out.print("m2 : ");
    int m2 = sc.nextInt();
    System.out.print("n2 : ");
    int n2 = sc.nextInt();

    int[][] x2 = new int[m2][n2];

    int[][] x3 = new int[m1][n2];
    if(m1 == n2){
      System.out.print("m3 : ");
      int m3 = m1;
      System.out.println("n3 : ");
      int n3 = n2;
    }
    else{
      System.out.println("dimention for multiplication is not valid.");
    }

    for(int i = 0 ;i<m1;i++){
      for(int j = 0 ;j<n1;j++){
        System.out.println("x1["+i+"]["+j+"] : ");
        x1[i][j] = sc.nextInt();
      }
    }

    System.out.println("--------------------");

    for(int i = 0 ;i<m2;i++){
      for(int j = 0 ;j<n2;j++){
        System.out.println("x2["+i+"]["+j+"] : ");
        x2[i][j] = sc.nextInt();
      }
    }
    int ans = 0;
    for(int i=0;i<m1;i++){
      for(int j=0;j<n2;j++){     
        for(int k=0;k<n1;k++){
          x3[i][j] += x1[i][k]*x2[k][j];
        }
      }
    }

    System.out.println("-------------------- Final Matrix");
    System.out.println("[");
    for(int i = 0 ;i<m1;i++){
      for(int j = 0 ;j<n2;j++){
        System.out.print(x3[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("]");

  }
}
