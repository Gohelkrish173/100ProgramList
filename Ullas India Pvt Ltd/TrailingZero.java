public class TrailingZero{
    public static void main(String[] args){
        int x1 = 3;
        int x2 = 5;
        int x3 = 5000;

        System.out.println("TrailingZeros : 3 : "+trailingZero(x1));
        System.out.println("TrailingZeros : 5 : "+trailingZero(x2));        
        System.out.println("TrailingZeros : 5000 : "+trailingZero(x3));            
        System.out.println("TrailingZeros : 500 : "+trailingZero(500));
    }

    public static int trailingZero(int n){
        int zero = 0;
        boolean flag = true;
        int temp = 5;

        while(flag){
            if((int)(n/temp) == 0){
                zero = zero + (n/temp);
                flag = false;
            }
            else{
                zero = zero + (n/temp);
            }
            temp*=5;
        }

        return zero;
    }
}