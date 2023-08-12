import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int originalNum = input.nextInt();
        int temp = originalNum;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum  += rem * rem * rem;
            temp /= 10;
        }
        if (originalNum == sum) System.out.println("YES");
        else System.out.println("NO");
    }

}
