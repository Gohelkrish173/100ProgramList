import java.util.*;

public class powerwithoutMP {
  public static int add(int a, int b){
    while(b != 0){
      int curry = a & b;
      a = a ^ b;
      b = curry << 1;
    }
    return a;
  }

  public static int multy(int a,int b){
    int result = 0;
    for(int i =0;i<b;i++){
      result = add(result,a);
    }
    return result;
  }

  public static int power(int a,int b){
    if(b == 0){
      return 1;
    }
    if(b == 1){
      return a;
    }

    int result = a;
    for(int i = 1;i<b;i++){
      result = multy(result, a);
    }
    return result;
  }

  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);

    System.out.print("a : ");
    int a = sc.nextInt();

    System.out.print("\nb : ");
    int b = sc.nextInt();

    int ans = power(a, b);

    System.out.println("output : "+ans);
  }
}
