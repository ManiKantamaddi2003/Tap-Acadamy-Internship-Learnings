package arrays;

import java.util.Scanner;

public class CommonOddElements {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];  // Calculate the sum of the current pair
            if (sum == 7) {
                System.out.println(arr[i] + " " + arr[i + 1]);  // Print the pair if the sum is 7
            }
        }
        
        scan.close();
    }
}
