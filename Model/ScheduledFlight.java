package Model;

import java.text.MessageFormat;
import java.util.*;

public class ScheduledFlight {
    private int maxcapacity;
    private int currentcapacity = 0;
    private Date date;
    private Flight flight;
    private double price;
    private Set<Passenger> passengers;
    private Set<Crew> Crews = new HashSet<Crew>();

    public void setMaxcapacity(int maxcapacity) {
        if (maxcapacity <= 0) {
            this.maxcapacity = 1;
            return;
        }
        this.maxcapacity = maxcapacity;
    }

    public void setDate(Date date) {
        if (date.before(new Date())) {
            this.date = date;
            return;
        }
        this.date = date;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = Math.abs(price);
            return;
        }
        this.price = price;
    }

    // return ture if added successed ,false if already added once
    public boolean AddPassenger(Passenger p) {
        if (passengers.add(p)) {
            currentcapacity++;
            return true;
        }
        return false;
    }

    // return ture if removed successed ,false if passenger is not exist
    public boolean RemovePassenger(Passenger p) {
        if (passengers.remove(p)) {
            currentcapacity--;
            return true;
        }
        return false;
    }

    // return ture if added successed ,false if already added once
    public boolean AddCrew(Crew c) {
        return Crews.add(c) ? true : false;
    }

    // return ture if removed successed ,false if passenger is not exist
    public boolean RemoveCrew(Crew c) {
        return Crews.remove(c) ? true : false;
    }

    public void GetDescription() {
        System.out.println("Welcome");
        System.out.println(MessageFormat.format("Flight with Number {0}", flight.getNumber()));
        System.out.println(MessageFormat.format("Go from {0} to {1}", flight.getDeparture(), flight.getArrival()));
        System.out.println(MessageFormat.format("on {0} ,its Price :{1}", date, price));
        System.out.println(MessageFormat.format("Max Capacity is {0} Current is {1}", maxcapacity, currentcapacity));
    }

    public void GetFlightCrews() {
        System.out.println(MessageFormat.format("Crew of flight : {0} is", flight.getNumber()));
        if (Crews == null || Crews.size() == 0) {
            System.out.println("No Crew is added yet");
            return;
        }
        for (Crew Crew : Crews) {
            System.out.println(MessageFormat.format("-{0} ->{1}", Crew.getName(), Crew.getJob()));
        }
    }
}
