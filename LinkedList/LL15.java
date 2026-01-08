class Node{
	int data;
	Node next;

	public Node(int data , Node next){
		this.data = data;
		this.next = next;
	}
}

public class LL15{
	public static void main(String[]args){
		Node head = new Node(1, new Node(2, new Node(1, new Node(2, new Node(1, null)))));
		boolean ans = Palindrome(head);
		System.out.print(ans);
	}

	public static boolean Palindrome(Node head){
		Node slow = head;
		Node fast = head;

		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}

		Node start = head;
		Node previous = null;
		Node temp = head;

		while(temp!=null){
			Node front = temp.next;
			temp.next = previous;
			previous = temp;
			temp = front;
		}

		while(previous == null || start!= null){
			if(previous.data != temp.data){
				return false;
			}
			previous = previous.next;
			temp = temp.next;
		}
		return true;
	}
}