
import java.util.* ;
class Node 
{
    int data;
    Node left;
    Node right;
    Node (int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BST
{
    Node root ;
    BST()
    {
        this.root = null;
    }
    public Node Insertion(Node root, int data)
    {
        if(root==null)
            return new Node(data);
        
        if(data > root.data)
            root.right = this.Insertion(root.right, data);
        if(data < root.data)
            root.left = this.Insertion(root.left, data);
            
        return root;
    }
    public Node Search(Node root, int data)
    {
        if(root==null || root.data == data)
            return root;
        if(data > root.data)
            return this.Search(root.right, data);
        if (data < root.data)
            return this.Search(root.left, data);
        
        return root;    
    }
    public Node Delete(Node root, int data)
    {
        if(root==null)
        {
            return root;
        }
        if (data < root.data)
            root.left = this.Delete(root.left, data);
        else if (data > root.data)
            root.right = this.Delete(root.right, data);
        else 
        {
            if (root.left == null)
            {
                return root.right;
            }
            else if (root.right == null)
            {
                return root.left;
            }
            
            root.data = this.minvalue(root.right);
            
            root.right = this.Delete(root.right, root.data);
        }
        return root;
    }
    public int minvalue(Node root)
    {
        int min = root.data;
        while(root.left!=null)
        {
            root = root.left;
            min = root.data;
        }
        return min;
    }
    public int SumofNodes(Node root)
    {
        if (root==null)
            return 0;
        
        return root.data + this.SumofNodes(root.left) + this.SumofNodes(root.right);
    }
    public int HeightofTree(Node root)
    {
        if (root==null)
            return -1 ;
        int leftheight  = this.HeightofTree(root.left); 
        int Rightheight = this.HeightofTree(root.right);
        
        return Math.max(leftheight, Rightheight) + 1;
    }
    public void PreOrderTraversal(Node root)
    {
        if (root==null)
            return;
        
        System.out.print(root.data+" ");
        this.PreOrderTraversal(root.left);
        this.PreOrderTraversal(root.right);
    }
   
	public static void main(String[] args) 
	{
		BST bst = new BST();
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		while(input!=-1)
		{
		    bst.root = bst.Insertion(bst.root,input);
		    input = sc.nextInt();
		}
		
		System.out.println(bst.HeightofTree(bst.root));
		   
	}
}