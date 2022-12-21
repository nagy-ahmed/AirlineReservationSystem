package Model;
public class Flight {
    private int number;
    private Airport departure;
    private Airport arrival;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDeparture(Airport departure) {
        this.departure = departure;
    }

    public void setArrival(Airport arrival) {
        this.arrival = arrival;
    }

    public int getNumber() {
        return number;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

}
