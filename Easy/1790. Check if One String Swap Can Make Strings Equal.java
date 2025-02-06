class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if(s1.length()!=s2.length()) return false;
        String str1="";
        String str2="";
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i)!=s2.charAt(i)) {
                str1+=s1.charAt(i);
                str2+=s2.charAt(i);
            }
            if(str1.length()>2 || str2.length()>2) return false;
        }
        if(str1.length()==2 && str2.length()==2 && str1.charAt(0)==str2.charAt(1) && str1.charAt(1)==str2.charAt(0)) return true;
        return false;  
    }
}
