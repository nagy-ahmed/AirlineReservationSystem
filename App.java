
import Model.*;
import lib.Color;
import Controller.*;

public class App {

    static Object currentUser = null;

    public static void View1() {
        while (currentUser == null) {
            currentUser = StartView.Sign(StartView.Welcome());
            if (currentUser == null)
                System.out.println(Color.PURPLE + "insuccess, please try again" + Color.RESET);
            if (currentUser == "Exit")
                break;
        }
    }

    public static void View2() {
        switch (currentUser.getClass().getName()) {
            case "Model.Admin":
                System.out.println(currentUser.toString());
                currentUser = null;
                break;
            case "Model.Employee":
                System.out.println(currentUser.toString());
                currentUser = null;
                break;
            case "Model.Passenger":
                Passenger p = (Passenger) currentUser;
                while (PassengerView.Operation(p))
                    ;
                currentUser = null;
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        while (currentUser == null) {
            View1();
            View2();
        }
    }
}
