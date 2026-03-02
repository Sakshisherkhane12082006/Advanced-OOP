package ExperimentNo4;

class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    int sub1, sub2;

    void setMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }
}

interface Sports {
    void setSportsMarks(int sMarks);
}

class Result extends Test implements Sports {
    int sMarks;

    public void setSportsMarks(int sMarks) {
        this.sMarks = sMarks;
    }

    void displayResult() {
        int total = sub1 + sub2 + sMarks;

        System.out.println("Roll No: " + getRollNo());
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Sports Marks: " + sMarks);
        System.out.println("Total Marks: " + total);
    }
}

public class StudentResultProgram {
    public static void main(String[] args) {

        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(70, 80);
        r.setSportsMarks(20);

        r.displayResult();
    }
}