package packageA2;

public interface Dequeue<T>{
	   public void addToFront(T element); 
	   public void addToRear(T element);
	   public T removeFront() throws UnsupportedOperationException;
	   public T removeRear() throws UnsupportedOperationException; 
	   public abstract T peekFront() throws UnsupportedOperationException;
	   public abstract T peekRear() throws UnsupportedOperationException; 
	   public boolean isEmpty();
	   public int getSize();
	   public boolean search(T element);
	   public String toString() throws UnsupportedOperationException;
	}
