class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        /*
        for(int i=0;i<words.length-1;i++) 
            for(int j=i+1;j<words.length;j++) 
                if(words[i].length()<=words[j].length()) 
                    if((words[j].substring(0,words[i].length())).equals(words[i]) && (words[j].substring(words[j].length()-words[i].length(),words[j].length())).equals(words[i])) count++;
        return count;
        */
        for(int i=0;i<words.length;i++)
            for(int j=i+1;j<words.length;j++)
                if(isEqual(words[i],words[j])) count++;
        return count;
    }
    private boolean isEqual(String word1,String word2) {
        return word2.startsWith(word1) && word2.endsWith(word1);
    }
}
