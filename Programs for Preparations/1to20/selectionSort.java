import java.util.*;

public class selectionSort {
  public static int[] selectionSort(int[] x){
    int v = 0;
    int in = 0;
    for(int i = 0;i<x.length;i++){
      v = x[i];
      in = i;
      for(int j = i;j<x.length;j++ ){
        if(v>x[j]){
          v = x[j];
          in = j; 
        }
      }
      x[in] = x[i];
      x[i] = v;
    }
    return x;
  };
  
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);

    System.out.print("Enter a Number : ");
    int n = sc.nextInt();

    int[] x = new int[n];

    for(int i = 0;i<n;i++){
      System.out.print("x["+i+"] : ");
      x[i] = sc.nextInt();
    }

    x = selectionSort(x);

    System.out.print("[");
    for(int j = 0;j<x.length;j++){
      System.out.print(x[j] + " ");
    }
    System.out.print("]");
  } 
}