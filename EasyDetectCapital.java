package com.leet.www;

public class EasyDetectCapital {
	public boolean detectCapitalUse(String word) {
        //
        if(word == null)
            return false;
        //declare a string
        String decider = new String();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90)
                decider+="1";
            else if(word.charAt(i) >= 97 && word.charAt(i) <= 122)
                decider+="0";
            else
                return false;
        }
        String t1 = new String(new char[word.length()]).replace("\0", "1");
        String t0 = new String(new char[word.length()]).replace("\0", "0");
        String t3 = new String();
        t3+="1";
        t3+=(new String(new char[word.length()-1]).replace("\0", "0"));
        if(decider.equals(t1) || decider.equals(t0) || decider.equals(t3))  return true;
        else
            return false;
        
    }

}
