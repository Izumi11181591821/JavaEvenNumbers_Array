import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] random_numbers = {14, 18, 36, 43, 45};

        int sumEven = 0;
        for (int i = 0; i < random_numbers.length; i++) {
            int num = random_numbers[i];
            if (num % 2 == 0) {
                sumEven += num;
            }
        }
        System.out.println("Sum of Even Numbers: " + sumEven);
    }
}
