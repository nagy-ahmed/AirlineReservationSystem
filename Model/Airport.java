package Model;

public class Airport {
    private String name;
    private String code;
    private String location;

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Airport [name=" + name + ", location=" + location + "]";
    }

    public Airport() {

    }

    public Airport(String name, String code, String location) {
        this.name = name;
        this.code = code;
        this.location = location;
    }

}
