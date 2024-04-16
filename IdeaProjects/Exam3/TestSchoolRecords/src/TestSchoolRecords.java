import java.util.ArrayList;
import java.util.Date;

public class TestSchoolRecords {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Student("Jennifer Refinnej", "32 Market St", "000-123-7625",
                "Jenny@mail.com", " Sophomore"));
        persons.add(new Student("Barbara Arabrab", "98 Circle St", "321-123-4123",
                "Barbara@mail.com", " Freshman"));
        persons.add(new Faculty("Margo Ogram", "1000 Even St", "030-781-9001",
                "Margo@mail.com", "English", 2000, new Date(),
                "10:00am - 10:30am", "Junior"));
        persons.add(new Faculty("Sammy Ymmas", "000 Crest way", "777-771-7701",
                "Sammy@mail.com", "Calculus", 6000, new Date(),
                "9:00am - 2:00pm", "Senior"));
        persons.add(new Staff("Carly Ylrac", "90 Pineapple St", "222-298-3462",
                "carly@mail.com", "Administration", 4000, new Date(),
                "Nurse Administrator"));
        persons.add(new Staff("Benny Ynneb", "111 Bear St", "999-000-9090",
                "benny@mail.com", "Administration", 8000, new Date(),
                "Vice Principal"));

        System.out.println("Details of persons:");
        System.out.println(" ");
        for (Person person : persons) {
            System.out.println(person);
            System.out.println();
        }

        ArrayList<Employee> employees = filterEmployees(persons);

        System.out.println("Employees:");
        System.out.println(" ");
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println();
        }
    }

    public static ArrayList<Employee> filterEmployees(ArrayList<Person> persons) {

        ArrayList<Employee> employees = new ArrayList<>();

        for (Person person : persons) {
            if (person instanceof Employee) {
                employees.add((Employee) person);
            }
        }
        return employees;
    }
}