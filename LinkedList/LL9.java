
class Node{
    int data;
    Node next;

    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}

public class LL9 {
    public static void main(String[] args) {
        Node head = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,new Node(6,null))))));
        Node start = head;
        Recursive(start);
    }

    public static void Recursive(Node start){
        if(start == null){
            return;
        }
        Recursive(start.next);
        System.out.print(start.data + " ");
        
    }
}

// o/p:- 6 5 4 3 2 1 
