import java.util.*;

public class MiddleOfSinglyLinkedList{
    public static void main(String[] args){

        Node y = input();

        System.out.println("Ans : "+middlePoint(y));
    }

    public static Node input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The N:");
        int n = sc.nextInt();

        // Create a Linked List with null
        Node h = null;
        Node t = null;
        
        for(int i = 0;i<n;i++){
            Node newNode = new Node(sc.nextInt());
            // First Check if Linked List Null then put first Node in Linked List and Give a head and tail to it.
            if(h == null){
                h = newNode;
                t = newNode;
            }
            // if head is Not null then we put new Node in Tail's next address
            else{
                // first tail.next == null then we put newNode into next Address
                t.next = newNode;
                // then apoint reference of new Node in tail
                t = newNode;
            }
        }

        return h;
    }

    public static int middlePoint(Node y){
        Node x = y;
        int count = 0;

        while(x != null){
            count++;
            x = x.next;
        }
        
        int n = count/2;

        Node z = y;
        for(int i = 0;i<n;i++){
            z = z.next;
        }

        return z.val;
    }
}

class Node{
    int val;
    Node next;

    Node(){}
    Node(int x){
        this.val = x;
    }

}