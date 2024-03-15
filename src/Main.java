import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] random_numbers = new int[5];

        random_numbers[0] = 14;
        random_numbers[1] = 18;
        random_numbers[2] = 36;
        random_numbers[3] = 43;
        random_numbers[4] = 45;

        Arrays.sort(random_numbers);

        int sumEven = 0;
        for (int num : random_numbers) {
            if (num % 2 == 0) {
                sumEven += num;
            }
        }
        System.out.println("Sum of Even Numbers: " + sumEven);
    }
}
