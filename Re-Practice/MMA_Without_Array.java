import java.util.Scanner;

public class MMA_Without_Array {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int Min = 0;
    int Max = 0;
    double Avg = 0;
    int x = 0;

    System.out.println("Enter The Size of List : ");
    long n = sc.nextInt();

    System.out.println("Enter The Numbers In List : ");
    for(long i=0;i<n;i++){
      x = sc.nextInt();
      Avg = Avg + x;
      
      if(i == 0){
        Min = x;
        Max = x;
      }

      if(x<=Min){
        Min = x;
      }
      if(Max<=x){
        Max = x;
      }

    }

    System.out.println("Max = "+Max);
    System.out.println("Min = "+Min);
    System.out.println("Average = "+(Avg/n));
  }

}