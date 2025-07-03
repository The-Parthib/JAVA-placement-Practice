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

    // Inorder
    public static void inOrder(Node root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //postOrder traversal

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
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

    // Multiplication of elements
    public static int mul(Node root) { 
    if (root == null) {
        return 1; // Multiplicative identity
    }
    return root.data * mul(root.left) * mul(root.right);
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

    // Height of a tree
    public static int height(Node root){
        // if(root == null) return 0;
        // if(root.left == null && root.right == null) return 0;
        if(root == null || (root.left == null && root.right == null)) return 0;
        return (1+Math.max(height(root.left),height(root.right)));
    }

    // level of tree

    public static int level(Node root){
        int result = height(root);
        return (result+1);

        // if (root==null || (root.left == null && root.right == null)){
        //     return 0;
        // }
        // return 1+(1+Math.max(height(root.left),height(root.right)));
    }

    //n-th level of tree
    public static void nthLevel(Node root, int level){
        if(root==null) return;
        if (level==1) {
            System.out.print(root.data+" ");
            return;
        }
        nthLevel(root.left, level-1);
        nthLevel(root.right, level-1);
    }

    // Min value of the tree
    public static int minElement(Node root){
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(minElement(root.left), minElement(root.right)));
    }
    
    // Level Order / BFS
    public static void levelOrder(Node root){
        int length = level(root);
        for (int i = 1; i <= length; i++) {
            nthLevel(root, i);
            System.err.println();
        }
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

        // System.out.println("PreOrder traversal:");
        // preOrder(root);
        // System.out.println("\nInOrder traversal:");
        // inOrder(root);
        // System.out.println("\nPostOrder traversal:");
        // postOrder(root);

        // System.out.println("size of tree : "+size(root));
        // System.out.println("sum of tree elements : "+sum(root));
        // System.out.println("Max of tree elements : "+maxElement(root));
        // System.out.println("Height of tree : "+height(root));
        // System.out.println("Min of tree : "+minElement(root));
        // System.out.println("\nmul of tree : "+mul(root));
        // System.out.println("\nlevel of tree : "+level(root));
        // nthLevel(root, 3);
        levelOrder(root);
    }
}
