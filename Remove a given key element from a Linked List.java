public void deleteNode(int key) {
      ListNode current = head;
      ListNode temp = null;
 
      if(current != null && current.data == key){
         head = current.next;
         return;
      }
 
      while(current != null && current.data != key){
         temp = current;
         current = current.next;
      }
 
      if(current == null){
         return;
      }
 
      temp.next = current.next;
   }
