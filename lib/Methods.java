package lib;

import java.util.Scanner;

public class Methods {
    static Scanner s = new Scanner(System.in);

    public static double EnteredValue() {
        double value = 0;
        boolean error;
        do {
            try {
                System.out.print("--> ");
                value = s.nextDouble();
                error = false;

            } catch (Exception e) {
                System.out.println(Color.CYAN_BACKGROUND + "Value Entered is a invalid value" + Color.RESET);
                s.nextLine();
                error = true;
                value = 0;
            }

        } while (error);

        return value;
    }

}
