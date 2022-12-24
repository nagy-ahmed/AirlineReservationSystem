package Model;

import java.util.*;

public class Reservation {
    private Date date;
    private Passenger passenger;
    private ScheduledFlight scheduledFlight;

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public ScheduledFlight getScheduledFlight() {
        return scheduledFlight;
    }

    public void setScheduledFlight(ScheduledFlight scheduledFlight) {
        this.scheduledFlight = scheduledFlight;
    }

    @Override
    public String toString() {
        return "Reservation [date=" + date + ", passenger=" + passenger + ", scheduledFlight=" + scheduledFlight + "]";
    }

    public Reservation(Passenger passenger, ScheduledFlight scheduledFlight) {
        this.passenger = passenger;
        this.scheduledFlight = scheduledFlight;
    }

}