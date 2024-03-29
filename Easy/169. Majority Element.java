/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
*/

//Solution
class Solution {
    public int majorityElement(int[] nums) {
        int count=0,res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=nums[res])
                count--;
            else
                count++;
            if(count==0)
            {
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[res])
                count++;
        }
        if(count<=nums.length/2)
            return -1;
        return nums[res];
    }
}
