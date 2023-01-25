import java.util.Scanner;

public class PasswordTest {

    public static void Menu() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean loop = true;

        String password = "clyderunners";
        int fail = 3;
        String login;
        do {
            System.out.println("Welcome to Glasgow Clyde Runners Club.");
            System.out.println("Please enter your password to continue: ");
            login = in.nextLine();
            if (login.equals(password)) {
                System.out.println("Password Validated");
                loop = false;
                Menu();
            } else {
                fail--;
                System.out.println("Your Password is incorrect");//print message to user
                System.out.println("You have: " + fail + " attempts left.");
                if (fail == 0) {
                    System.out.println("Number of attempts exceeded. You are now locked out.");
                    System.exit(0);
                }
            }
        } while (fail != 0);
    }
}
