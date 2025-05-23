/*74. Search a 2D Matrix
Solved
Medium
Topics
Companies
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int end=m*n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(matrix[row][col]<=target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
    return false;
    }

}