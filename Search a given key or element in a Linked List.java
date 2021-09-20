public boolean find(int searchKey) {
		if(head == null) {
			return false;
		}
		
		ListNode current = head;
		while(current != null) {
			if(current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
