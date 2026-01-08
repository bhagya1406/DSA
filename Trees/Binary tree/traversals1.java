import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class traversals1 {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static class Pair{
        Node node;
        int state;

        public Pair(Node node , int state){
            this.node = node;
            this.state = state;
        }
    }

    public static Node constructTree(Integer[]arr){
        Node root = new Node(arr[0]);
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));
        int ind = 0;
        while(!st.isEmpty()){
            Pair top = st.peek();

            if(top.state == 1){
                ind++;
                if(arr[ind] != null){
                    Node leftChild = new Node(arr[ind]);
                    top.node.left = leftChild;
                    st.push(new Pair(leftChild, 1));
                }
                top.state++;
            }

            else if(top.state == 2){
                ind++;
                if(arr[ind] != null){
                    Node rightChild = new Node(arr[ind]);
                    top.node.right = rightChild;
                    st.push(new Pair(rightChild, 1));
                }
                top.state++;
            }

            else{
                st.pop();
            }
        }
        return root;
    }

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }

        Queue <Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node node = q.poll();
            System.out.println(node.data);
            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1 , 2 , 4 , null , null , 5 , null , null , 3 , null , 6 , null , null};
        Node root = constructTree(arr);
        levelOrder(root);
    }
}
