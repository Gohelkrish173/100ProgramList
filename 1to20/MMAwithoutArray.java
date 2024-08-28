import java.util.*;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.sound.midi.SysexMessage;

public class MMAwithoutArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter A N :");
    int n = sc.nextInt();

    int x = sc.nextInt();

    if (x <= 0) {
      System.out.println("The number of elements must be positive.");
      return;
    }

    int min = x;
    int max = x;
    int ans = x;
    int n1 = 0;

    for (int i = 2; i <= n; i++) {
      n1 = sc.nextInt();
      if (n1 < min) {
        min = n1;
      }
      if (n1 > max) {
        max = n1;
      }

      ans = ans + n1;

    }

    System.out.println("Min : " + min);
    System.out.println("Max : " + max);
    System.out.println("Avg : " + (ans / n));
  }
}
