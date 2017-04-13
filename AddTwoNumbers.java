package com.leet.www;
/*
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 * */
public class AddTwoNumbers {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        if (l1==null && l2==null) 
	            return null;
	        int carryOver = 0;
	        int ans = 0;
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        //int a = 0, b= 0;
	        while(l1!=null || l2!= null){
	            ans = 0;
	            if(l1 == null && l2!=null)
	            {    
	                ans = l2.val + carryOver;
	                carryOver = 0;
	                if(ans > 9)
	                {
	                    carryOver = ans/10;
	                    ans = ans - 10;
	                }
	                result.add(ans);
	                l2 = l2.next;
	            }
	            else if(l1 != null && l2==null)
	            {   
	                ans = l1.val + carryOver;
	                carryOver = 0;
	                if(ans > 9)
	                {
	                    carryOver = ans/10;
	                    ans = ans - 10;
	                }
	                
	                result.add(ans);
	                l1 = l1.next;
	            }
	            else
	            {
	            
	                if(carryOver > 0){
	                    ans += carryOver;
	                    carryOver = 0;
	                }
	    
	                ans += l1.val + l2.val;
	                if(ans > 9)
	                {
	                    carryOver = ans/10;
	                    ans = ans - 10;
	                }
	                l1 = l1.next;
	                l2 = l2.next;
	                result.add(ans);
	            }
	        }
	        if(carryOver > 0)
	            result.add(carryOver);
	        Iterator<Integer> it = result.iterator();
	        int counter = 0;
	        ListNode curr = new ListNode(0);
	        ListNode start = new ListNode(0);
	        while(it.hasNext())
	        {
	            ListNode temp = new ListNode(it.next());
	            if(counter == 0){
	                curr = temp;
	                start = curr;
	            }
	            else
	            {
	                curr.next = temp;
	                curr = curr.next;
	            }
	            counter++; 
	        }
	    return start;
	    }
}
