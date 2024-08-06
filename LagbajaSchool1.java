
		

import java.util.Scanner;

public class LagbajaSchool1 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the number of students in your class:");
        int numberOfStudent = sc.nextInt();
        System.out.println("Enter the number of subjects done by each student:");
        int numberOfSubject = sc.nextInt();

     
        int[][] reportSheet = new int[numberOfStudent][numberOfSubject];
        int[] total = new int[numberOfStudent];
	int [] position = new int[numberOfStudent];

        
        for (int index = 0; index < numberOfStudent; index++) {
            System.out.printf("Enter the scores for student %d:%n", index + 1);
            for (int counter = 0; counter < numberOfSubject; counter++) {
                System.out.printf("Enter the score for subject %d: ", counter + 1);
                reportSheet[index][counter] = sc.nextInt();
                total[index] += reportSheet[index][counter]; // Compute total score
            }
        }

       
        System.out.printf("%-10s", "Student");
        for (int count = 1; count <= numberOfSubject; count++) {
            System.out.printf("%-10s", "Subject " + count);
        }
        System.out.printf("%-10s%-10s%n", "Total", "Average");

        
        for (int index = 0; index < numberOfStudent; index++) {
            System.out.printf("%-10d", index + 1); // Student number
            for (int counter = 0; counter < numberOfSubject; counter++) {
                System.out.printf("%-10d", reportSheet[index][counter]); // Subject score
            }
            double average = (double) total[index] / numberOfSubject; // Compute average
            System.out.printf("%-10d%-10.2f%n", total[index], average); // Total and Average
        }

        
    }
}
