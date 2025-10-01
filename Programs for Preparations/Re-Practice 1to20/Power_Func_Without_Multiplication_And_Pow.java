import java.util.*;

public class Power_Func_Without_Multiplication_And_Pow{

  public static double multiplication(double a,double b){
    double result = 0.0;
    boolean isNegative = false;

    if(b < 0.0){
      b = -b;
      isNegative = !isNegative;
    }

    for(int i = 0;i<b;i++){
      result += a;
    }

    return isNegative ? -result : result;
  }

  public static double power(double a,int b){
    if(b == 0) return 1.0;
    double result = 1.0;

    boolean isNegative_b = b < 0;
    if(isNegative_b) b = -b;

    for(int i = 0;i<b;i++){
      result = multiplication(result, (int) a);
    }

    double fractionPart = a - (int) a;
    if(fractionPart != 0.0){
      double wholeResult = 1.0;
      for(int i = 0;i<b;i++){
        double temp = 0.0;
        for(int j = 0;j<1000;j++){
          temp += result/1000;
        }
        result = wholeResult + temp;
      }
    }

    return isNegative_b ? 1.0/result : result;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter A Base : ");
    double a = sc.nextDouble();

    System.out.println("Enter A Exponential : ");
    int b = sc.nextInt();

    System.out.println("\n Ans : "+power(a, b));
  }

}