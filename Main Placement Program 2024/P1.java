import java.util.Scanner;

public class P1{

  public static int[] mergeArray(int[] a,int b[]){
    int[] merged = new int[a.length + b.length];
    int c = 0;
    int temp = 0;

    for(int i = 0;i<merged.length;i++){
      if(i >= a.length){
        c = i-a.length;
        merged[i] = b[c];
      }
      else{
        merged[i] = a[i];
      }
    }

    for(int i = 0;i<merged.length;i++){
      for(int j = 0;j<merged.length-1;j++){
        if(merged[j] >= merged[j+1]){
          temp = merged[j];
          merged[j] = merged[j+1];
          merged[j+1] = temp;
        }
      }
    }

    return merged;
  }

  // More Effiecient
  public static int[] mergeArray_Efficiently(int[] a,int[] b){
    int aL = a.length;
    int bL = b.length;
    int index = 0;
    int i = 0;
    int j = 0;
    int[] merged = new int[aL + bL];

    while(i <aL && j < bL){
      if(a[i] >= b[j]){
        merged[index] = b[j];
        System.out.print("merged["+index+"] = "+merged[index]+",\n");
        index = index+1;
        j = j+1;
      }
      else{
        merged[index] = a[i];
        System.out.print("merged["+index+"] = "+merged[index]+",\n");
        index = index+1;
        i = i + 1;
      }
    }

    if(i==aL){
      merged[index] = b[j];
      System.out.print("merged["+index+"] = "+merged[index]+",\n");
    }

    if(j==bL){
      merged[index] = a[i];
      System.out.print("merged["+index+"] = "+merged[index]+",\n");
    }

    return merged;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter An Size Of Array1 : ");
    int n1 = sc.nextInt();
    System.out.println("Enter An Size Of Array2 : ");
    int n2 = sc.nextInt();
    System.out.println("Enter An Size Of k : ");
    int k = sc.nextInt();

    int[] x1 = new int[n1];
    int[] x2 = new int[n2];

    System.out.println("Enter A value of X1 : ");
    for(int i=0;i<n1;i++){
      System.out.print("X1["+i+"] = ");
      x1[i] = sc.nextInt();
    }

    System.out.println("Enter A value of X2 : ");
    for(int i=0;i<n2;i++){
      System.out.print("X2["+i+"] = ");
      x2[i] = sc.nextInt();
    }

    // int[] merged = mergeArray(x1, x2);
    int[] merged = mergeArray_Efficiently(x1, x2);

    for(int i = 0;i<merged.length;i++){
      System.out.println(merged[i]);
    }

    System.out.println(k+"th Element = "+merged[k-1]);

  }
}