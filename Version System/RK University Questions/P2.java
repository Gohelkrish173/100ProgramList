import java.util.Scanner;

public class P2 {
  public static void main(String[] args){
    Node head = null;
    
    // Scanner sc = new Scanner(System.in);

    Node x1 = new Node(10);
    Node x2 = new Node(20);
    Node x3 = new Node(30);
    Node x4 = new Node(40);

    head = x1;
    x1.next = x2;
    x2.next = x3;
    x3.next = x4;
    x4.next = null;

    Node Temp = ReverseLinkedList(head);

    while (Temp != null) {
      System.out.println(Temp.val);
      Temp = Temp.next;
    }

  }

  // public void insertNode(int data){
  //   Node newNode = new Node(data);
  //   if(head == null){
  //     head = newNode;
  //     return;
  //   }

  //   Node temp = head;
  //   while(temp.next != null){
  //     temp = temp.next;
  //   }
  //   temp.next = newNode;
  // }

  public static Node ReverseLinkedList(Node head){
    
    Node prev = null;
    Node current = head;
    Node next = null;

    while(current != null){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    return prev;
  }
}

class Node{
  int val;
  Node next;

  Node(int val){
    this.val = val;
    this.next = null;
  }
}