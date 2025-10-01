public class HappyNumber{

    public static int myPower(int n,int p){
        if(p == 0 ){
            return 1;
        }
        return n * myPower(n,p-1);
    }

    public static void happy(int n){
        int d=0;
        int sum = 0;

        while(n >=10){
            sum = 0;

            while(n!=0){
                d = n%10;
                sum = sum + myPower(d,2);
                n = n/10;
            }
            n = sum;
        }

        if(n == 1){
            System.out.println("Given Number is happy Number.");
        }
        else{
            System.out.println("Given Number is Not happy Number.");
        }
    }

    public static void main(String[] args){
        int x1 = 203;
        int x2 = 56;

        happy(x1);
        happy(x2);
    }
}