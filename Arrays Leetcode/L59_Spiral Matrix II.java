/**
 * 
 * 59. Spiral Matrix II
Solved
Medium

Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

 

Example 1:


Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
Example 2:

Input: n = 1
Output: [[1]]
 

Constraints:

1 <= n <= 20
 */
//Solution : I have solved this problem using 4 pointers approach. I have used left, right, top and bottom pointers to traverse the matrix in spiral order. And while traversing I added the elements in the 2D array. which is similar to the problem 54. Spiral Matrix. The only difference is that in this problem we have to fill the matrix in spiral order instead of returning the elements in spiral order.
s
class Solution {
    public int[][] generateMatrix(int n) {
        int [][]arr=new int[n][n];
        int c=1;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;


        while(left<=right && top <= bottom){

                //traversing from left to right

             for(int i=left; i<=right; i++){

                arr[left][i]=c;
                c++;
             }

            top++;

            for(int j=top; j<=bottom; j++){
                arr[j][bottom]=c;
                c++;

            }
            right--;

            if(top<=bottom){
            //traversing from right to left
            for(int k=right; k>=left;k--){

                arr[bottom][k]=c;
                c++;

            }
            bottom--;
            }
           

            if(left <= right){

            // traversing from bottom to top;
            for(int l=bottom; l>=top; l--){
                arr[l][left]=c;
                c++;
            }
             left++;
            }
           
             



        }
        return arr;
    }
}