class Node{
    int data;
    Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class LL2 {
    public static void main(String[] args) {
        Node head = new Node(1,new Node(2,new Node(3,null)));
        Node last = new Node(5,null);
        last.next = head;
        Node start = last;
        while(start!=null){
            System.out.print(start.data + " ");
            start= start.next;
        }
    }
    
}

// o/p:- 5 1 2 3