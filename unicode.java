
import java.util.Scanner;  // Import the Scanner class
public class unicode {
    
  public static void main(String[] args) {

    Scanner user = new Scanner(System.in);

    //part 1
    System.out.println("Enter a positive double value (ex: 2.0, 5.0...): ");
    double userDoubleValue = user.nextDouble(); //double value
  
    double sqrtValue = Math.sqrt(userDoubleValue); //square root
    System.out.printf("square root is: %.2f%n", sqrtValue);

    double powerValue = Math.pow(sqrtValue, 2); //poweer
    double roundedValue = Math.round(powerValue); //rounded
    System.out.printf("rounded value is: %.2f%n", roundedValue);

    double celiValue = Math.ceil(roundedValue); //ceiling
    System.out.printf("ceiling value is: %.2f%n", celiValue);

    double floorValue = Math.floor(celiValue); //floor
    System.out.printf("floor value is: %.2f%n", floorValue);

    //part 2
    System.out.println("Enter a single character (ex: a, 2, !...): ");
    char userChar = user.next().charAt(0); //character input
  }
}
