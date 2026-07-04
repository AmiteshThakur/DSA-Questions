/**
 * 38. Count and Say
Solved
Medium
Topics
premium lock icon
Companies
Hint
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the run-length encoding of countAndSay(n - 1).
Run-length encoding (RLE) is a string compression method that works by replacing each maximal group of consecutive identical characters with the concatenation of the length of the group followed by the character itself. For example, to compress the string "3322251" we replace "33" with "23", replace "222" with "32", replace "5" with "15", and replace "1" with "11". Thus the compressed string becomes "23321511".

Given a positive integer n, return the nth element of the count-and-say sequence.

 

Example 1:

Input: n = 4

Output: "1211"

Explanation:

countAndSay(1) = "1"
countAndSay(2) = RLE of "1" = "11"
countAndSay(3) = RLE of "11" = "21"
countAndSay(4) = RLE of "21" = "1211"
Example 2:

Input: n = 1

Output: "1"

Explanation:

This is the base case.

 

Constraints:

1 <= n <= 30
 */

//Solution : I have used recursion to get the previous string and then used run length encoding to get the current string. I have used a StringBuilder to store the current string and then returned it. 


class Solution {
    public String countAndSay(int n) {
        
        String ans=rev(n);
        return ans;

    }

    private String rev(int n){
        int count=0; 

        if(n==1)return "1";
        else{

            String rel=rev(n-1);
            char c=' ';
            StringBuilder sb= new StringBuilder("");
              c=rel.charAt(0);
            for(int i=0; i<rel.length(); i++){
              

                if(rel.charAt(i)==c){
                    count++;
                }else if(rel.charAt(i)!=c){
                    sb.append(""+count+""+c);
                    count=1;
                    c=rel.charAt(i);

                }
            }

            if(count!=0){
                sb.append(""+count+""+c);
            }

            // System.out.println(rel+"-----"+sb);
            return sb.toString();

        }

    }
}