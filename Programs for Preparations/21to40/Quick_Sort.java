import java.util.Scanner;

public class Quick_Sort {

  public static double[] quickSort(double[] X,int lb,int ub){
    double[] x = X;

    if(lb < ub){
      int p = partition(x, lb, ub);

      x = quickSort(x,lb,p-1);
      x = quickSort(x, p+1, ub);
    }

    return x;
  }

  public static int partition(double[] X,int lb,int ub){
    double pivot = X[lb];
    int i = lb + 1;
    int j = ub;

    while (i <= j) {
      while (i <= ub && X[i] <= pivot) {
        i++;
      }
      while (j >= lb && X[j] > pivot) {
        j--;
      }

      if(i < j){
        double temp = X[i];
        X[i] = X[j];
        X[j] = temp;
      }
    }

    //Swap Pivot position
    X[lb] = X[j];
    X[j] = pivot;

    return j;
  }

  public static double[] inputList_for_sortint(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter The Size Of Array :- ");
    int n = sc.nextInt();

    double[] x = new double[n];

    for(int i = 0;i<n;i++){
      System.out.print("x["+i+"] = ");
      x[i] = sc.nextDouble();
    }

    return x;
  }

  public static void print_sorted_list(double[] x){
    
    System.out.print("[ ");
    for(int i =0;i<x.length;i++){
      System.out.print(x[i] + " ");
    }
    System.out.print("]");
  }

  public static void main(String[] args){
    double[] x = inputList_for_sortint();   
  
    print_sorted_list(quickSort(x,0,x.length-1));
  } 
}