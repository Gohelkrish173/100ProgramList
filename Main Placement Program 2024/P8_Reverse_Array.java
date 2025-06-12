import java.util.Scanner;

public class P8_Reverse_Array {
  
  public static void Reverse(int[] x){
    int l = 0;
    int n = x.length;
    int temp = 0;

    l = x.length % 2 == 0 ? (x.length/2) : ((x.length+1)/2);

    for(int i = 0;i<l;i++){
      temp = x[i];
      x[i] = x[n-i-1];
      x[n-i-1] = temp;
    }
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];

    for(int i=0;i<n;i++){
      System.out.print("x["+i+"] = ");
      a[i] = sc.nextInt();
    }

    Reverse(a);

    System.out.println("Reverse The Given Array : ");
    for(int i =0;i<n;i++ ){
      System.out.print(a[i] + " ");
    }
  }  
}
