import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {
        int[] arr = {2,4,32,13,13,1,4};

        System.out.println(Arrays.toString(arr));

        swap(arr, 0,4);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
