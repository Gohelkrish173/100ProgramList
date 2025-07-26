import java.util.*;

public class OddEvenSorting{
    public static void main(String[] args){
        // List<Long> x = new ArrayList<>(Arrays.asList(6L, 8L, 4L, 6L, 2L, 5L, 1L));
        List<Long> y = new ArrayList<>(Arrays.asList(60L, 80L, 40L, 17L, 25L, 37L, 10L));
        List<Long> x = new ArrayList<>(Arrays.asList(321L, 246L, 169L, 267L, 478L, 889L));
        

        x = oddEvenSort(x);
        y = oddEvenSort(y);

        for(int i = 0;i<x.size();i++){
            System.out.println(x.get(i));
        }

        System.out.println("--------------------------");
        for(int i = 0;i<y.size();i++){
            System.out.println(y.get(i));
        }

    }

    public static List<Long> oddEvenSort(List<Long> x){
        List<Long> eL = new ArrayList<Long>();
        List<Long> oL = new ArrayList<Long>();

        for(int i = 0;i<x.size();i++){
            if(i%2 == 0){
                eL.add(x.get(i));
                // System.out.println("----"+eL);
            }
            else{
                oL.add(x.get(i));
                // System.out.println("----"+oL);
            }
        }

        eL = sort(eL);
        oL = sort(oL);

        int eI = 0;
        int oI = 0;

        List<Long> main = new ArrayList<Long>();

        for(int i = 0;i<x.size();i++){
            if(i%2 == 0){
                main.add(eL.get(eI));
                eI++;
            }
            else{
                main.add(oL.get(oI));
                oI++;
            }
        }
        
        return main;
    }

    public static List<Long> sort(List<Long> x){
        List<Long> y = x;

        for(int i = 0;i<x.size()-1;i++){
            for(int j = i+1;j<x.size();j++){
                if(y.get(i) > y.get(j)){
                    long temp = y.get(i);
                    y.set(i,y.get(j));
                    y.set(j,temp);
                }
            }
        }

        // System.out.println("++++"+x);

        return y;
    }
}