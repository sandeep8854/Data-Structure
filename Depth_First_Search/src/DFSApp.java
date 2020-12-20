
public class DFSApp {

	public static void main(String[] args)
	{
		Graph theGraph=new Graph();
		theGraph.addVertex('A');    //0 (start for dfs)
		theGraph.addVertex('B');    //1
		theGraph.addVertex('F');    //2
		theGraph.addVertex('H');    //3
		theGraph.addVertex('C');    //4
		theGraph.addVertex('D');   //5
		theGraph.addVertex('G');   //6
		theGraph.addVertex('I');    //7
		theGraph.addVertex('E');   //8
		
		
		theGraph.addEdge(0, 1);  //AB
		theGraph.addEdge(1, 2);  //BF
		theGraph.addEdge(2, 3);  //FH
		theGraph.addEdge(0, 4);  //HC
		theGraph.addEdge(0, 5);   //CD
		theGraph.addEdge(5, 6);   //DG
		theGraph.addEdge(6, 7);   //GI
		theGraph.addEdge(0, 8);   //IE
		 
		
		
		System.out.print("Visits: ");
		theGraph.dfs();
		System.out.println();
	}
}
