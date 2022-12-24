
package Model;

public class Employee extends Person {
    private double salary;
    private String job;

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee [" + super.toString() + ", salary=" + salary + ", job=" + job + "]";
    }

    public Employee() {
        super.setPassword("123");
        ;
    }

    public Employee(int nationalId, String username, String password, String fName, String lName, String address,
            double salary, String job) {
        super(nationalId, username, password, fName, lName, address);
        this.salary = salary;
        this.job = job;
    }

}
