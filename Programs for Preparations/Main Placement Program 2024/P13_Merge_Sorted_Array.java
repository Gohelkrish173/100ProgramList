import java.util.Scanner;

public class P13_Merge_Sorted_Array {

  public static int[] merged_Sorted(int[] x1,int[] x2){
    int n1 = x1.length;
    int n2 = x2.length;
    int[] x3 = new int[n1 + n2];
    int i = 0;
    int j = 0;
    int index = 0;

    while (i < n1 && j < n2) {
      if(x1[i] >= x2[j]){
        x3[index++] = x2[j];
        j++;
      }
      else{
        x3[index++] = x1[i];
        i++;
      }
    }

    if(i==n1){
      if(j<=n2-1){
        for(j = j;j<n2;j++){
          x3[index++] = x2[j];
        }
      }
    }

    if(j == n2){
      if(i<=n1-1){
        for(i = i;i<n1;i++){
          x3[index++] = x1[i];
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