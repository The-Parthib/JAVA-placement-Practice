package Trees;

public class Implementation {
    public static class Node{
        int data;
        Node left;
        Node right;
    

    Node(int data){
        this.data = data;
    }
}

    public static void display(){

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

        System.out.println(root.left.left.data);
    }
}
