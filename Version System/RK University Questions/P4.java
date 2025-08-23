import java.util.*;

public class P4 {
  public static void main(String[] args){
    List<String> x = new ArrayList<>(Arrays.asList("Sandip","Is","Good","Good","Boy."));

    List<String> y = removeDuplicate(x);
    
    for(int i = 0;i<y.size();i++){
      System.out.print(y.get(i) + " ");
    }

  } 

  public static List<String> removeDuplicate(List<String> x){
    List<String> y = new ArrayList<>();

    for(String k : x){
      if(!y.contains(k)){
        y.add(k);
      }
    }

    return y;
  }
}
