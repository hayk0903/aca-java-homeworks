package generic;

import java.util.EmptyStackException;

/**
 * GenerickStack is an array implementation of the Stack interface. 
 * GenerickStack has fixed capacity, which is defined in constructor.
 * Elements in GenerickStack have indexes (unlike java arrays the first element has index 0). 
 * 
 */
public class GenericStack<T> implements Stack<T> {
	private int capacity;
	private T[] arr;
	private int index = 0;

	
	@SuppressWarnings("unchecked")
	public GenericStack(int capacity){
		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
	}
	
	@Override
	public boolean empty(){
		return index == 0;
	}
	
	@Override
	public void push(T element){
		if(! this.full()) arr[index++] = element;
		else throw new IndexOutOfBoundsException("Stack is full");
	}
	
	@Override
	public T pop(){
		if( ! this.empty()){
			T temp = arr[index-1];
			arr[index-- - 1] = null;
			return temp;
		}else{
			throw new EmptyStackException();
		}
	}
	
	@Override
	public T peek(){
		if( ! this.empty())return arr[index];
		else throw new EmptyStackException();
	}
	
	@Override
	public int search(T e){
		if( ! empty()){
			int result = -1;
			for(int i = 0; i <= index; i++){
				if(arr[i].equals(e)) {
					result = i + 1;
					break;}
			}
			return result;
		}else{
			throw new EmptyStackException();
		}
	}

	@Override
	public boolean full() {
		return index >= capacity;
	}
	
}
