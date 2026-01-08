class Node{
    int data;
    Node next;

    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}

public class LL6 {
    public static void main(String[] args) {
        Node head = new Node(1,new Node(2,new Node(3,null)));
        head.next = null;

        Node start = head;
        while(start!=null){
            System.out.println(start.data);
            start=start.next;
        }
    }
}

// o/p:- 1