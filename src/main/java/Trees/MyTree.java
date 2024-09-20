package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {


    TNode root;
    public MyTree() {}

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {
            if (value <= current.value) {
                if (current.left == null) {
                    // if left is null, insert there
                    current.left = newNode;
                    break;
                }
                // if left is not null, branch left subtree
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                }
                current = current.right;
            }
        }
    }

    // root - left - right

    void preOrderTraversal(TNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " "); // visit root
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    void inOrderTraversal(TNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }

    void postOrderTraversal(TNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }

    void levelOrderTraversal(TNode root) {
        if (root == null) {
            return;
        }
        Queue<TNode> queue  =   new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TNode node = queue.poll();
            System.out.print(node.value + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}
