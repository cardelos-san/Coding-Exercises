package athlete_database_system;

/************************************************************************************************
 * Node receives and stores Athlete objects in nodes.
 * @author K. Sanders and CS 212-02, Fall 2015 & Carlos De Los Santos
 ************************************************************************************************/

public class Node {
    private Athlete element;
    private Node next;
    
    /**
     * Constructor for objects of class Node
     */
    public Node (Athlete someData) {
        this.element = someData;
        this.next = null;
    }
    
    //Returns element of athlete type.
    public Athlete getElement() {
        return this.element;
    }
    
    //Gets next node.
    public Node getNext() {
        return this.next;
    }
    
    //Sets next node
    public void setNext (Node someNode) {
        this.next = someNode;
    }
}