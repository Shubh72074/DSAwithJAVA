package com.Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {53,63,3,5,23,52,3475,24,2,57};
        int target = 52;

        // passing the array and the target element we need to find
        System.out.println(Search(arr,target));
    }

    static int Search(int[] arr, int target) {

        // condition to check whether the array is empty
        // empty == true -> return -1

        if (arr.length == 0) {
            return -1;
        }

        // for loop which will iterate over indexes of the array
        for (int i = 0; i < arr.length; i++) {

            // checking for is the current element is equal to target element
            if ( arr[i] == target) {

                // if it is equal returning the index
                return i;
            }
        }

        // if it is not equal returning -1
        return -1;
    }
}
