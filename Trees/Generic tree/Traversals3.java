// level-order

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversals3 {
    public static void main(String[] args) {
        int[]arr = {10 , 20 , -1 , 30 , 50 , -1 , 60 , -1 , -1 , 40 , -1 };
        Node root = constructTree(arr);
        levelOrder(root);
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

    public static void levelOrder(Node root){
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int times = q.size();
            for(int i = 0 ; i<times ; i++){
                Node node = q.poll();
                System.out.println(node.data);
                for(Node child : node.children){
                    q.add(child);
                }
            }
            
        }            
    }
}


