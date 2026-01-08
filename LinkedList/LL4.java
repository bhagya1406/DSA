class Node{
    int data;
    Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class LL4 {
    public static void main(String[] args) {
        Node head = new Node(1,null);
        head.next = new Node(2,null);
        head.next.next = new Node(3,null);
        head.next.next.next = new Node(4,null);

        Node start = head;
        while(start!= null){
            System.out.print(start.data + " ");
            start= start.next;
        }
    }
    
}

// o/p:- 1 2 3 4 
