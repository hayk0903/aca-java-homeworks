package generic;


/**
 * An ordered collection of elements.
 * The Stack interface provides two methods to check if the Stack is empty and full.  
 * The Stack interface provides methods to push an element to the stack, pop the last element from the stack 
 * and return an element from the stack without removing it.
 * The Stack interface provides a method to search for a specified object.
 */

public interface Stack<T> {
	
	/**
	 * Returns true if this stack contains no elements.
	 */
	boolean empty();
	
	/**
	 * Returns true if this stack is full.
	 */
	boolean full();
	
	/**
	 * Adds an element to the end of the stack.
	 */
	void push(T element);
	
	/**
	 * Returns the last element removing it from the stack.
	 */
	T pop();
	
	/**
	 * Returns the last element from the stack without removing it.
	 */
	public T peek();
	
	/**
	 * Returns the index of the element. Returns -1 if not found.
	 */
	public int search(T e);

}
