public class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem * rem;
                temp /= 10;
            }
            if (sum == i) System.out.println(i);
        }
    }
}
