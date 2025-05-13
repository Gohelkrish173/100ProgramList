import java.util.Scanner;

public class Insertion_Sort {

  public static double[] insertionSort(double[] x){
    double[] x1 = x;
    double temp = 0;

    for(int i=0;i<x1.length-1;i++){
      for(int j = i+1;j>0;j--){
        if(x1[j]<x1[j-1]){
          temp = x1[j];
          x1[j] = x1[j-1];
          x1[j-1] = temp;
        }
      }
    }
    
    return x1;
  }

  public static double[] inputList_for_sorting(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the Size Of Array : ");
    int x = sc.nextInt();

    double[] l = new double[x];

    System.out.println("Enter the Element of Array : ");
    for(int i = 0;i<x;i++){
      l[i] = sc.nextDouble();
    }

    return l; 
  }

  public static void print_Sorted_Array(double[] x){
    
    System.out.print("[");
    for(int i = 0;i<x.length;i++){
      System.out.println(x[i] + " ");
    }
    System.out.print("]");

  }

  public static void main(String[] args){

    double[] x = inputList_for_sorting();

    System.out.println("Insertion Sorted : ");

    print_Sorted_Array(insertionSort(x));

  }

}