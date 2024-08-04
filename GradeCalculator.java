
/*
 * Aim: This is the Code for calculating The Grade Of Student
 * Author: Gohel Neel
 * B.Tech. CSE Student At Darshan University
 * Rajkot, Gujrat, India
 * Date: 04-08-2024
 * 
 */
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get No of Subject From User
        System.out.print("Enter the number of subjects: ");
        int noOfSubjects = sc.nextInt();

        // Array to Store The All Subject Marks
        int[] marks = new int[noOfSubjects];

        // To Calculate Percentage We need Total Marks
        int totalMarks = 0;

        // To get All subject marks from User
        for (int i = 0; i < noOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            // If Marks not valid
            while (marks[i] > 100 || marks[i] < 0) {
                System.out.print("Enter valid marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }
            // Calculating Total
            totalMarks += marks[i];

        }
        // Calculate The Percentage According To Given Condition
        double avgPercentage = (double) totalMarks / noOfSubjects;

        // To Store Checked Grade
        char grade = calculateGrade(avgPercentage);

        // Output
        System.out.println("-----------------------");
        System.out.println("\nStudent Get");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f\n", avgPercentage);
        System.out.println("Grade: " + grade);
    }

    // Method To calculate Grade According to Percentage 
    // Return The char
    public static char calculateGrade(double avgPercentage) {
        if (avgPercentage >= 90) {
            return 'A';
        } else if (avgPercentage >= 80) {
            return 'B';
        } else if (avgPercentage >= 70) {
            return 'C';
        } else if (avgPercentage >= 60) {
            return 'D';
        } else if (avgPercentage >= 50) {
            return 'E';
        } else {
            return 'F';
        }

    }

}