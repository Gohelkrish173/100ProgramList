import java.util.Scanner;

public class P_29 {

  public static int[] inputValue(){
    int[] x = new int[2];
    
    Scanner sc = new Scanner(System.in);
    System.out.println("N1 = ");
    int N1 = sc.nextInt();
    System.out.println("N2 = ");
    int N2 = sc.nextInt();

    if(N1>=N2){
      x[0] = N2;
      x[1] = N1;
    }
    else{
      x[0] = N1;
      x[1] = N2;
    }

    return x;
  }

  public static void Output(int[] X){
    int[] x = X;
    int dividend = x[1];
    int divisor = x[0];

    int quotient = 0;
    int reminder = dividend;

    if(divisor == 0){
      System.out.println("Divisor is must not be 0.");
      return ;
    }

    while (reminder >= divisor) {
      reminder = reminder - divisor;
      quotient = quotient + 1;
    }

    System.out.println("reminder = "+reminder+" ; quotient = "+quotient);

  }

  public static void main(String[] args){
    int[] x = inputValue();

    Output(x);
  }
  
}
