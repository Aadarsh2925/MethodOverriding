package academy.learnprogramming;

public class DayScholar extends Student{
    private String residentialAddress;

    public DayScholar(int studentId, char studentType, String studentFirstName, String studentLastName, String residentialAddress) {
        super(studentId, studentType, studentFirstName, studentLastName);
        this.residentialAddress = residentialAddress;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student residentialAddress = "+getResidentialAddress());
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }
}
