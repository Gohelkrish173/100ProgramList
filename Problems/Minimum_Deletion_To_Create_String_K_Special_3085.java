import java.util.*;

public class Minimum_Deletion_To_Create_String_K_Special_3085 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    System.out.print("Enter the S : ");
    String S = sc.nextLine();

    System.out.print("Enter The K : ");
    int K = sc.nextInt();

    System.out.print("Minimum Deletion : " + minimumDeletions(S, K));

  }

  public static int minimumDeletions(String word,int k){
    
    HashMap<Character,Integer> freq = new HashMap<>();

    // Not optimize Method to find Freq Of Char
    // for(int i = 0;i<word.length();i++){
    //   if(freq.containsKey(word.charAt(i))){
    //     freq.put(word.charAt(i), freq.get(word.charAt(i))+1);
    //   }
    //   else{
    //     freq.put(word.charAt(i),1);
    //   }
    // }

    // Optimize Method to find Freq of Char
    for(char x : word.toCharArray()){
      // this function is use for where hashmap not contain the key then it create the key of that char with value of 0 and if key is contain in hashmap then increase it's value by 1.

      // we can't give the default value 0 at that time, if hashmap don't contain that char then it takes value null. there for we use this function getorDefaul. if key not contain in hash map it define and set value 0  
      freq.put(x, freq.getOrDefault(x, 0)+1);
    }

    // now create a List For Sort the freq
    List<Integer> freqList = new ArrayList<>(freq.values());
    Collections.sort(freqList);

    int minDeletion = Integer.MAX_VALUE;

    for(int i =0;i<freqList.size();i++){
      int targetMin = freqList.get(i);
      int targetMax = targetMin + k;
      int deletion = 0;

      for(int x : freqList){
        if(x < targetMin){
          deletion += x;
        }
        else if(x > targetMax){
          deletion += (x - targetMax);
        }
      }

      minDeletion = Math.min(minDeletion, deletion);
    }

    return minDeletion;
  }

}