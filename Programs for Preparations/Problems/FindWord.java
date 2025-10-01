import java.util.HashMap;

public class FindWord {
  public static void main(String[] args) {
    String s = "Cows eats";
    System.out.println(findWord(s));
  }

  static String findWord(String s){
    String[] arr = s.split("\\s+");
    String res = "";
    int maxFreq = Integer.MIN_VALUE;
    for(String st : arr){
      HashMap<Character,Integer> map = new HashMap<>();
      for(int i=0;i<st.length();i++){
        char c = st.toLowerCase().charAt(i);
        map.put(c, map.getOrDefault(c, 0)+1);
      }
      int currMax = Integer.MIN_VALUE;
      for(int freq : map.values()){
        if((currMax < freq)) currMax = freq;
      }
      if((currMax != 1) && (currMax > maxFreq)){
        res = st;
        maxFreq = currMax;
      }
    } 

    if(maxFreq == Integer.MIN_VALUE) return "-1";
    return res;
  }
}
