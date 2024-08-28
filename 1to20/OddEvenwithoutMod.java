import java.util.Scanner;

public class OddEvenwithoutMod {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A Number : ");
    int n = sc.nextInt();

    if((n & 1) == 0){
      System.out.println("given Number is Even");
    }
    else{
      System.out.println("given Number is Odd");
    }
  }
}
