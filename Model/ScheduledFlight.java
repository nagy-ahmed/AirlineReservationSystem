package Model;

import java.text.MessageFormat;
import java.util.*;

import lib.Color;

public class ScheduledFlight {
    private int number;
    private Date date;
    private Flight flight;
    private double price;
    private int currentcapacity = 0;
    private int maxcapacity;
    private Set<Passenger> passengers = new HashSet<Passenger>();
    private Set<Employee> Employees = new HashSet<Employee>();

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

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

    public Date getDate() {
        return date;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getPrice() {
        return price;
    }

    public int getCurrentcapacity() {
        return currentcapacity;
    }

    public int getMaxcapacity() {
        return maxcapacity;
    }

    public void getPassengers() {
        System.out.println(MessageFormat.format("Passengers of flight : {0} is", getNumber()));
        if (passengers == null || passengers.size() == 0) {
            System.out.println("No Passenger is added yet");
            return;
        }
        int i = 1;
        for (Passenger passenger : passengers) {
            System.out.println(MessageFormat.format("{0}-{1} {2}", i, passenger.getfName(), passenger.getlName()));
            i++;
        }
    }

    public void getEmployees() {
        System.out.println(MessageFormat.format("Employee of flight : {0} is", getNumber()));
        if (Employees == null || Employees.size() == 0) {
            System.out.println("No Employee is added yet");
            return;
        }
        int i = 1;
        for (Employee Employee : Employees) {
            System.out.println(MessageFormat.format("{0}-{1} {2} --{3}", i, Employee.getfName(), Employee.getlName(),
                    Employee.getJob()));
            i++;
        }
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
    public boolean AddEmployee(Employee c) {
        return Employees.add(c) ? true : false;
    }

    // return ture if removed successed ,false if passenger is not exist
    public boolean RemoveEmployee(Employee c) {
        return Employees.remove(c) ? true : false;
    }

    public void GetDescription() {
        System.out
                .println(MessageFormat.format(Color.BLUE + "\nFlight with Number {0}" + Color.RESET,
                        getNumber()));
        System.out.println(MessageFormat.format("Go from {0} to {1}", flight.getDeparture(), flight.getArrival()));
        System.out.println(MessageFormat.format("on {0} ,its Price :{1}", date, price));
        System.out.println(MessageFormat.format("Max Capacity is {0} Current is {1}", maxcapacity, currentcapacity));
    }

    @Override
    public String toString() {
        GetDescription();
        return "";
    }

    public ScheduledFlight() {
        super();
    }

    public ScheduledFlight(int number, Date date, Flight flight, double price, int maxcapacity) {
        this.number = number;
        this.date = date;
        this.flight = flight;
        this.price = price;
        this.maxcapacity = maxcapacity;
    }

}
