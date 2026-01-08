//ITERATIVE APPROACH

class Node{
    int data;
    Node next;

    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}

public class LL7 {
    public static void main(String[] args) {
        Node head = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,new Node(6,null))))));

        Node start = head;
        while(start!=null){
            System.out.println( start.data  + "  " +  start );
            start = start.next;
        }
    }
}

// o/p:- 1  Node@251a69d7
//       2  Node@7e9e5f8a
//       3  Node@8bcc55f
//       4  Node@58644d46
//       5  Node@14dad5dc
//       6  Node@18b4aac2
