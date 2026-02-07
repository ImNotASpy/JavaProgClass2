import java.util.Scanner;

public class finance {

    public static void main(String[] args) {
        
        
        
        //part 1
        double tuition = 10000; //tuition cost for each year
        int year = 0; //starting year
        double totalCost = 0; //total cost for years after 10
        double increaseRate = 1.05; // yearly increase
        int maxYears = 10; //years to calculate to
        int yearsAfter = 4; //yearly tuition to calculate to

        while (year < maxYears) {
            tuition = tuition * increaseRate;
            year++;
        }

        System.out.printf("The tuition after %d years will be: $%.2f%n", maxYears, tuition);

        totalCost = 0; // reset total cost
        totalCost += tuition; // so that the 11th year uses 10th year tuition as starting point
        for (int i = 1; i < yearsAfter; i++) { //start at 1 since we already have year 11
            tuition = tuition * increaseRate;
            totalCost += tuition;
        }

        System.out.printf("The total cost for %d years after year %d: $%.2f%n", yearsAfter, maxYears, totalCost);


        //part 2 who has higher score
        Scanner user = new Scanner(System.in);
        double highScore = 0;
        String highName = "";

        System.out.print("Enter the number of students: ");
        int students = user.nextInt();

        for (int i = 0; i < students; i++) {
            System.out.print("Enter the student name: ");
            String name = user.next();
            System.out.print("Enter the student score: ");
            double currentScore = user.nextDouble();

            if(currentScore > highScore) {
                highScore = currentScore;
                highName = name;
            }
        }
        System.out.println("The highest score is: " + highScore + " by " + highName);

    }
}