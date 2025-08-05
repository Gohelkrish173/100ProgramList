// Prime or Not
import java.util.*;

public class P1 {
    public static void main(String[] args){
        List<Integer> L = new ArrayList<>(List.of(3,5,10,50,60,29));

        List<Boolean> LCP = checkPrime(L);

        System.out.println("Check Prime: ");
        for(int i = 0;i<L.size();i++){
            System.out.println(L.get(i)+" "+LCP.get(i));
        }
    }   

    public static List<Boolean> checkPrime(List<Integer> x){

        List<Boolean> y = new ArrayList<>();
        for(int i = 0;i<x.size();i++){
            for(int j  = 2;j<Math.sqrt(x.get(i));j++){
                if(x.get(i)%j == 0){
                    System.out.println(x.get(i)+"%"+j +" == " + x.get(i)%j);
                    y.add(false);
                }
            }
            if(y.size() != i+1){
                y.add(true);
            }
        }

        return y;
    }
}