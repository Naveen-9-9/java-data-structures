class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}


class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
}
class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        System.out.print("Preorder Traversal: ");
        tree.preOrder(tree.root);
        System.out.println("");
        
        System.out.print("\nInorder Traversal: ");
        tree.inOrder(tree.root);
        System.out.println("");
        
        System.out.print("\nPostorder Traversal: ");
        tree.postOrder(tree.root);
    }
}
