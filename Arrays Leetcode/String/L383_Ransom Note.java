/**
 * 
 * 383. Ransom Note
Solved
Easy
Topics
premium lock icon
Companies
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 

Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
 */

//Solution : I have applied frequecy approach to solve this problem, first i have take a frequency of the magazine and then i have checked if the frequency of ransomNote is less than or equal to the frequency of magazine or not, if it is less than or equal to 0 then return false, else return true.

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr=new int[26];

        for(int i=0; i<magazine.length(); i++){

          arr[magazine.charAt(i)-'a']++;

        }
        for(int j=0; j<ransomNote.length(); j++){

            if(arr[ransomNote.charAt(j)-'a']<=0)return false;
            else arr[ransomNote.charAt(j)-'a']--;

            
        }
        return true;
    }
}