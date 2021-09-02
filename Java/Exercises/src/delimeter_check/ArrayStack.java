package delimeter_check;

/************************************************************************************************
 * Array-based implementation of a stack
 * @author Clifford A. Shaffer 
 * Modified by: Carlos De Los Santos
 ************************************************************************************************/

class ArrayStack<E> implements StackADT<E> {
    private static final int defaultSize = 20;
    private int maxSize; // Maximum size of stack 
    private int top; // Index for top Object 
    private Character [] stackArray; // Array holding stack

    @SuppressWarnings("unchecked") // Generic array allocation 
    ArrayStack() { 
        maxSize = defaultSize; 
        top = 0; 
        stackArray = (Character[])new Character[defaultSize]; // Create listArray 
    }

    /** Reinitialize stack */ 
    public void clear() { top = 0; }

    /** Push "it" onto stack */ 
    public void push(Character it) { 
        assert top != maxSize : "Stack is full"; 
        stackArray[top++] = it; 
    }

    /** Remove and top element */ 
    public Character pop() { 
        assert top != 0 : "Stack is empty"; 
        return stackArray[--top]; 
    }

    /** @return Top element */ 
    public Character peek() { 
        assert top != 0 : "Stack is empty"; 
        return stackArray[top-1]; 
    }

    /** @return Stack size */ 
    public int length() { return top; }

    /** @returns true if stack is empty */    
    public boolean isEmpty() {
        if (top == 0){return true;}
        else return false;
    }
}
