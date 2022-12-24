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

    @Override
    public String toString() {
        return "Flight [number=" + number + ", departure=" + departure + ", arrival=" + arrival + "]";
    }

    public Flight() {
    }

    public Flight(int number, Airport departure, Airport arrival) {
        this.number = number;
        this.departure = departure;
        this.arrival = arrival;
    }

}
