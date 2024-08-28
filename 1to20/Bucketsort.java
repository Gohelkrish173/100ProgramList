import java.util.*;

public class Bucketsort {
  public static List<Float> insertion(List<Float> x){
    for(int i = 1;i< x.size();i++){
      float key = x.get(i);
      int j = i - 1;

      while (j >= 0 && x.get(i)>key) {
        x.set(j+1, x.get(j));
        j = j-1;
      }
      x.set(j+1, key);
    }

    return x;
  }
  
  public static float[] Bucketsort(float[] x){
    int n = x.length;

    //1) Create n empty buckets
    List<Float>[] buckets = new ArrayList[n];
    for(int i = 0;i<n;i++){
      buckets[i] = new ArrayList<>();
    }

    //2) put array elements in different buckets
    for(int i=0;i<n;i++){
      int bi = (int)(10 * x[i]);
      buckets[bi].add(x[i]);
    }

    //3) sort individual bucket using insertion sort
    for(int i =0;i<n;i++){
      insertion(buckets[i]);
    }

    //4)Concat all bucket into array
    int index = 0;
    for(int i=0;i<n;i++){
      for(int j = 0;j<buckets[i].size();j++){
        x[index] = buckets[i].get(j);
        index++;
      }
    }

    return x;
  };
  
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);

    System.out.print("Enter a Number : ");
    int n = sc.nextInt();

    float[] x = new float[n];

    for(int i = 0;i<n;i++){
      System.out.print("x["+i+"] : ");
      x[i] = sc.nextFloat();
    }

    x = Bucketsort(x);

    System.out.print("[");
    for(int j = 0;j<x.length;j++){
      System.out.print(x[j] + " ");
    }
    System.out.print("]");
  }
}