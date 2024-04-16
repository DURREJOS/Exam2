import java.util.Date;

public abstract class Employee extends Person {
    private String department;
    private double monthlySalary;
    private Date dateHired;

    public Employee(String name, String address, String phoneNumber, String email,
                    String department, double monthlySalary, Date dateHired) {

        super(name, address, phoneNumber, email);
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.dateHired = dateHired;
    }

    //getters
    public String getDepartment() {
        return department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    //setters
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    //overridden toString()
    public String toString() {
        return super.toString() + "\nDepartment: " + department + "\nMonthly Salary: $" + monthlySalary + "\nDate Hired: " + dateHired;
    }
}
