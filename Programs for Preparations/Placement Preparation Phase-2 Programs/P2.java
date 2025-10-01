import java.util.*;

// Find Ugly Number

public class P2{
    public static void main(String[] args) {
        int x = 17;

        if(checkUgly(x)) System.out.print("Given Number is Ugly");
        else System.out.print("Given Number is Not Ugly");
    }

    public static boolean checkUgly(int x){
        
        if(x != 2 && x != 3 && x != 1 && x != 5 && checkPrime(x)){
            return false;
        }

        if(x == 2 || x == 1 || x == 3 || x == 5){
            return true;
        }

        for(int i = 2;i<x;i++){
            if(x%i == 0){
                if(i != 2 && i != 3 && i != 5){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkPrime(int x){
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }
}
