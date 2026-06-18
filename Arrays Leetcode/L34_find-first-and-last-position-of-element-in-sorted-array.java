/**  *
 * 
 * 34. Find First and Last Position of Element in Sorted Array
Solved
Medium
Topics
premium lock icon
Companies
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
*/

// Solutiion : Binary Search

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        ans[0] = findBound(nums, target, true);  // Find first position
        ans[1] = findBound(nums, target, false); // Find last position
        
        return ans;
    }
    
    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        int bound = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents potential integer overflow
            
            if (nums[mid] == target) {
                bound = mid; // Record the match candidate
                
                if (isFirst) {
                    right = mid - 1; // Keep looking to the left for the first position
                } else {
                    left = mid + 1;  // Keep looking to the right for the last position
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return bound;
    }
}