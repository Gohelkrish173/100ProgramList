import java.util.*;

// Find Pronic Number.

public class P5{

    public static void main(String[] args){
        int x = 6;
        int x1 = 72;
        int x2 = 12;

        if(checkPronic(x)) System.out.println("Pronic.");
        else System.out.println("Not-Pronic.");

        if(checkPronic(x1)) System.out.println("Pronic.");
        else System.out.println("Not-Pronic.");

        if(checkPronic(x2)) System.out.println("Pronic.");
        else System.out.println("Not-Pronic.");
    }

    public static boolean checkPronic(int x){
        
        for(int i = 1;i<x;i++){
            if(x%i == 0){
                if(checkMultiple(x,i)) return true;
            }
        }

        return false;
    }

    public static boolean checkMultiple(int x,int y){
        return y*(y+1) == x ? true : false;
    }
}