package Controller;

import java.util.Scanner;

import Model.DB;
import Model.Employee;
import Model.Passenger;
import lib.*;

public class StartView {
    public static DB dbcontext = new DB();

    static Scanner s = new Scanner(System.in);

    public static int Welcome() {
        System.out.println(Color.RED + "\t\tWelcome" + Color.RESET);
        System.out.println(Color.BLUE + "--Sign In" + Color.RESET);
        System.out.println("\t1-Admin");
        System.out.println("\t2-Employee");
        System.out.println("\t3-Passenger");
        System.out.println(Color.BLUE + "--Sign Up" + Color.RESET);
        System.out.println("\t11-Admin <not avaliable now>");
        System.out.println("\t22-Employee");
        System.out.println("\t33-Passenger");
        System.out.println(Color.BLUE + "0-Exist" + Color.RESET);

        int ch;
        boolean again = false;
        do {
            ch = (int) Methods.EnteredValue();
            again = ch != 1 && ch != 2 && ch != 3 && ch != 11 && ch != 22 && ch != 33 && ch != 0;
            if (again) {
                System.out.println(Color.RED + "Your choose not Exist\nPlz Enter another value" + Color.RESET);
            }
        } while (again);
        return ch;
    }

    public static Object Sign(int ch) {
        if (ch == 1 || ch == 2 || ch == 3) {
            System.out.println(Color.GREEN + "Username : " + Color.RESET);
            String user = s.nextLine();
            System.out.println(Color.GREEN + "Password : " + Color.RESET);
            String pass = s.nextLine();
            switch (ch) {
                case 1:
                    return dbcontext.loginAdmin(user, pass);
                case 2:
                    return dbcontext.loginEmployee(user, pass);
                case 3:
                    return dbcontext.loginPassenger(user, pass);
                default:
                    break;
            }
        } else if (ch == 22 || ch == 33) {
            System.out.println(Color.CYAN + "Username : " + Color.RESET);
            String user = "";
            boolean again = false;
            while (!again) {
                user = s.nextLine();
                again = dbcontext.avaliableUser(user, ch == 22 ? "emp" : "pass");
                if (!again) {
                    System.out.println(Color.RED + "Username is already exist" + Color.RESET);
                }
            }
            switch (ch) {
                case 22:
                    System.out.println(Color.CYAN + "National Id : " + Color.RESET);
                    int pnationalId = (int) Methods.EnteredValue();
                    System.out.println(Color.CYAN + "Password : " + Color.RESET);
                    String ppassword = s.nextLine();
                    System.out.println(Color.CYAN + "First Name : " + Color.RESET);
                    String pfName = s.nextLine();
                    System.out.println(Color.CYAN + "Last Name : " + Color.RESET);
                    String plName = s.nextLine();
                    System.out.println(Color.CYAN + "Address : " + Color.RESET);
                    String paddress = s.nextLine();
                    System.out.println(Color.CYAN + "Salary Number : " + Color.RESET);
                    double psalary = Methods.EnteredValue();
                    System.out.println(Color.CYAN + "Job : " + Color.RESET);
                    String pjob = s.nextLine();

                    Employee e = new Employee(pnationalId, user, ppassword, pfName, plName, paddress, psalary, pjob);
                    return dbcontext.addEmployee(e) ? e : null;
                case 33:
                    System.out.println(Color.CYAN + "National Id : " + Color.RESET);
                    int nationalId = (int) Methods.EnteredValue();
                    System.out.println(Color.CYAN + "Password : " + Color.RESET);
                    String password = s.nextLine();
                    System.out.println(Color.CYAN + "First Name : " + Color.RESET);
                    String fName = s.nextLine();
                    System.out.println(Color.CYAN + "Last Name : " + Color.RESET);
                    String lName = s.nextLine();
                    System.out.println(Color.CYAN + "Address : " + Color.RESET);
                    String address = s.nextLine();
                    System.out.println(Color.CYAN + "Credit Card Number : " + Color.RESET);
                    int creditcardnumber = (int) Methods.EnteredValue();

                    Passenger p = new Passenger(nationalId, user, password, fName, lName, address, creditcardnumber);
                    return dbcontext.addPassenger(p) ? p : null;

                default:
                    break;
            }

        } else if (ch == 0) {
            return "Exit";
        }
        return null;

    }

}
