package arrays;

import java.util.Scanner;

public class PairsWithPrimeNumbers {

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to find and print pairs of prime numbers
    public static void pairsWithPrimes(int arr[]) {
        boolean found = false; // Flag to check if any pairs are found

        for (int i = 0; i < arr.length - 1; i++) {
            if (isPrime(arr[i])) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (isPrime(arr[j])) {
                        System.out.println("Prime Pair: (" + arr[i] + ", " + arr[j] + ")");
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No prime pairs were found.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();

        // Read the array elements
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Find and print pairs of prime numbers
        pairsWithPrimes(arr);

        // Close the scanner
        scan.close();
    }
}
