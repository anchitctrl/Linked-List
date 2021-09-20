public ListNode deleteLast() {
	if(head == null || head.next == null) {
            return head;
	}
	ListNode current = head;
	ListNode previous = null;
		
	while(current.next != null) {
	    previous = current;
	    current = current.next;
	}
	previous.next = null; // break the chain
	return current;	
    }
