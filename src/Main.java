import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] random_numbers = {14, 18, 36, 43, 45};

        int sumEven = 0;
        for (int num : random_numbers) {
            if (num % 2 == 0) {
                sumEven += num;
            }
        }
        System.out.println("Sum of Even Numbers: " + sumEven);
    }
}
