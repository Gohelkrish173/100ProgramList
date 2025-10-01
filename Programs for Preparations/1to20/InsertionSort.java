import java.util.*;

public class InsertionSort {
  public static int[] insertion(int[] x){
    for(int i = 1;i< x.length;i++){
      int key = x[i];
      int j = i - 1;

      while (j >= 0 && x[j]>key) {
        x[j+1] = x[j];
        j = j-1;
      }
      x[j+1] = key;
    }

    return x;
  }

  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);

    System.out.print("Enter a Number : ");
    int n = sc.nextInt();

    int[] x = new int[n];

    for(int i = 0;i<n;i++){
      System.out.print("x["+i+"] : ");
      x[i] = sc.nextInt();
    }

    x = insertion(x);

    System.out.print("[");
    for(int j = 0;j<x.length;j++){
      System.out.print(x[j] + " ");
    }
    System.out.print("]");
  }
}
