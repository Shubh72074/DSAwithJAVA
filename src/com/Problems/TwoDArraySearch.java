package com.Problems;

import java.util.Arrays;

public class TwoDArraySearch {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
        int target = 9;
        System.out.println(Arrays.toString(search(matrix,target)));
    }

    static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr[r].length - 1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r,c};
            }
            else if (arr[r][c] > target) {
                c--;
            }
            else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
