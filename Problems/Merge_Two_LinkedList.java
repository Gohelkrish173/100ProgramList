import java.util.*;

class Node{
  int val;
  Node next;
  Node() {}
  Node(int val){this.val = val;}
  Node(int val,Node next){this.val = val;this.next = next;}
}

public class Merge_Two_LinkedList{

  public static Node merge_List(Node L1,Node L2){
    Node Main = new Node();
    Node head = Main;
    
    head = head.next;

    while(L1 != null && L2 != null){
      if(L1.val < L2.val){
        head.val = L1.val;
        System.out.println(head.val +"|" + head.next);
        L1 = L1.next;
      }
      else{
        head.val = L2.val;
        L2 = L2.next;
        System.out.println(head.val +"|" + head.next);
      }
      head = head.next;
    }

    while(L1 != null){
      head.val = L1.val;
      System.out.println(head.val +"|" + head.next);
      head = head.next;
    }

    while(L2 != null){
      head.val = L2.val;
      System.out.println(head.val +"|" + head.next);
      head = head.next;
    }

    return Main.next;
  }

  public static void main(String[] args){
  
    Node L1 = new Node();
    Node head1 = L1;

    head1.val = 1;
    System.out.println(L1.val);
    head1.next = new Node(2);
    System.out.println(L1.next.val);
    head1.next.next = new Node(4);
    System.out.println(L1.next.next.val);

    System.out.println(L1.val);

    Node L2 = new Node();
    Node head2 = L2;

    head2.val = 1;
    head2.next = new Node(3);
    head2.next.next = new Node(4);

    System.out.println(L2.val + L2.next.val + L2.next.next.val);

    Node L = merge_List(L1,L2);
  }
}