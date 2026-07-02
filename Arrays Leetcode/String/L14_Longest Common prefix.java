/**
 * 14. Longest Common Prefix
Solved
Easy
Topics
premium lock icon
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
 */

//Solution : I have traversing the string array, first store the 0th index string in a variable as a prefix, then compare the prefix with the next string in the array. If the prefix is not matching with the next string then return the prefix.


class Solution {
    public String longestCommonPrefix(String[] strs) {
     String s=strs[0];
    if(strs.length == 1 )return strs[0];

     for(int i=1; i<strs.length; i++){
        
        s= compare(strs[i], s);
     }

return s;
    }
    private String compare(String s, String compareTo){

            StringBuilder str= new StringBuilder("");

            for(int i=0; i<s.length() && i<compareTo.length(); i++){

                    if(s.charAt(i)==compareTo.charAt(i)){
                        str.append(s.char0At(i));
                        continue;
                    }
                    break;
            }

            return str.toString();

    }
}