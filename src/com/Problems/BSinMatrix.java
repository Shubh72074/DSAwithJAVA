package com.Problems;

import java.util.Arrays;

public class BSinMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{14,15,16,17}};

        int target = 13;

        System.out.println(Arrays.toString(MatrixSearch(arr,target)));
    }
    static int[] MatrixSearch(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int rStart = 0;
        int rEnd = matrix.length - 1;
        int cStart = 0;
        int cEnd = cols - 1;

        if (rows == 1) {
            return binarySearch(matrix,0,0,cols - 1,target);
        }

        while (rStart < rEnd) {
            int cmid = cStart + (cEnd - cStart) / 2;
            if (matrix[rStart][cmid] == target) {
                return new int[]{rStart,cmid};
            }
            else if (target > matrix[rStart][cmid]) {
                rStart = cmid;
            }
            else {
                rStart = cmid - 1;
            }
        }

        if (target < matrix[rStart][cEnd]) {
            binarySearch(matrix,rStart,)
        }
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row,mid};
            }
            else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }
}
