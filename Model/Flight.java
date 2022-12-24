package Model;

public class Flight {
    private Airport departure;
    private Airport arrival;

    public void setDeparture(Airport departure) {
        this.departure = departure;
    }

    public void setArrival(Airport arrival) {
        this.arrival = arrival;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "Flight [departure=" + departure + ", arrival=" + arrival + "]";
    }

    public Flight() {
    }

    public Flight(Airport departure, Airport arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

}
