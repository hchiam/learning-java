package Question4_2;

public class Graph {
	
	/*
	 * VARIABLES
	 */
	
	// list of Nodes/values:
	private Node vertices[];
	// number count of vertices/Nodes/values in Graph:
	public int count;
	
	/*
	 * CONSTRUCTOR
	 */
	
	// create empty Graph with spaces for 6 Nodes:
	public Graph() {
		vertices = new Node[6];
		count = 0;
    }
	
	/*
	 * METHODS
	 */
	
	// add Node x (up to 30 Nodes):
    public void addNode(Node x) {
		if (count < 30) {
			vertices[count] = x;
			count++;
		} else {
			System.out.print("Graph full");
		}
    }
    
    // get the list of all Nodes in this Graph:
    public Node[] getNodes() {
        return vertices;
    }
}