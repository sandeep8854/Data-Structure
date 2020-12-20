
public class BFSApp {

	public static void main(String[] args) 
	{
		Graph theGraph=new Graph();
		theGraph.addVertex('A');    //0
		theGraph.addVertex('B');   //1
		theGraph.addVertex('C');    //2
		theGraph.addVertex('D');    //3
		theGraph.addVertex('E');   //4
		theGraph.addVertex('F');   //5
		theGraph.addVertex('G');    //6
		theGraph.addVertex('H');   //7
		theGraph.addVertex('I');   //8
		
		
		theGraph.addEdge(0, 1);    //AB
		theGraph.addEdge(0, 2);    //AC
		theGraph.addEdge(0, 3);    //AD
		theGraph.addEdge(0, 4);    //AE
		theGraph.addEdge(1, 5);    //BF
		theGraph.addEdge(5, 7);    //FH
		theGraph.addEdge(3, 6);    //DG
		theGraph.addEdge(6, 8);    //gi
	
		
		System.out.print("Visits : ");
		theGraph.bfs();
		System.out.println();
		

	}

}
