// * * * * * * *
//   *       *
//     *   *
//       *
//     *   *
//   *       *
// * * * * * * *

public class P13{
    public static void main(String[] args){
        // for(int i=1;i<=10;i++){
        pattern(7);
    }

    public static void pattern(int n){
        int mid = n+1/2;

        for(int i = 0;i<n;i++){
            if(i <= mid){
                
                for(int k = 0 ; k < n; k++){
                    if(i == 0 || i == n-1 || i == k || k == n-i-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }else{
                for(int j = 0; j < n ; j++){
                    System.out.print("  ");
                }

            }
            System.out.println();
            
            

        }

    }
}