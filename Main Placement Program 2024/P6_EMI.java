import java.util.Scanner;

public class P6_EMI {

  public static double EMI(double p,double r,int n){
    double emi = 1;
    double N = n*12;
    
    double R = (r/(12*100));
    double newR = (1+R);

    emi = (p*R*Math.pow(newR,N))/(Math.pow(newR,N) - 1);

    return emi;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Amount : ");
    double p = sc.nextDouble();
    System.out.print("Enter Rate Of Interest : ");
    double r = sc.nextDouble();
    System.out.print("Enter Year : ");
    int n = sc.nextInt();

    System.out.println("EMI = "+(EMI(p,r,n)));
  }
}