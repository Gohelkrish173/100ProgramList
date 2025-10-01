import java.util.Scanner;

public class Shell_Sort{
  
  public static int[] shellSort(int[] X){
    int[] x = X;

    for(int g = (x.length/2);g>0;g=g/2){
      for(int i = g;i<x.length;i++){
        int temp = x[i];
        int j;

        for(j =i;j>= g && x[j - g]>temp;j = j - g){
          x[j] = x[j-g];
        }

        x[j] = temp;
      }
    }

    return x;
  }

  public static int[] inputList_for_sortint(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter The Size Of Array :- ");
    int n = sc.nextInt();

    int[] x = new int[n];

    for(int i = 0;i<n;i++){
      System.out.print("x["+i+"] = ");
      x[i] = sc.nextInt();
    }

    return x;
  }

  public static void print_sorted_list(int[] x){
    
    System.out.print("[ ");
    for(int i =0;i<x.length;i++){
      System.out.print(x[i] + " ");
    }
    System.out.print("]");
  }

  public static void main(String[] args){
    int[] x = inputList_for_sortint();

    print_sorted_list(shellSort(x));
  }
}