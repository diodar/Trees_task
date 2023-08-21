package app;

public class Main {

    public static void main(String[] args) {

        BinaryTree bTree = new BinaryTree();
        bTree.getData();

        System.out.println("Inorder traversal");
        bTree.inorder(bTree.root);

        System.out.println("\nPreorder traversal ");
        bTree.preorder(bTree.root);

        System.out.println("\nPostorder traversal");
        bTree.postorder(bTree.root);
    }
}