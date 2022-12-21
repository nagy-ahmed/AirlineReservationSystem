package Model;

public class User {
    private String username = "admin";
    private String password = "admin";
    private String name;
    private String address;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
