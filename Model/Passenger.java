package Model;

import java.util.ArrayList;

public class Passenger extends Person {
    private int creditcardnumber;
    public ArrayList<Reservation> reservations = new ArrayList<>();

    public int getCreditcardnumber() {
        return creditcardnumber;
    }

    public void setCreditcardnumber(int creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }

    @Override
    public String toString() {
        return "Passenger [" + super.toString() + ", creditcardnumber=" + creditcardnumber + "]";
    }

    public Passenger() {
        super.setPassword("123");
    }

    public Passenger(int nationalId, String username, String password, String fName, String lName, String address,
            int creditcardnumber) {
        super(nationalId, username, password, fName, lName, address);
        this.creditcardnumber = creditcardnumber;
    }

}
