import java.util.Arrays;

public class LargestNumber {

  // Follow the steps below to use this file

  // 1. In the main file, create an instance of this class:
  // NewClass1 instance1 = new NewClass1();

  // 2. Call the method to get the greeting message:
  // System.out.println(instance1.sayHelloFromNewClass());
  
  public static String findLargset(int[] x){
  
    String[] X = new String[x.length];

    for(int i = 0;i<x.length;i++){
      X[i] = String.valueOf(x[i]);
    }
    // this Arrays function String array using codition which is given with perameter
    Arrays.sort(X,(a,b)-> (b+a).compareTo(a+b));

    // System.out.print("[");
    // for (String s : X) {
    //   System.out.print(s+",");
    // }
    // System.out.print("]");

    if(X[0].equals("0")){
      return "0";
    }

    StringBuilder S = new StringBuilder();

    for(int i = 0;i<x.length;i++){
      S.append(X[i]);
    }

    return S.toString();
  }
  
}