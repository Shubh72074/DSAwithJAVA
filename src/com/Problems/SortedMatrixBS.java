package com.Problems;

import java.util.Arrays;

public class SortedMatrixBS {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};

        for (int i = 1; i<19; i++) {
            System.out.println(Arrays.toString(binarysearch(matrix,i)));
        }
    }
    static int[] binarysearch(int[][] matrix, int target) {
        int rStart = 0;
        int rEnd = matrix.length;

        while (rStart < rEnd) {
            int rMid = rStart + (rEnd - rStart) / 2;
            int cEnd = matrix[rMid].length - 1;
            if (target > matrix[rMid][cEnd]) {
                rStart = rMid + 1;
            }
            else if (target == matrix[rMid][cEnd]) {
                return new int[]{rMid,cEnd};
            }
            else if (target == matrix[rMid][0]) {
                return new int[]{rMid,0};
            }
            else if (target > matrix[rMid][0] && target < matrix[rMid][cEnd]) {
                rStart = rMid;
                break;
            }
            else {
                rEnd = rMid - 1;
            }

        }

        int c = 0;
        int end = matrix[rStart].length - 1;
        while (c <= end) {
            int mid = c + (end - c) / 2;
            if (matrix[rStart][mid] == target) {
                return new int[]{rStart,mid};
            }
            else if (target > matrix[rStart][mid]) {
                c = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return new int[]{-1,-1};
    }
}
