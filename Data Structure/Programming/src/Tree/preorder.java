package Tree;

public class preorder {
    class Node {
        int data;
        Node left;
        Node right;
    }

    public static void preOrder(Node root) {
        System.out.print(root.data);
        System.out.print(" ");
        if(root.left != null)
            preOrder(root.left);
        if(root.right != null)
            preOrder(root.right);
        return;
    }
}
