package javapractice.pkg2;

import java.util.Arrays;

public class NewClass30 {
    public static void main(String[] args) {
        double[] numbers = {-1.5, 2.0, -3.7, 4.5, -6.8, 7.2};

        double[] positiveNumbers = filterPositiveNumbers(numbers);

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Positive Numbers: " + Arrays.toString(positiveNumbers));
    }

    private static double[] filterPositiveNumbers(double[] numbers) {
        int count = 0;

        // Count the number of positive numbers
        for (double number : numbers) {
            if (number > 0) {
                count++;
            }
        }

        // Create a new array to store positive numbers
        double[] positiveNumbers = new double[count];

        // Fill the new array with positive numbers
        int index = 0;
        for (double number : numbers) {
            if (number > 0) {
                positiveNumbers[index++] = number;
            }
        }

        return positiveNumbers;
    }
}