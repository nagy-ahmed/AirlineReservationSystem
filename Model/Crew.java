
package Model;

public class Crew extends User {
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

    public Crew() {
        super.setUsername("admin");
        ;
        super.setPassword("admin");
        ;
    }
}
