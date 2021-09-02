package delimeter_check;

/************************************************************************************************
 * Singly linked list node
 * @author Clifford A. Shaffer 
 * Modified by: Carlos De Los Santos.
 ************************************************************************************************/

class Link<E> {
    private E element; // Value for this node
    private Link<E> next; // Pointer to next node in list
    // Constructors 
    Link(E it, Link<E> nextval) {
        element = it; 
        next = nextval; 
    } 
    Link(Link<E> nextval) {
        next = nextval; 
    }
   
    // Return next field 
    Link<E> next() {
        return next; 
    }
    
    // Set next field 
    Link<E> setNext(Link<E> nextval) 
    { 
        return next = nextval; // Return element field
    }
    
    E element() { 
        return element; // Set element field
    }  
    
    E setElement(E it) {
        return element = it; 
    }
}
