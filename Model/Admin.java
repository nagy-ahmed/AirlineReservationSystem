package Model;

public class Admin extends Person {

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 3000) {
            this.salary = 3000;
            return;
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Admin [" + super.toString() + "salary=" + salary + "]";
    }

    public Admin() {
        super.setUsername("admin");
        super.setPassword("admin");

    }

    public Admin(int nationalId, String username, String password, String fName, String lName, String address,
            double salary) {
        super(nationalId, username, password, fName, lName, address);
        this.salary = salary;
    }

}
