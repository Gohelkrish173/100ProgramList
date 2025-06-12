
public class P1{

  public static int getValue(){
    try {
      int a = 1/0;
      System.out.println("1");
      return 1;
    } catch (Exception e) {
      System.out.println("2");
      return 2;
    }
    finally{
      System.out.println("3");
      return 3;
    }
  }

  public static void main(String[] args) {
    int a = getValue();
    System.out.println("Ans : "+a);
  }
}