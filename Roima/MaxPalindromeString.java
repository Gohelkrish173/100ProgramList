import java.util.*;

public class MaxPalindromeString{
    public static void main(String[] args){
        String s1 = "babad";
        String s2 = "cbba";

        System.out.println(maxPalindrome(s1));
        System.out.println(maxPalindrome(s2));
    }

    public static String maxPalindrome(String x){
        if(x.length() < 1){
            return x;
        }

        int maxLength = 1;
        String maxString = x.substring(0,1);

        for(int i = 0;i<x.length();i++){
            for(int j = i+maxLength;j<=x.length();j++){
                if(j-i>1 && palindrome(x.substring(i,j))){
                    maxLength = j-i;
                    maxString = x.substring(i,j);
                }
            }
        }

        return maxString;
    }

    public static boolean palindrome(String x){
        String y = "";

        for(int i = x.length()-1;i>=0;i--){
            y += x.charAt(i);
        }

        if(y.equals(x)){
            return true;
        }

        return false;
    }
}