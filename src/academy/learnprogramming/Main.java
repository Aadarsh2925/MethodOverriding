package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Hostelite hostelite=new Hostelite(12,'F',"Stephen","Curry","Vishalakshi",51);
        hostelite.displayDetails();
        System.out.println("+++++++++++++++++++++++++++++++");
        DayScholar dayScholar=new DayScholar(13,'L',"Klay","Thomas","2-8-1245");
        dayScholar.displayDetails();
    }
}
