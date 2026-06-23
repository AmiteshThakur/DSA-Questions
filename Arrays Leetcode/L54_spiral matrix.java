
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 54. Spiral Matrix
Solved
Medium

Hint
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
 */


// Solution : I have solved this problem using 4 pointers approach. I have used left, right, top and bottom pointers to traverse the matrix in spiral order. And using while loop as while traversing i added the elements in the arrayList. 




class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arrList=new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return arrList;
        }
        int left=0; 
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        while(top <= bottom && left<=right ){
            //first loop for left to right 

            for(int i=left; i<=right; i++){

                arrList.add(matrix[top][i]);

            }

            //top to bottom 
            top++;
            for(int j=top; j<=bottom; j++){
                
                arrList.add(matrix[j][right]);

            }
            right--;

            //rigth to left
            if(top<=bottom){
            for(int k=right; k>=left; k--){
                arrList.add(matrix[bottom][k]);

            }
            bottom--;
            }
          
            // bottom to top
            if(left<=right){
            for(int l=bottom; l>=top; l--){
                arrList.add(matrix[l][left]);

            }
            left++;
            }


        }
        return arrList;

    }
}