public class MinElementArray {
    public static void main(String[] args) {
        int[] arr = {4,3,24,23,1,43,55,332};

        int[][] arr2D = {
                {3,2,4},
                {55,53,322},
                {1,143,533}
        };

        System.out.println(min(arr));
        System.out.println("2D Array: "+min2D(arr2D));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int ele:arr) {
            if (ele < min) {
                min = ele;
            }
        }
        return min;
    }

    static int min2D(int[][] arr){
        int min = arr[0][0];
        for (int[] row: arr) {
            for (int ele:row) {
                if (ele < min) {
                    min = ele;
                }
            }
        }

        return min;
    }
}
