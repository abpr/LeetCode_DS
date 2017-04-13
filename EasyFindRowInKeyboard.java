package com.leet.www;

public class EasyFindRowInKeyboard {
	public String[] findWords(String[] words) {
        if(words == null)
            return null;
        Character[] r1 = {'q','w','e','r','t','y','u','i','o','p'};
        HashSet<Character> set1 = new HashSet<Character>(Arrays.asList(r1));
        Character[] r2 = {'a','s','d','f','g','h','j','k','l'};
        Character[] r3 = {'z','x','c','v','b','n','m'};
        HashSet<Character> set2 = new HashSet<Character>(Arrays.asList(r2));
        HashSet<Character> set3 = new HashSet<Character>(Arrays.asList(r3));
        ArrayList<String> res = new ArrayList<String>();
        HashSet<Character> targetSet = new HashSet<Character>();
        //System.out.println(set1);
        //loop thro eac string in the input array
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(set1.contains(Character.toLowerCase(word.charAt(0))))
                targetSet = set1;
            else if(set2.contains(Character.toLowerCase(word.charAt(0))))
                targetSet = set2;
            else if(set3.contains(Character.toLowerCase(word.charAt(0))))
                targetSet = set3;
            if(word.length()>1){
                //System.out.println(targetSet);
                //System.out.println("len"+word.length());
                for(int j=1;j<word.length();j++){
                    //System.out.println(word.charAt(j));
                    if(!targetSet.contains(Character.toLowerCase(word.charAt(j)))) break;
                    if(j==word.length()-1)  res.add(word);
                }
            }
            else{
                res.add(word);
            }
        }
        //conv the list to an array
        String[] arr = new String[res.size()]; 
        arr = res.toArray(arr);
        return arr;
        
        
    }

}
