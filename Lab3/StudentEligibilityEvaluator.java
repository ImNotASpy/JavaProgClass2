package Lab3;
import java.util.Scanner;  // Import the Scanner class
class StudentEligibilityEvaluator {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String userName = user.nextLine();

    System.out.println("Enter your GPA: ");
    double userGPA = user.nextDouble();

    System.out.println("Enter your completed credit hours: ");
    int userHours = user.nextInt();
    user.nextLine();

    System.out.println("Enter your Major (CS, BUS, ENG, etc): ");
    String userMajor = user.nextLine();

    System.out.println("Do you have a financial hold? (yes or no): ");
    boolean userFinancial = user.nextLine().equalsIgnoreCase("yes");

    System.out.println("Do you have a disciplinary record? (yes or no): ");
    boolean userRecord = user.nextLine().equalsIgnoreCase("yes");

//name
    System.out.println("Student Name: " + userName);  

// Academic Standing

    if (userGPA < 0.0 || userGPA > 4.0) {
        System.out.println("GPA entered is invalid.");
        return;
    }
    else if (userGPA <= 2.0) {
        System.out.println("Academic Standing: Bad");
    }
    else {
        System.out.println("Academic Standing: Good");
    }

  boolean isEligible;
// Eligibility Check
    if (userGPA >= 3.0 && !userFinancial && !userRecord) {
        isEligible = true;
        System.out.println("Eligibility for program: True");
    }
    else {
        isEligible = false;      
        System.out.println("Eligibility for program: false");
    }

//Scholarship Status
    String scholarship = (userGPA >= 3.5 && isEligible) ? "Full Scholarship"
                        : (userGPA >= 2.5 && isEligible) ? "Partial Scholarship"
                        : "No Scholarship";                        ;
    System.out.println("Scholarship Status: " + scholarship);

//Credit Hours
    if (userHours < 0) {
        System.out.println("Completed credit hours entered is invalid.");
        return;
    }
    else{
        System.out.println("Credit Hours: " + userHours);
    }

//Tuition Rate per Credit Hour
    double tuition;
    switch (userMajor.toUpperCase()) {
        case "CS":
            tuition = 450.0;
            break;
        case "BUS":
            tuition = 350.0;
            break;
        case "ENG":
            tuition = 250.0;
            break;
        default:
            tuition = 150.0;
            break;
    }
    System.out.println("Tuition Rate per Credit: $" + tuition);
// Boolean expressions
  boolean idk = userGPA >= 3.0 && userFinancial || userRecord;
      System.out.println("Priority Check(no parentheses): " + idk);
  
  boolean udk = userGPA >= 3.0 && (userFinancial || userRecord);
      System.out.println("Priority Check(with parentheses): " + udk);   
  
  }
}