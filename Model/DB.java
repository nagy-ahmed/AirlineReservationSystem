package Model;

import java.util.HashSet;
import java.util.Set;

public class DB {
   private Set<Passenger> passengers = new HashSet<Passenger>();
   private Set<User> users = new HashSet<User>();
   private Set<Crew> crews = new HashSet<Crew>();
   private Set<Airport> airports;
   private Set<Flight> flights;
   private Set<Reservation> reservations;

   public boolean addPassenger(String username, String password, String name, String address, int creditcardnumber) {
      if (username == "" || username == null)
         return false;

      for (Passenger passenger : passengers) {
         if (passenger.getUsername() == username)
            return false;
      }
      Passenger p = new Passenger();
      p.setUsername(username);
      p.setPassword(password);
      p.setName(name);
      p.setAddress(address);
      p.setCreditcardnumber(creditcardnumber);

      return passengers.add(p) ? true : false;
   }

   public boolean addUser(String username, String password, String name, String address) {
      if (username == "" || username == null)
         return false;

      for (User user : users) {
         if (user.getUsername() == username)
            return false;
      }
      User u = new User();
      u.setUsername(username);
      u.setPassword(password);
      u.setName(name);
      u.setAddress(address);

      return users.add(u) ? true : false;

   }

   public boolean addCrew(String username, String password, String name, String address, double salary, String job) {
      if (username == "" || username == null)
         return false;

      for (Crew crew : crews) {
         if (crew.getUsername() == username)
            return false;
      }
      Crew c = new Crew();
      c.setUsername(username);
      c.setPassword(password);
      c.setName(name);
      c.setAddress(address);

      return crews.add(c) ? true : false;

   }

   public Passenger loginPassenger(String username, String password) {
      for (Passenger passenger : passengers) {
         if (passenger.getUsername() == username && passenger.getPassword() == password)
            return passenger;
      }
      return null;
   }

   public User loginUser(String username, String password) {
      for (User user : users) {
         if (user.getUsername() == username && user.getPassword() == password)
            return user;
      }
      return null;
   }

   public Crew loginCrew(String username, String password) {
      for (Crew crew : crews) {
         if (crew.getUsername() == username && crew.getPassword() == password)
            return crew;
      }
      return null;
   }
}