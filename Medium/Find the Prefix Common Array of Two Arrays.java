class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int prefix=0;
        int[] ans=new int[A.length];
        int[] count=new int[A.length+1];
        for(int i=0;i<A.length;i++) {
            if(++count[A[i]]==2) prefix++;
            if(++count[B[i]]==2) prefix++;
            ans[i]=prefix;
        }
        return ans;
    }
}
