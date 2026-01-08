class Node{
    int data;
    Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class LL3 {
    public static void main(String[] args) {
        Node first = new Node(1,null);
         Node second = new Node(2,null);
         Node third = new Node(3,null);
         Node fourth = new Node(4,null);
         
         first.next = second;
         second.next = third;
         third.next = fourth; 

         Node start = first;
         while(start!=null){
            System.out.println(start.data);
            System.out.println(start);
            start = start.next;
         }
    }
    
}

// o/p:- 1
//       Node@251a69d7
//       2
//       Node@7344699f
//       3
//       Node@6b95977
//       4
//       Node@7e9e5f8a
