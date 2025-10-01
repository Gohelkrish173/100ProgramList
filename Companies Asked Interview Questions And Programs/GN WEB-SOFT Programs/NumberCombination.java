import java.util.*;

public class NumberCombination{
    public static void main(String[] args){
        List<Integer> N = new ArrayList<>();

        int x = 1234;

        String S = String.valueOf(x);
        char[] chars = S.toCharArray();

        for(int i = 0;i<chars.length;i++){
            permutaion(N,chars,i,chars.length-1);
        }

        for(int i =0;i<chars.length;i++){
            System.out.println(N.get(i));
        }
    }

    public static void permutaion(List<Integer> y,char[] arr,int l,int r){
        if(l == r){
            y.add(Integer.parseInt(new String(arr)));
            return;
        }
        else{
            for(int i = l;i<=r;i++){
                swap(arr,l,i);
                permutaion(y,arr,l+1,r);
                swap(arr,l,i); //backtrack
            }
        }
    }

    public static void swap(char[] s,int i,int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public static int count_Number(int n,int c){
        if(n == 0){
            return 0;
        }

        return c + count_Number(n/10,c+1);
    }
}