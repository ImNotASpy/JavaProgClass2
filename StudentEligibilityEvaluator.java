

import java.util.Scanner;  // Import the Scanner class

class StudentEligibilityEvaluator {
  public static void main(String[] args) {
    Scanner name = new Scanner(System.in);  // name Scanner object
    System.out.println("Enter your name: ");

    String userName = name.nextLine();  // NAME user input
    
    Scanner GPA = new Scanner(System.in);  // GPA Scanner object
    System.out.println("Enter your GPA: ");

    double userGPA = GPA.nextDouble();  // GPA user input
    
    Scanner hours = new Scanner(System.in);  // Hours Scanner object
    System.out.println("Enter your Completed credit hours: ");

    int userHours = hours.nextInt();     // HOURS user input

    Scanner major = new Scanner(System.in);  // Major Scanner object
    System.out.println("Enter your Major: ");

    String userMajor = major.nextLine(); // MAJOR user input

    Scanner financial = new Scanner(System.in);  // Financial Scanner object
    System.out.println("Do you have a financial hold? (yes or no): ");

    boolean userFinancial = financial.nextLine().equalsIgnoreCase("yes"); // FINANCIAL HOLD user input

    Scanner record = new Scanner(System.in);  // record Scanner object
    System.out.println("Do you have a disciplinary record? (yes or no): ");

    boolean userRecord = record.nextLine().equalsIgnoreCase("yes"); // DISCIPLINARY RECORD user input


    System.out.println("Username is: " + userName);  // Output user input
    System.out.println("GPA is: " + userGPA);
    System.out.println("Completed credit hours is: " + userHours);
    System.out.println("Major is: " + userMajor);
    System.out.println("Financial hold is: " + userFinancial);
    System.out.println("Disciplinary record is: " + userRecord);
  }
}