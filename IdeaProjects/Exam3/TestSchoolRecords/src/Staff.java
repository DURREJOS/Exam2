import java.util.Date;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email,
                 String department, double monthlySalary, Date dateHired, String title) {
        super(name, address, phoneNumber, email, department, monthlySalary, dateHired);
        this.title = title;
    }

    //getter
    public String getTitle() {
        return title;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    //overridden toString()
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}
