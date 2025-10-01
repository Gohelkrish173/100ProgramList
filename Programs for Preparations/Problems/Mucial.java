public class Mucial {
  public static void main(String[] args){
    String[] S = {"abeayh","2"};

    System.out.println(Music(S));
  } 
  
  public static String Music(String[] StrArr){
    int m = 0;
    int r = 0;
    int k = Integer.parseInt(StrArr[1]);
    String S = StrArr[0];

    for(int i = 0;i<StrArr[0].length();i++){
      if(
          S.charAt(i) == 'a' || 
          S.charAt(i) == 'e' ||
          S.charAt(i) == 'i' ||
          S.charAt(i) == 'o' ||
          S.charAt(i) == 'u'
        ){
          m++;
        }
        else{
          r++;
        }
    }

    if(m == r){
      return m+ "";
    }
    else if (m*r%k == 0){
      return m + "";
    }

    else{
      return "-1";
    }
  }
}
