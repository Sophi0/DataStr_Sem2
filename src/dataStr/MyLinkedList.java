package dataStr;

public class MyLinkedList<T> {
	/*
	 * katram mezglam veidojam jauno klasi!
	 */
	
	/*
	 * jauns mezgls: first, last, null
	 * 
	 * first -> null
	 * last -> null
	 */
	
	private MyNode first = null;
	private MyNode last = null;
	private int elementCounter = 0; //jaizveido, lai vieglak jaiet cauri blokam, nevajag parbaudit katru elementu ar sho mainigu
	
	//we will use no-args constructor from Object class
	
	//TODO: isFull, isEmpty, howManyElements(pirmaja seminara ir)
	
	public void add(T newElement) {
		//TODO: verify  is not full
		
				//list is empty
				if(elementCounter == 0) {
					MyNode<T> newNode = new MyNode<T>(newElement);
					first = newNode;	//norade uz pirmo elementu
					last = newNode;		//norade uz pedejo elementu
					elementCounter++;	//obligati jaraksta sho, lai palielinas katru reizi
				}
			}
	
	
}
