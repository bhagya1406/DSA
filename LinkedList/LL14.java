class Node{
	int data;
	Node next;
	
	public Node(int data , Node next){
		this.data = data;
		this.next = next;
	}
}

public class LL14{
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

		Node ans = CircularLinkedList(head);
		System.out.print(ans.data);
	}

	public static Node CircularLinkedList(Node head){
		Node start = head;
		Node slow = head;
		Node fast = head;

		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;

			if(slow == fast){
				slow = head;
				while(slow!=fast){
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}
}