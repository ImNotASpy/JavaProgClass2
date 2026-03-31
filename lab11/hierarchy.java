import java.util.ArrayList;
import java.util.Collections; 
import java.util.HashMap;

public class hierarchy {
    public static void main(String[] args) {
        premiumMember premium = new premiumMember(
                "email@email.com",
                "vic",
                "g",
                "555 st N",
                2.0,
                85,
                "2"
        );

        studentMember student = new studentMember(
                "email@email.com",
                "jess",
                "F",
                "556 st S",
                1.23,
                70,
                "1",
                "minnesota",
                "5543"
        );

        trainer trainer1 = new trainer(
                "eeemail@email.com",
                "rick",
                "M",
                "444 st NE",
                "Abs"
        );

        premium.assessments().put("2026-03-20", "initial assessment");
        premium.assessments().put("2026-03-25", "follow up assessment");

        student.assessments().put("2026-03-18", "student assessment 1");
        student.assessments().put("2026-03-28", "student assessment 2");

        student.chosenPackage("ignored");

        System.out.println(premium);
        System.out.println("last premium assessment: " + premium.lastAssessment());
        System.out.println("sorted premium dates: " + premium.sortedAssessments());

        System.out.println();

        System.out.println(student);
        System.out.println("last student assessment: " + student.lastAssessment());
        System.out.println("sorted student dates: " + student.sortedAssessments());

        System.out.println();

        System.out.println(trainer1);
    }
}

abstract class Person {
    private String name;
    private String gender;
    private String address;
    private String email;

    public Person(String email, String name, String gender, String address) {
        this.email = email;
        selectName(name);
        selectGender(gender);
        this.address = address;
    }

    public String email() {
        return email;
    }

    public void selectEmail(String email) {
        this.email = email;
    }

    public String name() {
        return name;
    }

    public void selectName(String name) {
        if (name.length() <= 30) {
            this.name = name;
        } else {
            this.name = name.substring(0, 30);
        }
    }

    public String selectGender() {
        return gender;
    }

    public void selectGender(String gender) {
        if ("M".equals(gender) || "F".equals(gender)) {
            this.gender = gender;
        } else {
            this.gender = "Unspecified";
        }
    }

    public String selectAddress() {
        return address;
    }

    public void selectAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder report = new StringBuilder();
        report.append("name: ").append(name).append("\n");
        report.append("sex: ").append(gender).append("\n");
        report.append("address: ").append(address).append("\n");
        report.append("email: ").append(email).append("\n");
        return report.toString();
    }
}

abstract class Member extends Person {
    private double startingWeight;
    private double height;
    private HashMap<String, String> assessments;
    private String chosenPackage;

    public Member(String email, String name, String gender, String address, double height, double startingWeight, String chosenPackage) {
        super(email, name, gender, address);
        selectHeight(height);
        selectStartingWeight(startingWeight);
        this.chosenPackage = chosenPackage;
        this.assessments = new HashMap<>();
    }

    public double height() {
        return height;
    }

    public void selectHeight(double height) {
        if (height >= 1.0 && height <= 3.0) {
            this.height = height;
        }
    }

    public double startingWeight() {
        return startingWeight;
    }

    public void selectStartingWeight(double startingWeight) {
        if (startingWeight >= 35 && startingWeight <= 250) {
            this.startingWeight = startingWeight;
        }
    }

    public String chosenPackage() {
        return chosenPackage;
    }

    public void selectChosenPackage(String chosenPackage) {
        this.chosenPackage = chosenPackage;
    }

    public HashMap<String, String> assessments() {
        return assessments;
    }

    public void selectAssessments(HashMap<String, String> assessments) {
        this.assessments = assessments;
    }

    public String lastAssessment() {
        if (assessments.isEmpty()) {
            return "No assessments";
        }

        ArrayList<String> dates = new ArrayList<>(assessments.keySet());
        Collections.sort(dates);
        String lastDate = dates.get(dates.size() - 1);
        return assessments.get(lastDate);
    }

    public String sortedAssessments() {
        if (assessments.isEmpty()) {
            return "No assessments";
        }

        ArrayList<String> dates = new ArrayList<>(assessments.keySet());
        Collections.sort(dates);
        return dates.toString();
    }

    public abstract void chosenPackage(String chosenPackage);

    @Override
    public String toString() {
        StringBuilder report = new StringBuilder();
        report.append(super.toString());
        report.append("height: ").append(height).append(" m\n");
        report.append("starting weight: ").append(startingWeight).append(" kg\n");
        report.append("chosen package: ").append(chosenPackage).append("\n");
        return report.toString();
    }
}

class premiumMember extends Member {
    public premiumMember(String email, String name, String gender, String address, double height, double startingWeight, String chosenPackage) {
        super(email, name, gender, address, height, startingWeight, chosenPackage);
    }

    @Override
    public void chosenPackage(String packageChoice) {
        selectChosenPackage(packageChoice);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class studentMember extends Member {
    private String college;
    private String studentID;

    public studentMember(String email, String name, String gender, String address, double height, double startingWeight, String chosenPackage, String college, String studentID) {
        super(email, name, gender, address, height, startingWeight, chosenPackage);
        this.college = college;
        this.studentID = studentID;
    }

    public String selectstudentID() {
        return studentID;
    }

    public void selectstudentID(String studentID) {
        this.studentID = studentID;
    }

    public String selectCollege() {
        return college;
    }

    public void selectCollege(String college) {
        this.college = college;
    }

    @Override
    public void chosenPackage(String packageChoice) {
        if ("minnesota".equalsIgnoreCase(college)) {
            selectChosenPackage("1");
        } else if ("harvard".equalsIgnoreCase(college)) {
            selectChosenPackage("2");
        } else {
            selectChosenPackage("Package 3");
        }
    }

    @Override
    public String toString() {
        StringBuilder report = new StringBuilder();
        report.append(super.toString());
        report.append("college: ").append(college).append("\n");
        report.append("student ID: ").append(studentID).append("\n");
        return report.toString();
    }
}

class trainer extends Person {
    private String speciality;

    public trainer(String email, String name, String gender, String address, String speciality) {
        super(email, name, gender, address);
        this.speciality = speciality;
    }

    public String selectSpeciality() {
        return speciality;
    }

    public void selectSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        StringBuilder report = new StringBuilder();
        report.append(super.toString());
        report.append("speciality: ").append(speciality).append("\n");
        return report.toString();
    }
}