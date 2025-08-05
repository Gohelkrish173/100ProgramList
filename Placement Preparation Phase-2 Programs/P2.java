import java.util.ArrayList;
import java.util.List;

public class P2 {
    public static void main(String[] args){
        List<Integer> L = new ArrayList<>(List.of(25,6,69,30));

    }

    public static boolean checkUgly(List<Integer> x){

        for(int i = 0;i<x.size();i++){
            List<Integer> F = factors(x.get(i));

            for(int j = 0;j<F.size();j++){
                if () {
                    
                }
            }
        }

    }

    public static List<Integer> factors(int x){
        
        List<Integer> F = new ArrayList<>();

        for(int i = 2;i<x;i++){
            if(x%i == 0){
                F.add(i);
            }
        }

        return F;
    }
}