import java.util.Scanner;

public class P15_Consecutive_Number_Jumped {
  
  public static int consecutiveNumbeJumpedCount(int[] x){
    int[] S = x;
    int temp = 0;
    int count = 0;

    for(int i = 0;i<x.length-1;i++){
      for(int j = i+1;j<x.length;j++){
        if(S[i] >= S[j]){
          temp = S[i];
          S[i] = S[j];
          S[j] = temp;
        }
      }
    }

    for(int i=0;i<x.length-1;i++){
      if((S[i] + 1) == S[i+1]){
        count++;
      }
    }

    return count+1;
  }

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter N : ");
    int n = sc.nextInt();

    int[] x = new int[n];

    for(int i =0;i<n;i++){
      System.out.print("x["+i+"] = ");
      x[i] = sc.nextInt();
    }

    System.err.print("Consecutive Number Jumped is : "+consecutiveNumbeJumpedCount(x));
  }

}