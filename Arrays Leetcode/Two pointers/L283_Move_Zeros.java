 /** 283. Move Zeroes
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
**/

// Solution using two pointers 

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int left=0;
        int right=1;

        while(right <= nums.length-1){

            if(nums[left]==0){

                if(nums[right]==0) right++;
                else if(nums[right]!=0){

                    nums[left]=nums[right];
                    nums[right]=0;
                    left++;
                    right++;

                }
            }else{
                left++;
                right++;
            }
        }
    }
}