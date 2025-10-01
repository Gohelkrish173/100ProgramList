import java.util.*;

// Decimal to Octal

public class P8{
    public static void main(String[] args){
        double x = 125.8;
        double y = 125.7;

        System.out.println("Octal Value = " + decimalToOctal(x));
        System.out.println("Decimal Value = "+ octalToDecimal(y));
    }

    public static double decimalToOctal(double x){
        int t = (int)x;

        double T = x - (int)t;

        Stack<Integer> y = new Stack<Integer>();
        while(t != 0){
            y.push(t%8);
            t=t/8;
        }

        String Ans = "";

        while(!y.isEmpty()){
            Ans = Ans + y.pop();
        }
        Ans = Ans + ".";

        for(int i = 0;i<2;i++){
            T = T*8; 
            int temp = (int)(T);
            Ans = Ans + temp;
            T = T - (int)T;
        }        

        return Double.valueOf(Ans);
    }

    public static double octalToDecimal(double x ){
        int t = (int)x;
        double T = (x - (int)t);
        String TS = "" + T;
        T = Double.valueOf(TS.substring(0,5));
        T = T * Math.pow(10,count(T));
        System.out.println("------------"+T);

        double Ans = 0.0;
        int c = 0;

        while(t!=0){
            Ans = Ans + ((t%10)*Math.pow(8,c));
            t = t/10;
            c++;
        }

        String y = "" + T;
        
        c = -1;

        for(int i = 0;i<y.length();i++){
            if(y.charAt(i) != '.'){
                Ans = Ans + (Integer.valueOf(""+y.charAt(i))*Math.pow(8,c));
                c--;
                break;
            }
        }

        return Ans;
    }

    public static int count(double x){
        int c = 0;

        while(x != 0){
            x = x*10;
            x = x - (int)x;
            // System.out.println(x);
            c++;
        }

        // System.out.println(c);
        return c;
    }
    

}