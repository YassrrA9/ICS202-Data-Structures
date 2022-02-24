package packagelist;

//****************************  DLL.java  *******************************
//generic doubly linked list class



import java.util.ArrayList;

//**********  DLL.java  ***********
//                  generic doubly linked list class

public class DLL<T> {
	private DLLNode<T> head, tail;

	public DLL() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void setToNull() {
		head = tail = null;
	}

	public T firstEl() {
		if (head != null)
			return head.info;
		else
			return null;
	}

	public void addToHead(T el) {
		if (head != null) {
			head = new DLLNode<T>(el, head, null);
			head.next.prev = head;
		} else
			head = tail = new DLLNode<T>(el);
	}

	public void addToTail(T el) {
		if (tail != null) {
			tail = new DLLNode<T>(el, null, tail);
			tail.prev.next = tail;
		} else
			head = tail = new DLLNode<T>(el);
	}

	public T deleteFromHead() {
		if (isEmpty())
			return null;
		T el = head.info;
		if (head == tail) // if only one node on the list;
			head = tail = null;
		else { // if more than one node in the list;
			head = head.next;
			head.prev = null;
		}
		return el;
	}

	public T deleteFromTail() {
		if (isEmpty())
			return null;
		T el = tail.info;
		if (head == tail) // if only one node on the list;
			head = tail = null;
		else { // if more than one node in the list;
			tail = tail.prev;
			tail.next = null;
		}
		return el;
	}

	public void printAll() {
		for (DLLNode<T> tmp = head; tmp != null; tmp = tmp.next)
			System.out.print(tmp.info + " ");
	}

	public T find(T el) {
		DLLNode<T> tmp;
		for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next)
			;
		if (tmp == null)
			return null;
		else
			return tmp.info;
	}

	// prints the elements of a doubly linked list in reverse

	public void printReverse() {

		for (DLLNode<T> node = tail; node != null; node = node.prev) {

			System.out.print(node.info + " ");

		}

		System.out.println();

	}

	public void delete7() {
		DLLNode<T> normalNode = head;


		if (isEmpty()) {

			return;

		}
		

		if (head.next == null) {

			deleteFromHead();

			return;

		}

		int count = 0;


		for (int i = 0; i < 6; i++) {

			if (count==0) {

				if (normalNode.next == null) {
					count = 1;

					normalNode = tail.prev;

				} else {

					normalNode = normalNode.next;

				}

			} else {

				if (normalNode.prev == null) {

					normalNode = head.next;

					count = 0;

				} else {

					normalNode = normalNode.prev;

				}

			}

		}

		if (normalNode.prev == null) {

			deleteFromHead();

		}

		else if (normalNode.next == null) {

			deleteFromTail();

		} else {

			normalNode.prev.next = normalNode.next;

			normalNode.next.prev = normalNode.prev;

		}

	}

	

	public void insertAlternate(DLL<T> newList) {
		DLLNode<T> tmpExistList, tmpNewList;
		for(tmpExistList = this.head, tmpNewList = newList.head;
				tmpNewList!= null;
				tmpExistList = tmpExistList.next , tmpNewList= tmpNewList.next) {
			deleteFromHead();
			addToTail(tmpExistList.info);
			addToTail(tmpNewList.info);
		}
	}
}