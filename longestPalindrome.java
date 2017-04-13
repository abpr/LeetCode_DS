public class longestPalindrome {
    public int longestPalindrome(String s) {
        //getting the largest palindromes in a given word
        //count the number of even times occurring letters
        if(s == null)
            return 0;
        int allSame = 1;
        int[] letters = new int[52];
        char prevChar = 'a';
        for(int i=0; i<s.length(); i++){
            //get the letters index
            char c = s.charAt(i);
            //System.out.println(c);
            if(i>0)
                prevChar = s.charAt(i-1);
            int pos =  c >= 97 ? c - 'a' : c - 'A'+26;
            if(prevChar != c)
                allSame = 0;
            letters[pos]++;
            
        }
        if(allSame == 1)
            return s.length();
        int flag = 0, sum = 0;
        int maxOdd = 0;
        for(int i=0; i<letters.length; i++){
            //System.out.println("-->"+letters[i]);
            //System.out.println(sum);
            if(letters[i] == 1)
                flag = 1;
            if(letters[i]%2 == 0)
                sum+=letters[i];
            else if(letters[i] > 1){
                sum+=letters[i]-1;
                if(letters[i] > maxOdd)
                    maxOdd = letters[i];
            }
        }
        if(flag == 1 || maxOdd> 0)
            sum+=1;
        return sum;
        
    }
}