public class Maximum_Profite {
 
  public static int maxProfite(int[] x){
    int sum = 0;
    
    for(int i = 0;i<x.length-1;i++){
      if(x[i+1] > x[i]){
        sum = sum + (x[i+1] - x[i]);
      }
    }
    
    return sum;
  }
  
}