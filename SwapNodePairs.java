package com.leet.www;

public class SwapNodePairs {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	    public ListNode swapPairs2(ListNode head) {
	        ListNode myhead = head;
	        int counter = 0;
	        if (head == null)
	            return null;
	        ListNode myhead2 = head;
	        while(head.next!= null){
	            if(counter%2 == 0)
	            {
	                int t = head.val;
	                head.val = head.next.val;
	                head.next.val = t;
	                head = head.next;
	            }
	            else
	            {
	                head = head.next;
	            }
	            counter++;
	        }
	        return myhead;
	    }

}


////////////////////////////
/*
 * changing the pointers alone
 * 
 * */
 */
 /**
  * Definition for singly-linked list.
  * public class ListNode {
  *     int val;
  *     ListNode next;
  *     ListNode(int x) { val = x; }
  * }
  */
     public ListNode swapPairs(ListNode head) {
        if (head == null || head.next ==null) return head;
        ListNode second = head.next;
        ListNode third = second.next;
        second.next = head;
        head.next = swapPairs(third);
        return second; 
         //head = head.next;
         //head = middleNode;
         //return myhead;
}