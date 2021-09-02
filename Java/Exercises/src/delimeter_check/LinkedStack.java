package delimeter_check;

/************************************************************************************************
 * Linked-based implemention of a stack.
 * @author Clifford A. Shaffer 
 * Modified by: Carlos De Los Santos.
 ************************************************************************************************/

class LinkedStack<E> implements StackADT<E> { 
    private Link<Character> top; // Pointer to first element 
    private int size; // Number of elements
    /** Constructors */ 
    public LinkedStack() { 
        top = null; 
        size = 0; 
    } 


    public LinkedStack(int size) {
        top = null;
        size = 0; 
    }

    /** Reinitialize stack */ 
    public void clear() {
        top = null;
        size = 0; 
    }

    /** Put "it" on stack */
    public void push(Character it) {
        top = new Link<Character>(it, top);
        size++; 
    }

    /** Remove "it" from stack */ 
    public Character pop() { 
        assert top != null : "Stack is empty";
        Character it = top.element();
        top = top.next();
        size--;
        return it;
    }

    /** @return Top value */ 
    public Character peek() {
        assert top != null : "Stack is empty";
        return top.element();
    }

    /** @return true if stack is empty */ 
    public boolean isEmpty(){
        if (top == null){return true;}
        else return false;
    }

    /** @return Stack length */ 
    public int length() {
        return size;
    } 

}
