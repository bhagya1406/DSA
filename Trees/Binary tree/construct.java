import java.util.Stack;

public class construct {
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

    // # CONSTRUCT A BINARY TREE # // 

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

    // # PRINT A BINARY TREE # //

    public static void printTree(Node root){

        if(root == null){
            return;
        }

        String str = " " ;

        if (root.left == null) {
            str += " . " + " <- ";
        }
        else{
            str += root.left.data + " <- " ;
        }
       
        str += root.data + " -> ";

        if(root.right == null){
            str += " . ";
        }
        else{
            str += root.right.data;
        }
        System.out.println(str);

        printTree(root.left);
        printTree(root.right);

    }

    // # SUM OF A NODE # //

    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int sum = root.data;
        sum += sum(root.left);
        sum += sum(root.right);
        return sum;
    }

    // # SIZE OF A BINARY TREE # //

    public static int Size(Node root){
        int s = 1;
        if(root == null){
            return 0;
        }
        if(root.left != null){
            s++;
        }
        else if(root.right != null){
            s++;
        }
        return s+1;
    }

    // # MAXIMUM NUMBER IN A BINARY TREE # //

    public static int max(Node root){
        if(root ==  null){
            return 0;
        }
        int max = root.data;
        int Left = max(root.left);
        int Right = max(root.right);
        int ans = Math.max(max , Math.max(Left , Right));
        return ans;
    }

    // # HEIGHT OF A BINARY TREE # //

    public static int height(Node root){
        if(root == null){
            return -1;
        }
        int left = height(root.left);
        int right = height(root.right);
        int max =  Math.max(left, right);
    
        return max+1;
    }



    public static void main(String[] args) {
        Integer[] arr = {1 , 2 , 4 , null , null , 5 , null , null , 3 , null , 6 , null , null};
        Node root = constructTree(arr);
        // printTree(root);
        System.out.println(sum(root));
        // System.out.println(Size(root));
        // System.out.println(max(root));
        // System.out.println(height(root));
    }
}
