class Node{
    int data;
    Node next;

    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}

public class LL12{
	public static void main(String[]args){
		Node head = new Node(1,new Node(2,new Node(3,new Node(4,null))));
		Node ans = Reverse(head);
	}

	public static Node Reverse(Node head){
		Node start = head;
		Node prev = null;
		Node temp = head;
		while(temp!=null){
			Node front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}
		return prev;
	}
}

