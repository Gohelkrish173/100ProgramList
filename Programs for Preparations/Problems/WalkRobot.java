public class WalkRobot {
  public static void main(String[] args) {
    int g = 4;
    int i1 = 0;
    int i2 = 3;

    String[] arr = {"S","W","N","N"};
    
    int moveX = i1;
    int moveY = i2;

    for(String dir : arr){
      if(dir == "S"){
        moveX++;
      }else if(dir == "N"){
        moveX--;
      }else if(dir == "E"){
        moveY++;
      }else{
        moveY--;
      }
    }

    if((moveX == i1)&&(moveY == i2)){
      System.out.println("RESTART");
    }else if((moveX < 0)||(moveX > g-1)||(moveY < 0)||(moveY > g-1)){
      System.out.println("DEAD");
    }else{
      System.out.println("RANDOM");
    }
  }
}
