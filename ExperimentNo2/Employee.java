package ExperimentNo2;

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    Employee(String f, String l, double s) {
        firstName = f;
        lastName = l;
        if (s > 0)
            monthlySalary = s;
        else
            monthlySalary = 0.0;
    }

    void setFirstName(String f) {
        firstName = f;
    }

    String getFirstName() {
        return firstName;
    }

    void setLastName(String l) {
        lastName = l;
    }

    String getLastName() {
        return lastName;
    }

    void setMonthlySalary(double s) {
        if (s > 0)
            monthlySalary = s;
        else
            monthlySalary = 0.0;
    }

    double getMonthlySalary() {
        return monthlySalary;
    }
}
