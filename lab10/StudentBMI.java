import java.util.Scanner;

public class StudentBMI {
    private String name;
    private double weight;
    private double height;

    public StudentBMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public double bmi() {
        return (weight * 703) / (height * height);
    }

    public String getStatus() {
        double bmiValue = bmi();
        if (bmiValue < 18.5) {
            return "Underweight";
        } else if (bmiValue < 24.9) {
            return "Normal weight";
        } else if (bmiValue < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public String StringBuilder(){
        StringBuilder report = new StringBuilder();
        report.append("Name: ").append(name).append("\n");
        report.append("Weight: ").append(weight).append(" lbs\n");
        report.append("Height: ").append(height).append(" inches\n");
        report.append("BMI: ").append(String.format("%.2f", bmi())).append("\n");
        report.append("Status: ").append(getStatus()).append("\n");
        return report.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter weight (lbs): ");
        String weightInput = input.nextLine();

        System.out.print("Enter height (inches): ");
        String heightInput = input.nextLine();

        double weight = Double.parseDouble(weightInput);
        double height = Double.parseDouble(heightInput);

        StudentBMI student = new StudentBMI(name, weight, height);
        System.out.println(student.getStatus());

        System.out.println(student.StringBuilder());
        input.close();
    }
}