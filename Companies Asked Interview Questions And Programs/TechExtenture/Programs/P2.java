// Coin Change Problem (Small Scale)

import java.util.*;

public class P2 {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Amount : ");
    int amount = sc.nextInt();

    System.out.print("Size : ");
    int n = sc.nextInt();

    List<Integer> Coin = new ArrayList<>();

    for(int i = 0;i<n;i++){
      System.out.print("E-"+i+" = ");
      Coin.add(sc.nextInt());
    }

    int coinNeeded = needCoin(amount, Coin);

    System.out.println("Needed Coin Is = "+ coinNeeded);

  }
  
  public static int needCoin(int amount, List<Integer> x){
    x.sort((o1, o2) -> o2 - o1); // sort the list

    int temp = amount;
    int need = 0;
    int index = 0;

    while (temp != 0){
      if(temp%x.get(index) != temp){
        need++;
        temp -= x.get(index);
      }
      else index++;
    }

    return need;
  }

}