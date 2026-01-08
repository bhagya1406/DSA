class Node{
    int data;
    Node next;

    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}

public class LL5 {
    public static void main(String[] args) {
        Node head = new Node(1,new Node(2,new Node(3,null)));
        Node fifth = new Node (5,null);

        Node temp = head.next;
        head.next = fifth;
        fifth.next = temp;

        Node start = head;
        while(start!=null){
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}

// o/p:- 1 5 2 3 