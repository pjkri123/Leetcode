class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1]<nums[i]) sum+=nums[i];
            else {
                if(max<sum) max=sum;
                sum=nums[i];
            }
        }
        if(max<sum) max=sum;
        return max;
    }
}
