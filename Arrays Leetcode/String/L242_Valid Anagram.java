/**
 * 242. Valid Anagram
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 * 
 */

//Solution : I have applied the approach of  taking the frequency of string s, and count of unique characters. Then I have traversed the string t and checked if the character is present in the frequency array or not. 

//2nd approach is to sort the strings and check if they are equal or not. 



class Solution {
    public boolean isAnagram(String s, String t) {
        int count=0;
        if(s.length() != t.length()) return false;
        int []arr=new int[26];
    // taken the frequency of string s, and count of unique characters.
        for(int i=0;  i<s.length(); i++){
            if(arr[s.charAt(i)-'a']==0){
                count++;    
                }
            arr[s.charAt(i)-'a']++;

        }

        for(int j=0; j<t.length(); j++){

            if(arr[t.charAt(j)-'a']==1){
                count--;

            }else if(arr[t.charAt(j)-'a']==0) return false;

            arr[t.charAt(j)-'a']--;




        }
    if(count==0)return true;

    return false;

    }
}