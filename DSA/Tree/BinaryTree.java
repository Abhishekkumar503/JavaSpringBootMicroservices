package Tree;
class Node
{
    int data;
    Node left;
    Node right;

    public Node (int data) {
        this.data= data;
    }
}
public class BinaryTree {

    Node root;
    public void insert(int data) {
        root=insetRec(root,data);
    }

    private Node insetRec(Node root, int data) {
        if(root==null)
            root=new Node(data);
        else if (data < root.data)
            root.left=insetRec(root.left,data);
        else if (data > root.data)
            root.right=insetRec(root.right,data);

        return root;
    }

    public void inorder()
    {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if(root!=null)
        {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void preOrder()
    {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node root) {
        if(root!=null)
        {
            System.out.print(root.data + " ");
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }

    public void postOrder()
    {
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node root) {
        if(root!=null)
        {
            inorderRec(root.left);
            inorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}
