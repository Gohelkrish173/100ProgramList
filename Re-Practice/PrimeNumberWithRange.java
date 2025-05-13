import java.util.*;

public class PrimeNumberWithRange {
  
  public static void primeNumbers(long x,long y){

    for(long i=x;i<=y;i++){
      
      if(i == 1){
        System.out.print(1 + " ");          
      }
      if(i == 2){
        System.out.print(2 + " ");          
      }

      for(long j=2;j<i;j++){
        if(i%j == 0){
          break;
        }
        if(j == i-1){
          System.out.print(i + " ");
        }
      }
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Starting Number : ");
    long x = sc.nextLong();

    System.out.println("Enter Last Number : ");
    long y = sc.nextLong();

    System.out.println("Prime Numbers Between Given Range : ");
    primeNumbers(x, y);
  }

}
