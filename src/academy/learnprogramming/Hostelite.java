package academy.learnprogramming;

public class Hostelite extends Student{
    private String HostelName;
    private int roomNumber;

    public Hostelite(int studentId, char studentType, String studentFirstName, String studentLastName, String hostelName, int roomNumber) {
        super(studentId, studentType, studentFirstName, studentLastName);
        this.HostelName=hostelName;
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student HostelName = "+getHostelName());
        System.out.println("Student HostelRoomNumber = "+getRoomNumber());

    }

    public String getHostelName() {
        return HostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
