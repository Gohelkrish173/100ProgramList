import java.util.HashMap;
import java.util.Scanner;

public class P2_Anagram {

  public static void anagram(String a,String b){
    if(a.length() != b.length()){
      System.out.print("Using Inbuilt method - given string is not anagram String.");
      return;
    }

    HashMap<Character,Integer> x1 = new HashMap<Character,Integer>();
  
    for(int i =0;i<a.length();i++){
      if(x1.containsKey(a.charAt(i))){
        x1.put(a.charAt(i),x1.get(a.charAt(i))+1);
      }
      else{
        x1.put(a.charAt(i), 1);
      }
    }

    HashMap<Character,Integer> x2 = new HashMap<Character,Integer>();

    for(int i =0;i<b.length();i++){
      if(x2.containsKey(b.charAt(i))){
        x2.put(b.charAt(i),x2.get(b.charAt(i))+1);
      }
      else{
        x2.put(b.charAt(i), 1);
      }
    }

    if(x1.equals(x2)){
      System.out.println("Using Inbuilt method - Given String is Anagram String");
    }
    else{
      System.out.println("Using Inbuilt method - Given String is not Anagram String");
    }
  }

  public static void angram_Without_InBuilt(String a,String b){
    if(a.length() != b.length()){
      System.out.print("Without Using Inbuilt method - Given String is Not Anagram String.");
      return;
    }

    int[] c1 = new int[26];
    int[] c2 = new int[26];

    for(int i = 0;i<a.length();i++){
      c1[a.charAt(i) - 'a'] = c1[a.charAt(i) - 'a'] + 1;
      c2[b.charAt(i) - 'a'] = c2[b.charAt(i) - 'a'] + 1;
    }

    for(int i = 0;i<26;i++){
      if(c1[i] != c2[i]){
        System.out.println("index = "+i+" value1 = "+c1[i]+" value2 = "+c2[i]);
        System.out.print("Without Using Inbuilt method - Given String Is Not Anagram String");
        return;
      }
    }

    System.out.print("Without Using Inbuilt method - Given String Is Anagram String.");
    
    return;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("S1 = ");
    String s1 = sc.nextLine();

    System.out.print("S2 = ");
    String s2 = sc.nextLine();

    anagram(s1, s2);
    angram_Without_InBuilt(s1, s2);
  }  
}