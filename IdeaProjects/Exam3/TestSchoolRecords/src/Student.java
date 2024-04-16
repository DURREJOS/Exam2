public class Student extends Person {
    private String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    //Getters
    public String getStatus() {
        return status;
    }

    //Setters
    public void setStatus(String status) {
        this.status = status;
    }

    //overridden toString
    public String toString() {
        return super.toString() + "\nStatus:" + status;
    }
}
