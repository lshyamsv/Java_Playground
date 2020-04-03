package leetcode;

import ds.singlylinkedlist.Node;



public class Reverselinkedlist {
	
	public Node reverseList(Node head) {
	    Node prev = null;
	    Node curr = head;
	    while (curr != null) {
	        Node nextTemp = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextTemp;
	    }
	    return prev;
	}

}
