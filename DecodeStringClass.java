package com.leet.www;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class DecodeStringClass {
	public static void main(String[] args)
	{
		//new DecodeStringClass().decodeString("222[a]");
		String x = "zsffs";
		//x.cont
	}
	    public String decodeString(String s) {
	        if(s.equals(""))
	            return s;
	        else{
	            //actual work
	            Stack<String> symbolStack = new Stack<String>();
	            Stack<Integer> numberStack = new Stack<Integer>();
	            String totalString = new String();
	            String finalString2 = new String();
	            HashMap<String,String> keyValue = new HashMap<String,String>();
	            for(int i=0;i<s.length();i++)
	            {
	                char currChar = s.charAt(i);
	                if(currChar == '[')
	                {
	                    
	                    symbolStack.push(Character.toString(currChar));
	                }
	                else if((currChar <= 'z' && currChar >= 'a'))
	                {
	                    
	                    symbolStack.push(Character.toString(currChar));
	                }
	                else if((int)currChar <= 57 && (int)currChar >= 48)
	                {
	                    String numString = new String();
	                    numString += Character.toString(currChar);
	                    while((int) s.charAt(i+1) <= 57 && (int) s.charAt(i+1) >= 48)
	                    {
	                        
	                        numString += s.charAt(i+1);
	                        i++;
	                    }
	                    //System.out.println("-->"+Integer.parseInt(numString));
	                    numberStack.push(Integer.parseInt(numString));
	                }
	                else if(currChar == ']')
	                {
	                    //start the game
	                    //symbolStack.push(Character.toString(currChar));
	                    String poppedString = symbolStack.pop();
	                    //totalString += poppedString;
	                    //System.out.println("popped"+poppedString);
	                    totalString = new String();
	                    while(poppedString.equals("[") == false)
	                    {
	                        //System.out.println("popped--"+poppedString);
	                        //keep popping and appending
	                        //System.out.println(poppedString.equals("["));
	                        totalString += poppedString; 
	                        poppedString = symbolStack.pop();
	                        
	                    }
	                    //System.out.println("popped string - "+totalString);
	                    //get the number of reps
	                    int reps = numberStack.pop();
	                    System.out.println(reps);
	                    String finalString = new String(new char[reps]).replace("\0", totalString);
	                    //System.out.println("after rep - "+finalString);
	                    String key = new String();
	                    key = "<"+Integer.toString(i)+">";
	                    keyValue.put(key,finalString);
	                    symbolStack.push(key);
	                }
	            }
	            //System.out.println(symbolStack);
	            //System.out.println(numberStack);
	            //System.out.println(keyValue);
	            
	            //pop the stack
	            String beforeReversal = new String();
	            //keep popping until u get the whole string
	            String fullyReverseString = new String();
	            while(!symbolStack.isEmpty())
	                {
	                    String temp = symbolStack.pop();
	                    if(keyValue.get(temp) != null)
	                        fullyReverseString += keyValue.get(temp);
	                    else
	                        fullyReverseString += temp;
	                    
	                }
	            String stringUntilNow = new String();
	            stringUntilNow = getStringRep(fullyReverseString, keyValue);
	            //stringUntilNow = new StringBuilder(stringUntilNow).reverse().toString();
	            while(stringUntilNow.contains("<"))
	                stringUntilNow = getStringRep(stringUntilNow, keyValue);
	            //if(stringUntilNow.contains("<"))
	            //    stringUntilNow = getStringRep(stringUntilNow, keyValue);
	            //System.out.println("outside"+stringUntilNow);
	            finalString2 = new StringBuilder(stringUntilNow).reverse().toString();
	            return finalString2;
	            
	        }
	        
	        
	    }
	    
	    public String getStringRep(String fullyReverseString, HashMap<String,String> keyValue)
	    {
	        
	            String stringUntilNow = new String();
	            for(int i=0;i<fullyReverseString.length();i++)
	            {
	                System.out.println("string inside func "+fullyReverseString);
	                String tempKey = new String();
	                String currKey = new String();
	                // String tempx = new String();
	                if(fullyReverseString.charAt(i) == '<')
	                {
	                    int k = i;
	                    currKey += Character.toString(fullyReverseString.charAt(k));
	                    while(fullyReverseString.charAt(k) != '>'){
	                        k++;
	                        currKey += Character.toString(fullyReverseString.charAt(k));
	                    }
	                    //get the value of the key
	                    //System.out.println("inside func"+currKey);
	                    String tempx = keyValue.get(currKey);
	                    stringUntilNow += tempx;
	                    //System.out.println("xx-"+currKey);
	                    i = k;
	                }
	                else{
	                stringUntilNow += Character.toString(fullyReverseString.charAt(i));
	                }
	            }
	            return stringUntilNow;
	    }
	}