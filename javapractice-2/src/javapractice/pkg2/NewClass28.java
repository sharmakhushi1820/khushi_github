package javapractice.pkg2;
public class NewClass28 {
    public static void main(String[] args) {
        int[] primeDistances = calculatePrimeDistances(100);

        System.out.println("Distances between the first 100 prime numbers: ");
        for (int i = 1; i < primeDistances.length; i++) {
            System.out.print(primeDistances[i] + " ");
        }
    }

    private static int[] calculatePrimeDistances(int numberOfPrimes) {
        int[] primes = new int[numberOfPrimes + 1];
        int[] distances = new int[numberOfPrimes];

        int count = 0;
        int number = 2;

        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                primes[++count] = number;
            }
            number++;
        }

        for (int i = 1; i < primes.length - 1; i++) {
            distances[i] = primes[i + 1] - primes[i];
        }

        return distances;
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