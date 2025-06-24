import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      System.out.println("Program-3 : ");
      
      Maximum_Profite m = new Maximum_Profite();

      int[] case1 = {7,1,5,3,6,4};
      int[] case2 = {1,2,3,4,5};
      int[] case3 = {7,6,4,3,1};
      
      System.out.println("Largest Number - Case 1 : "+m.maxProfite(case1));
      System.out.println("--------------------------------");
      System.out.println("Largest Number - Case 2 : "+m.maxProfite(case2));
      System.out.println("--------------------------------");
      System.out.println("Largest Number - Case 3 : "+m.maxProfite(case3));
   
      System.out.println("\nProgram-2 : ");
      
      JumpGame j = new JumpGame();
      
      int[] x1 = {2,3,1,1,4};
      int[] x2 = {3,2,1,0,4};
      
      System.out.println("Case 1 [2,3,1,1,4] : "+j.checkLast(x1));
      System.out.println("Case 2 [3,2,1,0,4] : "+j.checkLast(x2));
      
      System.out.println("\nProgram-1 : ");
      
      LargestNumber L = new LargestNumber();
      
      int[] x5 = {10,2};
      int[] x4 = {3,30,34,5,9};

      System.out.println("Case 1 [10,2] : Find Largest : "+L.findLargset(x5));
      System.out.println("Case 2 [3,30,34,5,9] : Find Largest : "+L.findLargset(x4));
  }
}