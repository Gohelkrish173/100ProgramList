import java.util.*;

public class findoddevendigitinN {
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter A Number : ");
    int n = sc.nextInt();
    int x = 0;
    int CE = 0;
    int CO = 0;

    while (n != 0) {
      x = n%10;
      if(x%2 == 0)CE += 1;
      else CO +=1;
      n = n/10;
    }

    System.out.println("Count of Even Digit : "+ CE);
    System.out.println("Count of Odd Digit : "+ CO);
  }
}
