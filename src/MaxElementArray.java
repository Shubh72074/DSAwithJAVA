public class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = {4,32,24,52,1,5,54,76,2};

        int max = arr[0];
        for (int ele:arr) {
            if (ele > max) {
                max = ele;
            }
        }

        System.out.println("MAX ELEMENT IS: "+ max);
    }
}
