public class Crew extends Person {
    private String username = "123";
    private String password = "123";
    private double salary;
    private String job;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username == "")
            return;

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password == "")
            return;

        this.password = password;
    }

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

}
