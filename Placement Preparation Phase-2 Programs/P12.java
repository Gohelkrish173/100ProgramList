// 1
// 1 * 1
// 1 * 3 * 1
// 1 * 3 * 5 * 3 * 1

public class P12 {
  public static void main(String[] args){
    int[] prime = {1,2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67};
    int n = 5;

    for(int i = 1;i<=n;i++){
      for(int j = 1;j<=prime[i-1];j++){
        if(j%2 != 0){
          System.out.print(j + " ");
        }
        else{
          System.err.print("* ");
        }
      }

      if(i != 1){
        for(int j = prime[i-1]-1;j>0;j--){
          if(j%2 != 0){
            System.out.print(j + " ");
          }
          else{
            System.err.print("* ");
          }
        }
      }


      System.out.println();
    }
  }

}
