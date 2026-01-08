class Node{
    int data;
    Node next;

    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}

public class LL10 {
    public static void main(String[] args) {
        Node head = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,new Node(6,null))))));
        Node start = head;
        int ans = Insert(start);
        System.out.println(ans);
    }
    
    public static int Insert(Node start){
        int index = 0;
        while(start!=null){
            if(index == 2){
                Node seven = new Node(7,null);
                Node temp = start.next;
                start.next = seven;
                seven.next = temp;
                return;
            }
            index ++;
            start = start.next;
        }
        return;
    }
}
