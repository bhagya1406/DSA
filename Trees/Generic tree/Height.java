import java.util.ArrayList;
import java.util.Stack;

// height = no. of edges
// no of edges is always less than nodes by 1 

public class Height {
    public static void main(String[] args) {
        int[]arr = {10 , 20 , -1 , 30 , 50 , -1 , 60 , -1 , -1 , 40 , -1 };
        Node root = constructTree(arr);
        System.out.println(height(root));
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

    public static int height(Node root){
        // # if height = 0 and we retrun height+1 output is 3 #
        // # if height = 0 and we return height output is 0 #
        int height = -1;
        for(Node child : root.children){
            int maxHeight = height(child);
            if(maxHeight > height){
                height = maxHeight;
            }
        }
        return height+1;
    }
}
