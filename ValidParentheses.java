package com.leet.www;

import java.util.Stack;

//
/**Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 * 
 * */
public class ValidParentheses {
	public boolean isValid(String s) {
	        Stack<Character> mystack = new Stack<Character>();
	        char[] clist = s.toCharArray();
	        for(char c : clist)
	        {
	            if(c == '{')
	                mystack.push('}');
	            else if(c == '[')
	                mystack.push(']');
	            else if(c == '(')
	                mystack.push(')');
	            else if(mystack.isEmpty() || mystack.pop()!=c)
	                return false;
	        }
	        boolean val = mystack.isEmpty();
	        return val;
	    }

}
