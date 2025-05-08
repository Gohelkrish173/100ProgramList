import java.util.Scanner;

public class ChocolateCount{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = 0;
    int y = 0;
    int z = 0;
    int wrapper = 0;
    int Total = 0;

    System.out.print("x : ");
    x = sc.nextInt();
    System.out.print("y : ");
    y = sc.nextInt();
    System.out.print("z : ");
    z = sc.nextInt();

    Total = Total + (int)(x/y);

    wrapper = Total;

    while (wrapper >= z) {
      int pendingwrapper = wrapper%z;
      Total = Total + (int)(wrapper/z);
      int newWraper = pendingwrapper + (int)(wrapper/z);
      wrapper = newWraper;
    }

    System.out.println("Total Chocolate Get : "+Total);
  }
}