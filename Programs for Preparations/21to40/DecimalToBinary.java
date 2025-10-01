import java.util.Scanner;

public class DecimalToBinary {
  
  public static String dTob(double x){
    
    String Ans= "";    
    int temp = (int)x;
    double temp2 = x-temp;

    if(temp == 0){
      Ans = "0";
    }

    // for before point
    while(temp != 0){
      Ans = (temp%2) + Ans;
      temp = temp/2;  
    }

    // String a = "" + temp2;
    // int count = a.length();

    if(temp2 > 0.0){
      Ans = Ans + ".";
      //for after point
      while(temp2 != 0.0){
        Ans += (int)(temp2*2);
        temp2 = (temp2*2) - (int)(temp2*2);
      }
    }

    return Ans;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter A Decimal Number : ");
    double x = sc.nextDouble();

    System.out.println("Binary Code For Given Number : "+dTob(x));

  }  
}
