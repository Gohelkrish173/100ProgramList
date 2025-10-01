import java.util.Scanner;

public class AngleOfClock {

  public static double angle(int h,int m){
    
    double ha = (h%12) * 30 + (m*30/60);
    double ma = m*6;
    
    double a = (ha - ma);

    if (a < 0) {
      a = (-1)*a;
    }

    return a < (360-a) ? a : (360-a);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter A Hour : ");
    int h = sc.nextInt();

    System.out.println("Enter A Minite : ");
    int m = sc.nextInt();

    System.out.println("Angle Of Clock = "+angle(h, m));
  }
  
}
