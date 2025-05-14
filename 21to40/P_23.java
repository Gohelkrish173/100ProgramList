import java.util.Scanner;

public class P_23 {
 
    public static void input_for_specific_index(){
    Scanner sc = new Scanner(System.in);

    int[] l = new int[100];

    System.out.println("Enter the Size Of Array : (max:100) ");
    int x = sc.nextInt();

    System.out.println("Enter the Element of Array : ");

    for(int i = 0;i<x;i++){
      l[i] = sc.nextInt();
    }

    System.out.println("Before Insertion :-");
    print_Array(l,x);

    System.out.println("Enter A Position : ");
    int p = sc.nextInt();

    if(p<0||p>=x){
      System.out.println("Invalid Position");
      return;
    }
    
    System.out.println("Enter A value : ");
    int n = sc.nextInt();

    //shift element to right
    for(int i=x;i>p;i--){
      l[i] = l[i-1];
    }
    l[p] = n;
    
    System.out.println("After Insertion :-");
    print_Array(l,x+1);

    return; 
  }

  public static void print_Array(int[] x,int index){
    
    System.out.print("[");
    for(int i = 0;i<index;i++){
      System.out.println(x[i] + " ");
    }
    System.out.print("]");

  }

  public static void main(String[] args){
    input_for_specific_index();
  }
  
}
