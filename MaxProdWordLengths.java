package com.leet.www;

public class MaxProdWordLengths {
	public int maxProduct(String[] words) {
        //int max = 0;
        int[] binaryValues = new int[words.length];
        int max = 0;
        for(int i=0;i<words.length;i++){
            int val1 = 0;
            for(int j=0;j<words[i].length();j++){
                            val1 |= 1 << (words[i].charAt(j) - 'a'); 
                            //val2 |= 1 < 
                        }
                        binaryValues[i] = val1;
                    }
                    for(int i=0; i<binaryValues.length;i++){
                        for(int j=i + 1;j<binaryValues.length;j++){
                            if(i!=j)
                            {
                                if((binaryValues[i] & binaryValues[j]) == 0){
                                    max = Math.max(max, words[i].length()*words[j].length());
                                }
                            }
                        }
                    }
        return max;
    }

}
