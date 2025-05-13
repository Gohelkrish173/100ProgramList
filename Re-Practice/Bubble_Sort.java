import java.util.Scanner;

public class Bubble_Sort {

  public static double[] bubbleSort(double[] x){
    double[] x1 = x;
    double temp = 0;

    for(int i=0;i<x1.length;i++){
      for(int j=0;j<x1.length-1;j++){
        if(x1[j] >= x1[j+1]){
          temp = x1[j];
          x1[j] = x1[j+1];
          x1[j+1] = temp; 
        }
      }
    }

    return x1;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter A Size Of Array : ");
    int x = sc.nextInt();

    double[] a = new double[x];

    System.out.println("Enter A Eliment in Array : ");
    for(int i = 0;i<x;i++){
      a[i] = sc.nextDouble();
    }

    double[] SortedArray = bubbleSort(a);

    System.out.print("[");
    for(int i = 0;i<x;i++){
      System.out.println(SortedArray[i] + " ");
    }
    System.out.print("]");

  }
  
}