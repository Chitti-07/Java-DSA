/*
Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral_Matrix_I {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> ans = spiral(arr);
        for (Integer nums: ans){
            System.out.println(nums);
        }
    }
    static List<Integer> spiral(int[][] nums) {
        List<Integer> ans = new ArrayList();
        int top = 0;
        int bottom = nums.length-1;

        int left = 0;
        int right = nums[0].length;

        while (top<=bottom && left<=right) {
            //To print nums from left to right by keeping top as constant
            for (int i = left; i <= right; i++) {
                ans.add(nums[top][i]);
            }
            top++;

            //To print nums from top to bottom on left side
            for (int i = top; i <= bottom; i++) {
                ans.add(nums[i][right]);
            }
            right--;

            if (top <= bottom) {
                //To print nums from right to left on bottom side
                for (int i = right; i >= left ; i--) {
                    ans.add(nums[bottom][i]);
                }
            }
            bottom--;


            if (left <= right) {
                //To print nums from bottom to top on left side
                for (int i = bottom; i >= top ; i--) {
                    ans.add(nums[i][left]);
                }
            }
            left++;
        }
        return ans;
    }
}
