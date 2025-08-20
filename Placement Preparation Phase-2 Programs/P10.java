import java.util.Scanner;

public class P10 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int index = 0;

    System.out.println("Enter Number of Size of Array.");
    int n = sc.nextInt();

    int[] x = new int[n];

    for(int i = 0;i<n;i++){
      System.out.println("Enter A Index Number :");
      index = sc.nextInt();

      System.out.println("Enter It's Value : ");
      x[index] = sc.nextInt();
    }
    
    index = 0;

    for(int y : x){
      System.out.println(index+" : "+y);
      index++;
    }
    
  }
}
