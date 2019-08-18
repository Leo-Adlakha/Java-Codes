package Graphs;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph g = new Graph() ;
		
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");
		
		g.addEdge("A", "B", 10);
		g.addEdge("A", "D", 20);
		g.addEdge("B", "C", 4);
		g.addEdge("C", "D", 5);
		g.addEdge("D", "E", 1);
		g.addEdge("E", "F", 2);
		g.addEdge("F", "G", 7);
		g.addEdge("E", "G", 6);
		
		g.display();
		
//		g.removeVertex("A");
		
//		g.display();
		
		g.removeEdge("B", "A");
		
		g.removeEdge("E", "F");
		

//		g.display();
//		
//		System.out.println(g.hasPath("A", "F")) ;
//		System.out.println(g.bfs("A", "F"));
//		System.out.println(g.dfs("A", "F"));
//		
//		g.bft();
		
		System.out.println(g.isConnected());
		System.out.println(g.isCyclic());
		System.out.println(g.isTree());
		System.out.println(g.getCC());
		
	}

}
