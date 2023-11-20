package javapractice.pkg2;
public class NewClass27 {
    public static void main(String[] args) {
        int[] primeArray = calculateSumOfPrimes(100);

        System.out.println("Sum of the first 100 prime numbers: " + primeArray[0]);
        System.out.println("Prime numbers: ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(primeArray[i] + " ");
        }
    }

    private static int[] calculateSumOfPrimes(int numberOfPrimes) {
        int[] primes = new int[numberOfPrimes + 1];
        int sum = 0;
        int count = 0;
        int number = 2; 

        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                sum += number;
                primes[++count] = number;
            }
            number++;
        }

        primes[0] = sum;
        return primes;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}