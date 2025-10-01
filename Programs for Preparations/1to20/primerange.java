import java.util.Scanner;

public class primerange {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter A N1 : ");
    int n1 = sc.nextInt();

    System.out.print("Enter A N2 : ");
    int n2 = sc.nextInt();
    int flag = 0; 

    for(int i=n1 ;i<=n2;i++){
      for(int j=2;j<i;j++){
        if(i%j == 0){
          flag = 1;
          break;
        }
      }
      if(flag == 0){
        System.out.print(i+" ");
      }
      flag = 0;
    }
  }
}
