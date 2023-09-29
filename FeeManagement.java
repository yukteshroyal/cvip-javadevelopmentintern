import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    String name;
    double totalFees;
    double feesPaid;

    public Student(String name, double totalFees) {
        this.name = name;
        this.totalFees = totalFees;
        this.feesPaid = 0;
    }

    public double getRemainingFees() {
        return totalFees - feesPaid;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public void payFees(double amount) {
        feesPaid += amount;
    }
}

public class FeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Student> studentMap = new HashMap<>();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Pay Fees");
            System.out.println("3. Display Fee Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter total fees: ");
                    double totalFees = scanner.nextDouble();
                    studentMap.put(id, new Student(name, totalFees));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    int payId = scanner.nextInt();
                    System.out.print("Enter amount to pay: ");
                    double paymentAmount = scanner.nextDouble();
                    Student student = studentMap.get(payId);
                    if (student != null) {
                        student.payFees(paymentAmount);
                        System.out.println("Payment successful!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int displayId = scanner.nextInt();
                    Student displayStudent = studentMap.get(displayId);
                    if (displayStudent != null) {
                        System.out.println("Student: " + displayStudent.name);
                        System.out.println("Total fees: $" + displayStudent.totalFees);
                        System.out.println("Fees paid: $" + displayStudent.feesPaid);
                        System.out.println("Remaining fees: $" + displayStudent.getRemainingFees());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
