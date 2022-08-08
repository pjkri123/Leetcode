/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

 

Example 1:

Input: num = 16
Output: true

Example 2:

Input: num = 14
Output: false
 

Constraints:

1 <= num <= 2^31 - 1
*/

//Solution
class Solution {
    public boolean isPerfectSquare(int num) {
        long start=1,end=num;
        while(start<=end)
        {
            long mid=start+(end-start)/2;
            if(mid*mid<num)
                start=mid+1;
            else if(mid*mid>num)
                end=mid-1;
            else
                return true;
        }
        return false;
    }
}
