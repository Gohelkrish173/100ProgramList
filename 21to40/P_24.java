import java.util.Scanner;

public class P_24{

  public static void print_Array(int[] x,int index){
    
    System.out.print("[");
    for(int i = 0;i<index;i++){
      System.out.print(x[i] + " ");
    }
    System.out.print("]\n");

  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter A Size Of Array : ");
    int x = sc.nextInt();

    int[] l = new int[x];
    for(int i = 0;i<x;i++){
      l[i] = sc.nextInt();
    }

    System.out.println("Before Deletion : ");
    print_Array(l, x);

    System.out.println("Enter The Element which you want to delete.");
    int n = sc.nextInt();
    int p =0;
    int flag = 0;

    for(int i = 0;i<x;i++){
      if(l[i] == n){
        p = i;
        flag = 1;
      }
    }
    if(flag == 0){
      System.out.println("Given Element is Not in given Array.");
      return;
    }

    //shift and delete.
    for(int i = p;i<x-1;i++){
      l[i] = l[i+1];
    }

    System.out.println("After Deletion: ");
    print_Array(l, x-1);
  }
}