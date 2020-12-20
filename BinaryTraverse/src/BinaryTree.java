
public class BinaryTree
{
	private TreeNode root;
	
	private class TreeNode
	{
		private TreeNode left;
		private TreeNode right;
		private int data;    //generic type
		
	public TreeNode(int data)
	{
		this.data=data;
	}
}
	public void createBinaryTree()
	{
		TreeNode first=new TreeNode(9);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
	
		
		
		root=first;   //root---->first;
		first.left=second;
		first.right=third;  //second---<first----<third
		
		second.left=fourth;
		
	}
	
	public void preOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	
	public void inOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	public void postOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+ " ");
	}
	public static void main(String[] args)
	{
		BinaryTree bt=new BinaryTree();
		bt.createBinaryTree();
	//	bt.postOrder(bt.root);
		bt.inOrder(bt.root);
	}
}
