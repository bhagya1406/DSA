class Node{
    int data;
    Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class LL1{
    public static void main(String[] args) {
         Node first = new Node(1,null);
         Node second = new Node(2,null);
         Node third = new Node(3,null);
         Node fourth = new Node(4,null);
         
         first.next = second;
         second.next = third;
         third.next = fourth; 

         System.out.println(first.data + " " + first.next);
         System.out.println(second.data + " " + second.next);
         System.out.println(third.data + " " + third.next);
         System.out.println(fourth.data + " " + fourth.next);
        }
    }

// O/p:- 1 Node@251a69d7
//       2 Node@7e9e5f8a
//       3 Node@8bcc55f
//       4 null