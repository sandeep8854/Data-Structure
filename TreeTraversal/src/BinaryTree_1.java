//import javax.swing.tree.TreeNode;

public class BinaryTree_1 
{
	private TreeNode root;
	
	private class TreeNode
	{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int d)
		{
			this.data=d;
		}
	}
		
		//Create a binary tree with full frastration
		//becasue his calling recusive
		//Gushha
		
		public void createBinartyTree()
		{
			TreeNode first=new TreeNode(9);
			TreeNode second=new TreeNode(2);
			TreeNode third=new TreeNode(3);
			TreeNode fourth=new TreeNode(4);
			
			root=first;
			first.left=second;
			first.right=third;
			second.left=fourth;
	    }
		
		public void postOrder(TreeNode root)
		{
			if(root==null) {
				return;
			}
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
		
		public void preOrder(TreeNode root)
		{
			if(root==null) {
				return;   //basecaseisveryImportantforrecursivecalling
			}
			
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
		public void inOrder(TreeNode root)
		{
			if(root==null) {
				return; //base case
			}
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
			
		}
	public static void main(String[] args) {
		BinaryTree_1 bt=new BinaryTree_1();
		bt.createBinartyTree();
		//bt.preOrder(bt.root);	
		//bt.inOrder(bt.root);
		bt.postOrder(bt.root);
	}
}
