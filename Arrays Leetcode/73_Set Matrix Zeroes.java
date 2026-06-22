/**
 * 
 * 73. Set Matrix Zeroes
Solved
Medium
Topics

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:



Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 

Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
 */
//Solution : As i have applied a basic bruit force approach here, I have created tow arrays one for row and other for column and then i have traversed the matrix and find out at what index the value is zero and then i have marked the row and column index in the respective arrays and then i have traversed the matrix again to set the value to zero if the row or column index is marked in the respective arrays. 

class Solution {
    public void setZeroes(int[][] matrix) {
        int row[]=new int[matrix.length];
        int column[]=new int[matrix[0].length];

        for (int i=0; i<row.length; i++){

            for(int j=0; j<column.length; j++){

                if(matrix[i][j]==0){
                    row[i]=1;
                    column[j]=1;

                }
            }

        }

        for(int k=0; k<row.length; k++){

            for(int l=0; l<column.length;l++){

                if(row[k]==1 || column[l]==1){
                    matrix[k][l]=0;
                }
            }
        }
    }
}