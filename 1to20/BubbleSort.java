import java.util.*;

public class BubbleSort {
  
  public static int[] Bubble(int[] x){
    int temp = 0;
    for(int i = 0;i<x.length;i++){
      for(int j = 0;j<x.length - 1;j++){
        if(x[j]>x[j+1]){
          temp = x[j+1];
          x[j+1] = x[j];
          x[j] = temp;
        }
      }
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

    x = Bubble(x);

    System.out.print("[");
    for(int j = 0;j<x.length;j++){
      System.out.print(x[j] + " ");
    }
    System.out.print("]");
  }
}
