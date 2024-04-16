import java.util.Date;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email,
                   String department, double monthlySalary, Date dateHired,
                   String officeHours, String rank) {
        super(name, address, phoneNumber, email, department, monthlySalary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    //getters
    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    //setters
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    //overridden toString
    public String toString() {
        return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
    }
}
