public class student {
    private double id;
    private String name;
    private String gender;
    private String branch;

    // Setter for ID
    public void setId(double id) {
        if (id >= 100000000 && id <= 999999999) {
            this.id = id;
        } else {
            System.out.println("ID must be a 9-digit number.");

        }
    }

    // Getter for ID
    public double getId() {
        return id;
    }

    // Setter for Name
    public void setName(String name) {
        if (name.matches("[a-zA-Z\\s]+")) {
            this.name = name;
        } else {
            System.out.println("Name must not contain special characters or digits.");
            this.name = "Unknown"; // Assigning a default value
        }
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Gender
    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) {
            this.gender = gender;
        } else {
            System.out.println("Gender must be either M (Male) or F (Female).");

        }
    }

    // Getter for Gender
    public String getGender() {
        return gender;
    }

    // Setter for Branch
    public void setBranch(String branch) {
        if (branch.equals("ECE") || branch.equals("CSE") || branch.equals("ME") ||
                branch.equals("ECSE") || branch.equals("CE") || branch.equals("BT") || branch.equals("EEE")) {
            this.branch = branch;
        } else {
            System.out.println("Branch must be one of the following: ECE, CSE, ME, ECSE, CE, BT, EEE.");

        }
    }

    // Getter for Branch
    public String getBranch() {
        return branch;
    }

    // Overriding toString() to format the details of Student
    @Override
    public String toString() {
        return "Student Details:\n" +
                "ID: " + String.format("%.0f", id) + "\n" +
                "Name: " + name + "\n" +
                "Gender: " + gender + "\n" +
                "Branch: " + branch;
    }

    public static void main(String[] args) {
        student student = new student();
        student.setId(123456789);  // Set ID as a 9-digit number
        student.setName("John Doe");  // Set a valid name
        student.setGender("M");  // Set gender as Male
        student.setBranch("CSE");  // Set branch as CSE

        System.out.println(student.toString());
    }
}
