package com.Problems;

public class LastSmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'a','b','d','e'};
        char target = 'a';

        System.out.println(SmallestToTarget(letters,target));
    }

    static char SmallestToTarget(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
