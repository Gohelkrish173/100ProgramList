import java.util.*;

public class s1_3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = 0;
    long ans = 1;
    int count = 0;

    System.out.println("N : ");
    n = sc.nextInt();

    for(int i = n;i>0;i--){
      ans = ans * i;
    }
    System.out.println(ans);
    while(ans > 0){
      if(ans%10 == 0){
        count++;
      }
      else{
        break;
      }
      ans = (int)(ans/10);
    }

    System.out.println("Count of 0 at the end : "+count);

  }
}