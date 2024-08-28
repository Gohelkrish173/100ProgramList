import java.util.*;

public class angleOfClock {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Hour : ");
    double h = sc.nextInt();

    System.out.print("Minite : ");
    double m = sc.nextInt();

    double ha = (h % 12) * 30 + (m / 60.0) * 30;
    double ma = m*6;

    double a = Math.abs(ha - ma);

    a = Math.min(a, 360 - a);

    System.out.println("The angle between the hour and minute hand is: " + a + " degrees");
  }
}
