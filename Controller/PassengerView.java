package Controller;

import Model.Passenger;
import lib.Methods;

public class PassengerView {
    public static boolean Operation(Passenger p) {
        System.out.println("-----------------------------------------------------");
        System.out.println("1-View My Info");
        System.out.println("2-View Flights");
        System.out.println("3-Make a Reservation");
        System.out.println("4-View My History");
        System.out.println("5-Log Out");
        int key = (int) Methods.EnteredValue();
        switch (key) {
            case 1:
                ViewInfo(p);
                return true;
            case 2:
                ViewFlights();
                return true;
            case 3:
                System.out.println("Please enter the flight number");
                int number = (int) Methods.EnteredValue();
                if (!StartView.dbcontext.MakeReservation(p, number))
                    System.out.println("sorry but you can't book this flight");
                else
                    System.out.println("Success");
                return true;
            case 4:
                ViewMyHistory(p);
                return true;
            case 5:
                return false;
            default:
                return true;

        }

    }

    public static void ViewInfo(Passenger p) {
        System.out.println(p.toString());
    }

    public static void ViewFlights() {
        System.out.println(StartView.dbcontext.scheduledFlights());
    }

    public static void ViewMyHistory(Passenger p) {
        System.out.println(StartView.dbcontext.MyHistory(p));
    }
}
