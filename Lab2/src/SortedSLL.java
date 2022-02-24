package packa;

public  class SortedSLL<T extends Comparable<T> >  {

	  
	public SortedSLL() {
        
    }
 
	    T head; 
	  
	    class T { 
	        int data; 
	        T next; 
	        T(int d) 
	        { 
	            data = d; 
	            next = null; 
	        } 
	    } 
	  
	    
	    public void insert(T e) 
	    { 
	        T current; 
	        if (head == null || head.data  
	        		>= e.data) { 
	        		            e.next = head; 
	        		            head = e; 
	        		        } 
	        		        else { 
	        		  
	        		            current = head; 
	        		  
	        		            while (current.next != null 
	        		&& current.next.data < e.data) 
	        		                current = current.next; 
	        		  
	        		            e.next = current.next; 
	        		            current.next = e; 
	        		        } 
	        		    } 
	    T newNode(int data) 
	    { 
	        T x = new T(data); 
	        return x; 
	    } 
	  
	    void printList() 
	    { 
	        T temp = head; 
	        while (temp != null) { 
	            System.out.print(temp.data + " "); 
	            temp = temp.next; 
	        } 
	    }
		
		
}

