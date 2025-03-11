class Solution {
    public int numberOfSubstrings(String s) {
        // case 1: TLE
        /*
        int count=0;
        for(int i=0;i<s.length()-2;i++) {
            for(int j=i+2;j<s.length();j++) {
                String str=s.substring(i,j+1);
                if(str.contains("a") && str.contains("b") && str.contains("c")) count++;
            }
        }
        return count;
        */

        // case 2:
        int count = 0;
        int lastA=-1;
        int lastB=-1;
        int lastC=-1;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='a') lastA=i;
            if(s.charAt(i)=='b') lastB=i;
            if(s.charAt(i)=='c') lastC=i;
            if(lastA!=-1 && lastB!=-1 && lastC!=-1)
                count+=Math.min(lastA,Math.min(lastB,lastC))+1;
        }
        return count;
    }
}
