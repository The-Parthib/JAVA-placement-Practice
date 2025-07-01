package Trees;

public class Implementation {
    public static class Node{
        int data;
        Node left;
        Node right;
    

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

    public static void display(Node root){

        // PreOrder Traversal
        if(root==null) return;
        System.out.print(root.data+" -> ");
        if(root.left != null){
            System.out.print(root.left.data+" , ");
        }
        else{
            System.out.print("null , ");
        }
        if(root.right != null){
            System.out.print(root.right.data);
        }
        else{
            System.out.print("null");
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void preOrder(Node root){
        if (root == null){
            return;
        }
        System.err.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Size of tree
    public static int size(Node root){
        if (root == null) {
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }

    // Sum of node elements
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        return (root.data+sum(root.left)+sum(root.right));
    }

    // Max tree element
    public static int maxElement(Node root){
        if (root == null) {
            return Integer.MIN_VALUE; // 0 is all time greater than a negetive number..
            // return 0; // problem occures when the node is -ve; when we use return 0;
        }
        // int a = root.data;
        // int b = maxElement(root.left);
        // int c = maxElement(root.right);

        // return Math.max(a, Math.max(b, c));
        return Math.max(root.data, Math.max(maxElement(root.left), maxElement(root.right)));
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        display(root);
        preOrder(root);

        // System.out.println("size of tree : "+size(root));
        // System.out.println("sum of tree elements : "+sum(root));
        System.out.println("Max of tree elements : "+maxElement(root));
    }
}
