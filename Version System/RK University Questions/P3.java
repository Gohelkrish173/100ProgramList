public class P3 {
  public static void main(String[] args){
    String x1 = "krish173";
    String x2 = "Krish@173";
    String x3 = "KRISH173";
    String x4 = "Krish@Gohel";
    String x5 = "kri";

    System.out.println(x1 + " = " + checkPassword(x1));
    System.out.println(x2 + " = " + checkPassword(x2));
    System.out.println(x3 + " = " + checkPassword(x3));
    System.out.println(x4 + " = " + checkPassword(x4));
    System.out.println(x5 + " = " + checkPassword(x5));
  }

  public static boolean checkPassword(String x){
    if(x.length() < 8){
      return false;
    }

    boolean upper = false;
    boolean lower = false;
    boolean special = false;
    boolean number = false;

    for(char y : x.toCharArray()){
      if(Character.isUpperCase(y)){
        upper = true;
      }
      if(Character.isLowerCase(y)){
        lower = true;
      }
      if(Character.isDigit(y)){
        number = true;
      }
      if(!Character.isLetterOrDigit(y)){
        special = true;
      }
    }

    return upper && lower && special && number ? true : false;
  }
}
