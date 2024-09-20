package Trees;

public class TreeApp {

    public static void main(String[] args) {


        MyTree tree = new MyTree();
        int[] numbers = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};

        for (int i = 0; i < 11; i++) {
            tree.insert(numbers[i]);
        }

        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("\nPre-Order Traversal of the tree: ");
        tree.preOrderTraversal(tree.root);

        System.out.println("\nIn-Order Traversal of the tree: ");
        tree.inOrderTraversal(tree.root);

        System.out.println("\nPost-Order Traversal of the tree: ");
        tree.postOrderTraversal(tree.root);

        System.out.println("\nLevel-Order Traversal of the tree: ");
        tree.levelOrderTraversal(tree.root);

    }

}
