package academy.learnprogramming;

public class Student {
    private int studentId;
    private char studentType;
    private String studentName;
    private double feesPerMonth;

    public Student(int studentId, char studentType,String studentFirstName,String studentLastName) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName=studentFirstName+studentLastName;
    }
    public void displayDetails(){
        System.out.println("StudentId = "+getStudentId());
        System.out.println("StudentName = "+getStudentName());
        System.out.println("StudentType = "+getStudentType());
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }

    public void setFeesPerMonth(double feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }
}
