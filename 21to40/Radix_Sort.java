import java.util.Scanner;

public class Radix_Sort{

  public static int[] radixSort(int[] X){
    int[] x = X;

    int maxDigit = max_Value_Digit(x);
    System.out.println("max_value_digit = " + maxDigit);

    for(int i=1;i<=maxDigit;i++){
      x = main_sorting(x, i);
    }
    return x;
  }

  public static int[] main_sorting(int[] X,int b){
    int[] x = X;
    int[][] R = new int[10][x.length];
    int[] count = new int[10];
    int check = 0;
    int temp = 0;
    int index = 0;

    //Use For take digit to Unsorted List And put Ready For The queue's
    for(int i = 0;i<x.length;i++){
      temp = x[i];

      //find the check digit for Entering element into that digit's queue
      for(int j = 0;j<b;j++){
        check = temp % 10;
        temp = temp/10;
      }

      R[check][count[check]] = x[i];
      count[check]++;

      //Enter element into check digit's queue
      for(int k=0;k<x.length;k++){
        if(R[check][k] == 0){
          R[check][k] = x[i];
          break;
        }
      }

    }

    //Now, Create Sorted Array from that queue's
    for(int i=0;i<10;i++){
      for(int j = 0;j<count[i];j++){
        x[index] = R[i][j];
        index++;
      }
    }

    return x;
  }

  public static int max_Value_Digit(int[] X){
    int[] x = X;
    int max = 0;
    int Ans = 0;

    for(int i=0;i<x.length;i++){
      if(i == 0){
        max = x[i];
      }

      if(max <= x[i]){
        max = x[i];
      }

      while(max !=0){
        max = max/10;
        Ans++;
      }

      return Ans;
    }

    return Ans;
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
      System.out.println(x[i] + " ");
    }
    System.out.print("]");

  }

  public static void main(String[] args){
    int[] x = inputList_for_sorting();

    print_Sorted_Array(radixSort(x));
  }

}