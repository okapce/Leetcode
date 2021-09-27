package com.example.demo.easy;

import com.example.demo.classes.ListNode;

public class DeleteDuplicates {
	
	public ListNode deleteDuplicates(ListNode head) {
		ListNode currentHead = head;		
		while(currentHead != null && currentHead.next != null) {
			if(currentHead.val == currentHead.next.val) {
				currentHead.next = currentHead.next.next;
			} else {
				currentHead = currentHead.next;
			}
		}
		return currentHead;
    }
	
	
	
}
