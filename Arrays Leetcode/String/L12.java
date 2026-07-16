/**
 * 
 * 12. Integer to Roman
Solved
Medium
Topics
premium lock icon
Companies
Seven different symbols represent Roman numerals with the following values:

Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:

If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.
Given an integer, convert it to a Roman numeral.

 

Example 1:

Input: num = 3749

Output: "MMMDCCXLIX"

Explanation:

3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 700 = DCC as 500 (D) + 100 (C) + 100 (C)
  40 = XL as 10 (X) less of 50 (L)
   9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
Example 2:

Input: num = 58

Output: "LVIII"

Explanation:

50 = L
 8 = VIII
Example 3:

Input: num = 1994

Output: "MCMXCIV"

Explanation:

1000 = M
 900 = CM
  90 = XC
   4 = IV
 

Constraints:

1 <= num <= 3999
 */

// Solution : I have applied the brut force approach to solve this problem assign all the possible values for 4 and 9 case. Add all the defult values in the map and whenever i required and vaule find it in the map. if it is not present then i will check for the next possible value and keep on adding it to the string until the number becomes 0. 
class Solution {
    public String intToRoman(int num) {

        StringBuilder sb=new StringBuilder("");

       Map<Integer, String> map=new HashMap<>();
       map.put(1,"I");
       map.put(5,"V");
       map.put(10,"X");
       map.put(50,"L");
       map.put(100,"C");
       map.put(500, "D");
       map.put(1000,"M");
       map.put(4,"IV");
       map.put(40,"XL");
       map.put(400,"CD");
       map.put( 9 ,"IX");
       map.put( 90 ,"XC");
       map.put( 900 ,"CM");

        StringBuilder str=new StringBuilder("");
        int value=1;

       while(num > 0){
        int n= num%10;
        n*=value;
        value*=10;
        if(map.containsKey(n)){
            if(str.toString() != "") {
            str.append(map.get(n));
            sb.insert(0, str)
            ;
            str.delete(0, str.length()); }else sb.insert(0, map.get(n));
            num/=10;
            continue;
        }
        if(n > 1000){
            str.append(map.get(1000));
             num-=1;
             value/=10;
            continue;
        }
        if(n > 500){
             str.append(map.get(500));
             num-=5;
             value/=10;
            continue;
        }
        if(n > 100){
            str.append(map.get(100));
             num-=1;
             value/=10;
            continue;
        }
        if(n > 50){
            str.append(map.get(50));
             num-=5;
             value/=10;
            continue;
        }
        if(n > 10){
            str.append(map.get(10));
             num-=1;
             value/=10;
            continue;
        }
        if(n > 5){
             str.append(map.get(5));
             num-=5;
             value/=10;
            continue;
        }
        if(n > 1){
            str.append(map.get(1));
             num-=1;
             value/=10;
            continue;
        }

        num/=10;

        }

        return sb.toString();
    }
}