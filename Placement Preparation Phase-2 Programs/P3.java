import java.util.*;

public class P3 {
    public static void main(String[] args){
        int x = 297;

        if(checkKaprekar(x)) System.out.println("given number is Kaprekar");
        else System.out.println("given number is Not Kaprekar");
    }

    public static boolean checkKaprekar(int x){
        int xS = (int)Math.pow(x, 2);
        int temp = xS;
        int count = 0;

        while(temp != 0){
            count++; 
            temp = temp/10;
        }
        
        if(count%2 == 0){
            count++;
        }

        int p1 = xS%(int)Math.pow(10, count/2);
        int p2 = xS/(int)Math.pow(10,count/2);

        System.out.println(p1 +" "+p2);

        if(p1+p2 == x){
            return true;
        }

        return false;
    }

}
