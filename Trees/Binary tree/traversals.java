import java.util.Stack;

public class traversals {
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

    // # PREORDER TRAVERSALS # // 

    public static void preOrder(Node root){
        if(root == null){
            return ;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    // # POSTORDER TRAVERSALS # //

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    // # INORDER TRAVERSALS # //
    
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void main(String[] args) {
        Integer[] arr = {1 , 2 , 4 , null , null , 5 , null , null , 3 , null , 6 , null , null};
        Node root = constructTree(arr);
        // preOrder(root);
        postorder(root);
        // inorder(root);
    }
}
