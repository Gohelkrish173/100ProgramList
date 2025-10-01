
public class Patterns {

  public static void P1(){
    int s = 3;
    char a = 'A';

    for(int i = 0;i<4;i++){
      for(int j=s;j>0;j--){
        System.err.print(" ");
      }

      s--;

      for(int k = 0;k<i+1;k++){
        if(i == 0){
          System.out.print((k+1) + " ");
        }
        if(i == 2){
          if(k == 0) System.out.print((k+2) + " ");
          else System.out.print((k+2)+" ");
        }
        if(i == 1){
          System.out.print((a++) + " ");
        }
        if(i == 3){
          System.out.print((a++) + " ");
        }
      }
      System.out.println("");
    }
  }

  public static void P2(int n){
    
    for(int i = 0 ;i<n;i++){
      //for space
      for(int j = 0;j<i;j++){
        System.out.print(" ");
      }

      //for star
      for(int k=(2*(n-i-1))+1;k>0;k--){
        System.out.print("*");
      }
      System.out.println("");
    }

  }

  public static void P3(int n){
    int s=0;

    for(int i = 0;i<n;i++){

      if(i == 0){
        for(int j =(2*(n-i-1))+1;j>0;j--){
          System.out.print("*");
        }
        System.out.println("");
      }
      else{
        for(int j =(n-s-1);j>0;j--){
          System.out.print("*");
        }

        for(int k=1;k<=(2*(i-1))+1;k++){
          System.out.print(" ");
        }
  
        for(int l = (n-s-1);l>0;l--){
          System.out.print("*");
        }
        System.out.println("");
        s++;
      }
    }

  }

  public static void main(String[] args){
    System.out.println("Pattern-1 :- ");
    P1();

    System.out.println("\nPattern-2 :- ");
    P2(25);

    System.out.println("\nPattern-3 :- ");
    P3(25);
  }
  
}
