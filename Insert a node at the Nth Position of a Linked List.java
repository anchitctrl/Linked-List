
public void insertAtPosition(int data, int position) {
	    ListNode newNode = new ListNode(data);
	    if(position == 0){
	        newNode.next = head;
	        head = newNode;
	    } else {
	        ListNode previous = head;
	        int count = 0;
	        while(count < position - 1){
	            previous = previous.next;
	            count++;
	        }
	        
	        ListNode current = previous.next;
	        newNode.next = current;
	        previous.next = newNode;
	    }
	}
