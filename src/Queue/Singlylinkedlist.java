package Queue;

public class Singlylinkedlist {
	 class Node{    
	        int data;    
	        Node next;    
	            
	        public Node(int data) {    
	            this.data = data;    
	            this.next = null;    
	        }    
	    }    
	     
	     
	    public Node head = null;    
	    public Node tail = null;    
	        
	       
	    public void addNode(int data) {    
	            
	        Node newNode = new Node(data);    
	            
	           
	        if(head == null) {    
	         
	            head = newNode;    
	            tail = newNode;    
	        }    
	        else {    
	               
	            tail.next = newNode;    
	            
	            tail = newNode;    
	        }    
	    }    
	        
	      
}