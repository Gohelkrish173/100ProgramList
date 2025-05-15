import java.util.Scanner;

class Node{
  int val;
  Node left;
  Node right;
  Node(int val){
    this.val = val;
  }
}

public class Tree_Sort{
  static int index = 0;

  public static int[] treeSort(int[] X){
    int[] x = X;

    Node root = new  Node(x[0]);
    for(int i = 1;i<x.length;i++){
      root = insertBST(root, x[i]);
    }
    x = inOrder(root,x);

    return x;
  }

  public static Node insertBST(Node root,int v){
    if(root.val > v){
      
      if(root.left == null){
        Node n = new Node(v);
        root.left = n;
      }
      else{
       root.left = insertBST(root.left, v);
      }

    }
    else{

      if(root.right == null){
        Node n = new Node(v);
        root.right = n;
      }
      else{
        root.right = insertBST(root.right, v);
      }

    }

    return root;
  }

  public static int[] inOrder(Node root,int[] x){
    if(root.left != null){ inOrder(root.left,x); }
    x[index] =  root.val;
    index = index +1;
    if(root.right != null){ inOrder(root.right,x); }
  
    return x;
  }

  public static int[] inputList_for_sorting(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the Size Of Array : ");
    int x = sc.nextInt();

    int[] l = new int[x];

    System.out.println("Enter the Element of Array : ");
    for(int i = 0;i<x;i++){
      l[i] = sc.nextInt();
    }

    return l; 
  }

  public static void print_Sorted_Array(int[] x){
    
    System.out.print("[");
    for(int i = 0;i<x.length;i++){
      System.out.print(x[i] + " ");
    }
    System.out.print("]");

  }

  public static void main(String[] args){
    int[] x = inputList_for_sorting();

    print_Sorted_Array(treeSort(x));
  }

}