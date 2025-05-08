import java.util.*;

public class s1_1{
  public static void main(String[] arms){
    Scanner sc = new Scanner(System.in);

    System.out.println("needle");
    String needle = sc.nextLine();
    System.out.println("haystack");
    String haystack = sc.nextLine();

    char[] n = new char[needle.length()];
    char[] h = new char[haystack.length()];
    int x = 0;
    int ans = 0;
    int k = 0;

    System.out.println(haystack.indexOf(needle) >= 0 ? haystack.indexOf(needle) : -1);

    // Or Long method
    // for(int i = 0;i<needle.length();i++){
    //   n[i] = needle.charAt(i);
    //   // System.out.println(n);
    // }

    // for(int i = 0;i<haystack.length();i++){
    //   h[i] = haystack.charAt(i);
    //   // System.out.println(h);
    // }

    // System.out.println(h.length);
    // System.out.println(haystack.length());

    // if(needle.length() > haystack.length()){
    //   System.out.print(-1);
    // // System.out.print("1st Condition");
    // }
    // else{
    //   for(int i=0;i<h.length;i++){
    //     if(h[i] == n[0]){
    //       System.out.println("else part");
    //       ans = i;
    //       k = i+1;
    //       x++;
    //       if(k > h.length-1){
    //         break;
    //       }
    //       else{
    //         for(int j = 1;j<n.length;j++){
    //           if(h[k] == n[j]){
    //             System.out.println("third part");
    //             x++;
    //           }
    //           k = k+1;
    //           if(k > h.length - 1){
    //             break;
    //           }
    //         }
    //       }
    //       if(x == needle.length()){
    //         break;
    //       }
    //       else{
    //         x = 0;
    //       }
    //     }
    //   }
    //   if(x == n.length){
    //     System.out.print(ans);
    //   }
    //   else{
    //     System.out.print(-1);
    //   }
    // }
  }
}