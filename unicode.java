
import java.util.Scanner;  // Import the Scanner class
public class unicode {
    
  public static void main(String[] args) {

    Scanner user = new Scanner(System.in);

    //part 1
    System.out.println("Enter a positive double value (ex: 2.0, 5.0...): ");
    double userDoubleValue = user.nextDouble(); //double value
  
    double sqrtValue = Math.sqrt(userDoubleValue); //square root
    System.out.printf("square root is: %.2f%n", sqrtValue);

    double powerValue = Math.pow(userDoubleValue, 2); //poweer
    System.out.printf("power value is: %.2f%n", powerValue);

    double roundedValue = Math.round(userDoubleValue); //rounded
    System.out.printf("rounded value is: %.2f%n", roundedValue);

    double celiValue = Math.ceil(userDoubleValue); //ceiling
    System.out.printf("ceiling value is: %.2f%n", celiValue);

    double floorValue = Math.floor(userDoubleValue); //floor
    System.out.printf("floor value is: %.2f%n", floorValue);

    //part 2
    System.out.println("Enter a single character (ex: a, 2, !...): ");
    char userChar = user.next().charAt(0); //character input

    if (Character.isUpperCase(userChar)) {
      System.out.println("The character you entered is an uppercase letter.");
    } else if (Character.isLowerCase(userChar)) {
      System.out.println("The character you entered is a lowercase letter.");
    } else if (Character.isDigit(userChar)) {
      System.out.println("The character you entered is a digit.");
    } else {
      System.out.println("The character you entered is other.");
    }

    int i = (int) userChar; //unicode transfer
    System.out.println("The Unicode value of the character is: " + i);

    int x = i + 1; //next unicode character
    char nextChar = (char) x;
    System.out.println("The next Unicode character is: " + nextChar);
    user.nextLine();


    //part 3
    System.out.println("Enter a first and last name separated by a space: ");
    String fullName = user.nextLine(); //full name input

    System.out.println("The length of the string is: " + fullName.length());
    System.out.println("The first character is: " + fullName.charAt(0));

    String firstName = fullName.substring(0, fullName.indexOf(' '));
    String lastName = fullName.substring(fullName.indexOf(' ') + 1);
    System.out.println(firstName);
    System.out.println(lastName);
    System.out.println("Upper Case: " + fullName.toUpperCase());


  }
}
