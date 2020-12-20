
public class Graph 
{
	private final int MAX_VERTS=20;
	private Vertex vertexList[];    //list of vertex
	private int adjMat[][];         //adjacency matrix
	private int nVerts;             //current number of vertics
	private Queue theQueue;
	
	public Graph()  //constructor
	{
		vertexList=new Vertex[MAX_VERTS];
		                           //adjancency matrix
		adjMat=new int[MAX_VERTS][MAX_VERTS];
		nVerts=0;
		for(int j=0; j<MAX_VERTS; j++)  //set adjancency
			for(int k=0; k<MAX_VERTS; k++)   //matrix to 0
				adjMat[j][k]=0;
		theQueue=new Queue();
	}
	
	public void addVertex(char lab)
	{
		vertexList[nVerts++]=new Vertex(lab);
	}
	
	public void addEdge(int start,int end)
	{
		adjMat[start][end]=1;
		adjMat[end][start]=1;
	}
	
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].lable);
	}
	
	public void bfs()     //breath first serach
	{                     //begin
		vertexList[0].wasVisited=true;   //true
		displayVertex(0);   //display it
		theQueue.insert(0); //insert at tail
		int v2;
		
		while(!theQueue.isEmpty())      //until queue  empty
		{
			int v1=theQueue.remove();   //remove vertex at head
			
			//until it has no unvisited neighbors
			while ((v2=getAdjUnvisitedVertex(v1))!= -1)
			{                            //get one
				vertexList[v2].wasVisited=true;   //mark it
				displayVertex(v2);               //display it
				theQueue.insert(v2);             //insert it
		  	}  //end while 
		}   //end while queue not empty
		
		//queue is empty, so we are done
		for(int j=0; j<nVerts;j++)         //reset flags
			vertexList[j].wasVisited=false;
	}

	private int getAdjUnvisitedVertex(int v)
	{
		for(int j=0;j<nVerts;j++)
			if(adjMat[v][j]==1  && vertexList[j].wasVisited==false)
				return j;
		return -1;
	}
}



















