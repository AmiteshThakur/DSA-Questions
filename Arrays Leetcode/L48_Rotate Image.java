/**
 * 
 * Rotate Image
Solved
Medium
Topics
premium lock icon
Companies
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:


Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 

Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000
 */

//Solution : As I have to rotate the image or 2D matrix by 90 degree in clockwise direction and I have to do it in place then I can first transpose the matrix and then reverse each row to get the final answer.   

class Solution {
    public void rotate(int[][] matrix) {
        
        //Transpose this matrix 
        for(int i=0; i<matrix.length; i++){

            for(int j=i+1; j<matrix.length; j++){
            
                matrix[i][j]=matrix[i][j]+matrix[j][i];
                matrix[j][i]=matrix[i][j]-matrix[j][i];
                matrix[i][j]=matrix[i][j]-matrix[j][i];



            }
        }
        

// Reverse each row of this matrix
        for(int k=0; k<matrix.length; k++){

        int left=0; 
        int right=matrix.length-1;  
            while(left < right){

                matrix[k][left]=matrix[k][left]+matrix[k][right];
                matrix[k][right]=matrix[k][left]-matrix[k][right];
                matrix[k][left]=matrix[k][left]-matrix[k][right];

                left++;
                right--;

            }

        }
    }
}