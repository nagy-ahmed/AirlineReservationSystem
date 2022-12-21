package Model;

public class Passenger extends User {
    private int creditcardnumber;

    public int getCreditcardnumber() {
        return creditcardnumber;
    }

    public void setCreditcardnumber(int creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }

    public Passenger() {
        super.setUsername("123");
        ;
        super.setPassword("123");
        ;
    }
}
