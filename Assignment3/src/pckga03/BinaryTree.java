package pckga03;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class BinaryTree<T extends Comparable<? super T>> { 
    BTNode<T> root;
    int height = -1;

    public BinaryTree() { 
        root = null; 
    }
    
   public void purge(){
        root = null;
   }
    
    public boolean isEmpty(){
       return root == null;
    }

     int getBalanceFactor(BTNode node)  { 
        if (node == null) 
            return -1; 
        else { 
            /* compute the height of each subtree */
            int heightLeftSubtree = getBalanceFactor(node.left); 
            int heightRightSubtree = getBalanceFactor(node.right); 
   
            return heightRightSubtree - heightLeftSubtree;
        } 
    } 

    //=========================================================
    
    public void iterativeInorderTraversal(){
        iterativeInorderTraversal(root);
    }  



    private void iterativeInorderTraversal(BTNode<T>  root){
   
        if (root == null)
            return;
 
 
        Stack<BTNode<T>> s = new Stack<BTNode<T>>();
        Stack<BTNode<T>> s2 = new Stack<BTNode<T>>();

       
        
        BTNode<T> curr = root;
        BTNode<T> curr2 = root;
        BTNode<T> curr21 = root;

        boolean checker = true;
        
        
        
        // traverse the tree
        while (curr != null || ! s.empty()){                   
            /* Reach the left most Node of the curr Node */
         
            while (curr !=  null) {
                /* place pointer to a tree node on the stack before traversing the node's left subtree */
                  
                s.push(curr);
                curr = curr.left;  
            }
 
            /* Current must be NULL at this point */    
            curr = s.pop();
            // push into the new stack
            s2.push(curr);
            
            
             System.out.print(curr.data + " ");
            
 
            /* we have visited the node and its left subtree.  Now, it's right subtree's turn */
            curr = curr.right;
        }
        
        // Checking the Tree
        
        do {
        	
        	curr2 = s2.pop();
        	if(!s2.empty()) {
        	curr21 = s2.pop();}
        	
        	// Check if the tree is a BST or not
        	if(((curr2.data).compareTo(curr21.data))>0) {
        		checker = true;
        	}else {
        		checker = false;
        		break;
        	}
        	// Chcick if the tree is an AVL or not
        	if((curr2 != null) || (curr21 !=null)) {
        		if(getBalanceFactor(curr2) == -1 || getBalanceFactor(curr2) ==0 || getBalanceFactor(curr2)==1){
                    checker = true ;
                }if(getBalanceFactor(curr21) == -1 || getBalanceFactor(curr21) ==0 || getBalanceFactor(curr21)==1){
                    checker = true ;
                }else {
                	checker = false;
                	break;
                }
        	}
        	
        }while(!s2.empty());
        	
     
   

   
        
        if(checker == true) {
        	System.out.println("       "+"The tree is an AVL tree");
        }else {
        	System.out.println("       "+"The tree is NOT an AVL tree");

        }
   
     }

   

   //==========================================================
    
    public void insert(T key){
        if (root == null) {
            root = new BTNode<T>(key);
            return;
        }
        
        BTNode<T> temp;
        Queue<BTNode<T>> q = new LinkedList<BTNode<T>>();
         q.add(root);
 
        // Do level order traversal until we find the first empty left or right child.
        while (!q.isEmpty()) {
            temp = q.poll();
 
            if (temp.left == null) {
                temp.left = new BTNode<T>(key);
                break;
            }
            else
                q.add(temp.left);
 
            if (temp.right == null) {
                temp.right = new BTNode<T>(key);
                break;
            }
            else
                q.add(temp.right);
        }
    }
    
    public void deleteByCopying(T data){
         if(root == null)
            throw new UnsupportedOperationException("Tree is empty!");
         else if(root.left == null && root.right == null){
            if(root.data.equals(data))
                root = null;
            else
               throw new NoSuchElementException(data + " not in the tree.");
         return;
       }
       
       Queue<BTNode<T>> queue = new LinkedList<BTNode<T>>();
       queue.add(root); 
       BTNode<T> keyNode = null;
       BTNode<T> currentNode = null;
       BTNode<T> parentNode = root;
       boolean found = false;
       while(! queue.isEmpty()){
          currentNode = queue.poll();
          
          if(currentNode.data.equals(data)){
             if(! found){
                keyNode = currentNode;
                found = true;
             }
          }
          
          if(currentNode.left != null){
             queue.add(currentNode.left);
             parentNode = currentNode;
           }
          if(currentNode.right != null){
             queue.add(currentNode.right);
             parentNode = currentNode;
           }
       }
       
       if(! found)
          throw new NoSuchElementException(data + " not in tree.");
          
        keyNode.data = currentNode.data;
        if(parentNode.left == currentNode)
            parentNode.left = null;
        else if(parentNode.right == currentNode)
            parentNode.right = null;      
    } 
  
    public void levelOrderTraversal(){ // BreadthFirstTraversal
      levelOrderTraversal(root);
    } 

    private void levelOrderTraversal(BTNode<T> root){
       if(root == null)
          return;
       Queue<BTNode<T>> queue = new LinkedList<BTNode<T>>();
       BTNode<T> node = root;
       queue.add(node); 
       while(! queue.isEmpty()){
          node = queue.poll();
          System.out.print(node.data + "  ");
          if(node.left != null)
             queue.add(node.left);
          if(node.right != null)
             queue.add(node.right);
       } 
    }
    
    public void inorderTraversal(){     
       inorderTraversal(root);   
     } 

    protected void inorderTraversal(BTNode<T> node) { 
        if (node == null) 
            return; 
  
        inorderTraversal(node.left); 
        System.out.print(node.data + " "); 
        inorderTraversal(node.right); 
    } 
    
    public void postorderTraversal(){     
       postorderTraversal(root);  
    }
 
    private void postorderTraversal(BTNode<T> node){ 
        if (node == null) 
            return; 
  
        postorderTraversal(node.left); 
        postorderTraversal(node.right); 
  
        System.out.print(node.data + " "); 
    }  
  
    public void preorderTraversal(){     
        preorderTraversal(root);  
    } 
 
    private void preorderTraversal(BTNode<T> node){ 
        if (node == null) 
            return; 
  
        System.out.print(node.data + " "); 

        preorderTraversal(node.left); 
        preorderTraversal(node.right); 
    } 
  
    public boolean search(T key){
       if(root == null)
          return false;
       Queue<BTNode<T>> queue = new LinkedList<BTNode<T>>();
       BTNode<T> node = root;
       queue.add(node); 
       while(! queue.isEmpty()){
          node = queue.poll();
          if(key.equals(node.data))
              return true;
          if(node.left != null)
             queue.add(node.left);
          if(node.right != null)
             queue.add(node.right);
       } 
          return false;
    }

   
   public void printTree(){
      printTree(root, "", true);
   }

     // Print the tree
  private void printTree(BTNode<T> currPtr, String indent, boolean last) {
    if (currPtr != null) {
      System.out.print(indent);
      if (last) {
        System.out.print("R----");
        indent += "   ";
      } else {
        System.out.print("L----");
        indent += "|  ";
      }
      System.out.println(currPtr.data);
      printTree(currPtr.left, indent, false);
      printTree(currPtr.right, indent, true);
    }
  }
 }    
