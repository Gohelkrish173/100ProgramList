import java.util.Scanner;

public class HammingDistance {
  
  public static int findHamminDistance(int x1,int x2){
    int xor = x1 ^ x2;

    int count = 0;
    while (xor != 0) {
      count += xor & 1;
      xor >>= 1;
    }
    return count;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n1 = 0;
    int n2 = 0;

    System.out.println("Enter N1 : ");
    n1 = sc.nextInt();
    System.out.println("Enter N2 : ");
    n2 = sc.nextInt();

    System.out.println("Hamming Distance for give two number is : "+ findHamminDistance(n1, n2));
  }  
}

// n1 : 1001
// n2 : 1110
// xor: 0111

// 1-time : xor & 1 : 0001 then count++ and right shift to xor : 0011 => 3 , count = 1
// 2-time : xor & 1 : 0001 then count++ and right shift to xor : 0001 => 1 , count = 2
// 3-time : xor & 1 : 0001 then count++ and right shift to xor : 0000 => 0 , count = 3

