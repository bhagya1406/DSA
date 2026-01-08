import java.util.ArrayList;
import java.util.Stack;

public class Traversals4 {
    public static void main(String[] args){
        int[]arr = {10 , 20 , -1 , 30 , 50 , -1 , 60 , -1 , -1 , 40 , -1 };
        Node root = constructTree(arr);
        zigZagLevel(root);
    }

    static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
        public Node(int data){
            this.data = data;
        }
    }

    public static Node constructTree(int[]arr){
        Stack<Node> st = new Stack<>();
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

    public static void zigZagLevel(Node root){
        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
        boolean direction = true;

        currentLevel.push(root);

        while(!currentLevel.isEmpty()){
            Node node = currentLevel.pop();
            System.out.println(node.data);
            if(direction){
                for(Node child : node.children){
                    nextLevel.push(child);
                }
            }
            else{
                for(int i = node.children.size()-1 ; i>=0 ; i--){
                    nextLevel.push(node.children.get(i));
                }
            }
            if(currentLevel.isEmpty()){
                Stack<Node> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
                direction = !direction;
            }
        }
    }
}
