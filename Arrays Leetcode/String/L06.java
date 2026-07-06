/**
 * 6. Zigzag Conversion
Solved
Medium
Topics
premium lock icon
Companies
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
 

Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
 */
//Solution : I have two loops to traverse the string, one for the rows and one for the columns. I have two variables top and down to keep track of the number of characters to be skipped in each row. I have  used StringBuilder to store the result the return the result as a string. The time complexity  of this solution is O(n). 

class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        int n=s.length();
        int i=1;
        StringBuilder sb=new StringBuilder("");


        while(i<= numRows){
            

            int index=i-1;
            if(index > n-1 )return sb.toString();
            sb.append(s.charAt(index));
            index++;
            while(index <  n){

               int top= (i==1) ? 0 : ((i-1)*2)-1;
               int down=  (i==numRows) ? 0 : ((numRows-i)*2)-1;

                index+=down;
                if(down!=0 && index < n){
                    
                    sb.append(s.charAt(index));
                    index++;

                }
                index+=top;
                if(top!=0 && index < n){
                    
                    sb.append(s.charAt(index));
                    index++;

                }

             }

             i++;


        }
        return sb.toString();
    }
}