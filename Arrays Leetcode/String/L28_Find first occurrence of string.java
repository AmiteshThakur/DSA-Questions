/**
 * 
Code
Code Sample
Code Sample
Test Result
28. Find the Index of the First Occurrence in a String
Solved
Easy
Topics
premium lock icon
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */

//Solution : I have traversing the string whenever i found the first character of the needle i call the function to check this is the needle or not. 
//another method is by using direct method. 

class Solution {
    public int strStr(String haystack, String needle) {

        // return haystack.indexOf(needle);   ---> direct method of string. 
        

        for(int i=0; i<haystack.length(); i++){

            if(haystack.charAt(i)==needle.charAt(0)){
              
               if(  finder(i, needle, haystack) ) return i;  

            }

        }
        return -1;
        
    }

    private boolean finder(int index, String needle, String haystack){
            int f = needle.length();

        for(int i=0; i< needle.length() && index < haystack.length() ; i++, index++ ){

            if(needle.charAt(i)!=  haystack.charAt(index) ) return false;

            f--;
        }

        if(f==0)return true;
        return false;
    }
}