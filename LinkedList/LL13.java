class Node{
	int data;
	Node next;
	
	public Node(int data , Node next){
		this.data = data;
		this.next = next;
	}
}

public class LL13{
	public static void main(String[]args){
		Node head = new Node(1,null);
        	Node second = new Node(2,null);
        	Node third = new Node(3,null);
        	Node fourth = new Node(4,null);
        	Node fifth = new Node(5,null);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = third;

		boolean ans = CircularLinkedList(head);
		System.out.println(ans);
	}
	
	public static boolean CircularLinkedList(Node head){
		Node start = head;
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				return true;
			}
		}
		return false;
	}
}