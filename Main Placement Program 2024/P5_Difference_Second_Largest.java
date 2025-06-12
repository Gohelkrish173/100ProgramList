import java.util.Scanner;

public class P5_Difference_Second_Largest {

  public static int Second_Difference(int[] x){
    int min = x[0];
    int max = x[0];
    int smin = 0;
    int smax = 0;

    for(int i = 0;i<x.length;i++){
      if(x[i] < min){
        min = x[i];
      }
      if(x[i]>max){
        max = x[i];
      }
    }

    smin = x[0];
    smax = x[0];

    for(int i = 0;i<x.length;i++){
      if(x[i]>min){
        if(x[i]<smin){
          smin = x[i];
        }
      }
      if(x[i]<max){
        if(x[i]>smax){
          smax = x[i];
        }
      }
    }

    System.out.println("smin : "+smin);
    System.out.println("smax : "+smax);
    
    return (smax - smin);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size Of Array : ");
    int n = sc.nextInt();

    int[] x = new int[n];

    for(int i = 0;i<n;i++){
      System.out.print("x["+i+"] = ");
      x[i] = sc.nextInt();
    }

    int difference = Second_Difference(x);

    System.out.print("Difference Of Second Largest Element : " + difference);
  }
  
}
