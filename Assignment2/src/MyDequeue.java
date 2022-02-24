package packageA2;

public class MyDequeue<T> implements Dequeue<T> {
	DLL<T> node = new DLL<T>() ;
    private DLLNode<T> head, tail;
    
    
    public MyDequeue() {
    	head = tail = null;
    }
	public void addToFront(T e) {
		node.addToHead(e);
	}

	
	public void addToRear(T e) {
		node.addToTail(e);
		
	}

	
	public T removeFront() throws UnsupportedOperationException {
        if (this.isEmpty()) {
            throw new UnsupportedOperationException("dequeue is empty");
        }
        return node.deleteFromHead();
	}

	
	public T removeRear() throws UnsupportedOperationException {
        if (this.isEmpty()) {
            throw new UnsupportedOperationException("dequeue is empty");
        }
        return node.deleteFromTail();

	}

	
	public T peekFront() throws UnsupportedOperationException {
        if (this.isEmpty()) {
            throw new UnsupportedOperationException("dequeue is empty");
        }
        return node.peekFront();
	}

	
	public T peekRear() throws UnsupportedOperationException {
        if (this.isEmpty()) {
            throw new UnsupportedOperationException("dequeue is empty");
        }
        return node.peekRear();
	}
	
	public boolean isEmpty() {
        if (node.findSize() == 0) {
            return true;
        }
        return false;

	}

	
	public int getSize() {
        return node.findSize();

	}

	
	public boolean search(T e) {
        return node.search(e);
	}
	@Override
	public String toString() throws UnsupportedOperationException { 
		
        return node.toString();
    }

	//to be implemented by students
}
