
public void deleteAtPosition(int position) {
	    if(position == 0){
	        ListNode temp = head;
	        head = head.next;
	        temp.next = null;
	    } else {
	        ListNode previous = head;
	        int count = 0;
	        while(count < position - 1){
	            previous = previous.next;
	            count++;
	        }
	        
	        ListNode current = previous.next;
	        previous.next = current.next;
	        current.next = null;
	    }
	}
