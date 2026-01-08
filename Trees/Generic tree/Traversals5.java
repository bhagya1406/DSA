import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Traversals5 {
    public static void main(String[] args) {
        int[]arr = {10 , 20 , -1 , 30 , 50 , -1 , 60 , -1 , -1 , 40 , -1 };
        Node root = constructTree(arr);
        mirror(root);
    }

    static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data){
            this.data = data;
        }
    }

    public static Node constructTree(int[]arr){
        Stack <Node> st = new Stack<>();
        Node root = null;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == -1){
                st.pop();
            }

            else{
                Node node = new Node(arr[i]);
                if(st.empty()){
                    root = node;
                }
                else{
                    st.peek().children.add(node);
                }
                st.push(node);
            }
        }
        return root;
    }

    // public static void printTree(Node root){
    //     StringBuilder sb = new StringBuilder();
    //     sb.append(root.data).append(" -> ");

    //     for(Node child : root.children){
    //         sb.append(child.data).append(" , ");
    //     }
    //     System.out.println(sb);

    //     for(Node child : root.children){
    //         printTree(child);
    //     }
    // }

    public static void mirror(Node root){
        for(Node child : root.children){
            mirror(child);
        }
        Collections.reverse(root.children);
    }
}
