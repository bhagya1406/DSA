class Node{
	int data;
	Node next;
	
	public Node(int data , Node next){
		this.data = data;
		this.next = next;
	}
}

public class LL17{
	public static void main(String[]args){
		Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, new Node(7, new Node(8,null))))))));
		int k = 3;
		Node ans = Remove(head, k);
		System.out.print(ans);
	}

	public static Node Remove(Node head , int k){
		Node slow = head;
		Node fast = head;
		int i =0;
		while(i<k){
			fast = fast.next;
			i++;
		}

		while(fast.next!=null){
			slow = slow.next;
			fast = fast.next;
		}

		Node temp = slow.next;
		slow.next = slow.next.next;
		temp = null;

		return head;
	}
}