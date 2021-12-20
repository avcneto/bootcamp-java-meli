package module3.aula_2_tt;

import java.util.Scanner;

public class StrongPassword extends Password {
    //.{4,} at least 4 characters
    //(?=.*[0-9]) a digit must occur at least once
    //(?=.*[A-Z]) a capital letter must occur at least once
    private static final String PASSWORD_REGEX = "(?=.*[0-9])(?=.*[A-Z]).{4,}";

    public StrongPassword(String regex) {
        super(regex);
    }

    @Override
    public void setValue(String password) {
        super.setValue(password);
    }

    public static void main(String[] args) {
        Password p = new Password(PASSWORD_REGEX);

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = reader.nextLine();
        reader.close();

        p.setValue(password);
    }
}
