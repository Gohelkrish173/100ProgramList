import java.util.*;

// Clock Angle

public class P7{
    public static void main(String[] args){
        double h = 3;
        double m = 40;

        System.out.println("Angle of 12:55 = "+angle(h,m));
    }

    public static double angle(double h,double m){
        double angle = h*(30)-(m/5)*30;
        double minute = m*30/60;

        double ans = angle + minute;

        return Math.abs(ans);
    }

}