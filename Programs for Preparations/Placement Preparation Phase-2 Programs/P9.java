import java.util.*;

// Decimal to HexaDecimal

public class P9{
    public static void main(String[] args){
        double x = 24;
        double x1 = 125.7;

        String y = "18.0";
        String y1 = "7D.B33";

        System.out.println("Decimal to Hexa-Decimal "+x+" = "+decimalToHexa(x));
        System.out.println("Decimal to Hexa-Decimal "+x1+" = "+decimalToHexa(x1));

        System.out.println("-------------------------------------------------");

        System.out.println("Hexa-Decimal to Decimal "+y+" = "+hexaToDecimal(y));
        System.out.println("Hexa-Decimal to Decimal "+y1+" = "+hexaToDecimal(y1));
    }

    public static String decimalToHexa(double x){
        int t = (int)x;
        double T = x - t;
        String Ans = "";

        Stack<Integer> y = new Stack<Integer>();

        while(t != 0){
            y.push(t%16);
            t = t/16;
        }

        String t1 = "";

        while(!y.isEmpty()) {
            int t2 = y.pop();
            if(t2 == 10){
                t1 = "A";
            }
            else if(t2 == 11){
                t1 = "B";
            }
            else if(t2 == 12){
                t1 = "C";
            }
            else if(t2 == 13){
                t1 = "D";
            }
            else if(t2 == 14){
                t1 = "E";
            }
            else if(t2 == 15){
                t1 = "F";
            }
            else{
                t1 = "" + t2;
            }
            Ans = Ans + t1;
        }

        Ans = Ans + ".";

        for(int i = 0;i<4;i++){
            T = T*16;
            int temp = (int)T;
            T = T - temp;
            if(temp == 10){
                t1 = "A";
            }
            else if(temp == 11){
                t1 = "B";
            }
            else if(temp == 12){
                t1 = "C";
            }
            else if(temp == 13){
                t1 = "D";
            }
            else if(temp == 14){
                t1 = "E";
            }
            else if(temp == 15){
                t1 = "F";
            }
            else{
                t1 = "" + temp;
            }
            Ans = Ans + t1;
        }

        return Ans;
    }

    public static double hexaToDecimal(String x){
        String[] y = x.split("\\.");
        // System.out.println(y);
        double t1 = 0;
        double Ans = 0;
        int c = 0;

        for(int i = y[0].length() - 1;i>=0;i--){
            if(y[0].charAt(i) == 'A'){
                t1 = 10;
            }
            else if(y[0].charAt(i) == 'B'){
                t1 = 11;
            }
            else if(y[0].charAt(i) == 'C'){
                t1 = 12;
            }
            else if(y[0].charAt(i) == 'D'){
                t1 = 13;
            }
            else if(y[0].charAt(i) == 'E'){
                t1 = 14;
            }
            else if(y[0].charAt(i) == 'F'){
                t1 = 15;
            }
            else{
                t1 = Double.valueOf(""+y[0].charAt(i));
            }
            Ans = Ans + (t1*Math.pow(16, c));
            c++;
        }

        c = -1;

        for(int i = 0;i<y[1].length();i++){
            if(y[1].charAt(i) == 'A'){
                t1 = 10;
            }
            else if(y[1].charAt(i) == 'B'){
                t1 = 11;
            }
            else if(y[1].charAt(i) == 'C'){
                t1 = 12;
            }
            else if(y[1].charAt(i) == 'D'){
                t1 = 13;
            }
            else if(y[1].charAt(i) == 'E'){
                t1 = 14;
            }
            else if(y[1].charAt(i) == 'F'){
                t1 = 15;
            }
            else{
                t1 = Double.valueOf(""+y[1].charAt(i));
            }
            Ans = Ans + (t1*Math.pow(16, c));
            c--;
        }

        return Ans;
    }
    
}