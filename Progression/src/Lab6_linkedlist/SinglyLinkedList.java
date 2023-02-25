package Lab6_linkedlist;

public class SinglyLinkedList {
		
		// reference that points to the list head
		public ListNode head;
		
		// nested class for singly-list node
		private static class ListNode {
			int val;
			ListNode next;
			ListNode(int x){ 
				val = x;
			}
			ListNode(int x, ListNode nextIn) { 
				this.val = x;
				this.next = nextIn;
			}
		}
		
		public SinglyLinkedList() {
			head = null;
		}
		
		// add node to the head of list
		private void add(int val) {
			ListNode e = new ListNode(val, head);
			head = e;
			
		}
		
		public String toString() {
	   	 	String mylist = "";
	   	 	ListNode e = head;
	   	 	while(e != null) {
	   	 		mylist = mylist + e.val + " ";
	   	 		e = e.next;
	   	 }
	   	 return mylist;
		}
		
		
	    private void reverseList() {	
			if(head == null) return;
			ListNode curr = head;
			ListNode next;
			ListNode prev = null;

				while(curr!= null){
					next = curr.next;
					curr.next = prev;
					prev = curr;
					curr = next;
				}
			head = prev;
	    }
	    
	    private void reverseBetween(int m, int n) {
	    	ListNode dummy = new ListNode(0, head);
	    	ListNode curr = dummy;
	    	for(int i=0; i<m-1; i++) {
	    		curr = curr.next;
	    	}
	    	ListNode before = curr;
	    	for(int i=0; i<n-m+2; i++) {
	    		curr = curr.next;
	    	}
	    	ListNode after = curr;
	    	
	    	curr = before.next;
	    	ListNode prev = after;
	    	ListNode next;
	    	while(curr!=null){
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
	    	before.next = prev;
	    	head = dummy.next;
	    }
	    	/*
	    	while (head!=null) {
	    		
	    	ListNode prev = null;
	    	ListNode start_head = head;
	    	ListNode tail = head;
			for (int i=0; i<m; i++) {
				if (i == m-1) {
					prev = start_head;
				}
				start_head = start_head.next;
			}
			for (int i=0; i<n; i++) {
				tail = tail.next;
			}
			
			while (start_head != tail) {
				ListNode next = start_head.next;
				start_head.next = prev;
				prev = start_head;
				start_head = next;
			}*/



	    
	    public static void main(String args[]) {
	    	SinglyLinkedList list1 = new SinglyLinkedList();
	    	for(int i = 10; i > 0; i--) {
	    		list1.add(i);
	    	}
	    	System.out.println(list1);
	    	list1.reverseList();
	    	System.out.println(list1);
	    	list1.reverseList();
	    	System.out.println(list1);
	    	list1.reverseBetween(3,7);
	    	System.out.println(list1);
	    }
}

