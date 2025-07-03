public class MagicNumber{
    public static void magic(int n){
        int d=0;
        int sum = 0;

        while(n >=10){
            sum = 0;

            while(n!=0){
                d = n%10;
                sum = sum + d;
                n = n/10;
            }
            n = sum;
        }

        if(n == 1){
            System.out.println("Given Number is Magic Number.");
        }
        else{
            System.out.println("Given Number is Not Magic Number.");
        }
    }

    public static void main(String[] args){
        int x1 = 55;
        int x2 = 56;

        magic(x1);
        magic(x2);
    }
}