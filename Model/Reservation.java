package Model;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;;

public class Reservation {
    private int reservationid;
    private Date date;
    private Passenger passenger;
    private ScheduledFlight scheduledFlight;
    private String seatno;
    private static final AtomicInteger count = new AtomicInteger(0);

    public int getReservationid() {
        return reservationid;
    }

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

    public String getSeatno() {
        return seatno;
    }

    public void setSeatno(String seatno) {
        this.seatno = seatno;
    }

    public Reservation() {
        this.reservationid = count.incrementAndGet();
    }
}