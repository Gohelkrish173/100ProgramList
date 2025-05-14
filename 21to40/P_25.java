import java.util.Scanner;

public class P_25 {

  public static int isInArray(int a[],int m){
    return search(a, m, 0);
  }

  public static int search(int a[],int m,int index){
    if(index == a.length){
      return 0; //Not Found
    }
    if(a[index] == m){
      return 1;
    }

    return search(a, m, index + 1);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size of Array : ");
    int x = sc.nextInt();

    int[] l = new int[x];
    System.out.println("Enter A Element In to List : ");
    for(int i = 0;i<x;i++){
      l[i] = sc.nextInt();
    }

    System.out.println("Enter A Element which user want to find from array");
    int n = sc.nextInt();

    System.out.println((isInArray(l, n) == 1 ? "Found" : "Not Fount") + " in Array");

  }
  
}
