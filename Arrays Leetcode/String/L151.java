/*
    151. Reverse Words in a String
Solved
Medium
Topics
premium lock icon
Companies
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Constraints:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
*/

//Solution : I have used two StringBuilder obj one for the final string and one for the current word. I have traversed the string and whenever I encounter a space I will insert the current word , in the last i have checked for the last word and inserted it in the final string. I have also handled the case of multiple spaces and leading and trailing spaces. 

class Solution {
    public String reverseWords(String s) {
    StringBuilder sbr=new StringBuilder("");
    StringBuilder word=new StringBuilder("");


    for(int i=0; i<s.length(); i++){

        if(s.charAt(i)==' ' && word.toString()=="") continue;

        if(s.charAt(i)==' '){
                if(sbr.length()==0){
                    sbr.insert(0, word);
                }else{
                    sbr.insert(0, word+" ");
                }
            word=new StringBuilder("");

        }else if(s.charAt(i)!=' ' ){

            
            word.append(s.charAt(i));

        }
    }

    if(word.toString()!="" ){

      if(sbr.length()!=0)  sbr.insert(0, word+" " );
      else sbr.insert(0, word);
    }
    return sbr.toString();

    }
}