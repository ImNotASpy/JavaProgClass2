package lab6;
import java.util.Scanner;

public class Analyzer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //task 1
        //range 1
        System.out.print("Enter 3 ranges of integers below\n");
        System.out.print("Enter start of range: ");
        int first = input.nextInt();
        System.out.print("Enter end of range: ");
        int end = input.nextInt();

        //range 2
        System.out.print("Enter start of range: ");
        int first2 = input.nextInt();
        System.out.print("Enter end of range: ");
        int end2 = input.nextInt();

        //range 3
        System.out.print("Enter start of range: ");
        int first3 = input.nextInt();
        System.out.print("Enter end of range: ");
        int end3 = input.nextInt();

        System.out.println("Sum of range 1 is: "+ sum(first, end));
        System.out.println("Sum of range 2 is: " + sum(first2, end2));
        System.out.println("Sum of range 3 is: "+ sum(first3, end3));


        //task 2
        System.out.print("Enter a number: ");
        int score = input.nextInt();

        evaluate(score);

        //task3
        System.out.println("Enter two whole numbers: ");
        int numb = input.nextInt();
        int numb1 = input.nextInt();
        
        System.out.println("smaller number: " + select(numb, numb1));

        System.out.println("Enter two decimals: ");
        double num = input.nextDouble();
        double num1 = input.nextDouble();
    
        System.out.println("smaller number: " + select(num, num1));


        //task4
        System.out.println("Enter character 1: ");
            char firstChar = input.next().charAt(0);
        System.out.println("Enter character 2: ");
            char secondChar = input.next().charAt(0);

        System.out.println("Character: " + generateChar(firstChar,secondChar));
    }

    //example from lecture
    public static int sum(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++)
            sum += i;
        return sum;
    }


    public static void evaluate(int score) {
        if (score >= 100)
            System.out.println("Big Number");
        else if (score >= 50)
            System.out.println("Medium Number");
        else if (score >= 10)
            System.out.println("Low Number");
        else
            System.out.println("Too Low Number");
    }

    public static int select(int i, int x) {
        if (i < x)
            return i;
        else
            return x;
    }

    public static double select(double i, double x){
        if (i < x)
            return i;
        else
            return x;
    }


    //from cha6 presentation slide
    public static char generateChar(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
}