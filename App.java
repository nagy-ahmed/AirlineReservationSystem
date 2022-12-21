import Model.*;

public class App {

    static DB contexetDb = new DB();

    public static void main(String[] args) {

        boolean done = contexetDb.addUser("ahmed", null, "ahmed nagy dawood", null);
        User u = contexetDb.loginUser("ahmed", "admin");
        if (u == null) {
            System.out.println("user is not exist");
        }
        System.out.println(u.getUsername());
        System.out.println(u.getPassword());
        System.out.println(u.getName());

    }
}
