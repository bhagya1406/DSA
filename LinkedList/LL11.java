class Node{
    int data;
    Node next;

    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}

public class LL11{
	public static void main(String[]args){
		// Node head = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,new Node(6,null))))));
		Node head = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,null)))));

		Node start = head;
		
		Node slow = head;
		Node fast = head;

		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}
}