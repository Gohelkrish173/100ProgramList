public class Missing_Positive_Integer{
  public static void main(String[] args) {
    int[] A = {-5,-8,0,5,8,6};

    int[] B = Bubble_Sort(A);

    // for(int i =0;i<B.length;i++) System.out.println(B[i]);
    
    System.out.println("Print the First Missing Value : "+ findMissingPositive(B));
  }

  public static int findMissingPositive(int[] a){
    boolean set = false;
    int ans = 0;
    int temp = 0;

    for(int i = 0;i<a.length;i++){
      if(a[i] > 0){
        if(!set){
          temp = a[i];
          set = true;
        }
        if(temp == a[i]){
          temp++;
        }
        else{
          ans = temp;
          break;
        }
      }
    }

    return ans;
  }

  public static int[] Bubble_Sort(int[] a){
    
    int temp = 0;

    for(int i = 0;i<a.length-1;i++){
      for(int j = i+1;j<a.length;j++){
        if(a[i] > a[j]){
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }

    return a;
  }

}