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
		//TODO verify  is not full
		
				//list is empty
				if(elementCounter == 0) {
					MyNode<T> newNode = new MyNode<T>(newElement);
					first = newNode;	//norade uz pirmo elementu
					last = newNode;		//norade uz pedejo elementu
					elementCounter++;	//obligati jaraksta sho, lai palielinas katru reizi
				}
				
				else {
					MyNode<T> newNode = new MyNode<T>(newElement);	//jauns mezgls
					last.setNext(newNode); 	//iedodam saiti uz newNode mezgli(67)
					newNode.setPrevious(last);	//pirms jauna mezgla ir previous mezgls(kur bija 35)
					last = newNode;
					elementCounter++;
					
					//Получается вначале создаем новый блок-элемент, затем следующий добавляем.
					
					/*
					 * tagad ir jauns mezgls: 35 -> 67
					 */
				}
			}
	
	public void add(T newElement, int position) throws Exception {
		//TODO verify is not full
		
		if(position < 0 || position > elementCounter) {
			throw(new Exception("Wrong position"));
		}
		else {
			//add at the beginning
			
			/* katru reizi veidojas jauns mezgls:
			*				200
			*			previous -> null
			*		null <- next
			*/
			
			if(position == 0) {
				MyNode<T> newNode = new MyNode<T>(newElement);
				first.setPrevious(newNode);
				newNode.setNext(first);
				first = newNode;
				elementCounter++;
						
			}
		
			//Здесь же мы в самом начале (перед first) добавляем новый блок к уже существующим блокам(к змейке этой)
			
			//add at the end
			else if(position == elementCounter) {
				add(newElement);
			}
		
			//Здесь по такому же принципу, как было в начале кода, поэтому просто копируем функцию(делаем это перед last)
				
			//add in the middle
			else {
				MyNode tempNode = first;	//izveidojam jaunu mainigo, kura ir first
				for(int i = 0; i < position - 1; i++) {	//position - 1, jo mums piemeram elementi 100 un 67, bet jauno bloku vajag starp shitiem ievietot(pa kreisi), tapes -1
					tempNode = tempNode.getNext();
				}
				
				MyNode tempNode2 = tempNode.getNext();
				MyNode<T> newNode = new MyNode<T>(newElement);	//izveidots jauns mezgls, kurs bus strap siem diviem mezgliem
				
				tempNode.setNext(newNode);	//norade un newNode
				newNode.setPrevious(tempNode);	//norade uz tempNode
				
				tempNode2.setNext(newNode);
				newNode.setPrevious(tempNode2);
				
				elementCounter++;
			
			}
		}
	}	
		public void print() {
			//TODO verify if list is empty
			MyNode tempNode = first;
			while(tempNode != null) {
				System.out.print(tempNode.getElement() + " ");
				tempNode = tempNode.getNext();
			}
			System.out.println();
		}
		
		public void remove(int position) {
			//TODO verify if list is empty
			//TODO verify if position is wrong
			
			//TODO the 4th case - if we want to remove the last element
			//remove from the beginning
			if(position == 0) {
				first = first.getNext();
				first.setPrevious(null); 	//tatad sheit mes elementu noradam uz first, un previous noradam uz nulli, sanak to, ka starp sho elementu nav
				elementCounter--;
			}
			//remove from the end. tatad sheit last noradam uz previous un next uz nulli
			else if(position == elementCounter - 1){
				last = last.getPrevious();
				last.setNext(null);
				elementCounter--;
			}
			
			//remove from the middle
			else {
				MyNode tempNode = first;
				
				for(int i = 0; i < position; i++) {
					tempNode = tempNode.getNext();
				}
				
				MyNode tempNodePrevious = tempNode.getPrevious();
				MyNode tempNodeNext = tempNode.getNext();
				tempNodePrevious.setNext(tempNodeNext);
				tempNodeNext.setPrevious(tempNodePrevious);
				elementCounter--;
			}
		}
	}

	
	//ЗАМЕТКА! for each цикл подходит для того, чтоб через ВСЕ элементы пройти
	//ЗАМЕТКА! pritln когда пишем, автоматически переносится на новую строку, чтобы такого не было, пишем print(System.out.print)