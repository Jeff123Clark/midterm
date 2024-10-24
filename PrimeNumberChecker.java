public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number = 32; // Hardcoded input number

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 1; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number, also i made a change to the code.");
        } else {
            System.out.println(number + " is not a prime number, also I made a change to the code.");
        }

        System.out.println("List of prime numbers up to " + number + ":");
        for (int i = 2; i <= number; i++) {
            boolean isPrimeCheck = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimeCheck = false;
                    break;
                }
            }
            if (isPrimeCheck) {
                System.out.print(i + " ");
            }
        }
    }
}
