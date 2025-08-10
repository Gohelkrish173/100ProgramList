import java.util.*;

// Happy Number

public class P6{
    public static void main(String[] args){
        int x = 49;
        int x1 = 50;

        if(checkHappy(x)) System.out.println("Happy Number.");
        else System.out.println("Not-Happy Number.");

        if(checkHappy(x1)) System.out.println("Happy Number.");
        else System.out.println("Not-Happy Number.");
    }

    public static boolean checkHappy(int x){
        int sum = 0;
        int y = 0;
        List<Integer> z = new ArrayList<>();
        z.add(x);

        while(x != 1){
            while(x != 0){
                y = x%10;
                sum = sum + (int)Math.pow(y,2);
                x = x/10;
            }
            if(sum == 1){
                return true;
            }
            else{
                if(z.contains(sum)) return false;
                else{
                    z.add(sum);
                    x = sum;
                    sum = 0;
                }
            }
        }

        return false;
    }

}