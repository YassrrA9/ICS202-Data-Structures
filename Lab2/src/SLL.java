package packa;


public class SLL<T> {
    protected SLLNode<T> head, tail;
    public SLL() {
        head = tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addToHead(T el) {
        head = new SLLNode<T>(el,head);
        if (tail == null)
            tail = head;
    }
    public void addToTail(T el) {
        if (!isEmpty()) {
            tail.next = new SLLNode<T>(el);
            tail = tail.next;
        }
        else head = tail = new SLLNode<T>(el);
    }

    public int length(){

        int i = 0 ;

        for(SLLNode temp = head ; temp != null ; temp = temp.next ){

            i++ ;
        }

        return i ;
    }
     public void insertBefore(T newElem, T existingElem){


         SLLNode<T> pred, tmp;

         if(head.info.equals(existingElem)){

             addToHead(newElem);

             return;

         }


        if(isInList(existingElem)){


            for (pred = head, tmp = head.next;
                 tmp != null && !tmp.info.equals(existingElem);
                 pred = pred.next, tmp = tmp.next);


            if (tmp != null) {
                SLLNode<T> newElement = new SLLNode<>();
                newElement.next = tmp;
                pred.next = newElement;
                newElement.info = newElem;


            }

        }


        else {
            System.out.println("existingElem does not exist");
        }

    }


    public void insertAfter(T newElem, T existingElem){


        if(tail.info.equals(existingElem)){

            addToTail(newElem);

            return;
        }

        SLLNode<T> tmp = head ;


        if(isInList(existingElem)){


            while (tmp != null){

                if(tmp.info.equals(existingElem)){



                    SLLNode <T> newElement = new SLLNode<>();

                    newElement.info = newElem ;
                   newElement.next = tmp.next ;
                   tmp.next = newElement ;


                    break;
                }

                tmp = tmp.next ;

            }



        }

        else {
            System.out.println("existingElem does not exist");
        }




    }

    public void deleteBefore(T elem){

        if(head==tail){

            System.out.println("there is only one element in the list !");


            return;
        }

        else if(isEmpty()){

            return;
        }

        else if (!isEmpty()) {
            SLLNode<T> pred, tmp;

            for (pred = head, tmp = head.next;
                 tmp != null && !tmp.info.equals(elem);
                 pred = pred.next, tmp = tmp.next);

            if(tmp != null){

                delete(pred.info);


            }

            else {
                System.out.println("existingElem does not exist");
            }





        }



    }


    public void deleteAfter(T elem) {

        if (head == tail) {

            System.out.println("there is only one element in the list !");

            return;

        } else if (isEmpty()) {

            return;
        } else if (!isEmpty()) {
            SLLNode<T> pred, tmp;

            for (pred = head, tmp = head.next;
                 tmp != null && !tmp.info.equals(elem);
                 pred = pred.next, tmp = tmp.next)
                ;

            if (tmp != null) {

                if(tmp == tail){
                    System.out.println("Target element is tail ! there is nothing after it");

                    return;
                }

                 tmp.next = null ;


            } else {
                System.out.println("existingElem does not exist");
            }


        }

    }







    public T deleteFromHead() { // delete the head and return its info;
        if (isEmpty())
            return null;
        T el = head.info;
        if (head == tail)       // if only one node on the list;
            head = tail = null;
        else head = head.next;
        return el;
    }
    public T deleteFromTail() { // delete the tail and return its info;
        if (isEmpty())
            return null;
        T el = tail.info;
        if (head == tail)       // if only one node in the list;
            head = tail = null;
        else {                  // if more than one node in the list,
            SLLNode<T> tmp;    // find the predecessor of tail;
            for (tmp = head; tmp.next != tail; tmp = tmp.next);
            tail = tmp;        // the predecessor of tail becomes tail;
            tail.next = null;
        }
        return el;
    }
    public void delete(T el) {  // delete the node with an element el;
        if (!isEmpty())
            if (head == tail && el.equals(head.info)) // if only one
                head = tail = null;       // node on the list;
            else if (el.equals(head.info)) // if more than one node on the list;
                head = head.next;    // and el is in the head node;
            else {                    // if more than one node in the list
                SLLNode<T> pred, tmp;// and el is in a nonhead node;
                for (pred = head, tmp = head.next;
                     tmp != null && !tmp.info.equals(el);
                     pred = pred.next, tmp = tmp.next);
                if (tmp != null) {   // if el was found;
                    pred.next = tmp.next;
                    if (tmp == tail) // if el is in the last node;
                        tail = pred;
                }
            }
    }
    public void printAll() {
        for (SLLNode<T> tmp = head; tmp != null; tmp = tmp.next)
            System.out.print(tmp.info + " ");
    }
    public boolean isInList(T el) {
        SLLNode<T> tmp;
        for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next);
        return tmp != null;
    }
	
}
