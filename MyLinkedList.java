package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;
	int ind;

	/** Create a new empty LinkedList*/ 
	public MyLinkedList() {
		// TODO: Implement this method
		size=0;                                
		head=new LLNode<E>(null);              
		tail=new LLNode<E>(null);
		head.next=tail;
		tail.prev=head;
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) 
	{
		// TODO: Implement this method
		
		if (element==null) {
		throw new NullPointerException();
		}
		else {
		LLNode<E> newNode = new LLNode<E>(element);
		newNode.next = tail;
		newNode.prev = tail.prev;
		tail.prev.next = newNode;
		tail.prev = newNode;

		size++;
		return true;
		}

		
	
		
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 
	{
		// TODO: Implement this method.
		/*ind = index;
		if(index<this.size && index>=0) {                                 
			LLNode<E> goal=head;			
			for(int i=0;i<=index;i++) {
				goal=goal.next;				
			}			
			return goal.data;
		}		                 
		else {
			throw new IndexOutOfBoundsException("INDEXOUTOFBOUNDS");		
		}*/
		if(0>index || index>size-1) {
			throw new IndexOutOfBoundsException();
			}
		else{
			LLNode<E> temp = new LLNode<E>(null);
			temp = head.next;;
			for(int i=1;i<=index;i++) {
			temp = temp.next;
			}
			return temp.data;
		}
		//return null;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		// TODO: Implement this method
		/*if(element==null) {
			throw new NullPointerException("cannot store nullpointers");
		}				
		else if(ind<0 || ind>size()-1){
			throw new IndexOutOfBoundsException("INDEXOUTOFBOUNDS");
		}
		else {
			LLNode<E> newnode=new LLNode<E>(element);  
			LLNode<E> next=(LLNode<E>)this.get(ind);	
			LLNode<E> prevnode=(LLNode<E>)this.get(ind-1);
			LLNode<E> nextnode=head;                           
			for(int i=0;i<=ind;i++) {
				next=next.next;
			}			
			//LLNode<E>
			prevnode=next.prev;
			newnode.next=next;
			nextnode.prev=newnode;
			prevnode.next=newnode;
			newnode.prev=prevnode;				
			size++;
		}*/
		if(index<0 || index>size) {
			throw new IndexOutOfBoundsException();
			}
		else if(element==null){
			throw new NullPointerException();
		}
		else {
			LLNode<E> temp = new LLNode<E>(element);
			temp.next = head.next;
			int i=0;
			while(i!=index) {
				temp.next = temp.next.next;
				i++;
			}
			temp.prev = temp.next.prev;
			temp.next.prev = temp;
			temp.prev.next = temp;
			size++;
			}

	}


	/** Return the size of the list */
	public int size() 
	{
		// TODO: Implement this method
		return size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		// TODO: Implement this method
		if (0>index || index>=size) {
			throw new IndexOutOfBoundsException();
			}
		else {
			LLNode<E> temp = head.next;
			int i=0;
			while (i!=index) {
				temp=temp.next;
				i++;
			}
			temp.next.prev = temp.prev;
			temp.prev.next = temp.next;
			size--;
			return temp.data;
			}
		//return null;
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// TODO: Implement this method
		if (index<0 || index>size-1) {
			throw new IndexOutOfBoundsException();
		}
		else if(element == null) {
			throw new NullPointerException();
		}
		else {
			LLNode<E> temp = new LLNode<E>(null);
			temp = head.next;;
			for(int i=1;i<=index;i++) {
				temp = temp.next;
			}
			E data = temp.data;
			temp.data = element;
			return data;
		}
		//return null;
	}   
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor
	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}



}
