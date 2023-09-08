package com.Random;

public class PBS {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8,11};
        int start = 0;
        int end = arr.length - 1;
        int target = 5;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println("Found");
                break;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
    }
}
