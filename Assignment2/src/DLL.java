package packageA2;

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
        else return null;
    }
    public void addToHead(T el) {
        if (head != null) {
             head = new DLLNode<T>(el,head,null);
             head.next.prev = head;
        }
        else head = tail = new DLLNode<T>(el);
    }
    public void addToTail(T el) {
        if (tail != null) {
             tail = new DLLNode<T>(el,null,tail);
             tail.prev.next = tail;
        }
        else head = tail = new DLLNode<T>(el);
    }
    public T deleteFromHead() {
        if (isEmpty()) 
             return null;
        T el = head.info;
        if (head == tail)   // if only one node on the list;
             head = tail = null;
        else {              // if more than one node in the list;
             head = head.next;
             head.prev = null;
        }
        return el;
    }
    public T deleteFromTail() {
        if (isEmpty()) 
             return null;
        T el = tail.info;
        if (head == tail)   // if only one node on the list;
             head = tail = null;
        else {              // if more than one node in the list;
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
        for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next);
        if (tmp == null)
             return null;
        else return tmp.info;
    }
    public T peekFront() {
		T data;
		if (this.head != null && this.tail!= null) {
			 data = head.info;
				return data;	
		}else
			return (T) "nothing inside";

	}
    public T peekRear() {
		T data = tail.info;
		return data;
	}

	public boolean search(T element) {/*
		DLLNode temp = head;
		 do{
			if (temp.info == element) {
				System.out.println("it's here");
				return true;
			}
		}while (temp != null);
		System.out.println("!!!!it's here"); return false;*/
		DLLNode<T> tmp;
		for (tmp = head; tmp != null && !tmp.info.equals(element); tmp = tmp.next)
			;
		if (tmp == null)
			return false;
		else
			return true;
	}
	public int findSize() {
		DLLNode<T> node = this.head;
		int res = 0;
		while (node != null) {
			res++;
			node = node.next;
		}

		return res;
	}
	public String toString() throws UnsupportedOperationException { 
		String dequeueInfo = "";
		if (this.isEmpty()) {
            throw new UnsupportedOperationException("dequeue is empty");
        }else {

	      for (DLLNode<T> tmp = head; tmp != null; tmp = tmp.next) {
          dequeueInfo += tmp.info+" ";
        
	}
	  	return dequeueInfo;

        }

	}
}