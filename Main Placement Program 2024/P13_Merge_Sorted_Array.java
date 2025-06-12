import java.util.Scanner;

public class P13_Merge_Sorted_Array {

  public static int[] merged_Sorted(int[] x1,int[] x2){
    int n1 = x1.length;
    int n2 = x2.length;
    int n = n1>=n2 ? n1 : n2;
    int[] x3 = new int[n1 + n2];
    int index = 0;

    for(int i = 0;i<n;i++){
      if(n1 == n){
        if(i <= n2){
          if(x1[i] >= x2[i]){
            x3[index++] = x2[i];
            x3[index++] = x1[i]; 
          }
          else{
            x3[index++] = x1[i];
            x3[index++] = x2[i];
          }
        }
        else{
          x3[index++] = x1[i];
        }
      }
      else{
        if(i <= n1){
          if(x1[i] >= x2[i]){
            x3[index++] = x2[i];
            x3[index++] = x1[i]; 
          }
          else{
            x3[index++] = x1[i];
            x3[index++] = x2[i];
          }
        }
        else{
          x3[index++] = x2[i];
        }
      }
    }

    return x3;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("n1 : ");
    int n1 = sc.nextInt();
    System.out.print("n2 : ");
    int n2 = sc.nextInt();

    int[] x1 = new int[n1];
    int[] x2 = new int[n2];

    System.out.println("Enter Array-1 : ");
    for(int i = 0;i<n1;i++){
      System.out.print("x1["+i+"] = ");
      x1[i] = sc.nextInt();
    }

    System.out.println("Enter Array-2 : ");
    for(int i = 0;i<n1;i++){
      System.out.print("x2["+i+"] = ");
      x2[i] = sc.nextInt();
    }

    int[] Ans = merged_Sorted(x1, x2);

    System.out.println("Print Sorted Array : ");
    for(int i =0;i<(n1+n2);i++){
      System.out.println("X3["+i+"] = "+Ans[i]);
    }

  }  
}
