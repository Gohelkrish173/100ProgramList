import java.util.Scanner;

public class Selection_Short {

  public static double[] selectionSort(double[] x){
    double[] x1 = x;
    int index = 0;
    double val = 0;

    for(int i =0;i<x1.length;i++){
      index = i;
      val = x1[i];
      for(int j = i+1;j<x1.length;j++){
        if(x[j] < val){
          index = j;
          val = x[j];
        }
      }
      x[index] = x[i];
      x[i] = val;
    }

    return x1;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Size of Array : ");
    int x = sc.nextInt();

    double[] a = new double[x];

    for(int i = 0;i<x;i++){
      a[i] = sc.nextDouble();
    }

    System.out.println("Sorted Array : ");
    double[] SortArray = selectionSort(a);

    System.out.print("[");
    for(int i = 0;i<x;i++){
      System.out.print( SortArray[i] + " ");
    }
    System.out.print("]");

  }
}