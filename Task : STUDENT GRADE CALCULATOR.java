//------------------------------TASK 2-----------------------------------
//STUDENT GRADE CALCULATOR
// Input: Take marks obtained (out of 100) in each subject.
// Calculate Total Marks: Sum up the marks obtained in all subjects.
// Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
// average percentage.
// Grade Calculation: Assign grades based on the average percentage achieved.
// Display Results: Show the total marks, average percentage, and the corresponding grade to the user



package com.codsoft;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int phy_marks = 0, chem_marks = 0, bio_marks = 0, math_marks = 0;
        boolean marksEntered = false;

        do {
            System.out.println("\n----------- STUDENT GRADE CALCULATOR MENU -----------");
            System.out.println("1. Enter Marks");
            System.out.println("2. Calculate Total, Percentage and Grade");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = sc.nextInt();

            switch (choice) {
            case 1:
                try {
                    System.out.println("Enter the marks obtained in Physics (out of 100):");
                    phy_marks = sc.nextInt();
                    if (phy_marks < 0 || phy_marks > 100)
                        throw new IllegalArgumentException("Invalid Physics marks! Must be between 0 and 100.");

                    System.out.println("Enter the marks obtained in Chemistry (out of 100):");
                    chem_marks = sc.nextInt();
                    if (chem_marks < 0 || chem_marks > 100)
                        throw new IllegalArgumentException("Invalid Chemistry marks! Must be between 0 and 100.");

                    System.out.println("Enter the marks obtained in Biology (out of 100):");
                    bio_marks = sc.nextInt();
                    if (bio_marks < 0 || bio_marks > 100)
                        throw new IllegalArgumentException("Invalid Biology marks! Must be between 0 and 100.");

                    System.out.println("Enter the marks obtained in Math (out of 100):");
                    math_marks = sc.nextInt();
                    if (math_marks < 0 || math_marks > 100)
                        throw new IllegalArgumentException("Invalid Math marks! Must be between 0 and 100.");

                    marksEntered = true;
                    System.out.println("Marks entered successfully!");

                } catch (IllegalArgumentException e) {
                    // Reset all marks to 0
                    phy_marks = chem_marks = bio_marks = math_marks = 0;
                    marksEntered = false;
                    System.out.println("Error: " + e.getMessage());
                }
                break;


                case 2:
                    if (!marksEntered) {
                        System.out.println("Please enter marks first using option 1.");
                        break;
                    }

                    int totalMarks = phy_marks + chem_marks + bio_marks + math_marks;
                    double averagePercentage = totalMarks / 4.0;

                    String grade;
                    if (averagePercentage >= 90) {
                        grade = "O Grade";
                    } else if (averagePercentage >= 80) {
                        grade = "A+ Grade";
                    } else if (averagePercentage >= 70) {
                        grade = "A Grade";
                    } else if (averagePercentage >= 60) {
                        grade = "B+ Grade";
                    } else if (averagePercentage >= 50) {
                        grade = "B Grade";
                    } else if (averagePercentage >= 40) {
                        grade = "P Grade";
                    } else {
                        grade = "F Grade";
                    }

                    System.out.println("\n------------------- RESULT -----------------");
                    
                    System.out.println("Total Marks			: " + totalMarks + " / 400");
                    System.out.println("Percentage			:" +averagePercentage);
                    System.out.println("Grade				: " + grade);
                    break;

                case 3:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }

        } while (choice != 3);

        sc.close();
    }
}
