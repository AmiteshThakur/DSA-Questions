/**
 * 
 * 125. Valid Palindrome
Solved
Easy
Topics
premium lock icon
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

 */

// Solution : I have applied two pointer approach to check if the string is palindrome or not. Check whether the character is alphanumeric or not. If it is alphanumeric then taken their values, and check if they are equal or not, if not then return false, else move the pointers. 

class Solution {
    public boolean isPalindrome(String s) {
      int left=0;
      int right= s.length()-1;

      while(left  <  right ){
        int l=-1;
        int r=-1;
        if((s.charAt(left) >= 'a' && s.charAt(left) <='z') || (s.charAt(left) >= 'A' && s.charAt(left) <='Z') || (s.charAt(left) >= '0' && s.charAt(left)<='9') ){
                if( s.charAt(left) >= 'a' && s.charAt(left) <='z' ) l=s.charAt(left)-'a';
                else if( s.charAt(left) >= '0' && s.charAt(left)<='9') l=s.charAt(left)+27;
                else l=s.charAt(left)-'A';
        }else{

             left++;
        }
 
        if((s.charAt(right) >= 'a' && s.charAt(right) <='z') || (s.charAt(right) >= 'A' && s.charAt(right) <='Z') || (s.charAt(right) >= '0' && s.charAt(right)<='9') ){
                if( s.charAt(right) >= 'a' && s.charAt(right) <='z' ) r=s.charAt(right)-'a';
                else if(s.charAt(right) >= '0' && s.charAt(right)<='9') r=s.charAt(right)+27;
                else r=s.charAt(right)-'A';
        }else{ 
          
            right--;
            }

            if(l!=-1 && r!=-1){
                if(l!=r) return false;
                left++;
                right--;
            }


      }  

      return true;
    }
}

