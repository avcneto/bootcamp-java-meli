package module3.aula_2_tt_exercice_1;

import java.util.Scanner;

public class WeakPassword extends Password {
    //.{4,} at least 4 characters
    private static final String PASSWORD_REGEX = ".{4,}";

    public WeakPassword(String regex) {
        super(regex);
    }

    @Override
    public void setValue(String password) {
        super.setValue(password);
    }

    public static void main(String[] args) {
        WeakPassword p = new WeakPassword(PASSWORD_REGEX);

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = reader.nextLine();
        reader.close();

        p.setValue(password);
    }
}
