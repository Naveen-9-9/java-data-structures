class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);
        return root;
    }

    

    boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        
        if (key < root.data)
            return search(root.left, key);
        return search(root.right, key);
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
}

public class binaryTreeSearch {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        System.out.print("Inorder Traversal: ");
        bst.inOrder(bst.root);

        System.out.print("\nPreorder Traversal: ");
        bst.preOrder(bst.root);

        System.out.print("\nPostorder Traversal: ");
        bst.postOrder(bst.root);

        System.out.println("\nSearch for 40: " + bst.search(bst.root, 40));
        System.out.println("Search for 90: " + bst.search(bst.root, 90));
    }
}
