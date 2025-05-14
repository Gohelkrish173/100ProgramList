import java.util.Scanner;

public class TypeOfDigitCount_And_ConfigurationWithoutModulo {

  public static int[] typeOfDigitCount(long x){
    int[] Counts = new int[2];

    Counts[0] = 0;
    Counts[1] = 0;

    while(x >0){
      if((x%10)%2 == 0){
        Counts[0]++;
        x = x/10;
      }
      else{
        Counts[1]++;
        x = x/10;
      }
    }

    return Counts;
  }

  public static String digitConfigurationWithOutModuloOP(long x){

    if((x&1)==0){
      return "Given Number is Even";
    }
    else{
      return "Given Number is Odd";
    }

  }

  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter A Digit : ");
    long x = sc.nextLong();

    int[] TypeCount = typeOfDigitCount(x);

    System.out.println("Odd Digits : "+TypeCount[1]);
    System.out.println("Even Digits : "+TypeCount[0]);
    System.out.println(digitConfigurationWithOutModuloOP(x));
  }
  
}
