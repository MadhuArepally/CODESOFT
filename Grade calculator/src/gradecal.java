import java.util.Scanner;

public class gradecal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take marks obtained in each subject
        System.out.print("Enter the number of subjects: ");
        int Subjects = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= Subjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        // Calculate Total Marks
        // Calculate Average Percentage
        double Percentage = (double) total / Subjects;

        // Step 4: Grade Calculation
        char grade;
        if (Percentage >= 90) {
            grade = 'O';
        } else if (Percentage >= 80) {
            grade = 'A';
        } else if (Percentage >= 70) {
            grade = 'B';
        } else if (Percentage >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        //Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + String.format("%.2f", Percentage) + "%");
        System.out.println("Grade: " + grade);

    }
}
