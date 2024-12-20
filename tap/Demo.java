package tap;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // Number of buildings
        scan.nextLine(); // Consume the newline
        String[][][] B = new String[n][][];

        for (int i = 0; i < n; i++) {
            int rooms = scan.nextInt(); // Number of rooms in the i-th building
            scan.nextLine(); // Consume the newline
            B[i] = new String[rooms][];

            for (int j = 0; j < rooms; j++) {
                int students = scan.nextInt(); // Number of students in the j-th room
                scan.nextLine(); // Consume the newline
                B[i][j] = new String[students];

                for (int k = 0; k < students; k++) {
                    B[i][j][k] = scan.nextLine(); // Name of the k-th student
                }
            }
        }

        // Output all student names
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                for (int k = 0; k < B[i][j].length; k++) {
                    System.out.println(B[i][j][k]);
                }
            }
        }
    }
}
