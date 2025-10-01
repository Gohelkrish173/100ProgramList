import java.util.Scanner;

public class BinaryToDecimal {

  public static int[] toInt(String x){
    int ans = 0;
    int ans2 = 0;
    int[] intAns = new int[2];

    for(int i=0;i<x.length();i++){

      if(x.charAt(i) == '.'){
        intAns[1] = i;
        break;
      }

      if(x.charAt(i)< '0' || x.charAt(i) > '9'){
        throw new NumberFormatException("Invalid Number " + x.charAt(i));
      }
      ans = ans*10 + (x.charAt(i) - '0');
    }

    intAns[0] = ans;
    if(intAns[1] == 0) intAns[1] = 0;

    return intAns;
  }

  public static double btod(String x){
    int[] intNumbers = toInt(x);
    int x1 = intNumbers[0];
    int afterDotCount = intNumbers[1];
    System.out.println(x1 + " " + afterDotCount);
    double Ans = 0.0;
    int i = 0;

    //for before point;
    while (x1 != 0) {
      Ans = Ans + ((x1%10)*Math.pow(2, i));
      x1 = x1/10;
      i++;
    }

    int k = 1;
    //for after point;
    for(int j = afterDotCount+1;j<x.length();j++){
      if(x.charAt(j) < '0' || x.charAt(i) > '9') throw new NumberFormatException("Invalid char : "+x.charAt(j));
      Ans = Ans + ((x.charAt(j) - '0')*Math.pow(2, -k));
      System.out.println(Ans);
      k++;
    }
  
    return Ans;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter A Binary Code (For Binary Code,only use 0's and 1's for string) : ");
    String x = sc.nextLine();

    System.out.println("Decimal From Given Binary Number : " + btod(x));
  }  
}
