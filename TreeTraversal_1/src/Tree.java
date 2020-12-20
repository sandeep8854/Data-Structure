import java.util.Stack;

public class Tree 
{
	private Node root;      //first node of tree
	
	public Tree()   //constructor
	{
		root=null;  //no nodes in tree yet
	}
	///////////////////////////   find key   ////////////////////////////////
	public Node find(int key)  //find node with given key
	{                          //Assume non empty tree
		Node current=root;     //start at root
		while(current.iData!=key)  //while no match
		{
			if(key<current.iData) //go left
				current=current.leftChild;
			else
				current=current.rightChild;
			if(current==null)   //if no child
				return null;
		}
		return current;   //found it
	}
	//-----------insert the Data------------//
	
	public void insert(int id,double dd)
	{
		Node newNode=new Node();  //make new node
		newNode.iData=id;         //insert data
		newNode.dData=dd;
		
		if(root==null)   //no  node in root
			root=newNode;
		else          //root occupied
		{
			Node current=root;  //start at root
			Node parent;
			while(true)           //exit internally
			{
				parent=current;
				if(id<current.iData)  //go left
				{
					current=current.leftChild;
					if(current==null) //if end of line
					{                //insert on left
						parent.leftChild=newNode;
						return;
					}
				}  //end if go left
				else
				{
					current=current.rightChild;
					if(current==null) //if end of line
					{                 //insert on right
						parent.rightChild=newNode;
						return;
					}
				}  //end else go right
			} //end while	
		} //end else not root
	} //end insert()
	
//--------------------------------delete node with given key-------------------//
	public boolean delete(int key)  //delete node with given key
	{
		Node current=root;
		Node parent=root;
		boolean isLeftChild=true;
		
		while(current.iData!=key) //search for node
		{
			 parent = current;
			 
			 if(key < current.iData)  // go  left
			 {
				 isLeftChild=true;
				 current=current.leftChild;
			 }
			 else
			 {
				 isLeftChild=false;
				 current=current.rightChild;
			 }
			 
			 if(current==null)  //end of the line
				 return false;  //did't find it
		}  //end while loop
		//found node to delete
		
		//if no children ,simply delete it
		if(current.leftChild==null && current.rightChild==null)
		{
			if(current == root)  //if root,
				root=null;     //tree is empty
			else if(isLeftChild)
				parent.leftChild=null;  //disconnect
			else                        //form parent
				parent.rightChild=null;
		}
		
		//if no right child ,replace with left subtree
		else if(current.rightChild==null)
			if(current==root)
				root=current.leftChild;
			else if(isLeftChild)
				parent.leftChild=current.leftChild;
			else
				parent.rightChild=current.leftChild;
		
		//if no left child, replace with right subtree;
		else if(current.leftChild==null)
			if(current==root)
				root=current.rightChild;
			else if(isLeftChild)
				parent.leftChild=current.rightChild;
			else
				parent.rightChild=current.rightChild;
		
		//two children ,so replace with inorder successor//
		
		else
		{
			//get successor of node  to delete (current)
			Node succcessor=getSuccessor(current);
			
			//connect parent of current to successor instead
			if(current==root)
				root=succcessor;
			else if(isLeftChild)
				parent.leftChild=succcessor;
			else
				parent.rightChild=succcessor;
			
			//connect succcessor  to current's left child
			succcessor.leftChild=current.leftChild;
		} //end else two children
			//succcessor can't have a left child
		return true;    //success
	}  //end delete()
	
	//return node with next heighest value after delNode
	//goes to right child, then right child's left descendents
	
      private Node getSuccessor(Node delNode)
      {
    	  Node successorParent=delNode;
    	  Node successor=delNode;
    	  Node current=delNode.rightChild;  //go to right child
    	  while(current!=null)              //until no more
    	  {                        //left children
    		  successorParent=successor;
    		  successor=current;
    		  current=current.leftChild;   //go to left child
    		                           //if successor not
    	  }
    	  
    	  if(successor!=delNode.rightChild)  //right child
    	  {
    		  successorParent.leftChild=successor.rightChild;
    		  successor.rightChild=delNode.rightChild;
    	  }
    	  return successor;
}
	
      
      public void traverse(int traverseType)
      {
    	  switch(traverseType)
    	  {
    	  case 1: System.out.print("\nPreOrder Traversal: ");
    	  preOrder(root);
    	  break;
    	  
    	  case 2: System.out.print("\nInOrder Traversal: ");
    	  inOrder(root);
    	  break;
    	  
    	  case 3: System.out.print("\nPostOrder Traversal: ");
    	  postOrder(root);
    	  break;
    	  }
    	  System.out.println();
      }
      
      //Recurssion calling in inOrder ,perOrder and PostOrder 
      
	private void postOrder(Node root) 
	{
		if(root!=null)
		{
			postOrder(root.leftChild);
			postOrder(root.rightChild);
			System.out.print(root.iData + " ");
		}
		
	}
	
	
	private void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.leftChild);
			System.out.print(root.iData +" ");
			inOrder(root.rightChild);
		}
		
	}
	
	
	private void preOrder(Node root) 
	{
		if(root!=null)
		{
			System.out.print(root.iData + " ");
			preOrder(root.leftChild);
			preOrder(root.rightChild);
		}
	}
	
	public void displayTree()
	{
		Stack globalStack=new Stack();
		globalStack.push(root);
		int nBlanks=32;
		boolean isRowEmpty=false;
		System.out.println("..............................................");
		
		while(isRowEmpty==false)
		{
			Stack localStack=new Stack();
			isRowEmpty=true;
			
			for(int j=0;j<nBlanks;j++)
			{
				System.out.print(' ');
			}
			
			while(globalStack.isEmpty()==false)
			{
				Node temp=(Node)globalStack.pop();
				if(temp!=null)
				{
					System.out.print(temp.iData);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					
					if(temp.leftChild !=null || temp.rightChild!=null)
						isRowEmpty=false;
				}
				else
				{
					System.out.print("......");
					localStack.push(null);
					localStack.push(null);
				}
				
				for(int j=0;j<nBlanks*2-2;j++)
					System.out.print(' ');
			}  //end while global stack non empty
			System.out.println();
			nBlanks=nBlanks/2;
			
			while(localStack.isEmpty()==false)
				globalStack.push(localStack.pop());
		}//emd while isRowEmpty is false
		System.out.println(" .................................");
	}  //end displayTRee()
} //end of class tree


















































