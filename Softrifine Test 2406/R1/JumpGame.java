public class JumpGame {

  // Follow the steps below to use this file

  // 1. In the main file, create an instance of this class:
  // NewClass1 instance1 = new NewClass1();

  // 2. Call the method to get the greeting message:
  // System.out.println(instance1.sayHelloFromNewClass());

  // public String sayHelloFromNewClass(){
  //   return "Hello from New Class 1";
  // }
  
  public static Boolean checkLast(int[] x){
    int index = 0;
    
    for(int i = 0;i<x.length-1;i++){
      if(x[i] <= x[i+1]){
        index = index + x[i];
      }
      else{
        continue;
      }
    }
    
    if(index == x.length-1){
      return true;
    }
    
    return false;
  }
  
  

}