import java.util.*;

// Second Largest Number

public class P1{
  
  public static void main(String[] args){
    List<Integer> x = List.of(5,3,8,1,2);

    int largest = Integer.MIN_VALUE;

    for(int i = 0;i<x.size();i++){
      if(largest < x.get(i)){
        largest = x.get(i);
      }
    }

    int secondLargest = Integer.MIN_VALUE;

    for(int i = 0;i<x.size();i++){
      if(x.get(i) != largest && secondLargest < x.get(i)){
        secondLargest = x.get(i);
      }
    }
 
    System.out.println("Second Largest Element in The List : " + secondLargest);

  }

}