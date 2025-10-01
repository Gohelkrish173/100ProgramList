public class ReverseLinkedList{

 public static void main(String[] args){
 	Node head = null;
	
	Node x1 = new Node(10);
	Node x2 = new Node(20);
	Node x3 = new Node(30);

	head = x1;
	x1.next = x2;
	x2.next = x3;
	x3.next = null;

	Node Ans = reverseNode(head);

	while(Ans != null){
		System.out.println(Ans.val);
		Ans = Ans.next;
	}
 }

 public static Node reverseNode(Node head){
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
	
	public Node(int val){
		this.val = val;
	}
}