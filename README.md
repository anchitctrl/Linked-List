# Linked-List :man_technologist:

### Hey there :smiling_face_with_three_hearts: , first of all welcome to this repository. If you are looking for an amazinf resource to learn Linked List, this is the place. I am including all the basics to important questions here which will definitely help you land to your dream object. <br />

### Data Structures and Algorithm is the most important topic to give you a Job, and Linked List is something which everyone finds quite easier to learn, so if you think you are good in Linked List you can go through, and revise this topic and keep it fresh. 
<br />

> #### Zindagi Gulzar honi chahiye, Sort to Linked List bhi hoti hai - Unknown

## Table of Contents

* [Implementation of a Linked List](#implementation-of-a-linked-list)
* [Create a Linked List](#create-a-linked-list)
* [Print Elements of a Linked List](#print-elements-of-a-linked-list)
* [Length of a Linked List](#length-of-a-linked-list)
* [Insert a node at the Beginning of a Linked List](#insert-a-node-at-the-beginning-of-a-linked-list)
* [Insert a node at the End of a Linked List](#insert-a-node-at-the-end-of-a-linked-list)
* [Insert a node at the Nth Position of a Linked List](#insert-a-node-at-the-nth-position-of-a-linked-list)
* [Delete first node from a Linked List](#delete-first-node-from-a-linked-list)
* [Delete End node from a Linked List](#delete-end-node-from-a-linked-list)
* [Delete node at the Nth position of a Linked List](#delete-node-at-the-nth-position-of-a-linked-list)
* [Search a given key or element in a Linked List](#search-a-given-key-or-element-in-a-linked-list)
* [Reverse a singly linked list](#reverse-a-singly-linked-list)
* [Find the Middle node in a Linked List](#find-the-middle-node-in-a-linked-list)
* [Nth node from the end of the Linked List](#nth-node-from-the-end-of-the-linked-list)
* [Insert a node in a sorted Linked List](#insert-a-node-in-a-sorted-Linked-List)
* [Remove a given key element from a Linked List](#remove-a-given-key-element-from-a-linked-list)
* [Detect a Loop in a Linked List](#delete-a-loop-in-a-linked-list)
* [Reverse a Linked List in group of given size](#reverse-a-linked-List-in-group-of-given-size)
* [Delete a Loop in a Linked List](#delete-a-loop-in-a-linked-list)
* [Find the Starting point of a Loop in a Linked List](#find-the-starting-point-of-a-loop-in-a-linked-list)

<a name="implementation-of-a-linked-list"></a>
## Implementation of a Linked List

```java
public class SinglyLinkedList {
	
	private ListNode head;
	
	private static class ListNode {
		private int data; // Can be a generic type
		private ListNode next; // Reference to next ListNode in list
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
}
```

<a name="create-a-linked-list"></a>
## Create a Linked List

```java
public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		// Now we will connect them together to form a chain
		sll.head.next = second; // 10 --> 1
		second.next = third; // 10 --> 1 --> 8
		third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null
	}
```

<a name="print-elements-of-a-linked-list"></a>
## Print Elements of a Linked List

```java
public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
```

<a name="length-of-a-linked-list"></a>
## Length of a Linked List

```java
public int length() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
```

<a name="insert-a-node-at-the-beginning-of-a-linked-list"></a>
## Insert a node at the Beginning of a Linked List

```java
public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
```

<a name="insert-a-node-at-the-end-of-a-linked-list"></a>
## Insert a node at the End of a Linked List

```java
public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
```

<a name="insert-a-node-at-the-nth-position-of-a-linked-list"></a>
## Insert a node at the Nth Position of a Linked List

```java
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
```

<a name="delete-first-node-from-a-linked-list"></a>
## Delete first node from a Linked List

```java
public ListNode deleteFirst() {
        if(head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
```

<a name="delete-end-node-from-a-linked-list"></a>
## Delete End node from a Linked List

```java
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
```

<a name="delete-node-at-the-nth-position-of-a-linked-list"></a>
## Delete node at the Nth position of a Linked List

```java
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
```

<a name="search-a-given-key-or-element-in-a-linked-list"></a>
## Search a given key or element in a Linked List

```java
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
```

<a name="reverse-a-singly-linked-list"></a>
## Reverse a singly linked list

```java
public ListNode reverse() {
		if(head == null) {
			return head;
		}
		
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
```

<a name="find-the-middle-node-in-a-linked-list"></a>
## Find the Middle node in a Linked List

```java
public ListNode getMiddleNode() {
		if(head == null) {
			return null;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
```

<a name="nth-node-from-the-end-of-the-linked-list"></a>
## Nth node from the end of the Linked List

```java
public ListNode getNthNodeFromEnd(int n) {
		if(head == null) {
			return null;
		}
		
		if(n <= 0) {
			throw new IllegalArgumentException("Invalid value: n = " + n);
		}
		
		ListNode mainPtr = head;
		ListNode refPtr = head;
		
		int count = 0;
		
		while(count < n) {
			if(refPtr == null) {
				throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
			}
			refPtr = refPtr.next;
			count++;
		}
		
		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}
```

<a name="insert-a-node-in-a-sorted-Linked-List"></a>
## Insert a node in a sorted Linked List

```java
public ListNode insertInSortedList(int value) {
		ListNode newNode = new ListNode(value);
		
		if(head == null) {
			return newNode;
		}
		
		ListNode current = head;
		ListNode temp = null;
		
		while (current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
```

<a name="remove-a-given-key-element-from-a-linked-list"></a>
## Remove a given key element from a Linked List

```java
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
```

<a name="delete-a-loop-in-a-linked-list"></a>
## Delete a Loop in a Linked List

```java
public class Solution {
            public ListNode detectCycle(ListNode head) {
                ListNode slow = head;
                ListNode fast = head;
        
                while (fast!=null && fast.next!=null){
                    fast = fast.next.next;
                    slow = slow.next;
                    
                    if (fast == slow){
                        ListNode slow2 = head;
                        // ListNode previous1=null;
                        // ListNode previous2=null;
                        while (slow2 != slow){
                            // previous1=slow;
                            // previous2=slow2;
                            slow = slow.next;
                            slow2 = slow2.next;
                        }
                        return slow;
                    }
                }
                return null;
            }
        }
```

<a name="reverse-a-linked-List-in-group-of-given-size"></a>
## Reverse a Linked List in group of given size

```java
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pointer = dummy;
        while (pointer != null) {
            ListNode node = pointer;
            // first check whether there are k nodes to reverse
            for (int i = 0; i < k && node != null; i++) {
                node = node.next;
            }
            if (node == null) break;
            
            // now we know that we have k nodes, we will start from the first node
            ListNode prev = null, curr = pointer.next, next = null;
            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            ListNode tail = pointer.next;
            tail.next = curr;
            pointer.next = prev;
            pointer = tail;
        }
        return dummy.next;
    }
}
```

<a name="find-the-starting-point-of-a-loop-in-a-linked-list"></a>
## Find the Starting point of a Loop in a Linked List

```java
public class Solution {
            public ListNode detectCycle(ListNode head) {
                ListNode slow = head;
                ListNode fast = head;
        
                while (fast!=null && fast.next!=null){
                    fast = fast.next.next;
                    slow = slow.next;
                    
                    if (fast == slow){
                        ListNode slow2 = head;
                        // ListNode previous1=null;
                        // ListNode previous2=null;
                        while (slow2 != slow){
                            // previous1=slow;
                            // previous2=slow2;
                            slow = slow.next;
                            slow2 = slow2.next;
                        }
                        return slow;
                    }
                }
                return null;
            }
        }
```
 
