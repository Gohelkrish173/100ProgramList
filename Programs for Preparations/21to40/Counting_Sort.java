import java.util.Scanner;

public class Counting_Sort {

  public static int[] countingSort(int[] X){
    int[] x = X;
    int maxValue = max(x);
    int[] C = new int[maxValue+1];
    int index = 0;
    
    //add count in CoutingSort
    for(int i = 0;i<x.length;i++){
      C[x[i]] = C[x[i]] + 1;
    }

    //Add Element with Sorting
    for(int i = 0;i<C.length;i++){
      for(int j =0;j<C[i];j++){
        x[index] = i;
        index++;
      }
    }

    return x;
  }

  public static int max(int[] a){
    int temp = 0;
    
    for(int i = 0;i<a.length;i++){
      if(i == 0) temp = a[i];
      if(temp < a[i]){
        temp = a[i];
      }
    }
    return temp;
  }

  public static int[] inputList_for_sorting(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the Size Of Array : ");
    int x = sc.nextInt();

    int[] l = new int[x];

    System.out.println("Enter the Element of Array : ");
    for(int i = 0;i<x;i++){
      l[i] = sc.nextInt();
    }

    return l; 
  }

  public static void print_Sorted_Array(int[] x){
    
    System.out.print("[");
    for(int i = 0;i<x.length;i++){
      System.out.print(x[i] + " ");
    }
    System.out.print("]");

  }

  public static void main(String[] args){
    int[] x = inputList_for_sorting();

    System.out.println("Array Sorted By Counting Sort is given below : ");
    print_Sorted_Array(countingSort(x));
  }
  
}
