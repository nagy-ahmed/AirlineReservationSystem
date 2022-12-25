
import Model.*;
import lib.Color;
import Controller.*;

public class App {

    public static void name() {

    }

    public static void main(String[] args) {
        while (true) {
            Object currentUser = null;
            while (currentUser == null) {
                currentUser = StartView.Sign(StartView.Welcome());
                if (currentUser == null)
                    System.out.println(Color.PURPLE + "insuccess, please try again" + Color.RESET);
                if (currentUser == "Exist")
                    return;
            }
            switch (currentUser.getClass().getName()) {
                case "Model.Admin":
                    System.out.println(currentUser.toString());
                    break;
                case "Model.Employee":
                    System.out.println(currentUser.toString());
                    break;
                case "Model.Passenger":
                    Passenger p = (Passenger) currentUser;
                    while (PassengerView.Operation(p))
                        ;
                    break;
                default:
                    break;
            }
        }
    }
}
