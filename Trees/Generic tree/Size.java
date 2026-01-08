import java.util.ArrayList;
import java.util.Stack;

public class Size {
    public static void main(String[] args) {
        int[]arr = {10 , 20 , -1 , 30 , 50 , -1 , 60 , -1 , -1 , 40 , -1 };
        Node root = constructTree(arr);
        System.out.println(size(root));
    }

    static class Node{
        int data;
        ArrayList<Node> childern = new ArrayList<>();

        public Node(int data){
            this.data = data;
        }
    }

    public static Node constructTree(int[]arr){
        Stack <Node> st = new Stack<>();
        Node root = null;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == -1 ){
                st.pop();
            }

            else{
                Node node = new Node(arr[i]);
                if(st.empty()){
                    root = node;
                }
                else{
                    st.peek().childern.add(node);
                }
                st.push(node);
            }
        }
        return root;
    }

    public static int size(Node root){
        int s = 1;
        for (Node child : root.childern) {
            s += size(child);
        }
        return s;
    }
}
