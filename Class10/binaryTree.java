class treeNode{
    int data;
    treeNode left,right;
    treeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class binaryTree {
    treeNode root;
    binaryTree(){
        this.root = null;
    }
    public void inOrderTraversal(treeNode root){
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
    public void preOrderTraversal(treeNode root){
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public void postOrderTraversal(treeNode root){
        if (root == null) {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
        bt.root = new treeNode(1);
        treeNode temp = bt.root;
        temp.left = new treeNode(2);
        temp.left.left = new treeNode(4);
        temp.left.right = new treeNode(5);

        temp.right = new treeNode(3);
        temp.right.left = new treeNode(6);
        temp.right.right = new treeNode(7);

        System.out.println("Inorder traversal");
        bt.inOrderTraversal(temp);
        System.out.println("\npreorder traversal");
        bt.preOrderTraversal(temp);
        System.out.println("\npostorder traversal");
        bt.postOrderTraversal(temp);
    }
}
