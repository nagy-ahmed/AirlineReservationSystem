package Model;

import java.util.ArrayList;
import java.util.Date;

public class DB {
   private ArrayList<Passenger> passengers = new ArrayList<Passenger>();
   private ArrayList<Admin> admins = new ArrayList<Admin>();
   private ArrayList<Employee> employees = new ArrayList<Employee>();
   private ArrayList<Airport> airports = new ArrayList<>();
   private ArrayList<Flight> flights = new ArrayList<>();
   private ArrayList<ScheduledFlight> scheduledFlights = new ArrayList<>();

   public boolean addAdmin(Admin a, String user) {
      if (user.equals("ahmed--nagy"))
         return admins.add(a) ? true : false;
      return false;
   }

   public boolean addEmployee(Employee e) {
      return employees.add(e) ? true : false;

   }

   public boolean addPassenger(Passenger p) {
      return passengers.add(p) ? true : false;
   }

   public boolean avaliableUser(String username, String type) {
      if (username == "" || username == null)
         return false;

      switch (type) {
         case "emp":
            for (Employee employee : employees) {
               if (employee.getUsername().equals(username))
                  return false;
            }
            break;
         case "pass":
            for (Passenger passenger : passengers) {
               if (passenger.getUsername().equals(username))
                  return false;
            }
            break;
         default:
            break;
      }
      return true;
   }

   public Admin loginAdmin(String username, String password) {
      for (Admin admin : admins) {
         if (admin.getUsername().equals(username) && admin.getPassword().equals(password))
            return admin;
      }
      return null;
   }

   public Passenger loginPassenger(String username, String password) {
      for (Passenger passenger : passengers) {
         if (passenger.getUsername().equals(username) && passenger.getPassword().equals(password))
            return passenger;
      }
      return null;
   }

   public Employee loginEmployee(String username, String password) {
      for (Employee employee : employees) {
         if (employee.getUsername().equals(username) && employee.getPassword().equals(password))
            return employee;
      }
      return null;
   }

   public boolean MakeReservation(Passenger p, int number) {
      for (ScheduledFlight scheduledFlight : scheduledFlights) {
         if (scheduledFlight.getNumber() == number && scheduledFlight.AddPassenger(p)) {
            p.reservations.add(new Reservation(p, scheduledFlight));
            return true;
         }

      }
      return false;
   }

   public String scheduledFlights() {
      return " " + scheduledFlights;
   }

   public String MyHistory(Passenger p) {
      if (p.reservations.size() > 0)
         return "" + p.reservations;
      return "You not reserve any ticket";
   }

   public DB() {
      Admin a = new Admin();
      a.setUsername("ahmed--nagy");
      Employee e = new Employee();
      e.setUsername("ahmednagy");
      Passenger p = new Passenger();
      p.setUsername("ahmednagy");
      admins.add(a);
      employees.add(e);
      passengers.add(p);
      Airport Alexandria = new Airport("Alexandria International Airport", "ALY", "Alexandria");
      Airport Assiut = new Airport("Assiut Airport", "ATZ", "Assiut");
      Airport london = new Airport("london", "lon", "england");
      Airport paris = new Airport("paris", "par", "france");

      Flight f1 = new Flight(Alexandria, Assiut);
      Flight f2 = new Flight(Assiut, Alexandria);
      Flight f3 = new Flight(london, Alexandria);
      Flight f4 = new Flight(london, Assiut);
      Flight f5 = new Flight(Alexandria, london);
      Flight f6 = new Flight(Alexandria, paris);

      ScheduledFlight sf1 = new ScheduledFlight(111, new Date(), f1, 500, 100);
      ScheduledFlight sf2 = new ScheduledFlight(222, new Date(), f2, 670, 50);
      ScheduledFlight sf3 = new ScheduledFlight(333, new Date(), f3, 670, 50);
      ScheduledFlight sf4 = new ScheduledFlight(444, new Date(), f4, 670, 50);
      ScheduledFlight sf5 = new ScheduledFlight(555, new Date(), f5, 670, 50);
      ScheduledFlight sf5_1 = new ScheduledFlight(666, new Date(), f5, 670, 50);
      ScheduledFlight sf5_2 = new ScheduledFlight(777, new Date(), f5, 670, 50);
      ScheduledFlight sf6 = new ScheduledFlight(888, new Date(), f6, 670, 50);
      airports.add(Alexandria);
      airports.add(Assiut);
      airports.add(london);
      airports.add(paris);
      flights.add(f1);
      flights.add(f2);
      flights.add(f3);
      flights.add(f4);
      flights.add(f5);
      flights.add(f6);
      scheduledFlights.add(sf1);
      scheduledFlights.add(sf2);
      scheduledFlights.add(sf3);
      scheduledFlights.add(sf4);
      scheduledFlights.add(sf5);
      scheduledFlights.add(sf5_1);
      scheduledFlights.add(sf5_2);
      scheduledFlights.add(sf6);
      MakeReservation(p, 111);
      MakeReservation(p, 222);

   }
}