class Node{
	int data;
	Node next;
	
	public Node(int data , Node next){
		this.data = data;
		this.next = next;
	}
}

public class LL16{
	public static void main(String[]args){
		// Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
		Node head = new Node(1, new Node(2, new Node(3, new Node(4,null))));
		Node ans = Mid(head);
		System.out.println(ans.data);
	}

	public static Node Mid(Node head){
		Node mid = head;
		Node slow = head;
		Node fast = head;

		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
			mid = slow;
		}
		Node temp = mid.next;
		mid.next = null;
		mid.next = temp;
		return mid;
	}
}