package dataStr;

public class MyNode<T> {
	
	/*
	 * izveidojam Node bloku(mezglu), kur elementi ir: 35; next; previous:
	 *    		35
	 *		previous -> null
	 * null <- next
	 */
	
	/*
	 * katram mezglam veidojam jauno klasi!
	 */

	private T  element;
	private MyNode next = null;		//uzreiz pec noklusejuma bus null
	private MyNode previous = null;	//uzreiz pec noklusejuma bus null
	
	
	//set un get funkcijas
	public T getElement() {
		return element;
	}


	public void setElement(T inputElement) {
		if(inputElement != null) {
			element = inputElement;
		}
		else {
			element = (T) new Object();	
		}
	}


	public MyNode getNext() {
		return next;
	}


	public void setNext(MyNode next) {
		this.next = next;
	}


	public MyNode getPrevious() {
		return previous;
	}


	public void setPrevious(MyNode previous) {
		this.previous = previous;
	}


	public MyNode(T inputElement) {
		setElement(inputElement);
	}
	
	public String toString() {	//izvadam elementu(35)
		return "" + element;
	}
}
