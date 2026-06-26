/**
 * 
 * 680. Valid Palindrome II
Solved
Easy

Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 

Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
 */

// Solution : I have traversing from both left and right and checking if the characters are equal or not. If they are not equal then I have traversed by skiping left element, and second time skiping right element if get true in any of the condition then return true else return false.


class Solution {
    public boolean validPalindrome(String s) {
        int count = 0;
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;

            } else {
                if (count == 0) {
                    if (traverse(left + 1, right, s) || traverse(left, right - 1, s))
                        return true;
                    return false;
                }

            }

        }
        return true;

    }

    private boolean traverse(int left, int right, String s) {

        while (left < right) {

            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;

            } else
                return false;

        }
        return true;
    }

}