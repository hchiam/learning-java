package Question4_2;

import java.util.LinkedList;

public class Question {
	
	/*
	 * VARIABLE
	 */
	
	// state of "visiting" that each Node can be in:
	public enum State {
		Unvisited, Visited, Visiting;
	}
	
	/*
	 * MAIN METHOD FOR RUNNING EVERYTHING ELSE IN THIS PACKAGE
	 */
	
	public static void main(String a[]) {
		// use method within this java file to create and get new Graph:
		Graph g = createNewGraph();
		// get start and end Nodes:
		Node[] n = g.getNodes();
		Node start = n[3];
		Node end = n[5];
		// test pathExists method within this java file:
		System.out.println("pathExists(g, start, end) = " + pathExists(g, start, end));
	}
	
	/*
	 * METHODS
	 */
	
	// create and fill a Graph with Nodes:
	public static Graph createNewGraph() {
		// create empty Graph:
		Graph g = new Graph();
		// create empty list of Nodes with 6 spaces:
		Node[] temp = new Node[6];
		
		// put Nodes into each space in list of Nodes:
		temp[0] = new Node("a", 3);
		temp[1] = new Node("b", 0);
		temp[2] = new Node("c", 0);
		temp[3] = new Node("d", 1);
		temp[4] = new Node("e", 1);
		temp[5] = new Node("f", 0);
		
		// add "next node" references from each respective Node:
		temp[0].addAdjacent(temp[1]);
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
		temp[4].addAdjacent(temp[5]);
		
		// put each Node from list of Nodes into Graph:
		for (int i = 0; i < 6; i++) {
			g.addNode(temp[i]);
		}
		
		// return filled Graph:
		return g;
	}
	
	// search for whether a path exists between start Node and end Node in the Graph:
    public static boolean pathExists(Graph g, Node start, Node end) {
    	// create a queue (implemented by a linked list)
        LinkedList<Node> q = new LinkedList<Node>();
        // (re)initialize "visiting" state to "not visited yet" for each node in the Graph
        for (Node u : g.getNodes()) {
            u.state = State.Unvisited;
        }
        // set the start Node to "visiting"
        start.state = State.Visiting;
        // add start Node to the queue (the start Node is first in line to get "served")
        q.add(start);
        // create temporary Node u to hold next in line to "visit"/"serve"
        Node u;
        // while there's still more Nodes in line to be "served"/"visited"...
        while(!q.isEmpty()) {
        	// get the Node next in line to "visit"/"serve"
            u = q.removeFirst();
            // if there is a Node to "visit"/"serve"...
            if (u != null) {
            	// go through all its "next" Nodes
	            for (Node v : u.getAdjacent()) {
	            	// further investigate any of its "next" Nodes that have not been visited...
	                if (v.state == State.Unvisited) {
	                	if (v == end) { // say "yes" if one of those "next" Nodes happens to be the "destination"
	                        return true;
	                    } else { // otherwise mark each of its "next" Nodes as "visiting" and add to line-up queue of Nodes to "visit"/"serve"
	                        v.state = State.Visiting;
	                        q.add(v);
	                    }
	                }
	            }
	            // then mark this Node's "visit" as complete
	            u.state = State.Visited;
            }
        }
        // if after all this the "destination" Node was not encountered, then say "no"
        return false;
    }
}