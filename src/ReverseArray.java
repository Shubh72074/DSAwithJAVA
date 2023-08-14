import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 42, 14, 1, 4, 5, 3, 7, 8};
        System.out.println("INITIAL ARRAY: "+ Arrays.toString(arr));
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

        System.out.println("REVERSED ARRAY: "+ Arrays.toString(arr));
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
