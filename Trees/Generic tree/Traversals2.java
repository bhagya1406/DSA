//combined => pre-order + post-order

import java.util.ArrayList;
import java.util.Stack;

public class Traversals2 {

    public static void main(String[] args) {
        int[]arr = {10 , 20 , -1 , 30 , 50 , -1 , 60 , -1 , -1 , 40 , -1 };
        Node root = constructTree(arr);
        combined(root);
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

// for loop chya var sop takla tr to preoorder node asnar
// for loop chya khali sop takla tr to postorder node asnar

// for loop chya at madhe function calling chya var sop lihla tr to preorder edge asnar
// for llop chya at madhe function calling chya khali sop lihla tr to postorder edge asnar

    public static void combined(Node root){
        System.out.println("node pre-order : " + root.data);
        for(Node child : root.children){
            System.out.println("edge pre-order : " + root.data + " -> " + child.data);
            combined(child);
            System.out.println("edge post-order : " + root.data + " -> " + child.data);
        }
        System.out.println("node post-order : " + root.data);
    }
}
