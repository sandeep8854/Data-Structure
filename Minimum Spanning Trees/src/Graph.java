
public class Graph
{
	private final int MAX_VERTS=20;
	private Vertex vertexList[];       //list of vertices
	private int adjMat[][];            //adjacency matrix
	private int nVerts;                //current number of vertices
	private StackX theStack;
	
	public Graph()   //constructor
	{
		vertexList=new Vertex[MAX_VERTS];
		                        //adjacency matrix
		adjMat=new int[MAX_VERTS][MAX_VERTS];
		nVerts=0;
		for(int j=0;j<MAX_VERTS;j++)    //set adjacency
			for(int k=0;k<MAX_VERTS;k++)  //matrix to 0
				adjMat[j][k]=0;
		theStack=new StackX();
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
		System.out.print(vertexList[v].label);
	}
	
	public void mst()  //minimum spanning tree(depth first)
	{                                    //start at 0
		vertexList[0].wasVisited=true;  //mark it
		theStack.push(0);               //push it
		
		while(!theStack.isEmpty())  //until stack empty
		{                            //get stack top
			int currentVertex=theStack.peek();
			//get next unvisited neighbor
			
			int v=getAdjUnvisitedVertex(currentVertex);
			if(v==-1)                   //if no more neighbors
				theStack.pop();  //pop it away
			else
			{
				vertexList[v].wasVisited=true;  //mark it
				theStack.push(v);           //push it
				                      //display edges
				displayVertex(currentVertex);   //from currentV
				displayVertex(v);        //to v
				System.out.print(" ");
			}
		}//ens while stack not empty
		
		for(int j=0;j<nVerts;j++)            //resert flags
			vertexList[j].wasVisited=false;
	}
    // returns an unvisited vertex adj to v
	private int getAdjUnvisitedVertex(int v)
	{
		for(int i=0;i<nVerts; i++)
			if(adjMat[v][i]==1  && vertexList[i].wasVisited==false)
				return i;
		return -1;
	}
}






















