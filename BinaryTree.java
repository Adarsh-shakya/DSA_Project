class nodee
{
    nodee left,right;
    int key;
   public nodee(int item)
    {
    key=item;
    left=right=null;
    }
}
 class BinaryTree 
 {
    nodee root;
    BinaryTree()
    {
      root=null;
    }
    
    public void preorder(nodee node )
    {
     if(node==null)
         return;
     System.out.println(node.key);
     preorder(node.left);
     preorder(node.right);
    }
    public void inorder(nodee node )
    {
     if(node==null)
         return;
     inorder(node.left);
     System.out.println(node.key);
     inorder(node.right);
    }
    public void postorder(nodee node )
    {
     if(node==null)
         return;
     postorder(node.left);
     postorder(node.right);
     System.out.println(node.key);
    }
    void inorder()
    {
      inorder(root);
    }
    void preorder()
    {
      preorder(root);
    }
    void postorder()
    {
      postorder(root);
    }
    public static void main(String []args)
    {
     BinaryTree tree=new BinaryTree();
     tree.root=new nodee(1);
     tree.root.left=new nodee(2);
     tree.root.right=new nodee(3);
     tree.root.left.left=new nodee(4);
     tree.root.left.right=new nodee(5);
     
     System.out.println("preorder traverse");
     tree.preorder();
     System.out.println("inorder traverse");
     tree.inorder();
     System.out.println("postorder traverse");
     tree.postorder();
     
    }
}
