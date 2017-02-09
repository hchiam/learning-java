package Question4_2;

class Node {
    
    /*
     * VARIABLES
     */
    
    // list of "next" nodes:
    private Node adjacent[];
    // number count of "next" nodes that populate that list:
    public int adjacentCount;
    // value stored in this node:
    private String vertex;
    // "visiting" state of this node: (see Question.java public enum State)
    public Question.State state;
    
    public Node(String vertex, int adjacentLength) {
        this.vertex = vertex;
        adjacentCount = 0;
        adjacent = new Node[adjacentLength];
    }
    
    /*
     * METHODS
     */
    
    // add a "next" node (up to 30):
    public void addAdjacent(Node x) {
        if (adjacentCount < 30) { // up to 30 (arbitrary choice I suppose, but to cap memory use per node)
            this.adjacent[adjacentCount] = x; // place a Node at that index of list of "next" nodes
            adjacentCount++; // update number count of "next" nodes that populate that list
        } else {
            System.out.print("No more adjacent can be added");
        }
    }
    // get list of "next" nodes:
    public Node[] getAdjacent() {
        return adjacent;
    }
    // get value stored in this node:
    public String getVertex() {
        return vertex;
    }
}