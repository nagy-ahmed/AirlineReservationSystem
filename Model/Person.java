package Model;

public class Person {
    private int nationalId;
    private String username;
    private String password;
    private String fName;
    private String lName;
    private String address;

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

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

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "nationalId=" + nationalId + ", username=" + username + ", password=" + password + ", fName="
                + fName + ", lName=" + lName + ", address=" + address + ", ";
    }

    public Person() {
    }

    public Person(int nationalId, String username, String password, String fName, String lName, String address) {
        this.nationalId = nationalId;
        this.username = username;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
    }

}
