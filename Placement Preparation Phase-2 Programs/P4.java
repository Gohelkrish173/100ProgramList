import java.util.*;

// Find Automorphic Number

public class P4{
    
    public static void main(String[] args){
        int x = 5;
        int x2 = 76;
        int x3 = 12;

        if(checkAutomorpic(x)) System.out.println("Automorphic.");
        else System.out.println("Not-Automorphic.");

        if(checkAutomorpic(x2)) System.out.println("Automorphic.");
        else System.out.println("Not-Automorphic.");

        if(checkAutomorpic(x3)) System.out.println("Automorphic.");
        else System.out.println("Not-Automorphic.");
    }

    public static boolean checkAutomorpic(int x){
        int squareX = (int)Math.pow(x,2);
        int y = x;
        int c = 0;

        while(y != 0){
            c++;
            y/=10;
        }

        int Ans = squareX%(int)Math.pow(10,c);

        return Ans == x ? true : false;
    }

}