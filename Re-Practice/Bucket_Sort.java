import java.util.Scanner;

public class Bucket_Sort {

  public static double[] bucketSort(double[] X){
    double[] x = X;
    double[][] B = new double[10][x.length];
    int check = 0;
    int k = 0;

    //for set in buckets
    for(int i=0;i<x.length;i++){
      check = (int)(x[i]*10);
      System.out.println("Check" + check);

      for(int j = 0;j<B[check].length;j++){
        // System.out.println("B["+check+"]["+j+"] = "+B[check][j]);
        if(B[check][j] == 0.0){
          B[check][j] = x[i];
          // System.out.println("B["+check+"]["+j+"] = "+B[check][j]);
          break;
        }
      }
    }

    // System.out.println("Before Insertion : ");
    // for(int i=0;i<10;i++){
    //   for(int j = 0;j<x.length;j++){
    //     System.out.println("B["+i+"]["+j+"] = "+B[i][j]);
    //   }
    // }

    //for insertion sort
    for(int i = 0;i<10;i++){
     B[i] = insertionSort(B[i]); 
    }

    // System.out.println("After Insertion : ");
    // for(int i=0;i<10;i++){
    //   for(int j = 0;j<x.length;j++){
    //     System.out.println("B["+i+"]["+j+"] = "+B[i][j]);
    //   }
    // }

    for(int i=0;i<10;i++){
      for(int j=0;j<x.length;j++){
        // if(B[i][j] == 0.0 && B[i][j+1] == 0.0){
        //   System.out.println("B["+i+"]["+j+"] = "+B[i][j]);
        //   break;
        // }
        // System.out.println("B["+i+"]["+j+"] = "+B[i][j]);
        if(B[i][j] == 0.0) continue;
        x[k] = B[i][j];
        // System.out.println("x["+k+"] = "+ x[k]);
        k++;
      }
    }

    return x;
  }

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

    System.out.println("Note :-");
    System.out.println("Element of 0 is not exist in this array. : ");
    System.out.println("Enters Values between 0 to 1 : \n");

    double[] x = inputList_for_sorting();
  
    System.out.println("\n Bucket Sorted List :");

    print_Sorted_Array(bucketSort(x));
  }
  
}
