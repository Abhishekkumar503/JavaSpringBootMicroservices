package Hibernate_Learnings.Hibernate;

public class Student {
    private int rollnumber;
    private String studentName;
    private int Marks;

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollnumber=" + rollnumber +
                ", studentName='" + studentName + '\'' +
                ", Marks=" + Marks +
                '}';
    }
}
