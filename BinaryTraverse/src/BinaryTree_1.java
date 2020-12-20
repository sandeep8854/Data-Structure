import java.util.*;
public class BinaryTree_1
{
	private TreeNode root;
	
	private class TreeNode
	{
		private TreeNode left;
		private TreeNode right;
		private int data;  //generic type
		
		
		public TreeNode(int data)
		{
			this.data=data;
		}
	}
		public void createBinaryTree()
		{
			TreeNode first=new TreeNode(10);
			TreeNode second=new TreeNode(7);
			TreeNode third=new TreeNode(15);
			TreeNode fourth=new TreeNode(6);
			TreeNode fifth=new TreeNode(9);
			TreeNode six=new TreeNode(14);
			TreeNode seven=new TreeNode(18);
			TreeNode eight=new TreeNode(4);
			TreeNode nine=new TreeNode(8);
			TreeNode ten=new TreeNode(19);
			
			root=first;
			first.left=second;
			first.right=third;
			second.left=fourth;
			second.right=fifth;
			second.left.left=six;
			second.right.right=seven;
			third.left=eight;
			third.right=nine;
		
			third.right.right.right=ten;
			
			
		}
		
		public void preOrder(TreeNode root)
		{
			if(root==null)
			{
				return;
			}
			System.out.print(root.data+ " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	
		public static void main(String[] args) 
		{
			BinaryTree_1 bt=new BinaryTree_1();
			bt.createBinaryTree();
			bt.preOrder(bt.root);
			
			
			
 }
}
