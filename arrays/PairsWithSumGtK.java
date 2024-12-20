package arrays;

import java.util.Scanner;

public class PairsWithSumGtK {

    // Method to find and print all pairs with a sum equal to k
    public static void pairs(int arr[], int k) {
        //boolean found = false; // Flag to check if any pairs are found

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println( arr[i] + " " + arr[j]);
                    //found = true;
                }
            }
        }

//        if (!found) {
//            System.out.println("No pairs with sum equal to " + k + " were found.");
//        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        // Read the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();

        // Read the target sum k
        System.out.print("Enter the target sum k: ");
        int k = scan.nextInt();

        // Read the array elements
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Find and print pairs with sum equal to k
        pairs(arr, k);

        // Close the scanner
        scan.close();
    }
}
